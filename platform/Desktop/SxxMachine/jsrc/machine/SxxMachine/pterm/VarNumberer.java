package SxxMachine.pterm;

import SxxMachine.HashDict;
import SxxMachine.Term;
import SxxMachine.Var;

/**
 * Used in implementing uniform replacement of variables with new constants.
 * useful for printing out with nicer variable names.
 *
 * @see Var
 * @see Clause
 */
public class VarNumberer extends SystemObject {
    HashDict dict;

    int ctr;

    public VarNumberer() {
        dict = new HashDict();
        ctr = 0;
    }

    @Override
    public Term action(Term place) {
        place = place.dref();
        // IO.trace(">>action: "+place);
        if (place.isVar()) {
            SymbolTerm root = (SymbolTerm) dict.get(place);
            if (null == root) {
                root = new PseudoVar(ctr++);
                root.name = root.name + place.getString();
                dict.put(place, root);
            }
            place = root;
        }
        // IO.trace("<<action: "+place);
        return place;
    }

}
