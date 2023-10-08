package smth;

public class PrinterDelegate extends PrinterDefault implements IPrinterDelegate{


    @Override
    public void printAll(IPrintable printable) {
        printable.Print(this);
    }
}
