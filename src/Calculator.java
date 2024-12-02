public class Calculator {

    public int add(int a, int b) {
        return a+b;
    }

    public int substract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public float divide(float a, float b) {
        if (b == 0) {
            System.out.println("Nie można dzielić przez 0");
            return -999;
        } else {
            return (a / b);
        }
    }

    public int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Nie można dzielić modulo przez 0");
            return -888;
        } else {
            return (a % b);
        }
    }
}
