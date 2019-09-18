import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        byte a;
        System.out.println("Если вы хотите посчитать число в бинарной системе нажмите 1");
        System.out.println("Если вы хотите посчитать число в восьмиричной системе  нажмите 2");
        System.out.println("Если вы хотите посчитать число в шестандцатиричной системе  нажмите 3");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextByte();
        if (a==1) {
            Testcalc1 testcalc1=new Testcalc1();
            testcalc1.Count();
        } else if (a==2) {
            Testcalc2 testcalc2=new Testcalc2();
            testcalc2.Cout2();
        }
        else if (a==3) {
            Testcalc3 testcalc3=new Testcalc3();
            testcalc3.Count3();

        }
    }
}
