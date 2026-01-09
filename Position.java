public class Position {
  
  private double x;
  private double y;
  private double distance;
  
  public Position(double xVal, double yVal) {
    x = xVal;
    y = yVal;
  }
  public String toString() {
    return "(" + x + ", " + y + ")";
  }
  public double totalDistance() {
    return distance;
  }
  public void move(double mDistance, String direction) {
    distance += mDistance;
    switch(direction) {
      case "N": 
        y += mDistance;
        break;
      case "W": 
        x -= mDistance;
        break;
      case "S": 
        y -= mDistance;
        break;
      case "E": 
        x += mDistance;
        break;
    }
  }
}