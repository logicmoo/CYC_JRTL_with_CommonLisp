package SxxMachine;

public class PrologFlags {
    /**
     *
     */

    /** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>bounded</code>. */
    private final boolean bounded = false;
    /** Prolog implementation flag: <code>max_integer</code>. */
    private static final int maxInteger = Integer.MAX_VALUE;
    /** Prolog implementation flag: <code>min_integer</code>. */
    private static final int minInteger = Integer.MIN_VALUE;
    /** Prolog implementation flag: <code>integer_rounding_function</code>. */
    private final String integerRoundingFunction = "down";
    /** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>char_conversion</code>. */
    private String charConversion = "codes";
    /** Prolog implementation flag: <code>debug</code>. */
    private String debug;
    /** Prolog implementation flag: <code>max_arity</code>. */
    int maxArity = 255;
    /** Prolog implementation flag: <code>unknown</code>. */
    private String unknown;
    /** <font color="red">Not supported yet</font>. Prolog implementation flag: <code>double_quotes</code>. */
    private String doubleQuotes = "codes";
    /** Prolog implementation flag: <code>print_stack_trace</code>. */
    private String printStackTrace;

    /** Returns the value of Prolog implementation flag: <code>bounded</code>. */
    public boolean isBounded() {
        return this.bounded;
    }

    /** Returns the value of Prolog implementation flag: <code>max_integer</code>. */
    public int getMaxInteger() {
        return maxInteger;
    }

    /** Returns the value of Prolog implementation flag: <code>min_integer</code>. */
    public int getMinInteger() {
        return minInteger;
    }

    /** Returns the value of Prolog implementation flag: <code>integer_rounding_function</code>. */
    public String getIntegerRoundingFunction() {
        return this.integerRoundingFunction;
    }

    /** Returns the value of Prolog implementation flag: <code>char_conversion</code>. */
    public String getCharConversion() {
        return this.charConversion;
    }

    /** Sets the value of Prolog implementation flag: <code>char_conversion</code>. */
    public void setCharConversion(String mode) {
        this.charConversion = mode;
    }

    /** Returns the value of Prolog implementation flag: <code>debug</code>. */
    public String getDebug() {
        return this.debug;
    }

    /** Sets the value of Prolog implementation flag: <code>debug</code>. */
    public void setDebug(String mode) {
        this.debug = mode;
    }

    /** Returns the value of Prolog implementation flag: <code>max_arity</code>. */
    public int getMaxArity() {
        return this.maxArity;
    }

    /** Returns the value of Prolog implementation flag: <code>unknown</code>. */
    public String getUnknown() {
        return this.unknown;
    }

    /** Sets the value of Prolog implementation flag: <code>unknown</code>. */
    public void setUnknown(String mode) {
        this.unknown = mode;
    }

    /** Returns the value of Prolog implementation flag: <code>double_quotes</code>. */
    public String getDoubleQuotes() {
        return this.doubleQuotes;
    }

    /** Sets the value of Prolog implementation flag: <code>double_quotes</code>. */
    public void setDoubleQuotes(String mode) {
        this.doubleQuotes = mode;
    }

    /** Returns the value of Prolog implementation flag: <code>print_stack_trace</code>. */
    public String getPrintStackTrace() {
        if (true)
            return "on";
        return printStackTrace;
    }

    /** Sets the value of Prolog implementation flag: <code>print_stack_trace</code>. */
    public void setPrintStackTrace(String mode) {
        this.printStackTrace = mode;
    }

    protected void setFlags() {
        this.charConversion = "off";
        this.debug = "off";
        this.unknown = "error";
        this.doubleQuotes = "codes";
        this.printStackTrace = "off";
    }

    public static int startLevel = 0;
    public static PrologFlags current;

    public static String useDoubleQuotes() {
        if (current == null)
            return "codes";
        return current.getDoubleQuotes();
    }

}
