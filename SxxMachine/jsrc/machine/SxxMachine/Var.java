package SxxMachine;

/**
 * Part of the Term hierarchy implmenting logical variables. They are subject to
 * reset by application of and undo action keep on the trail stack.
 */
public interface Var extends Term, Undoable {

    abstract public boolean unbound();

}