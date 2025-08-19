
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Queue;

public class FIFOConsensus extends ConsensusProtocol {
    private Queue<Integer> queue = new LinkedList<>();

    public FIFOConsensus(int threadCount) {
        // done?
        super(threadCount);
    }

    @Override
    public int decide(int threadId, int value) {
        // done

        // //METHOD 1: First unique value wins.
        // propose(threadId, value);

        // if(!queue.contains(value)){
        // queue.add(value);
        // }

        // return queue.peek();

        // Method 2: First threads value wins
        propose(threadId, value);

        if (queue.isEmpty()) {
            queue.add(value);
        }

        return queue.peek();
    }
}
