import java.util.Scanner;

public class Testcalc1 {
    public  void Count() { //---------------------------------- перевод в двоичную систему
        byte countNumber, variable;
        byte[] binaryArray = new byte[7];
        System.out.println("Введите число от -128 до 127:");
        Scanner scanner01 = new Scanner(System.in);
        countNumber = scanner01.nextByte();
        variable = countNumber;
        System.out.print("Ваш бинарный код:");
        for (int i = 0; i < binaryArray.length; i++) {     // записываем данные в массив  с помощью цикла
            if (countNumber % 2 == 0) {
                // binaryArray[i] = (byte) (countNumber%2);
            } else {
                binaryArray[i] = 1;
            }
            countNumber /= 2;
        }
        if (variable > 0) {
            for (int n = 3; n >= 0; n--) // считываем данные из массива в обратном порядке начиня с 4го элемента
                System.out.print(binaryArray[n]);

        } else if (variable < 0) {               //для перевода отрицательных бинарных чисел
            switch (binaryArray[0]){
                case 0:
                    binaryArray[0]=1;
                    break;
                case 1:
                    binaryArray[0]=0;
                    break;
            }
            for (int n = 3; n >= 0; n--){
                System.out.print(binaryArray[n]);}

        }
        else if (variable==0){
            System.out.println("0");
        }

    }
}

