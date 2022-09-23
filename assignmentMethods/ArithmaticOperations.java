package assignmentMethods;

public class ArithmaticOperations {

	double addition(double x, double y) {
		return x + y;
	}

	double substract(double x, double y)// substracts y from x
	{
		return x - y;
	}

	double multiply(double x, double y) {
		return x * y;
	}

	double divide(double x, double y) {
		return x / y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArithmaticOperations obj=new ArithmaticOperations();
		double answer=0;
		//=obj.addition(4.56, 3.043);
		//answer=obj.substract(2.32, 0.879);
		//answer=obj.multiply(2.32, 0.879);
		answer=obj.divide(2.32, 0.879);
		System.out.print(answer);
		
		
	}

}
