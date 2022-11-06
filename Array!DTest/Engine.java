package test6;

public class Engine {
	private int engineId;
	private String lastenginecleandate;
	private SubEngine subEngine;
	
	public Engine(int engineId, String lastenginecleandate, SubEngine subEngine) {
		this.engineId = engineId;
		this.lastenginecleandate = lastenginecleandate;
		this.subEngine = subEngine;
	}

	@Override
	public String toString() {
		return "[engineId=" + engineId + ", lastenginecleandate=" + lastenginecleandate + ", subEngine="
				+ subEngine + "]";
	}
	
	
	
}
