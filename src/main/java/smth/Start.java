package smth;

public class Start {
    public static void main(String[] args) {
        Text txt = new Text(new IPrintable[]{
                new Word("Test"), new Sign(' '), new Word("my"), new Sign(' '), new Word("architecture"), new Sign('!')
        });
        txt.Print(new PrinterDefault());
        txt.Print(new PrinterSpecial());
        PrinterDelegate printerDelegate = new PrinterDelegate();
        printerDelegate.printAll(txt);

    }
}
