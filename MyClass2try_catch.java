package Revision;

public class MyClass2try_catch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=0;
		int c=0;
		myMtd(a,b,c);
		System.out.println("Main method");
	}

	private static void myMtd(int a, int b, int c) {
		// TODO Auto-generated method stub
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("divide by zero not possible");
			System.out.println("Method123");
		}
		System.out.println("Done!!!!");
		
	}

}
