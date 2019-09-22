public class DrawRecurrssion {
    public  void Cout(int height, int width, int tempWidth) {
        if (height > 0 || width > 0) {
            if (width > 0) {
                System.out.print("+");
                Cout(height, width - 1, tempWidth);
                return;

            }
            if (height > 1) {
                System.out.println();
                Cout(height - 1, tempWidth, tempWidth);
            }
        }

    }
}
