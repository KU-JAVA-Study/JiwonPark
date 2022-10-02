package chapter04;

class Circle {
    private final double x;
    private final double y;
    private final int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.printf("(%.1f,%.1f) %d\n", x, y, radius);
    }

    public int getRadius() {
        return radius;
    }
}