import java.util.Scanner;

public class MethodBackend {
    public void run(){
        byte a;
        System.out.println("Please enter 1 to execute GPGLL string");
        System.out.println("Please enter 2 to execute PACCEI string");
        System.out.println("Please enter 3 to execute GPGVTG string");
        System.out.println("Please enter 4 to execute GPGSA string");
        System.out.println("Please enter 5 to execute GPGGA string");
        System.out.println("Please enter 6 to execute PFUELR string");
        System.out.println("Please enter 7 to execute GPRMCS string");
        System.out.println("Please enter 8 to execute PIWIFI string");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextByte();
        switch (a) {
            case 1:
                GPGLL gpgll=new GPGLL();
                gpgll.show();
                break;
            case 2:
                PACCEI paccei=new PACCEI();
                paccei.show();
                break;
            case 3:
                GPGVTG gpgvtg=new GPGVTG();
                gpgvtg.show();
                break;
            case 4:
                GPGSA gpgsa=new GPGSA();
                gpgsa.show();
                break;
            case 5:
                GPGGA gpgga=new GPGGA();
                gpgga.show();
                break;
            case 6:
                PFUELR pfuelr=new PFUELR();
                pfuelr.show();
                break;
            case 7:
                GPRMCS gprmcs=new GPRMCS();
                gprmcs.show();
                break;
            case 8:
                PWIFI pwifi=new PWIFI();
                pwifi.show();
                break;


        }
        }

    }

