package iterator;

import iterator.dto.Commit;

public abstract class AbstractCommitGraph implements Iterable {
    protected Commit rootCommit;

    public AbstractCommitGraph(Commit graphRoot) {
        this.rootCommit = graphRoot;
    }

    public Commit getRootCommit() {
        return rootCommit;
    }
}
