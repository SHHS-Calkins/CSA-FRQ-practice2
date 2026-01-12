public class Position { //Class Name
  //Instance Variables
  private double x; //Left/Right position
  private double y; //Up/Down position
  private double distance; //Total distance traveled. 
  //Constructor
  public Position(double xVal, double yVal) { //Creates an object with two values.
    x = xVal; //This object's x value.
    y = yVal; //This object's y value.
  }
  //Method Stuffs
  public String toString() { //Prints Coordinates.
    return "(" + x + ", " + y + ")"; //The making of the coordinate string.
  }
  public double totalDistance() { //Returns distance traveled.
    return distance; //The thing that was just said.
  }
  public void move(double mDistance, String direction) { //Move by mDistance(Moving Distance) in direction.
    distance += mDistance; //Add whatever distance was entered into the method to the Total.
    switch(direction) { //Switch-case is an alternative for multiple If-Elses.
      case "N": //If the value's "N",
        y += mDistance; // Add to y (Go Up)
        break; //Get out of the switch.
      case "W": //If the value's "W",
        x -= mDistance; // Subtract From x (Go Left)
        break; //Get out of the switch.
      case "S": //If the value's "S",
        y -= mDistance; // Subtract From y (Go Down)
        break; //Get out of the switch.
      case "E": //If the value's "E",
        x += mDistance; // Add to x (Go Right)
        break; //Get out of the switch.
    }
  }
}