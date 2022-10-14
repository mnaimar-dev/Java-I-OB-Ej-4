package com.company;

public class SmartPhone extends SmartDevice {

    // Atributes
        public String serviceProvider;
        public int numberOfCameras;
        public boolean whatsAppInstalled;

    // Constructors
        public SmartPhone() {

        }

        public SmartPhone(String manufacturer, String model, int year, double price, int id, String serviceProvider, int numberOfCameras, boolean whatsAppInstalled) {
            super(manufacturer, model, year, price, id);
            this.serviceProvider = serviceProvider;
            this.numberOfCameras = numberOfCameras;
            this.whatsAppInstalled = whatsAppInstalled;
        }

    // Method
        public static void call(){
            System.out.println("Hello! 📞🔊");
        }

    // toString()
    @Override
    public String toString() {
        return "SmartPhone{" +
                "serviceProvider='" + serviceProvider + '\'' +
                ", numberOfCameras=" + numberOfCameras +
                ", whatsAppInstalled=" + whatsAppInstalled +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
