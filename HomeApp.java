public class HomeApp {
    public static void main(String[] args) {
        HomeService light = new Light();
        HomeInterface homeInterface = new HomeInterface();

        // Turn on all services
        homeInterface.turnOnAll();
        System.out.println("---------------------------------");
        // Turn off all services
        homeInterface.turnOffAll();
        System.out.println("---------------------------------");
        light.turnOn();
        light.turnOff();


    }
}