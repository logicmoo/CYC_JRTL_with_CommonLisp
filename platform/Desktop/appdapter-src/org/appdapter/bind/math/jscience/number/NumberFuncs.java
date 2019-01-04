package org.appdapter.bind.math.jscience.number;

import java.util.Iterator;
import java.util.List;
import org.jscience.mathematics.function.Variable;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.jscience.mathematics.number.Number;
import org.jscience.mathematics.function.Polynomial;

public class NumberFuncs
{
    public static <NT extends Number<NT>> NT evalPoly(final Polynomial<NT> poly) {
        return evalPrintReturnPoly(poly, null, null, null, false);
    }
    
    public static <NT extends Number<NT>> NT evalPrintReturnPoly(final Polynomial<NT> poly, final String logLabel, final Logger logger, final Level logLev, final boolean logFlag) {
        final NT nval = (NT)poly.evaluate();
        if (logFlag) {
            final StringBuffer msg = new StringBuffer(logLabel).append(" = {");
            msg.append(poly.toString()).append("} (").append(dumpPolyVars(poly)).append(") = ").append(nval);
            logger.info(msg.toString());
        }
        return nval;
    }
    
    public static <NT extends Number<NT>> String dumpPolyVars(final Polynomial<NT> poly) {
        final StringBuffer buf = new StringBuffer("[");
        final List<Variable<NT>> polyVars = (List<Variable<NT>>)poly.getVariables();
        boolean firstVar = true;
        for (final Variable<NT> v : polyVars) {
            final String sym = v.getSymbol();
            final NT nval = (NT)v.get();
            if (!firstVar) {
                buf.append(",");
            }
            buf.append(sym).append("=").append(nval.toString());
            firstVar = false;
        }
        buf.append("]");
        return buf.toString();
    }
}

/*

	Total time: 26 ms
	
*/