import java.util.Vector;

public abstract class ConsensusProtocol{

    private int threadCount;
	protected Vector<Integer> proposed;

	public ConsensusProtocol(int threadCount)	{
		//TODO: Implement    
	}

	void propose(int threadId, int value)	{
		//TODO: Implement function   
	}

	public abstract int decide(int id, int value);
}
