package iterator.dto;

public class Commit {
    private Commit parent;
    private Integer hash;
    private String message;

    public Commit(Commit parent, String message) {
        this.parent = parent;
        this.message = message;
        hash = hashCode() + parent.message.hashCode() + message.hashCode();
    }

    public Commit getParent() {
        return parent;
    }

    public Integer getHash() {
        return hash;
    }

    public String getMessage() {
        return message;
    }
}
