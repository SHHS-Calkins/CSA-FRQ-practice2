import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Creation Of Position Object X: ");
        double choice1 = scan.nextDouble();
        System.out.println("Creation Of Position Object Y: ");
        double choice2 = scan.nextDouble();
        Position p = new Position(choice1, choice2);
        System.out.println(p);
        System.out.println("Method (q to quit)");
        while (true) { //Forever Loop (Until "q" is chosen).
            String method = scan.nextLine();
            switch (method) {
                case "move":
                    System.out.println("Distance: ");
                    choice1 = scan.nextDouble();
                    System.out.println("Direction(N/W/E/S): ");
                    String choice4 = scan.nextLine();
                    p.move(choice1, choice4);
                    System.out.println(p);
                    break;
                case "totalDistance":
                    System.out.println(p.totalDistance());
                    break;
                case "toString":
                    System.out.println(p);
                    break;
                case "q":
                    System.exit(0); //Ends the program.
            }
        }
    }
}
