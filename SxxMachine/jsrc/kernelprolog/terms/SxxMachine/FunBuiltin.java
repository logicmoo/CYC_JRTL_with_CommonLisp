package SxxMachine;

/**
 * Template for builtins of arity >0
 */

abstract public class FunBuiltin extends ConstBuiltin {
    // public StructureTerm thiz = this;
    
    int arity;

    public FunBuiltin(String f, int i) {
        super(f);
        arity = i;
    }

    // @Override
    // public int exec(Prog p) {s
    // // TODO Auto-generated method stub
    // return 0;
    // }
    // //abstract public int exec(Prog p);
    //
    @Override
    public boolean isBuiltin() {
        return true;
    }

    @Override
    public int arity() {
        return arity;
    }

}
