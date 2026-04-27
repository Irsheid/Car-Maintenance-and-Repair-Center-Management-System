public class Car {
    private String maker;
    private String model;
    private String plateNumber;

    public Car(String maker, String model, String plateNumber) {
        this.maker = maker;
        this.model = model;
        this.plateNumber = plateNumber;
    }

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    @Override
    public String toString() {
        return "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", plateNumber='" + plateNumber + '\'';
    }
}

