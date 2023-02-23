public class Suv extends Car{
    SUVTypes SUVType;

    public Suv(String vin, Makes make, Models model, int odometer, SUVTypes SUVType) {
        super(vin, make, model, odometer);
        this.SUVType = SUVType;
    }
}
