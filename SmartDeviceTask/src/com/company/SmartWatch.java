package com.company;

public class SmartWatch extends SmartDevice {
    // Atributos
        public String typeOfWatch;
        public boolean hasGPS;


    // Constructores
        public SmartWatch() {

        }
        public SmartWatch(String manufacturer, String model, int year, double price, int id, String typeOfWatch, boolean hasGPS) {
            super(manufacturer, model, year, price, id);
            this.typeOfWatch = typeOfWatch;
            this.hasGPS = hasGPS;
        }

    // Métodos
        public void watchHour(){
            System.out.println("The time is... 🕐");
        }

    // toString()
    @Override
    public String toString() {
        return "SmartWatch{" +
                "typeOfWatch='" + typeOfWatch + '\'' +
                ", hasGPS=" + hasGPS +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
