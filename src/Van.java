public class Van extends Car{

    VanTypes vanType;

    public Van(String vin, Makes make, Models model, int odometer, VanTypes vanType) {
        super(vin, make, model, odometer);
        this.vanType = vanType;
    }
}
