public class JPSMain {
    public static void main(String[] args) {
        GPRMCS gprmcs=new GPRMCS();
        gprmcs.show();

        GPGGA gpgga=new GPGGA();
        gpgga.show();

        GPGVTG gpgvtg=new GPGVTG();
        gpgvtg.show();

        GPGSA gpgsa=new GPGSA();
        gpgsa.show();
        PACCEI paccei=new PACCEI();
        paccei.show();

    }
}
