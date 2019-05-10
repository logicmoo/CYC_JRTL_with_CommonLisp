package org.appdapter.bind.math.jscience.probability;

import java.util.Iterator;
import java.util.ArrayList;
import org.appdapter.bind.math.jscience.function.VariableFuncs;
import javolution.text.Text;
import org.appdapter.bind.math.jscience.number.FieldNumberFactory;
import org.jscience.mathematics.function.Variable;
import java.util.List;
import org.jscience.mathematics.function.Function;
import org.jscience.mathematics.number.FieldNumber;

public abstract class ProbabilityDensityFunction<DomainValue, MeasureNumber extends FieldNumber<MeasureNumber>> extends Function<DomainValue, MeasureNumber>
{
    private List<Variable<DomainValue>> myVars;
    public FieldNumberFactory<MeasureNumber> myMeasureNumberFactory;
    
    protected ProbabilityDensityFunction(final FieldNumberFactory<MeasureNumber> measNumFact) {
        this.myMeasureNumberFactory = measNumFact;
    }
    
    public final void setVariables(final List<Variable<DomainValue>> vars) {
        this.myVars = vars;
    }
    
    @Override
	public final List<Variable<DomainValue>> getVariables() {
        return this.myVars;
    }
    
    @Override
	public Text toText() {
        return new Text(this.getClass().getSimpleName() + "[curVal=" + this.evaluate() + ", curVars=[" + VariableFuncs.dumpVarList((List)this.myVars) + "]]");
    }
    
    public final double evaluateToDouble() {
        final MeasureNumber result = (MeasureNumber)this.evaluate();
        if (result == null) {
            throw new RuntimeException("evaluateToDouble() got null result from evaluate()");
        }
        return result.doubleValue();
    }
    
    public final List<DomainValue> getCurrentDomainVariableValues() {
        final List<DomainValue> res = new ArrayList<DomainValue>();
        for (final Variable<DomainValue> v : this.myVars) {
            res.add((DomainValue)v.get());
        }
        return res;
    }
}

/*

	Total time: 27 ms
	
*/