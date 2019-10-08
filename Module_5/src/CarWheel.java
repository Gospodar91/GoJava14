public class CarWheel {
    private float wheelStrength;
    public CarWheel() {
        wheelStrength = 1.0f;
    }
    public CarWheel(float wheelStrength) {
        if (wheelStrength >= 0.0 && wheelStrength <= 1.0) {
            this.wheelStrength = wheelStrength;
        } else {
            System.out.println("Wrong parameter:" + "\t" + "Enter count from 0.0f to 1.0f");
        }
    }

    public void renewWheel() {
        wheelStrength = 1.0f;
    }
    public double damagewheel(float damage) {
        if (damage >= 0) {
            if (damage >= wheelStrength)
                wheelStrength = 0;
            else wheelStrength -= damage;
        }
        return wheelStrength;
    }

    public float getWheelStrength()
    {
        return wheelStrength;
    }
    public void getWheelStatus(){
        if (wheelStrength==0) {
            System.out.println("Wheel is broken");
        }
        else if (wheelStrength>=0.1&&wheelStrength<1) {
            System.out.println("The wheel deterioration is:"+((1-wheelStrength)*100)+"%");
        }
        else if (wheelStrength==1){
            System.out.println("Wheel is new");
        }

    }
}
