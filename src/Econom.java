public class Econom extends Car{

    public BodyTypes bodyType;

    public Econom(String vin, Makes make, Models model, int odometer, BodyTypes bodyType) {
        super(vin, make, model, odometer);
        this.bodyType = bodyType;
    }

}
