import java.util.Scanner; //Scanner implementation
public class Test { //A public class, it's called a test.
    public static void main(String[] args) { //Main class Nonsense
        Scanner scan = new Scanner(System.in); //Scanner Thingie
        System.out.println("Creation Of Position Object X: "); //Something to be user-friendly
        double choice1 = scan.nextDouble(); //Takes x value
        System.out.println("Creation Of Position Object Y: "); //More user-friendly stuff
        double choice2 = scan.nextDouble(); //Taking the y value.
        Position p = new Position(choice1, choice2); //Makes a Position object using X and Y values
        System.out.println(p); //Prints out what that object is just to check.
        System.out.println("Method (q to quit)"); //User-friendly for Friendly-User
        while (true) { //Forever Loop (Until "q" is chosen).
            String method = scan.nextLine(); //Takes whatever method the individual chooses
            switch (method) { //Checking what method the user wants and doing stuff based on it.
                case "move": //If it's the move method,
                    System.out.println("Distance: "); //User-User 
                    choice1 = scan.nextDouble(); //Takes How far to go.
                    scan.nextLine(); //Something so future scanning will cooperate with me.
                    System.out.println("Direction(N/W/E/S): "); //Something so the program's 
                    // easier to use by users, I think I'll call it being user-friendly.
                    String choice4 = scan.nextLine(); //Takes Direction
                    p.move(choice1, choice4); //Moves the object based on the inputs.
                    System.out.println(p); //Prints out object so we know about it's position.
                    break; //Get out of the switch stuff
                case "totalDistance": //If the method is the totalDistance one
                    System.out.println(p.totalDistance()); //Shows the total distance
                    break; //Get out of the switch stuff
                case "toString": //If the toString method is wanted
                    System.out.println(p); //Prints out the object
                    break; //Get out of the switch stuff
                case "q": //Incase the user wants to run and never look back,
                    System.exit(0); //Ends the program.
            } //Scanner Bracket
        } //Forever Loop Encasement Bracket
    } //Main method bracket
} //Test Class bracket (This is all the most important of information)
