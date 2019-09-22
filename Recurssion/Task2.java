public class Task2 {
    public void drawRectangle(int wide, int high) {
        String num = "";
        while (wide > 0) {
            num = num + "+";
            wide = wide - 1;

        }
        while (high > 0) {
            high = high - 1;
            System.out.println(num);
        }

    }
}
