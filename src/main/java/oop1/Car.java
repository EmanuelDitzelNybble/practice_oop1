package oop1;

public class Car {
    private String color;
    private int year;
    private int gearbox;
    private String model;

    public Car(){}

    public void running(){
        System.out.println("Now i'm Running, nothing can stop me!");
    }
    public void start(){
        System.out.println("I'm Start now!");
    }
    public void stop(){
        System.out.println("Ok, i'm stopped, what now?");
    }
    public void printingData(String model, String color, int year)
    {
        System.out.println(model+ "\n"+color+ "\n"+year);
    }
    public void gearPosition(int gearbox)
    {
        System.out.println("Im running with "+gearbox+" Gear now");
    }

    // ------ Getters & Setters ------

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getGearbox() {
        return gearbox;
    }

    public void setGearbox(int gearbox) {
        this.gearbox = gearbox;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
