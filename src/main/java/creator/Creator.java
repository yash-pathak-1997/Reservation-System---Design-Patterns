package creator;

import java.util.List;

public abstract class Creator {
    public Creator next_step;

    public static Creator link(Creator first, Creator... chain){
        Creator head = first;
        for (Creator nextInChain: chain) {
            head.next_step = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    public abstract List getList();

    protected List checkNext() {
        if (next_step == null) {
            return null;
        }
        return next_step.getList();
    }
}
