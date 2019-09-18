import java.util.Scanner;

public class GPGGA {
    public void show(){
        System.out.println("Enter GPGGA String");
        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String substring=string.substring(1,6);
        System.out.println("Source:"+substring);
        String words[]=string.split(",",70);
        int start=7;
        int end=17;
        char dst []=new char[end-start];
        string.getChars(start,end,dst,0);
        System.out.println("Getting time:"+dst[0]+""+dst[1]+"\t"+"hours"+"\t"+ //Распарсить через DataTime не смог
                +dst[2]+"\t"+"minutes"+"\t"+dst[4]+""+dst[5]
                +""+dst[7]+dst[8]+dst[9]+"\t"+"seconds UTC");
        float time=Float.parseFloat(words[1]);
        double lattitude = Double.parseDouble(words[2]);
        double longitude = Double.parseDouble(words[4]);
        float satelitenum = Float.parseFloat(words[7]);
        float hdp = Float.parseFloat(words[8]);
        float level = Float.parseFloat(words[9]);
        String northsouth=words[3];
        String eastwest=words[5];
        String condition=words[6];
        System.out.println("Lattitude:"+lattitude+"\n"+"N=North,S=South"+"\t:"+northsouth);
        System.out.println("Longitude:"+longitude+"\n"+"E=East;W=West"+"\t:"+eastwest);
        System.out.println("Condition: 1=valid;0=not valid"+"\t:"+condition);
        System.out.println("Number of satellites:"+satelitenum);
        System.out.println("Horizontal Dilution of Precision:"+hdp);
        System.out.println("Level above or below the sea:"+level+"meters");

    }
}
