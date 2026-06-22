package command;

public class RevertCommand extends Command {
    private final Integer commitHash;

    public RevertCommand(Repo repository, Integer commitHash) {
        super(repository);
        this.commitHash = commitHash;
    }

    @Override
    public Integer execute() {
        return repository.revertCommit(commitHash);
    }
}
