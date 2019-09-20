package org.opencyc.inference;

import org.opencyc.api.CycApiException;
import java.util.Iterator;
import org.opencyc.api.CycObjectFactory;
import java.util.Map;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycVariable;
import java.util.HashMap;

public class Bindings extends HashMap<CycVariable, Object>
{
    public Bindings() {
    }
    
    public Bindings(final InferenceResultSet resultSet, final int row) {
        final int oldRow = resultSet.getRow();
        resultSet.absolute(row);
        this.populateFromResultSet(resultSet);
        resultSet.absolute(oldRow);
    }
    
    public Bindings(final InferenceResultSet resultSet) {
        this.populateFromResultSet(resultSet);
    }
    
    public Bindings(final CycNaut bindingsNaut) {
        for (int argNum = 1; argNum <= bindingsNaut.getArity(); ++argNum) {
            final CycNaut binding = (CycNaut)bindingsNaut.getArg(argNum);
            final CycVariable var = (CycVariable)binding.getArg(1);
            final Object desiredValue = binding.getArg(2);
            this.put(var, desiredValue);
        }
    }
    
    void populateFromCycList(final CycList cycList) {
        this.clear();
        this.putAll(cycList.toMap());
    }
    
    private void populateFromResultSet(final InferenceResultSet resultSet) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, CycApiException {
        for (final String varName : resultSet.getColumnNames()) {
            final CycVariable var = CycObjectFactory.makeCycVariable(varName);
            this.put(var, resultSet.getObject(var));
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 30 ms
	
	Decompiled with Procyon 0.5.32.
*/