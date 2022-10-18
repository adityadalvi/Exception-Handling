package Revision;

public class PossibleCombinationsTry_Catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=0;
		int c=0;

		//only try not possible
		/*try
		{

		}*/


		//only catch not possible
		/*catch
		{

		}*/


		//only finally not possible
		/*finally {

		}*/


		//try-catch
		/*try {
			c=a/b;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("handled");
		}*/


		//finally block will excute first then it will throw exception object(exception_name, description,stacktrace)
		/*try {
			c=a/b;
		} finally {
			// TODO: handle finally clause
			System.out.println("Finally block will execute");
		}*/


		//try-catch inside try
		/*try {
			try {

			} catch (Exception e) {
				// TODO: handle exception
			}
		} catch (Exception e) {
			// TODO: handle exception
		}*/

		//try-catch inside catch
		/*try {

		} catch (Exception e) {
			// TODO: handle exception
			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}*/

		
		//try-catch inside finally
		/*try {

		} finally {
			// TODO: handle finally clause
			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}*/
		
		
		//statement between try and catch block gives error(catch without try)
		/*try {
			
		}
		System.out.println("endkjwnjcnkj");
		catch (Exception e) {
			// TODO: handle exception
		}*/
		
		

	}

}
