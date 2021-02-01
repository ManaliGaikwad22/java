import java.util.*;

class Complex {
    int real;
    int img;

    public Complex(int r, int i) {
        real = r;
        img = i;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex((a.real + b.real), (a.img + b.img));
    }

    public static Complex diff(Complex a, Complex b) {
        return new Complex((a.real - b.real), (a.img - b.img));
    }

    public static Complex product(Complex a, Complex b) {
        return new Complex(((a.real * b.real) - (a.img * b.img)), ((a.real * b.real) + (a.img * b.img)));
    }

    public void printComplex() {
        if (real == 0 && img != 0) {
            System.out.println(img);
        } else if (img == 0 && real != 0) {
            System.out.println("real");
        } else {
            System.out.println(real);
            System.out.println(img);

        }
    }
}

public class tasksixonee {
    public static void main(String[] args)
    {
        Complex c = new Complex(10,7);
        Complex d = new Complex(20,15);

        Complex ad = Complex.add(c,d);
        Complex dif = Complex.diff(c,d);
        Complex pr = Complex.product(c,d);
        ad.printComplex();
        dif.printComplex();
        pr.printComplex();

    }
}
