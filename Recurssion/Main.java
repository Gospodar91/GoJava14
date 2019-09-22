public class Main {
    public static void main(String[] args) {
        DrawRecurrssion drawRecurrssion=new DrawRecurrssion(); // рекурсивный вывод прмяугольника
        drawRecurrssion.Cout(3,5,5); //tempWidth всегда равно width

        FirstFifthTask firstFifthTask=new FirstFifthTask();
        System.out.println(firstFifthTask.PrintNum(5)); // рекурсивный  вывод чисел

        Task2 task2=new Task2();                 //не рекурсивный вывод прямоугольника
        task2.drawRectangle(3,4);

        Task3 task3=new Task3();
        task3.drawRectangle003(4);                   /////квадрат

        Task4 task4=new Task4();
        System.out.println(task4.getMAx(4,7));                   //getMAx INT
        System.out.println(task4.getMAx(5,8.5f));                //getMax int\float



    }




}
