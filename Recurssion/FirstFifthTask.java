public class FirstFifthTask {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

    }

    //555555555555555555555555555555555555555555//
    public String PrintNum(int x) {
        return x==0?"":PrintNum(x - 1) + "\n" + x;

    }
}

