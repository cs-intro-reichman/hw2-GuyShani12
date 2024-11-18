// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int n = Integer.parseInt(args[1]);
                int count = 0;
                String word2 = "";

                while (count < word.length())
                {
                        char c = args[0].charAt(count);
                        c = Character.toUpperCase(c);

                        if (c == 'O' || c == 'S' || c == 'A' || c == 'E' || c == 'I' || c == 'F' || c == 'X' 
                        || c == 'H' || c == 'L' || c == 'M' || c == 'N'|| c == 'R'){
                                System.out.println("Give me an " + c + ": " + c + "!");
                        }
                        else {
                                System.out.println("Give me a  " + c + ": " + c + "!");
                        }
                         word2 = word2 + c;
                        count++;
                }

                System.out.println("What does that spell?");
                for (int i = 0; i < n; i++){
                        System.out.println(word2 + "!!!");
                }

        }
}
