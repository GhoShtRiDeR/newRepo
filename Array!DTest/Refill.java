package test6;

public class Refill {
	private String inkColor;
	private double length;// in cm
	private Nib tip;
	
	
	public String getInkColor() {
		return inkColor;
	}
	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getTip() {
		return "Materail-Type: "+tip.getMaterialType()+"\n Width: "+tip.getWidth()+"mm";
	}
	public void setTip(Nib tip) {
		this.tip = tip;
	}

	

	
}
