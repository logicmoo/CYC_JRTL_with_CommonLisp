package org.appdapter.bind.math.jscience.number;

import org.jscience.mathematics.number.Number;
import org.jscience.mathematics.structure.Ring;
import org.jscience.mathematics.function.Term;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import org.slf4j.Logger;
import org.jscience.mathematics.function.Polynomial;
import org.jscience.mathematics.function.Variable;
import org.jscience.mathematics.number.Real;

public class RealFuncs
{
    public static Real makeReal(final double d) {
        final double mag = Math.abs(d);
        throw new RuntimeException("need to replace code for Real.valueOf()");
    }
    
    public static void setVariableValue(final Variable<Real> var, final double value) {
        final Real rval = makeReal(value);
        var.set((Real)rval);
    }
    
    public static double getVariableValue(final Variable<Real> var) {
        final Real rval = (Real)var.get();
        if (rval == null) {
            throw new RuntimeException("Null value for var with sym=" + var.getSymbol());
        }
        return rval.doubleValue();
    }
    
    public static void setInputVarValue(final Polynomial poly, final String fullSymbol, final double value) {
        final Variable<Real> v = (Variable<Real>)poly.getVariable(fullSymbol);
        if (v == null) {
            throw new RuntimeException("Can't locate var for sym=" + fullSymbol + " in poly=" + poly);
        }
        setVariableValue(v, value);
    }
    
    public static double getInputVarValue(final Polynomial poly, final String fullSymbol) {
        final Variable<Real> v = (Variable<Real>)poly.getVariable(fullSymbol);
        if (v == null) {
            throw new RuntimeException("Can't locate var for sym=" + fullSymbol + " in poly=" + poly);
        }
        final Real rval = (Real)v.get();
        if (rval == null) {
            throw new RuntimeException("Null value for var with sym=" + fullSymbol + " in poly=" + poly);
        }
        return rval.doubleValue();
    }
    
    public static double evalPoly(final Polynomial<Real> poly) {
        return evalPrintReturnPoly(poly, null, null, null, false);
    }
    
    public static double evalPrintReturnPoly(final Polynomial<Real> poly, final String logLabel, final Logger logger, final Level logLev, final boolean logFlag) {
        final Real val = (Real)poly.evaluate();
        if (logFlag) {
            final StringBuffer msg = new StringBuffer(logLabel).append(" = {");
            msg.append(poly.toString()).append("} (").append(dumpPolyVars(poly)).append(") = ").append(val);
            logger.info(msg.toString());
        }
        return val.doubleValue();
    }
    
    public static String dumpPolyVars(final Polynomial poly) {
        final StringBuffer buf = new StringBuffer("[");
        final List<Variable<Real>> polyVars = (List<Variable<Real>>)poly.getVariables();
        boolean firstVar = true;
        for (final Variable<Real> v : polyVars) {
            final String sym = v.getSymbol();
            final Real rval = (Real)v.get();
            if (!firstVar) {
                buf.append(",");
            }
            buf.append(sym).append("=").append(rval.toString());
            firstVar = false;
        }
        buf.append("]");
        return buf.toString();
    }
    
    public static Polynomial makeConstAccelPosPoly(final Variable<Real> rangeOffsetTimeVar, final Variable<Real> rangeAccelVar, final Variable<Real> rangePosStartVar, final Variable<Real> rangeVelStartVar) {
        final Term timeSquaredTerm = Term.valueOf((Variable)rangeOffsetTimeVar, 2);
        final Term accelTerm = Term.valueOf((Variable)rangeAccelVar, 1);
        final Term accelTimeSqTerm = timeSquaredTerm.times(accelTerm);
        final Real oneHalf = makeReal(0.5);
        final Polynomial parabPoly = Polynomial.valueOf((Ring)oneHalf, accelTimeSqTerm);
        final Term timeTerm = Term.valueOf((Variable)rangeOffsetTimeVar, 1);
        final Term velTerm = Term.valueOf((Variable)rangeVelStartVar, 1);
        final Term velTimeTerm = timeTerm.times(velTerm);
        final Polynomial linearPoly = Polynomial.valueOf((Ring)Real.ONE, velTimeTerm);
        final Polynomial constPoly = Polynomial.valueOf((Ring)Real.ONE, (Variable)rangePosStartVar);
        final Polynomial constPlusLinear = constPoly.plus(linearPoly);
        final Polynomial fullPoly = constPlusLinear.plus(parabPoly);
        return fullPoly;
    }
    
    public static NumberFactory<Real> getRealNumberFactory() {
        return new NumberFactory<Real>() {
            public Real getZero() {
                return Real.ZERO;
            }
            
            public Real getOne() {
                return Real.ONE;
            }
            
            public Real getOneHalf() {
                throw new RuntimeException("need to replace code for Real.valueOf() for compat with latest Javolution");
            }
            
            public Real makeNumberFromDouble(final double d) {
                return RealFuncs.makeReal(d);
            }
            
            public Real[] makeArray(final int size) {
                return (Real[])makeArrayForClass((Class)Real.class, size);
            }
        };
    }
}

/*

	Total time: 43 ms
	
*/