import java.util.Scanner;

public class GPGSA {
    public void show(){
        System.out.println("Enter GPGSA String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String substring=string.substring(1,6);
        System.out.println("Source:"+substring);
        String words[]=string.split(",",70);
        String receive=words[1];
        int fixmode=Integer.parseInt(words[2]);
        int satelliteid=Integer.parseInt(words[3]);
        int dopvalue=Integer.parseInt(words[4]);
        int horvalue=Integer.parseInt(words[5]);
        int vertvalue=Integer.parseInt(words[6]);
        System.out.println(" Receiver mode: A = automatic; M = manual:"+receive);
        System.out.println(" Fix mode: 1 = fix not available; 2 = 2D; 3 = 3D:"+fixmode);
        System.out.println(" ID of each satellite used in the fix (unused are 00):"+satelliteid);
        System.out.println(" Percent DOP value :"+dopvalue);
        System.out.println(" Horizontal DOP value :"+horvalue);
        System.out.println(" Vertical DOP value :"+vertvalue);
    }
}
