public class Testcalc2  {
    public void Cout2(int num) {
        int a;
        int []b=new int[10];
       a=num;
        System.out.print("Восьмиричный код:");
        if (a<=8){
            System.out.println(a);
        }
        else if (a>9){
            for(int i=0;i<b.length;i++){
                b[i]=a%8;
                a/=8;
            }
            for (int n = 4; n >= 0; n--){
                System.out.print(b[n]);}
        }



    }
}
