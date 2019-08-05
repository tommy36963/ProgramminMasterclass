package section7OOPpt2.composition.encapsulation.challenge;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int addToner(int toner) {
        if (toner > 0 && toner <= 100) {
            if (this.tonerLevel + toner > 100) {
                return -1;
            }

            this.tonerLevel += toner;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPage(int addPage) {
        int pagesToPrint = addPage;
        if (this.duplexPrinter) {
            pagesToPrint = (addPage / 2) + (addPage % 2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {

        return pagesPrinted;
    }
}
