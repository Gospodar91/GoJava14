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
        double d01 = Double.parseDouble(words[2]);
        double d02 = Double.parseDouble(words[4]);
        float f = Float.parseFloat(words[7]);
        float f01 = Float.parseFloat(words[8]);
        float f02 = Float.parseFloat(words[9]);
        String str01=words[3];
        String str02=words[5];
        String str03=words[6];


        System.out.println("Lattitude:"+d01+"\n"+"N=North,S=South"+"\t:"+str01);
        System.out.println("Longitude:"+d02+"\n"+"E=East;W=West"+"\t:"+str02);
        System.out.println("Condition: 1=valid;0=not valid"+"\t:"+str03);
        System.out.println("Number of satellites:"+f);
        System.out.println("Horizontal Dilution of Precision:"+f01);
        System.out.println("Level above or below the sea:"+f02+"meters");

    }
}
