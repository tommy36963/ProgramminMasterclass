package section7OOPpt2.composition.polymorphism;



    class Car{

        private String name;
         private String engine;
         private int cylinders;
         private int wheels;

        public Car(String name, int cylinders) {
            this.name = name;
            this.cylinders = cylinders;
            this.engine = engine;
            this.wheels = 4;

        }


        public String getName() {
            return name;
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getEngine() {
            return engine;
        }

        public String startEngine(){
            return "Engine Started";
        }

        public String accelerate(){
            return "Car is accelerating";
        }

        public String brake(){
            return "Car is braking";
        }
    }

    class M3 extends Car{

        public M3(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String accelerate() {
            return "0 - 60: 4.0 Seconds";
        }

        @Override
        public String startEngine() {
            return "M3 engine started ";
        }
    }

    class Spider extends Car{
        public Spider(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String accelerate() {
            return "0 - 60: 3.0 Seconds";
        }

        @Override
        public String startEngine() {
            return "Spider engine started ";
        }
    }

    class GTR extends Car {
        public GTR(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public String accelerate() {
            return "0 - 60: 2.7 Seconds";
        }

        @Override
        public String startEngine() {
            return "GTR engine started ";
        }
    }

        public class Challenge {

            public static void main(String[] args) {

                Car car = new Car("Base Car", 4);
                System.out.println(car.getName());
                System.out.println(car.getCylinders());
                System.out.println(car.startEngine());
                System.out.println(car.accelerate());

                M3 m3 = new M3("BMW M3 ", 6);
                System.out.println(m3.getName());
                System.out.println(m3.getCylinders());
                System.out.println(m3.startEngine());
                System.out.println(m3.accelerate());

                Spider spider = new Spider("Ferrari Spider ", 8);
                System.out.println(spider.getName());
                System.out.println(spider.getCylinders());
                System.out.println(spider.startEngine());
                System.out.println(spider.accelerate());

                GTR gtr = new GTR("Nissan GTR ", 8);
                System.out.println(gtr.getName());
                System.out.println(gtr.getCylinders());
                System.out.println(gtr.startEngine());
                System.out.println(gtr.accelerate());

            }


          /*  public static Car carSpeeds() {

                switch (1) {
                    case 1:
                        return new M3();

                    case 2:
                        return new Spider();

                    case 3:
                        return new GTR();
                }
                return null;

            } */

        }
