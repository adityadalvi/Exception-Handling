package Revision;

public class ThrowsKeyword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int a=100;
		int b=0;
		System.out.println("Main Mtd");
		//mtd1();
		try 
		{
			mtd1(a,b);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("dnewjdnwjcnkweckmcklmwklm");		
	}

	private static void mtd1(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("mtd1");
		mtd2(a,b);	
	}

	private static void mtd2(int a, int b) throws Exception {
		// TODO Auto-generated method stub
		int c=a/b;
		System.out.println("mtd2");
		
	}


}
