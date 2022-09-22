package test4;
class Q11{
	static int a=2;
	  void add(int a){
          this.a =  a + 1;
      }
      void add(int a , int b){
    	  add(a);
          this.a +=  a + 2;
      }        

	
}
public class Q1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5, j = 2;
		System.out.println(j++ - --j - i++ + ++i - 7- - + - -2 + j++ - i++ * j--);

		int x = 4;

		System.out.println(x++ + ++x - ++x + --x + x-- - x++ + x-- - x++ - --x + x++);
		Q11 obj=new Q11();
		obj.add(6, 7);    

		System.out.print(obj.a);
	}

}
