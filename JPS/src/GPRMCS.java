import java.util.Scanner;

public class GPRMCS {
    public void show() {
        System.out.println("Enter GPRMCS string" );
        Scanner scanner=new Scanner(System.in);
        String string=new String();
        string=scanner.nextLine();
        String substring = string.substring(1, 6);
        System.out.println("Source:" + substring);
        int start = 7;
        int end = 17;
        char dst[] = new char[end - start];
        string.getChars(start, end, dst, 0);           //получение элементов строки в массиве
        System.out.println("Getting time:" + dst[0] + "" + dst[1] + "\t" + "hours" + "\t" +
                +dst[2] + "\t" + "minutes" + "\t" + dst[4] + "" + dst[5]
                + "" + dst[7] + dst[8] + dst[9] + "\t" + "seconds UTC");
        String words[] = string.split(",", 74);
        float time=Float.parseFloat(words[1]);
        double lattitude = Double.parseDouble(words[3]);
        double longitude = Double.parseDouble(words[5]);
        float speed = Float.parseFloat(words[7]);
        float waydirection = Float.parseFloat(words[8]);
        String condition=words[2];
        String ns=words[4];
        String ew02=words[6];
        System.out.println("Condition: A=True,V=false,N-false" + "\t:" + condition);
        System.out.println("Lattitude:" + lattitude + "" + "N=North,S=South" + "\t:" + ns);
        System.out.println("Longitude:" + longitude + "" + "E=East;W=West" + "\t:" + ew02);
        System.out.println("Speed:" + speed + "\n" + "Way directioon:" + waydirection);
        start = 56;
        end = 63;
        string.getChars(start, end, dst, 0);
        System.out.println("Date:" + dst[0] + "" + dst[1] + "/" + dst[2] + "" + dst[3] + "/" + "20" + dst[4] + "" + dst[5]);
    }
}
