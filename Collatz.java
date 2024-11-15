// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int seed = Integer.parseInt(args[0]);
		String s = args[1];

		for (int i = 1; i <= seed; i++)
		{
            int count = 1;
			int num = i;
			boolean b = false;

			if (s.equals("V")){
				System.out.print(i + " ");
			}
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
		}
		System.out.print("Every one of the first " + seed + " hailstone sequences reached 1.");
	}
}
