package SxxMachine;

import java.io.PrintStream;
import java.io.PrintWriter;

import SxxMachine.pterm.TermData.StaticPred;

/**
 * The superclass of classes for Prolog exceptions.<br>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.0
 */
public abstract class PrologException extends RuntimeException {
    /** Constructs a new Prolog exception. */
    public PrologException() {
    }

    public PrologException(String s) {
        super(s);
    }

    @Override
    abstract public String getMessage();

    /** Returns the message term of this object. */
    abstract public Term getMessageTerm();

    private Operation[] prologStackElement = null;

    public Operation[] getPrologStackTrace() {
        return this.prologStackElement == null ? null : this.prologStackElement.clone();
    }

    public void setPrologStackTrace(Operation[] stack) {
        this.prologStackElement = stack;
    }

    public boolean hasPrologStackTrace() {
        return this.prologStackElement != null;
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
        if (this.prologStackElement != null && this.prologStackElement.length > 0) {
            s.println("Prolog stack trace:");
            for (Operation o : this.prologStackElement) {
                s.println(printOp(o));
            }
        }
    }

    private StringBuilder printOp(Operation o) {
        StringBuilder sb = new StringBuilder("\tat ");
        if (o.getClass() == StaticPred.class) {
            StaticPred o2 = (StaticPred) o;
            o2.toString(sb);
            return sb;
        }
        sb.append(o.getClass().getName());
        int i = sb.lastIndexOf(".");
        if (i >= 0) {
            sb.setCharAt(i, ':');
        }
        return sb;
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
        if (this.prologStackElement != null && this.prologStackElement.length > 0) {
            s.println("Prolog stack trace:");
            for (Operation o : this.prologStackElement) {
                s.println(printOp(o));
            }
        }
    }
}
