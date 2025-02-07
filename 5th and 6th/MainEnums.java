import model.CarEnums;

public class MainEnums {

    public static void main(String[] args) {
        CarEnums car = new CarEnums("Nissan", 2020);
        car.drive(CarEnums.TrafficLight.RED);
    }

}
