package SxxMachine;

import java.lang.reflect.Method;

import SxxMachine.pterm.TermData;

/**
 * Template for builtins of arity 0
 */

abstract public class ConstBuiltin extends TermData implements NameArity {

    Method st_exec_method;

    @Override
    public void setMethod(Method b) {
        soopsy();
        st_exec_method = b;
    }

    @Override
    public java.lang.String getFAKey() {
        return Name + "/" + arity();
    }

    String Name;

    public ConstBuiltin(String s) {
        Name = s;
    }

    // abstract public int exec(Prog p);

    public boolean isBuiltin() {
        return true;
    }

    @Override
    public String fname() {
        return Name;
    }

    @Override
    public int arity() {
        return Term.CONST;
    }

}
