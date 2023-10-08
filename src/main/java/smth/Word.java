package smth;

public class Word implements IPrintable{
    private String str;
    public Word(String str) {
        this.str = str;
    }

    @Override
    public void Print(IPrinter iPrinter) {
        iPrinter.firstMethod(str);

    }
}
