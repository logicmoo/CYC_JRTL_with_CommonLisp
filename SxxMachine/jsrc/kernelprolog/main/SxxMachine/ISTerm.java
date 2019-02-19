package SxxMachine;

public interface ISTerm {
    public Term ArgDeRef(int i);

    public Term ArgNoDeRef(int i);

    public int getIntArg(int i);

    public int unifyArg(int i, Term a, Prog p);
}