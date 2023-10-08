package smth;

import java.util.Arrays;

public class Text implements IPrintable {
    IPrintable[] iPrintables;
    public Text(IPrintable[] iPrintables){

        this.iPrintables = iPrintables;

    }


    @Override
    public void Print(IPrinter iPrinter) {

        for (int i = 0; i < iPrintables.length; i++) {
            iPrintables[i].Print(iPrinter);
        }

    }
}
