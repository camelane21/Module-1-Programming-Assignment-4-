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