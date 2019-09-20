package org.opencyc.util;

import java.util.Iterator;
import java.util.Map;
import java.math.BigDecimal;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycList;

public abstract class DataTypeConverter<E>
{
    protected E handleParseException(final ParseException ex, final boolean shouldReportFailure) {
        if (shouldReportFailure) {
            ex.printStackTrace();
        }
        return null;
    }
    
    protected E parse(final CycList cycList, final boolean shouldReportFailure) {
        final Object naut = CycNaut.convertIfPromising((Object)cycList);
        if (naut instanceof CycNaut) {
            return this.parse((CycObject)naut, shouldReportFailure);
        }
        if (shouldReportFailure) {
            new IllegalArgumentException(cycList + " cannot be interpreted as a NAUT").printStackTrace();
        }
        return null;
    }
    
    protected E parse(final CycObject cycObject, final boolean shouldReportFailure) {
        try {
            return this.fromCycTerm(cycObject);
        }
        catch (ParseException ex) {
            return this.handleParseException(ex, shouldReportFailure);
        }
    }
    
    protected E parse(final CycList cycList) {
        return this.parse(cycList, true);
    }
    
    protected E parse(final CycObject cycObject) {
        return this.parse(cycObject, true);
    }
    
    protected boolean isOfType(final Object object) {
        if (object instanceof CycList) {
            return this.parse((CycList)object, false) != null;
        }
        return object instanceof CycObject && this.parse((CycObject)object, false) != null;
    }
    
    protected abstract CycObject toCycTerm(final E p0) throws ParseException;
    
    protected abstract E fromCycTerm(final CycObject p0) throws ParseException;
    
    protected static Integer parseInteger(final Object obj, final String type) throws ParseException {
        Integer result;
        try {
            result = Integer.valueOf(obj.toString());
        }
        catch (NumberFormatException nfe) {
            throw new ParseException(obj + " is not a valid " + type + ".");
        }
        return result;
    }
    
    protected static BigDecimal parseBigDecimal(final Object obj, final String type) throws ParseException {
        BigDecimal result;
        try {
            result = new BigDecimal(obj.toString());
        }
        catch (NumberFormatException nfe) {
            throw new ParseException(obj + " is not a valid " + type + ".");
        }
        return result;
    }
    
    protected static Float parseFloat(final Object obj, final String type) throws ParseException {
        Float floatValue;
        try {
            floatValue = Float.valueOf(obj.toString());
        }
        catch (NumberFormatException nfe) {
            throw new ParseException(obj + " is not a valid " + type + ".");
        }
        return floatValue;
    }
    
    protected static void throwParseException(final Object obj, final String detail) throws ParseException {
        throw new ParseException("Can't parse " + obj + ": " + detail);
    }
    
    protected static void throwParseException(final Object obj) throws ParseException {
        throw new ParseException("Can't parse " + obj);
    }
    
    protected static <K, V> K lookupKeyByValue(final Map<K, V> map, final V value) {
        for (final Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 71 ms
	
	Decompiled with Procyon 0.5.32.
*/