class HomeInterface {
    private TV tv;
    private AirConditioning airConditioning;
    private Light light;

    public HomeInterface() {
        this.tv = new TV();
        this.airConditioning = new AirConditioning();
        this.light = new Light();
    }

    public void turnOnAll() {
        tv.turnOn();
        airConditioning.turnOn();
        light.turnOn();
    }

    public void turnOffAll() {
        tv.turnOff();
        airConditioning.turnOff();
        light.turnOff();
    }
}