package model;

public class Plane {
    private String name;
    private String country;
    private int year;
    private  int hours;
    private int weigh;
    private boolean isMilitary;
    private byte wingSpan;
    private int topSpeed;
    private int seats;
    private char cost;   //
    

    public Plane(String name, String country, int year, int hours, int weigh, boolean isMilitary, byte wingSpan, int topSpeed, int seats, char cost) {
        this.name = name;
        this.country = country;
        this.year = year;
        this.hours = hours;
        this.weigh = weigh;
        this.isMilitary = isMilitary;
        this.wingSpan = wingSpan;
        this.topSpeed = topSpeed;
        this.seats = seats;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public byte getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(byte wingSpan) {
        this.wingSpan = wingSpan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public char getCost() {
        return cost;
    }

    public void setCost(char cost) {
        this.cost = cost;
    }

    public void printINFO(){

        System.out.println("name" + "-"+ name);
        System.out.println("country" + "-"+ country);
        System.out.println("year" + "-"+ year);
        System.out.println("hours" + "-"+ hours);
        System.out.println("military" + "-"+ isMilitary);
        System.out.println("weigh" + "-"+ weigh);
        System.out.println("wingspan" + "-"+ wingSpan);
        System.out.println("topspeed" + "-"+ topSpeed);
        System.out.println("seats" + "-"+ seats);
        System.out.println("cost" + "-"+ cost);


    }
}
