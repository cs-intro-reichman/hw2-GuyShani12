// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]);
		System.out.println("pi according to Java: " + Math.PI);
		double pi = 1;
		double x = 3;
		double y = 5;

		for (int i = 1; i < n; i++)
		{
			if (i % 2 != 0){
				pi = pi - (1 / x);
			    x = x + 4; 
			}
			else {
				pi = pi + (1 / y);
			    y = y + 4; 
			}
		}
		System.out.print("pi approximated: " + pi * 4);
	}
}
