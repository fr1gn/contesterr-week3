package port;
import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        this.points = points;
    }

    public void addPoint(Point point) {
        points.add(point);
    }
    public double perimeter() {
        double result = 0;
        int numPoints = points.size();
        for(int i = 0; i<numPoints-1; i++) {
            result+= points.get(i).distanceTo(points.get(i + 1));
        }
        result += points.get(numPoints - 1).distanceTo(points.get(0));
        return result;
    }
    public double longestSide() {
        double result = 0;
        int numPoints = points.size();
        for (int i = 0; i < numPoints - 1; i++) {
            double currentSide = points.get(i).distanceTo(points.get(i + 1));
            result = Math.max(result, currentSide);
        }
        double lostSide = points.get(numPoints - 1).distanceTo(points.get(0));
        result = Math.max(result, lostSide);
        return result;
    }
    public double AverageSide() {
        double result = 0;
        int numPoints = points.size();
        for (int i = 0; i < numPoints - 1; i++) {
            result += points.get(i).distanceTo(points.get(i + 1));
        }

        result += points.get(numPoints - 1).distanceTo(points.get(0));

        return result / numPoints;
    }
}
