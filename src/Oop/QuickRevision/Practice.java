package Oop.QuickRevision;

public class Practice {
    public static class Car {
        protected String brand;
        String model;
        String year;

        public Car() {
        }

        public Car(String brand,
                   String model,
                   String year) {
            this.brand = brand;
            this.model = model;
            this.year = year;
        }

        public void printDetails() {
            System.out.println("car model: " + this.model);
            System.out.println("car brand: " + this.brand);
            System.out.println("car year: " + this.year);
        }
    }


    public static void main(String[] args) {
        Car c = new Car("Omni", "Murti", "2020");
        c.printDetails();
    }
}
