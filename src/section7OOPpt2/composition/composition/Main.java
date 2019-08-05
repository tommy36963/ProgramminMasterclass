package section7OOPpt2.composition.composition;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");


        // Below base objects that can pass to bedroom class
        Ceiling ceiling = new Ceiling(12,"White");

        Bed bed = new Bed("Queen",8,3,4,1);

        Lamp lamp = new Lamp("Quartz",false,80);

        Bedroom bedroom = new Bedroom("Tommys", wall1,wall2,wall3,wall4,ceiling,bed, lamp);
        // make the bed by calling method makeBed() in Bedroom
        bedroom.makeBed();
        bedroom.bangWoman();

        // use better from bedroom then use turnOn()  method from Lamp
        bedroom.getLamp().turnOn();
        bedroom.getLamp().turnOff();


    }
}
