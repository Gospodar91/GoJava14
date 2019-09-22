public class Testcalc3  {
    public  void Count3(int num) {
        int a;
        a=num;
        System.out.print("Ваш шестнадцатиричный код:");
        String[] b = new String[4];
        if (a <= 9) {
            System.out.println(a);
        } else  if (a>9){
            for (int i = 0; i < b.length; i++) {
                b[i] = String.valueOf(a % 16);
                a /= 16;
                switch (b[i]) {
                    case "10":
                        b[i] = "A";
                        break;
                    case "11":
                        b[i] = "B";
                        break;
                    case "12":
                        b[i] = "C";
                        break;
                    case "13":
                        b[i] = "D";
                        break;
                    case "14":
                        b[i] = "E";
                        break;
                    case "15":
                        b[i] = "F";
                        break;
                }
            }
        }

        for (int n = 3; n >= 0; n--){
            System.out.print(b[n]);}

    }
}
