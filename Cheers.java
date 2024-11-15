// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int n = Integer.parseInt(args[1]);
                int count = 0;

                while (count < word.length())
                {
                        if (args[0].charAt(count) == 'O' || args[0].charAt(count) == 'U' || args[0].charAt(count) == 'A' || args[0].charAt(count) == 'E' || args[0].charAt(count) == 'I' ){
                        System.out.println("Give Me an " + args[0].charAt(count) + ": " + args[0].charAt(count) + "!");
                        }
                        else {
                                System.out.println("Give Me a  " + args[0].charAt(count) + ": " + args[0].charAt(count) + "!");
                        }
                        
                        count++;
                }

                for (int i = 0; i < n; i++){
                        System.out.println(word + "!!!");
                }

        }
}
