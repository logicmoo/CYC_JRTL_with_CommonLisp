package org.opencyc.cycobject;

import java.util.HashMap;
import org.opencyc.util.DateConverter;
import java.util.Iterator;
import java.util.List;
import java.util.Date;
import java.util.TimeZone;
import java.util.Map;

public class CycNaut extends CycFormula implements CycNonAtomicTerm, CycDenotationalTerm
{
    private Map<TimeZone, Date> dates;
    private Boolean dateStatus;
    private CycQuantity quantity;
    private Boolean quantityStatus;
    
    public CycNaut(final Iterable<Object> terms) {
        super((Iterable)terms);
        this.dates = null;
        this.dateStatus = null;
        this.quantity = null;
        this.quantityStatus = null;
    }
    
    public CycNaut(final CycDenotationalTerm functor, final Object... args) {
        super(functor, args);
        this.dates = null;
        this.dateStatus = null;
        this.quantity = null;
        this.quantityStatus = null;
    }
    
    public static Object convertIfPromising(final Object term) {
        if (term instanceof List && !(term instanceof CycNaut)) {
            final List<Object> termAsList = (List<Object>)term;
            if (!termAsList.isEmpty() && termAsList.get(0) instanceof CycConstant) {
                final CycConstant arg0 = (CycConstant) termAsList.get(0);
                if (Character.isUpperCase(arg0.getName().charAt(0))) {
                    return new CycNaut(termAsList);
                }
            }
        }
        return term;
    }
    
    public CycFort getFunctor() {
        return (CycFort)this.getOperator();
    }
    
    public CycNaut getFormula() {
        return this;
    }
    
    public List getArguments() {
        return this.getArgsUnmodifiable().subList(1, this.getArity() + 1);
    }
    
    public CycNaut deepCopy() {
        return new CycNaut(super.deepCopy().getArgsUnmodifiable());
    }
    
    public boolean equalsAtEL(final Object object) {
        if (!(object instanceof CycNonAtomicTerm)) {
            return false;
        }
        final CycNonAtomicTerm thatNAT = (CycNonAtomicTerm)object;
        if (this.getFunctor().equalsAtEL((Object)thatNAT.getFunctor()) && this.getArity() == thatNAT.getArity()) {
            for (int argNum = 1; argNum <= this.getArity(); ++argNum) {
                final Object arg = this.getArgument(argNum);
                final Object thatArg = thatNAT.getArgument(argNum);
                if (!arg.equals(thatArg)) {
                    if (!(arg instanceof CycFormula) || !((CycFormula)arg).equalsAtEL(thatArg)) {
                        if (!(arg instanceof CycDenotationalTerm) || !((CycDenotationalTerm)arg).equalsAtEL(thatArg)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public CycList toCycList() {
        final CycList cycList = new CycList();
        final CycFort functor = this.getFunctor();
        if (functor instanceof CycNonAtomicTerm) {
            cycList.add((Object)((CycNonAtomicTerm)functor).toCycList());
        }
        else {
            cycList.add((Object)functor);
        }
        for (final Object argument : this.getArguments()) {
            cycList.add(argument);
        }
        return cycList;
    }
    
    public CycList toDeepCycList() {
        final CycList cycList = new CycList();
        final CycFort functor = this.getFunctor();
        if (functor instanceof CycNonAtomicTerm) {
            cycList.add((Object)((CycNonAtomicTerm)functor).toDeepCycList());
        }
        else {
            cycList.add((Object)functor);
        }
        this.getArguments();
        for (final Object argument : this.getArguments()) {
            if (argument instanceof CycNonAtomicTerm) {
                cycList.add((Object)((CycNonAtomicTerm)argument).toDeepCycList());
            }
            else {
                cycList.add(argument);
            }
        }
        return cycList;
    }
    
    public Object getArgument(final int argnum) {
        return this.getArg(argnum);
    }
    
    public Object cycListApiValue() {
        return super.cycListApiValue();
    }
    
    public Date asDate() {
        return this.asDate(TimeZone.getDefault());
    }
    
    public Date asDate(final TimeZone timeZone) {
        return this.isDate() ? this.lookupOrComputeDate(timeZone) : null;
    }
    
    public boolean isDate() {
        if (this.dateStatus == null) {
            this.computeDateStatus();
        }
        return this.dateStatus;
    }
    
    public CycQuantity asQuantity() {
        return this.isQuantity() ? this.quantity : null;
    }
    
    public boolean isQuantity() {
        if (this.quantityStatus == null) {
            this.computeQuantityStatus();
        }
        return this.quantityStatus;
    }
    
    private Date lookupOrComputeDate(final TimeZone timeZone) {
        if (this.dates != null && this.dates.containsKey(timeZone)) {
            return this.dates.get(timeZone);
        }
        final Date date = DateConverter.parseCycDate(this, timeZone, false);
        if (date != null) {
            if (this.dates == null) {
                this.dates = new HashMap<TimeZone, Date>();
            }
            this.dates.put(timeZone, date);
        }
        return date;
    }
    
    private void computeDateStatus() {
        this.lookupOrComputeDate(TimeZone.getDefault());
        this.dateStatus = (this.dates != null);
    }
    
    private void computeQuantity() {
        this.quantity = CycQuantity.valueOf(this);
    }
    
    private void computeQuantityStatus() {
        this.computeQuantity();
        this.quantityStatus = (this.quantity != null);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 79 ms
	
	Decompiled with Procyon 0.5.32.
*/