import java.util.Scanner;

public class GPGVTG {
    public void show(){
        System.out.println("Enter GPGVTG String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String substring=string.substring(1,6);
        System.out.println("Source:"+substring);
        String words[]=string.split(",",70);
        float heading = Float.parseFloat(words[1]);
        float horizvelocityknots = Float.parseFloat(words[5]);
        float horizontalvelocity = Float.parseFloat(words[7]);
        String position=words[6];
        System.out.println(" Heading over ground in degrees (relative to true north) :"+heading);
        System.out.println("horizontal velocity over ground in knots :"+horizvelocityknots);
        System.out.println("horizontal velocity over ground in km/h :"+horizontalvelocity);
        System.out.println("positioning system mode indicator : A = autonomous mode, D = Differential mode, "
                +"\n"+"E = Estimated (dead reckoning) mode, M = Manual input mode, S = Simulator mode, "+"\n"+
                "N = Data not valid. Note: The CTM internal GPS module supports autonomous mode only."+position);

    }
}
