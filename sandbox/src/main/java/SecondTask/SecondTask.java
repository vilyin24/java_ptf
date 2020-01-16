package SecondTask;

public class SecondTask {
  Point s = new Point();


  public static void main(String[] args) {

    Point s = new Point();
    System.out.println(distance(s));
  }
  public static double distance(Point s){
    return Math.sqrt(s.p1*s.p1 + s.p2*s.p2);
  }

}
