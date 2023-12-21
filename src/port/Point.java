package port;

public class Point {
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point destination) {
        double deltaX = destination.getX() - this.x;
        double deltaY = destination.getY() - this.y;

        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
