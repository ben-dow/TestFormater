package models;

/**
 * @author Benjamin Dow
 */
public class FileInfo {
    private String saveName;
    private String outputName;
    private String authorName;

    public FileInfo() {
    }

    public FileInfo(String saveName, String outputName, String authorName) {
        this.saveName = saveName;
        this.outputName = outputName;
        this.authorName = authorName;
    }

    public String getSaveName() {
        return saveName;
    }

    public void setSaveName(String saveName) {
        this.saveName = saveName;
    }

    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    public String getAuthorName() {

        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
