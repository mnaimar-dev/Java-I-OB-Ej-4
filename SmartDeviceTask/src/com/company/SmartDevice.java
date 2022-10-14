package com.company;

public class SmartDevice {

    // Atributes
        public String manufacturer;
        public String model;
        public int year;
        public double price;
        public int id;

    // Constructors
        public SmartDevice() {

        }

        public SmartDevice(String manufacturer, String model, int year, double price, int id) {
            this.manufacturer = manufacturer;
            this.model = model;
            this.year = year;
            this.price = price;
            this.id = id;
        }

    // Methods
        public static void turnOn() {
            System.out.println("Device Turned On 🌕");
        }

        public static void turnOff() {
            System.out.println("Device Turned Off 🌑");
        }

    // toString()
        @Override
        public String toString() {
            return "SmartDevice{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", model='" + model + '\'' +
                    ", year=" + year +
                    ", price=" + price +
                    ", id=" + id +
                    '}';
        }
}
