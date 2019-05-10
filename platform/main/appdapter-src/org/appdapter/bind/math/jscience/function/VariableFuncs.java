package org.appdapter.bind.math.jscience.function;

import java.util.Iterator;
import org.jscience.mathematics.function.Variable;
import java.util.List;

public class VariableFuncs
{
    public static <NT> String dumpVarList(final List<Variable<NT>> vars) {
        if (vars == null) {
            return null;
        }
        final StringBuffer buf = new StringBuffer("[");
        boolean firstVar = true;
        for (final Variable<NT> v : vars) {
            final String sym = v.getSymbol();
            final NT nval = (NT)v.get();
            if (!firstVar) {
                buf.append(",");
            }
            buf.append(sym).append("=").append(nval);
            firstVar = false;
        }
        buf.append("]");
        return buf.toString();
    }
}

/*

	Total time: 23 ms
	
*/