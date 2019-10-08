public class Car {
    private String crateDate;
    private String engineType;
    private double realMaxSpeed;
    private double acceleration100Time;
    private int maxPassengers;
    private int passengersIn;
    private double currentSpeed;
    private int wheelAmount;
    private int carDoorAmount;
    private CarWheel wheels[];
    private CarDoor doors[];

    public Car(String crateDate) {
        this.crateDate = crateDate;
        crateDate = "11/09/2019";
    }

    public Car(String crateDate, String engineType, double maxSpeed,double acceleration100Time, int maxPassengers, int passengersIn,
               double currentSpeed, int wheelAmount, int carDoorAmount) {
        this.crateDate = crateDate;
        this.engineType = engineType;
        this.realMaxSpeed = maxSpeed;
        this.acceleration100Time=acceleration100Time;
        this.maxPassengers = maxPassengers;
        this.passengersIn = passengersIn;
        this.currentSpeed = currentSpeed;
        this.wheelAmount = wheelAmount;
        this.carDoorAmount = carDoorAmount;
        wheels = new CarWheel[wheelAmount];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new CarWheel();
        }
        doors = new CarDoor[carDoorAmount];
        for (int i = 0; i < doors.length; i++) {
            doors[i] = new CarDoor();
        }

    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void addPassenger() {
        if (passengersIn >= 0 && passengersIn < maxPassengers) {
            passengersIn++;
        } else if (passengersIn > maxPassengers) {
            System.out.println("It`s not a Zaporoshez");
        }
    }

    public void deletePassenger() {
        if (passengersIn > 0) {
            passengersIn--;
        }
    }

    public void deleteAllPassengers() {
        while (passengersIn > 0)
            passengersIn--;
    }

    public CarWheel getIndexOfWheel(int index) {
        return wheels[index];

    }

    public CarDoor getCarDoor(int index) {
        return doors[index];
    }

    public void zeroWheel() {
        wheels = new CarWheel[0];
    }

    public void addWheel(int x) {   // x=переменная,на сколько нужно увеличить кол-во колес
        wheelAmount = wheelAmount + x;
    }

    double calculateCurrentMaxSpeed() {
        if (passengersIn == 0) return 0;
        double minWheelHealth = 0;
        if (wheels.length != 0) {
            minWheelHealth = wheels[0].damagewheel(0.6f);

            for (int i = 1; i < wheels.length; i++) {
                minWheelHealth = minWheelHealth > wheels[i].getWheelStrength() ? wheels[i].getWheelStrength() : minWheelHealth;
            }
            System.out.println(realMaxSpeed);
        }
        return realMaxSpeed * minWheelHealth;

    }

    void printCarInfo() {
        System.out.println("Car production date: " + crateDate+";");
        System.out.println("Car engine type: " + engineType + ";");
        System.out.printf("Maximal speed(technically): %.2f km/h;\n", realMaxSpeed);
        System.out.printf("Current speed: %.2f km/h;\n", currentSpeed);
        System.out.printf("Acceleration to 100 km/h: %.2f seconds;\n", acceleration100Time);
        System.out.println("Passengers capacity: " + maxPassengers + ";");
        System.out.println("Currently passengers in: " + passengersIn + ";");

        System.out.printf("Current maximum speed: %.2f km/h.\n", calculateCurrentMaxSpeed());
    }
}
