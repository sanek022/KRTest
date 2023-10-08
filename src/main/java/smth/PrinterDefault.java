package smth;

public class PrinterDefault implements IPrinter {


    @Override
    public void firstMethod(String string) {
        System.out.print(string);
    }

    @Override
    public void secondMethod(char ch) {
        System.out.print(ch);
    }
}
