package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if(str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }
        String newstr = str.stripTrailing();
        return newstr.charAt(newstr.length()-1);
    }

    public String findFileExtension(String fileName) {
        if(fileName == null || fileName.strip().isEmpty() || fileName.length() == 1 || fileName.indexOf(".") == 0 || fileName.indexOf(".") == fileName.length()-1) {
            throw new IllegalArgumentException("Invalid file name!");
        }
        return fileName.substring(fileName.indexOf("."));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if(fileName == null || fileName.strip().isEmpty() || fileName.length() == 1 || fileName.indexOf(".") == 0 || fileName.indexOf(".") == fileName.length()-1) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(ext == null || ext.strip().isEmpty()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        String[] separated = fileName.split("\\.");
        return separated[1].equals(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if(searchedFileName == null || searchedFileName.strip().isEmpty()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        if(actualFileName == null || actualFileName.strip().isEmpty()) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        return actualFileName.equalsIgnoreCase(searchedFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        if(fileName == null || fileName.strip().isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }
        if(fileName.length() == 1 || fileName.indexOf(".") == 0 || fileName.indexOf(".") == fileName.length()-1) {
            throw new IllegalArgumentException("Invalid argument!");
        }
        String ext = fileName.substring(fileName.indexOf(".") + 1);
        return fileName.replace(ext, ext.toLowerCase());
    }

    public String replaceStringPart(String fileName, String present, String target) {

        if(fileName == null || fileName.strip().isEmpty()) {
            throw new IllegalArgumentException("Empty string!");
        }
        return fileName.replace(present, target);
    }
}
