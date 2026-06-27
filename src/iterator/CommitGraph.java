package iterator;

import iterator.dto.Commit;

public class CommitGraph extends AbstractCommitGraph {

    public CommitGraph(Commit graphRoot) {
        super(graphRoot);
    }

    @Override
    public BasicIterator createIterator() {
        return null;
    }
}
