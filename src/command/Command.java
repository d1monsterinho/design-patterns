package command;

public abstract class Command {
    public final Repo repository;
    public Integer commitHash;

    public Command(Repo repository) {
        this.repository = repository;
    }

    public abstract Integer execute();

    public Integer getCommitHash() {
        return commitHash;
    }
}
