package test6;

public class SubEngine {
	
	private String subEngineType;

	public String getSubEngineType() {
		return subEngineType;
	}

	public void setSubEngineType(String subEngineType) {
		this.subEngineType = subEngineType;
	}

	@Override
	public String toString() {
		return "[subEngineType=" + subEngineType + "]";
	}
	
	

}
