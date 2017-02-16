package labWork_3_6_1;

/**
 * Created by Bulik on 27.09.2016.
 */
public final class MyClass {
   private int a = 10;
    protected int b = -10;
    public final int c = 555;
    int d = -111;

    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public int getD() {
        return d;
    }
    public void setD(int d) {
        this.d = d;
    }

    public MyClass() {
    }

    public MyClass(int a) {
        this.a = a;
    }

    public MyClass(int a, int d) {
        this.a = a;
        this.d = d;
    }

    public MyClass(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

}
