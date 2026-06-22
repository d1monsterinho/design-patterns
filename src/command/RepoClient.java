package command;

public class RepoClient {
    public void makeCommitAndRevert() {
        Repo repo = new Repo();

        Command goodChangeCommitCommand = new CommitCommand(repo, "Good change");
        Command badChangeCommitCommand = new CommitCommand(repo, "Bad change");

        goodChangeCommitCommand.execute();
        badChangeCommitCommand.execute();

        Command revertBadChangeCommand = new RevertCommand(repo, badChangeCommitCommand.getCommitHash());
        revertBadChangeCommand.execute();

        System.out.println(repo.getCommitToChangeMap());
    }
}
