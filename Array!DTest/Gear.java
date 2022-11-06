package test6;

public class Gear {
	private String gearType;

	public Gear() {
		gearType = "manual";
	}
	
	public Gear(String auto) {
		gearType = "Automatic";
	}

	@Override
	public String toString() {
		return "[gearType=" + gearType + "]";
	}
}
