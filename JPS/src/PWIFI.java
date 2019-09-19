import java.util.Scanner;

public class PWIFI {
    public void show() {
        System.out.println("Enter PWIFI string");
        Scanner scanner = new Scanner(System.in);
        String string = new String();
        string = scanner.nextLine();
        String substring = string.substring(1, 6);
        System.out.println("Source:" + substring);
        String words[] = string.split(",", 74);
        String wifitech=words[1];
        String essid=words[2];
        String mac=words[3];
        String txpower=words[4];
        String lq=words[5];
        String rx=words[6];
        String noise=words[7];
        String Ipadress=words[8];

        System.out.println("Wi fi technology:"+wifitech);
        System.out.println("ESSID of the access point:"+essid);
        System.out.println("access point MAC address:"+mac);
        System.out.println("TX power:"+txpower);
        System.out.println("LQ quality:"+lq);
        System.out.println("RX signal strength"+rx);
        System.out.println("Noise level:"+noise);
        System.out.println("Current IP address of gateway's WAN interface:"+Ipadress);
    }
}
//$PWIFI,IEEE802.11ng,cypress,00:24:A5:AD:61:4F,18dBm,70/70,-22dBm,n/a dBm,192.168.100.202*53