public class CarTest {

    class Car {

        // Data
        boolean isCarStarted;
        boolean isDoorClose;
        // Method
        void start() {
            System.out.println("Start engine of car.");
            isCarStarted = true;
        }

        void turnoff() {
            System.out.println("Turn off the car.");
            isCarStarted = false;

        }

        void door_open() {
            System.out.println("Door is open.");
            isDoorClose = false;
        }

        void close_door() {
            System.out.println("Door is close.");
            isDoorClose = true;
        }

        void go() {
            // Door is close and car is start.
            if (isCarStarted && isDoorClose) {
                System.out.println("Car is going!");
            }else {
                System.out.println("Car is stop yet!!");
            }
        }
    }
}
