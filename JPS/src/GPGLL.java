import java.util.Scanner;

public class GPGLL {
    public void show() {
        System.out.println("Enter GPGLL string");
        Scanner scanner = new Scanner(System.in);
        String string = new String();
        string = scanner.nextLine();
        String substring = string.substring(1, 6);
        System.out.println("Source:" + substring);
        String words[] = string.split(",", 74);
       float lattitude = Float.parseFloat(words[1]);
        String ns=words[2];
        float longitude = Float.parseFloat(words[3]);
        String ew=words[4];
        String flag=words[6];
        System.out.println("Lattitude:" + lattitude + "" + "N=North,S=South" + "\t:" + ns);
        System.out.println("Longitude:" + longitude + "" + "E=East;W=West" + "\t:" + ew);
        int start = 32;
        int end = 42;
        char dst[] = new char[end - start];
        string.getChars(start, end, dst, 0);           //получение элементов строки в массиве
        System.out.println("Getting time:" + dst[0] + "" + dst[1] + "\t" + "hours" + "\t" +
                +dst[2] + "\t" + "minutes" + "\t" + dst[4] + "" + dst[5]
                + "" + dst[7] + dst[8] + dst[9] + "\t" + "seconds UTC");
        System.out.println("data validity flag: A = valid current data, " +
                "B = valid stored data, " +
                "V = invalid current data, W = invalid stored data:"+flag);



    }
}





















//$GPGLL,llll.llll,a,yyyyy.yyyy,b,hhmmss.ss,v*hh<CR><LF>