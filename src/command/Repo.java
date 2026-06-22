package command;

import java.util.LinkedHashMap;
import java.util.Map;

public class Repo {
    private final Map<Integer, String> commitToChangeMap;

    public Repo() {
        this.commitToChangeMap = new LinkedHashMap<>();
    }

    public Map<Integer, String> getCommitToChangeMap() {
        return commitToChangeMap;
    }

    public Integer makeCommit(String commitChange) {
        Integer commitHash = generateCommitHash(commitChange);
        commitToChangeMap.put(commitHash, commitChange);

        return commitHash;
    }

    public Integer revertCommit(Integer commitHash) {
        Integer revertHash = generateCommitHash(commitToChangeMap.get(commitHash) + "revert");
        commitToChangeMap.put(revertHash, String.format("Revert Commit of %s", commitHash));

        return revertHash;
    }

    private Integer generateCommitHash(String commitChange) {
        return (int) (Math.random() * 100_000) + commitChange.hashCode();
    }
}
