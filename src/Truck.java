public class Truck extends Car{

    public Truck(String vin, Makes make, Models model, int odometer) {
        super(vin, make, model, odometer);
    }

    public void upload(int weight){
        System.out.println("The truck " + getVin() + " is uploading " + weight + " kilograms.");
    }

    public void download(){
        System.out.println("The truck " + getVin() + " is downloading...");
    }

}
