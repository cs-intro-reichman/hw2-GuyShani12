public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int added = Integer.parseInt(args[1]);

        int totalMinutes = added + minutes + (hours * 60);
        int newMinutes = totalMinutes % 60;
        int newHours = (totalMinutes / 60) % 24;

        if (newHours < 10){
            if (newMinutes < 10){
            System.out.println("0" + newHours + ":0" + newMinutes);
            }
            else {
                System.out.println("0" + newHours + ":" + newMinutes);
            }
        }
        else {
            if (newMinutes < 10){
                System.out.println(newHours + ":0" + newMinutes);
                }
                else {
                    System.out.println(newHours + ":" + newMinutes);
        }
        }
    }
}
