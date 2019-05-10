package org.appdapter.bind.math.jscience.function;

import java.util.Iterator;
import java.util.List;
import org.jscience.mathematics.function.Variable;
import org.slf4j.Logger;
import org.jscience.mathematics.number.Number;
import org.jscience.mathematics.number.FieldNumber;
import org.appdapter.bind.math.jscience.number.FieldNumberFactory;
import org.appdapter.bind.math.jscience.number.RingElementFactory;
import org.jscience.mathematics.function.Term;
import org.jscience.mathematics.function.Polynomial;
import org.jscience.mathematics.structure.Ring;

public class PolyFuncs
{
    public static <R extends Ring<R>> Polynomial<R> makeConstantPoly(final R constant) {
        return (Polynomial<R>)Polynomial.valueOf((Ring)constant, Term.ONE);
    }
    
    public static <R extends Ring<R>> Polynomial<R> makeUnitPoly(final RingElementFactory<R> ref) {
        return makeConstantPoly(ref.getOne());
    }
    
    public static <R extends Ring<R>> Polynomial<R> makeZeroPoly(final RingElementFactory<R> ref) {
        return makeConstantPoly(ref.getZero());
    }
    
    public static <FN extends FieldNumber<FN>> Polynomial<FN> makeConstantPoly(final FieldNumberFactory<FN> dnf, final double constant) {
        final FN cn = (FN)dnf.makeNumberFromDouble(constant);
        return makeConstantPoly(cn);
    }
    
    public static <RN extends Number<RN>> double evalPoly(final Polynomial<RN> poly) {
        return evalPrintReturnPoly(poly, null, null, false);
    }
    
    public static <RN extends Number<RN>> double evalPrintReturnPoly(final Polynomial<RN> poly, final String logLabel, final Logger logger, final boolean logFlag) {
        final RN val = (RN)poly.evaluate();
        if (logFlag) {
            final StringBuffer msg = new StringBuffer(logLabel).append(" = {");
            msg.append(poly.toString()).append("} (").append(dumpPolyVars(poly)).append(") = ").append(val);
            logger.info(msg.toString());
        }
        return val.doubleValue();
    }
    
    public static <RN extends Number<RN>> String dumpPolyVars(final Polynomial<RN> poly) {
        final StringBuffer buf = new StringBuffer("[");
        final List<Variable<RN>> polyVars = (List<Variable<RN>>)poly.getVariables();
        boolean firstVar = true;
        for (final Variable<RN> v : polyVars) {
            final String sym = v.getSymbol();
            final RN rval = (RN)v.get();
            if (!firstVar) {
                buf.append(",");
            }
            buf.append(sym).append("=").append(rval.toString());
            firstVar = false;
        }
        buf.append("]");
        return buf.toString();
    }
}

/*

	Total time: 28 ms
	
*/