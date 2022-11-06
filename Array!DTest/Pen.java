package test6;

/*A Pen contains variables Refill, capLength and brand. Refill has variables
inkColor, length and Nib (tip). Nib has variables materialType and width. Create
a  class structure for above. Write a main method which sets values in all the variables
using setter methods and prints all the variables using getter methods. 
*/

public class Pen {

	private double caplength;
	private String brand;
	private Refill refill;

	public String getCaplength() {
		return "Cap Length: "+caplength;
	}

	public void setCaplength(double caplength) {
		this.caplength = caplength;
	}

	public String getBrand() {
		return "Brand name: "+brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void penDetails() {
		System.out.print(this.getBrand()+"\n"+this.getCaplength()+"\n"+this.getRefill());
	}

	public static void main(String[] args) {
		Nib ballpoint = new Nib();
		ballpoint.setMaterialType("brass");
		ballpoint.setWidth(0.2);
		
		Refill some = new Refill();
		some.setInkColor("Blue");
		some.setLength(12.5);
		some.setTip(ballpoint);
		
		Pen goldex = new Pen();
		goldex.setBrand("Neo");
		goldex.setCaplength(4.2);
		goldex.setRefill(some);
		
		goldex.penDetails();

	}

	public String getRefill() {
		return "Ink Color: "+refill.getInkColor()+"\nRefill Length: "+refill.getLength()+
				"\nNib details:\n "+refill.getTip();
	}

	public void setRefill(Refill refill) {
		this.refill = refill;
	}

}
