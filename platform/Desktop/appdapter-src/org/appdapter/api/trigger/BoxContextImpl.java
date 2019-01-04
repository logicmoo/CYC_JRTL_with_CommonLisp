package org.appdapter.api.trigger;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public abstract class BoxContextImpl implements BoxContext
{
    public <BT extends Box<TT>, TT extends Trigger<BT>> List<BT> getOpenChildBoxesNarrowed
    (final Box parent, final Class<BT> boxClass, final Class<TT> trigClass) {
        final List <Box> wideOpenChildBoxes = (List<Box>)this.getOpenChildBoxes(parent);
        final List<BT> narrowedOpenChildBoxes = new ArrayList<BT>();
        for (final Box narrow : wideOpenChildBoxes) {
            final Box wocb = narrow;
            narrowedOpenChildBoxes.add((BT) narrow);
        }
        return narrowedOpenChildBoxes;
    }
}

/*

	Total time: 21 ms

*/