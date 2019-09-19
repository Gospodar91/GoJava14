import java.util.Scanner;

public class Testcalc1   {
    public  void Count(int num) { //-------------перевод в двоичную систему
        int countNumber;
        int[] binaryArray = new int[10];
        countNumber=num;
        System.out.print("Ваш бинарный код:");
        for (int i = 0; i < binaryArray.length; i++) {     // записываем данные в массив  с помощью цикла
            binaryArray[i] = (countNumber%2);
            countNumber /= 2;
        }
        for (int n = 3; n >= 0; n--) // считываем данные из массива в обратном порядке начиня с 4го элемента
                System.out.print(binaryArray[n]);
        }

    }


