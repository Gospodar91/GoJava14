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
        double d01 = Double.parseDouble(words[3]);
        double d02 = Double.parseDouble(words[5]);
        float f = Float.parseFloat(words[7]);
        float f01 = Float.parseFloat(words[8]);
        String str=words[2];
        String str01=words[4];
        String str02=words[6];
        System.out.println("Condition: A=True,V=false,N-false" + "\t:" + str);
        System.out.println("Lattitude:" + d01 + "" + "N=North,S=South" + "\t:" + str01);
        System.out.println("Longitude:" + d02 + "" + "E=East;W=West" + "\t:" + str02);
        System.out.println("Speed:" + f + "\n" + "Way directioon:" + f01);
        start = 56;
        end = 63;
        string.getChars(start, end, dst, 0);
        System.out.println("Date:" + dst[0] + "" + dst[1] + "/" + dst[2] + "" + dst[3] + "/" + "20" + dst[4] + "" + dst[5]);
    }
}
