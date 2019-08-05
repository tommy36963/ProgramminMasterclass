package section7OOPpt2.composition.encapsulation.challenge;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50,true);
        System.out.println("Initial page count = "  + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(9);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPage(12);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());


    }
}
