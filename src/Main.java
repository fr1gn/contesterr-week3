import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float n = scanner.nextFloat();
        float res = 0;
        for(int i = 0; i < n; i++) {
            res+=a;
        }
        System.out.println(res);
    }
}