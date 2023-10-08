package smth;

public class Sign implements IPrintable {
 private char ch;
    public Sign(char ch){
    this.ch = ch;
    }
    @Override
    public void Print(IPrinter iPrinter) {
        iPrinter.secondMethod(ch);
    }
}
