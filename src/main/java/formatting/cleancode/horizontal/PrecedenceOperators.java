package src.main.java.formatting.cleancode.horizontal;

/*Notice how nicely the equations read.
        The factors have no white space between them because they are high precedence.
        The terms are separated by white space because addition and subtraction are lower precedence.*/

public class PrecedenceOperators {

    public static double root1(double a, double b, double c) {
        double determinant = determinant(a, b, c);
        return (-b + Math.sqrt(determinant))/(2*a);
    }

    public static double root2(int a, int b, int c) {
        double determinant = determinant(a, b, c);
        return (-b - Math.sqrt(determinant))/(2 * a);
    }

    private static double determinant(double a, double b, double c) {

        return b*b-4*a*c;
    }
}

