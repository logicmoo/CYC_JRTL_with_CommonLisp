package SxxMachine;

import java.util.ArrayList;

public class ObjectStack /* extends ArrayList */ {
    public final void push(Term var) {
        add(var);
    }

    public final Term pop() {
        return (Term) remove(size() - 1);
    }

    ArrayList<Term> stack = new ArrayList<Term>();

    private Object remove(int i) {
        return stack.remove(i);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    private void add(Term x) {
        stack.add(x);
    }
}
