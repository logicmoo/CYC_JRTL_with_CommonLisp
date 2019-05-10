package SxxMachine;

@FunctionalInterface
public interface ExecProg {
    public int exec(Prog p, ISTerm thiz);
}