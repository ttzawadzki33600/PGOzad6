public class Main {

    public static void main(String[] args){

        Car auto = new Car(5);
        auto.start();
        auto.stop();
        System.out.println("Samochód ma " + auto.getNumberOfSeats() +" miejsc.");
    }
}
