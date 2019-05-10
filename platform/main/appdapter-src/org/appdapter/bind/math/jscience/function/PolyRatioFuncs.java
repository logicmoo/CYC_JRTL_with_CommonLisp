package org.appdapter.bind.math.jscience.function;

import org.jscience.mathematics.number.FieldNumber;
import org.appdapter.bind.math.jscience.number.FieldNumberFactory;
import org.jscience.mathematics.function.Polynomial;
import org.jscience.mathematics.structure.Ring;
import org.jscience.mathematics.function.RationalFunction;
import org.jscience.mathematics.structure.Field;
import org.appdapter.bind.math.jscience.number.RingElementFactory;

public class PolyRatioFuncs
{
    public static <F extends Field<F>> RationalFunction<F> makeConstantPolyRatio(final F constant, final RingElementFactory<F> ref) {
        final Polynomial<F> numer = (Polynomial<F>)PolyFuncs.makeConstantPoly((Ring)constant);
        final Polynomial<F> denom = (Polynomial<F>)PolyFuncs.makeUnitPoly((RingElementFactory)ref);
        return (RationalFunction<F>)RationalFunction.valueOf((Polynomial)numer, (Polynomial)denom);
    }
    
    public static <F extends Field<F>> RationalFunction<F> makeUnitPolyRatio(final RingElementFactory<F> ref) {
        return makeConstantPolyRatio((F)ref.getOne(), ref);
    }
    
    public static <F extends Field<F>> RationalFunction<F> makeZeroPolyRatio(final RingElementFactory<F> ref) {
        return makeConstantPolyRatio((F)ref.getZero(), ref);
    }
    
    public static <FN extends FieldNumber<FN>> RationalFunction<FN> makeConstantPolyRatio(final FieldNumberFactory<FN> dnf, final double constant) {
        final FN cn = (FN)dnf.makeNumberFromDouble(constant);
        return makeConstantPolyRatio(cn, (org.appdapter.bind.math.jscience.number.RingElementFactory<FN>)dnf);
    }
}

/*

	Total time: 8 ms
	
*/