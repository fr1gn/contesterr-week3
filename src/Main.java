import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import port.Shape;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "numbers.txt";


        Shape shape = new Shape();


        Scanner scanner = new Scanner(new File(filePath));

        while (scanner.hasNext()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();

            port.Point point = new port.Point((int) x, (int) y);
            shape.addPoint(point);
        }


        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());

    }
}