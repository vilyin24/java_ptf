public class Point {

  double[] coordinatFistPoint = new double[]{1.0D, 1.0D};
  double[] coordinatTwisePoint = new double[]{8.0D, 10.0D};

  public static void main(String[] args) {
    Point one = new Point();
    double answer = one.distance(one.coordinatX(one.coordinatFistPoint[0], one.coordinatTwisePoint[0]), one.coordinatY(one.coordinatFistPoint[1], one.coordinatTwisePoint[1]));
    System.out.println("Растояние между точками = " + answer);
  }

  public double coordinatX(double x1, double x2) {
    return x2 - x1;
  }

  public double coordinatY(double y1, double y2) {
    return y2 - y1;
  }

  public double distance(double p1, double p2) {
    return Math.sqrt(p1 * p1 + p2 * p2);

  }
}
