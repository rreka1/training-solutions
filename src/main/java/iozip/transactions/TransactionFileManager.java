package iozip.transactions;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TransactionFileManager {

    public void saveTransactions(Path path, List<Transaction> transactionList) {
        try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            for (Transaction transaction : transactionList) {
                zos.putNextEntry(new ZipEntry(Long.toString(transaction.getId())));
                zos.write((transaction.getTime() + "\n").getBytes());
                zos.write((transaction.getAccount() + "\n").getBytes());
                zos.write((transaction.getAmount() + "\n").getBytes());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }
}
