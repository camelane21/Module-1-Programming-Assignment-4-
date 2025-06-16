public class Main {
    public static void main(String[] args) {
        // 1) default triangle
        RegularPolygon p1 = new RegularPolygon();
        // 2) hexagon with side=4
        RegularPolygon p2 = new RegularPolygon(6, 4);
        // 3) decagon side=4 centered at (5.6, 7.8)
        RegularPolygon p3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.printf("Polygon 1: perimeter = %.3f, area = %.3f%n",
                          p1.getPerimeter(), p1.getArea());
        System.out.printf("Polygon 2: perimeter = %.3f, area = %.3f%n",
                          p2.getPerimeter(), p2.getArea());
        System.out.printf("Polygon 3: perimeter = %.3f, area = %.3f%n",
                          p3.getPerimeter(), p3.getArea());
    }
}

class RegularPolygon {
    private int    n;
    private double side;
    private double x;
    private double y;

    /** No-arg: 3 sides, side length 1, center at (0,0) */
    public RegularPolygon() {
        this(3, 1.0, 0.0, 0.0);
    }

    /** n-sided, given side length, center at origin */
    public RegularPolygon(int n, double side) {
        this(n, side, 0.0, 0.0);
    }

    /** n-sided, given side length and center (x, y) */
    public RegularPolygon(int n, double side, double x, double y) {
        this.n    = n;
        this.side = side;
        this.x    = x;
        this.y    = y;
    }
     // Accessors and mutators
    public int    getN()    { return n; }
    public void   setN(int n)    { this.n = n; }
    public double getSide() { return side; }
    public void   setSide(double side) { this.side = side; }
    public double getX()    { return x; }
    public void   setX(double x)    { this.x = x; }
    public double getY()    { return y; }
    public void   setY(double y)    { this.y = y; }

    /** Perimeter = n × side */
    public double getPerimeter() {
        return n * side;
    }

    /**
     * Area = (n × s²) / (4 × tan(π / n))
     */
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
}