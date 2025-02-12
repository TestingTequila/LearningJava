package day20;

public class C {
    int i;
    String s;

    boolean b;

    public C(int i, String s, boolean b) {
        this.i = i;
        this.s = s;
        this.b = b;
    }

    public C(String s, boolean b) {
        this.s = s;
        this.b = b;
    }

    public C()
    {
        this.i=500;
        this.s = "Don";
        this.b =true;

    }
}
