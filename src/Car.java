public class Car implements Vehicle{

    public String vin;
    public Makes make;
    public Models model;
    public int odometer;

    public Car(String vin, Makes make, Models model, int odometer) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
    }

    @Override
    public void drive(){
        System.out.println("The vehicle " + getMake() + " " + getModel() + " VIN " + getVin() + " is driving...");
    }

    @Override
    public void stopDriving(int distance){
        odometer += distance;
        System.out.println("The vehicle stopped with the odometer of " + getOdometer());
    }

    public String getVin() {
        return vin;
    }

    public Makes getMake() {
        return make;
    }

    public Models getModel() {
        return model;
    }

    public int getOdometer() {
        return odometer;
    }
}
