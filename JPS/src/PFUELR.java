import java.util.Scanner;

public class PFUELR {
    public void show() {
        System.out.println("Enter PFUELR string");
        Scanner scanner = new Scanner(System.in);
        String string = new String();
        string = scanner.nextLine();
        String substring = string.substring(1, 7);
        System.out.println("Source:" + substring);
        int start = 7;
        int end = 17;
        char dst[] = new char[end - start];
        string.getChars(start, end, dst, 0);           //получение элементов строки в массиве
        System.out.println("Getting time:" + dst[0] + "" + dst[1] + "\t" + "hours" + "\t" +
                +dst[2] + "\t" + "minutes" + "\t" + dst[4] + "" + dst[5]
                + "" + dst[7] + dst[8] + dst[9] + "\t" + "seconds UTC");
        String words[]=string.split(",",70);
        int fuelmode= Integer.parseInt(words[2]);
        float fuelrate= Float.parseFloat(words[3]);
        float odmvalue= Float.parseFloat(words[4]);
        String ctm200=(words[6]);
        System.out.println("Fuel mode:"+fuelmode);
        System.out.println("Fuel rate:"+fuelrate);
        System.out.println("Odontometer value:"+odmvalue);
        start = 30;
        end = 37;
        string.getChars(start, end, dst, 0);
        System.out.println("Date:" + dst[0] + "" + dst[1] + "/" + dst[2] + "" + dst[3] + "/" + "20" + dst[4] + "" + dst[5]);
        System.out.println("CTM-200's user settable name:"+ctm200);

    }
    }

//$PFUELR,225623.00,1,8.9,27542,201011,09604890968*0F