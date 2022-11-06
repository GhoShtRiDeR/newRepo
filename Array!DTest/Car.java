package test6;

/*There are four classes a) Car (carId, carcolor) b) Engine
(engineid ,lastenginecleandate) c) SubEngine (subenginetype)
d) Gear (type - auto manual)
Car has Engine, Engine has SubEngine, Car also has Gear
Create Object in Object (Containment) for above scenario 
*/

public class Car {
	private int carId;
	private String corcolor;
	private Engine engine;
	private Gear gear;
	public Car(int carId, String corcolor, Engine engine, Gear gear) {
	
		this.carId = carId;
		this.corcolor = corcolor;
		this.engine = engine;
		this.gear = gear;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", corcolor=" + corcolor + ", engine=" + engine + ", gear=" + gear + "]";
	}



	public static void main(String[] a) {
		SubEngine xyz = new SubEngine();
		xyz.setSubEngineType("A");
		Engine flat = new Engine(101,"1/06/2022",xyz);
		Gear mnl = new Gear();
		Car fiat = new Car(1011,"White",flat,mnl);
		
		System.out.println(fiat);
	}
}
