public class Main {

    public static void main(String[] args) {

        Makes kia = Makes.KIA;
        Models rio = Models.RIO;

        BodyTypes sedan = BodyTypes.SEDAN;
        BodyTypes hatchback = BodyTypes.HATCHBACK;
        BodyTypes universal = BodyTypes.UNIVERSAL;

        Econom kiaRio = new Econom("5NPDH4AE6BH023266", kia, rio, 138000, hatchback);
        kiaRio.drive();
        kiaRio.stopDriving(125);
        Garage.signUp(kiaRio);


        Makes buick = Makes.BUICK;
        Models enclave = Models.ENCLAVE;
        SUVTypes compact = SUVTypes.COMPACT;
        SUVTypes mid = SUVTypes.MID;
        SUVTypes large = SUVTypes.LARGE;

        Suv buickEnclave = new Suv("1GYFK63878R248711", buick, enclave, 35000, mid);
        buickEnclave.drive();
        buickEnclave.stopDriving(1000);
        Garage.signUp(buickEnclave);

        Makes honda = Makes.HONDA;
        Models odissey = Models.ODISSEY;
        VanTypes high = VanTypes.HIGH;
        VanTypes low = VanTypes.LOW;

        Van hondaOdissey = new Van("4S3BK4252X7305536", honda, odissey, 197000, low);
        hondaOdissey.drive();
        hondaOdissey.stopDriving(250);
        Garage.signUp(hondaOdissey);
        Garage.signOut(hondaOdissey);

        Makes revell = Makes.REVELL;
        Models revell851507 = Models.REVELL851507;
        Truck revellM851507 = new Truck("JH4KA4670KC024543", revell, revell851507, 65000);
        revellM851507.drive();
        revellM851507.stopDriving(750);
        revellM851507.upload(5000);
        revellM851507.download();
        Garage.signUp(revellM851507);

        Garage.getVehiclesList();

    }

}
