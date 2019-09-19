import java.util.Scanner;

public class PACCEI {
    public void show(){
        System.out.println("Enter PACCEI String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String substring=string.substring(1,7);
        System.out.println("Source:"+substring);
        int start = 7;
        int end = 17;
        char dst[] = new char[end - start];
        string.getChars(start, end, dst, 0);           //получение элементов строки в массиве
        System.out.println("Getting time:" + dst[0] + "" + dst[1] + "\t" + "hours" + "\t" +
                +dst[2] + "\t" + "minutes" + "\t" + dst[4] + "" + dst[5]
                + "" + dst[7] + dst[8] + dst[9] + "\t" + "seconds UTC");
        String words[]=string.split(",",70);
        float time=Float.parseFloat(words[1]);
        float lattitude = Float.parseFloat(words[2]);
        float longitude = Float.parseFloat(words[4]);
        float velocity=Float.parseFloat(words[6]);
        float acceleration=Float.parseFloat(words[7]);
        String ns=words[3];
        String ew=words[5];
        System.out.println("Lattitude:" +lattitude + "" + "N=North,S=South" + "\t:" +ns );
        System.out.println("Longitude:" + longitude + "" + "E=East;W=West" + "\t:" + ew);
        System.out.println("Velocity:"+velocity);
        System.out.println(" acceleration/deceleration in km/h/s "+acceleration);
        start = 55;
        end = 59;
        string.getChars(start, end, dst, 0);
        System.out.println("Date:" + dst[0] + "" + dst[1] + "/" + dst[2] + "" + dst[3] + "/" + "20" + dst[4] + "" + dst[5]);

    }
}
