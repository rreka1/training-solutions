package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    List<Production> productions = new ArrayList<>();
    List<Vote> votes = new ArrayList<>();

    public void readTalents(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                productions.add(new Production(id, name));
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public void calculateVotes(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                int id = Integer.parseInt(line);
                addVote(id);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("can not read file", ioe);
        }
    }

    public void writeResultToFile(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (Vote vote : votes) {
                Production production = findProductionById(vote.getId());
                pw.print(vote.getId() + " ");
                pw.print(production.getName() + " ");
                pw.println(vote.getNumber());
            }
            pw.print("Winner: " + findWinner().getName());
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not write file", ioe);
        }
    }

    public List<Production> getProductions() {
        return new ArrayList<>(productions);
    }

    public List<Vote> getVotes() {
        return new ArrayList<>(votes);
    }

    private void addVote(int id) {
        boolean exist = false;
        for (Vote vote : votes) {
            if (vote.getId() == id) {
                vote.incNum();
                exist = true;
            }
        }
        if (!exist) {
            votes.add(new Vote(id, 1));
        }
    }

    private Production findProductionById(int id) {
        for (Production production : productions) {
            if (production.getId() == id) {
                return production;
            }
        }
        throw new IllegalArgumentException("Production not found");
    }

    private Production findWinner() {
        int max = votes.get(0).getNumber();
        int maxId = votes.get(0).getId();
        for (Vote vote : votes) {
            if (vote.getNumber() > max) {
                max = vote.getNumber();
                maxId = vote.getId();
            }
        }
        for (Production production : productions) {
            if (maxId == production.getId()) {
                return production;
            }
        }
        return null;
    }
}
