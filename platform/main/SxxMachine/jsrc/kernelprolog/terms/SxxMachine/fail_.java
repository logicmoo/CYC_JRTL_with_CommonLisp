package SxxMachine;

/**
 * Always fails
 */
public class fail_ extends ConstBuiltin {
    fail_() {
        super("fail");
    }

    public int exec(Prog p) {
        return 0;
    }

    static public int st_exec(Prog p, ISTerm thiz) {
        return 0;
    }
}