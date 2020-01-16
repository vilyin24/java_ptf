package SecondTask;

public class Point {
  double[] coordinatFistPoint = {1,1};
  double[] coordinatTwisePoint = {4,5};

  double p1 = coordinatX(coordinatFistPoint[0],coordinatTwisePoint[0]);
  double p2 = coordinatY(coordinatFistPoint[1],coordinatTwisePoint[1]);

  public double coordinatX ( double x1, double x2){
    return x2 - x1;

  }

  public double coordinatY ( double y1, double y2){
    return y2- y1 ;

  }
  public double distance( double p1, double p2){
    return Math.sqrt(p1 * p1 + p2 * p2);
  }

}

