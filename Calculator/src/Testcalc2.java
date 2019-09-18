import java.util.Scanner;

public class Testcalc2 {
    public void Cout2() {
        int a;
        int []b=new int[5];
        System.out.println("Введите число:");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("Ваш результат:");
        if (a<=8){
            System.out.println(a);
        }
        else if (a>9){
            for(int i=0;i<b.length;i++){
                b[i]=a%8;
                a/=8;
            }
            for (int n = 4; n >= 0; n--){
                System.out.print(b[n]);}
        }
        else if (a==0){
            System.out.println("0");
        }

    }
}
