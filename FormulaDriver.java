import java.util.Scanner;

public class FormulaDriver
{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        System.out.println ("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        
        OrderedPair roots = Formula.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for "+a+"x^2 + "+b+"x + "+c+" are (" + roots+").");
        System.out.println();
        
        System.out.println ("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
                
        OrderedPair A = new OrderedPair(x1, y1);
        OrderedPair B = new OrderedPair(x2, y2);
        double slope = Formula.findSlope(A, B);
        
        System.out.println("A line between ("+A+") and ("+B+") has a slope of "+slope+".");
        System.out.println();
    
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        
        A = new OrderedPair(x1, y1);
        B = new OrderedPair(x2, y2);
        System.out.println("The midpoint between (" + A + ") and (" + B + ") is ("+Formula.findMidpoint(A,B)+").");
        System.out.println();
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        double a1 = input.nextDouble();
        System.out.print("Increases by: ");
        double d = input.nextDouble();;
        double sum = Formula.findArithmeticSeries(a1, d, k);
        System.out.println("The sum of the first " +k+" terms of an arithmetic series that starts with "+a1+" and increases by "+d+" is "+sum+".");
        System.out.println();
        
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        a1 = input.nextDouble();
        System.out.print("Rate of growth: ");
        double r = input.nextDouble();
        double sum2 = Formula.findGeometricSeries(a1, r, k);
        System.out.println("The sum of the first "+k+" terms of a finite geometric series that starts with "+a1+" and increases by a rate of "+r+" is "+sum2+".");
        System.out.println();
        
        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int n = input.nextInt();
        System.out.println("Rolling a " + n + "-sided die... you got a "+Formula.rollDie(n)+"!");
    }
}
