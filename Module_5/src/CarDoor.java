public class CarDoor {
    private boolean doorOpen;
    private boolean windowOpen;


    public CarDoor(){                          // двери и окна закрыты  по дефолту
        doorOpen=false;
        windowOpen=false;
    }
    public CarDoor(boolean doorOpen,boolean windowOpen){
        this.doorOpen=doorOpen;
        this.windowOpen=windowOpen;
    }
    // методы
    public void openDoor(){
        doorOpen=true;
    }
    public void closeDoor(){
        doorOpen=false;

    }
    public  void openWindow(){
        windowOpen=true;
    }
    public void closeWindow(){
        windowOpen=false;
    }
    public  void reverseDoor(){
        doorOpen=!doorOpen;

    }
    public void reverseWindow(){
        windowOpen=!windowOpen;
    }
    public void showStatus(){
        if (doorOpen) {
            System.out.println("Door is open");
        }
        else {
            System.out.println("Door is closed");
        }
        if (windowOpen){
            System.out.println("Window is open");
        }
        else {
            System.out.println("Window is closed");
        }
    }



}

