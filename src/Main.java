import port.Point;
import port.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:\\Users\\admin\\IdeaProjects\\AssignmentOne\\src\\numbers.txt";
        Shape shape = new Shape();

        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
    }
}
