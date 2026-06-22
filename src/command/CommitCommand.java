package command;

public class CommitCommand extends Command {
    private final String commitChange;

    public CommitCommand(Repo repository, String commitChange) {
        super(repository);
        this.commitChange = commitChange;
    }

    @Override
    public Integer execute() {
        commitHash = repository.makeCommit(commitChange);
        return commitHash;
    }

    public Integer getCommitHash() {
        return commitHash;
    }
}
