package oop1;

public class Client {
    public static void main(String[] args) {
        Car Honda = new Car();
        Honda.setModel("HRV");
        Honda.setColor("RED");
        Honda.setYear(1992);

        Car Ford = new Car();
        Ford.setModel("F100");
        Ford.setColor("BLUE");
        Ford.setYear(2002);

        Car Chevrolet = new Car();
        Chevrolet.setModel("CRUZE");
        Chevrolet.setColor("BLACK");
        Chevrolet.setYear(2022);

        System.out.println("/----- HONDA data -----/");
        Honda.printingData(Honda.getModel(),Honda.getColor(),Honda.getYear());
        Honda.start();
        Honda.running();
        Honda.gearPosition(6);
        Honda.stop();


        System.out.println("/----- FORD data -----/");
        Ford.printingData(Ford.getModel(),Ford.getColor(),Ford.getYear());
        Ford.start();
        Ford.running();
        Ford.gearPosition(6);
        Ford.stop();


        System.out.println("/----- CHEVROLET data -----/");
        Chevrolet.printingData(Chevrolet.getModel(),Chevrolet.getColor(),Chevrolet.getYear());
        Chevrolet.start();
        Chevrolet.running();
        Chevrolet.gearPosition(6);
        Chevrolet.stop();
    }
}
