
public class Formula
{
    
   
    public static OrderedPair findQuadraticRoots (double a, double b, double c){ 
        double answer1 = (-b - Math.sqrt(b*b - 4.0*a*c))/ (2.0*a);
        double answer2 = (-b + Math.sqrt(b*b - 4.0*a*c))/ (2.0*a);
        
        
        OrderedPair answers = new OrderedPair(answer1, answer2);
        return answers;
    }
    
    public static double findSlope (OrderedPair A, OrderedPair B){
       
        double slope = (B.getY() - A.getY())/(B.getX() - A.getX());
        
        return slope;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double midX = (A.getX() + B.getX())/2;
        double midY = (A.getY() + B.getY())/2;
        OrderedPair answer = new OrderedPair(midX, midY);
        return answer;
    }
    
    public static double findArithmeticSeries(double a, double d, int k) {
        return (k/2.0)*(2*a+d*(k-1));
    }
    
    public static double findGeometricSeries(double a, double r, double k){
        return a*(1-Math.pow(r,k))/(1-r);
    }
    
    public static int rollDie (int sides) {
        return (int)(Math.random()*sides)+1;
    }
}
