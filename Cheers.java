// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int n = Integer.parseInt(args[1]);
                int count = 0;
                word = word.toUpperCase();

                while (count < word.length())
                {
                        char c = args[0].charAt(count);
                        c = Character.toUpperCase(c);

                        if (args[0].charAt(count) == 'O' || args[0].charAt(count) == 'U' || args[0].charAt(count) == 'A' || args[0].charAt(count) == 'E' 
                        || args[0].charAt(count) == 'I' || args[0].charAt(count) == 'F' || args[0].charAt(count) == 'X' || args[0].charAt(count) == 'H' 
                        || args[0].charAt(count) == 'L' || args[0].charAt(count) == 'M' || args[0].charAt(count) == 'N'|| args[0].charAt(count) == 'R'){
                        System.out.println("Give Me an " + c + ": " + c + "!");
                        }
                        else {
                                System.out.println("Give Me a  " + c + ": " + c + "!");
                        }
                        
                        count++;
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < n; i++){
                        System.out.println(word + "!!!");
                }

        }
}
