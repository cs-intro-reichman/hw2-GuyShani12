// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String s = args[1];
		int loop = 1;

		if (s.equals("V") || s.equals("v")){
		for (int i = 1; i <= seed; i++)
		{
            int count = 1;
			int num = i;
			boolean b = false;

			System.out.print(loop + " ");

			while (b == false)
			{
				if (num % 2 == 0){
					num = num / 2;
					System.out.print(num + " ");
				}
				else {
					num = num * 3 + 1;
					System.out.print(num + " ");
				}
				if (num == 1){
					b = true;
				}
				count++;
			}
			System.out.println("(" + count + ")");
			loop++;
		}
	    }
		System.out.print("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
