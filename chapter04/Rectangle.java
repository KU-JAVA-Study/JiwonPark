package chapter04;

class Rectangle {
    private final int x;
    private final int y;
    private final int width;
    private final int height;

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void show() {
        System.out.printf("(%d,%d)에서 크기가 %d x %d인 사각형\n", x, y, width, height);
    }

    public int square() {
        return width * height;
    }

    boolean contains(Rectangle r) {
        if (x < r.x && y < r.y)
            return (width + x) > (r.x + r.width) && (height + y) > (r.y + r.height);
        return false;
    }
}