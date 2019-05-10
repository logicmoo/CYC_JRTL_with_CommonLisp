package SxxMachine;

import static SxxMachine.pterm.TermData.Long;

import SxxMachine.pterm.Source;

/**
 * creates a source of integers based on x=a*x+b formula
 */
public class IntegerSource extends Source {

    public IntegerSource(long fuel, long a, long x, long b, Prog p) {
        super(p);
        this.fuel = fuel;
        this.a = a;
        this.b = b;
        this.x = x;
    }

    private long fuel;

    private long a;

    private long b;

    private long x;

    @Override
    public Term getElement() {
        if (fuel <= 0)
            return null;
        NumberTerm R = Long(x);
        x = a * x + b;
        --fuel;
        return R;
    }

    @Override
    public void stop() {
        fuel = 0;
    }

    @Override
    public String pprint() {
        return "{(x->" + a + "*x+" + b + ")[" + fuel + "]=" + x + "}";
    }

}