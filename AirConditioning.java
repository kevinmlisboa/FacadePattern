class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air Condition is on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Air Condition is off...");
    }
}