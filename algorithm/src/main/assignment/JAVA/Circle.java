package JAVA;

class Circle {
    static final double PI = 3.14;
    private  int r; //반지름
    public Circle() {
        r = 0;
    }
    public Circle(int a){
        r = a;
    }
    public int gerR() {
        return this.r;
    }
    public void setR(int r) {
        this.r = r;
    }
    public double getArea() {
        return r * r * PI ;
    }


}
