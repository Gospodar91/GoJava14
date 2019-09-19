import javax.swing.text.View;
import java.util.Scanner;
public class Main {
    static int i=1;

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
         Testcalc1 testcalc1 = new Testcalc1();
         testcalc1.Count(num);
         System.out.println();
         Testcalc2 testcalc2 = new Testcalc2();
         testcalc2.Cout2(num);
         System.out.println();
         Testcalc3 testcalc3 = new Testcalc3();
         testcalc3.Count3(num);

    }
}

