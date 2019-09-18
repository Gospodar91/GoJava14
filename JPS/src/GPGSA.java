import java.util.Scanner;

public class GPGSA {
    public void show(){
        System.out.println("Enter GPGSA String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String substring=string.substring(1,6);
        System.out.println("Source:"+substring);
        String words[]=string.split(",",70);
        String str=words[1];
        int a=Integer.parseInt(words[2]);
        int b=Integer.parseInt(words[3]);
        int c=Integer.parseInt(words[4]);
        int d=Integer.parseInt(words[5]);
        int e=Integer.parseInt(words[6]);
        System.out.println(" Receiver mode: A = automatic; M = manual:"+str);
        System.out.println(" Fix mode: 1 = fix not available; 2 = 2D; 3 = 3D:"+a);
        System.out.println(" ID of each satellite used in the fix (unused are 00):"+b);
        System.out.println(" Percent DOP value :"+c);
        System.out.println(" Horizontal DOP value :"+d);
        System.out.println(" Vertical DOP value :"+e);
    }
}
