package org.opencyc.api;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.cycobject.CycList;
import java.text.ParsePosition;
import java.text.FieldPosition;
import org.opencyc.cycobject.DefaultCycObject;
import java.text.Format;

public class CycLFormat extends Format
{
    private CycAccess cyc;
    private boolean newlines;
    private boolean showHashDollar;
    
    protected CycLFormat(final CycAccess cyc) {
        this.newlines = true;
        this.showHashDollar = true;
        this.cyc = cyc;
    }
    
    public static CycLFormat getInstance(final CycAccess cyc) {
        final CycLFormat cycF = new CycLFormat(cyc);
        return cycF;
    }
    
    public void setWrapLines(final boolean newlines) {
        this.newlines = newlines;
    }
    
    public void setShowHashDollar(final boolean showHashDollar) {
        this.showHashDollar = showHashDollar;
    }
    
    private CycAccess getCycAccess() {
        return this.cyc;
    }
    
    private String buildFormatCommand(final Object obj) {
        return "(get-pretty-formatted-string " + DefaultCycObject.stringApiValue(obj) + " " + DefaultCycObject.stringApiValue(this.showHashDollar) + " " + DefaultCycObject.stringApiValue(this.newlines) + ")";
    }
    
    @Override
    public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {
        final String command = this.buildFormatCommand(obj);
        try {
            toAppendTo.append(this.getCycAccess().converseString((Object)command));
        }
        catch (Exception ex) {
            throw new RuntimeException("Exception formatting " + obj, ex);
        }
        return toAppendTo;
    }
    
    @Override
    public Object parseObject(final String source, final ParsePosition pos) {
        try {
            final String command = "(multiple-value-list (read-from-string-ignoring-errors (cyclify-string " + DefaultCycObject.stringApiValue((Object)source) + ")))";
            final CycList ret = (CycList)this.getCycAccess().converseCycObject((Object)command);
            final Object value = ret.first();
            final Object indexOrError = ret.second();
            if (indexOrError instanceof Integer) {
                pos.setIndex((int)indexOrError);
                return value;
            }
            pos.setErrorIndex(pos.getIndex());
            return null;
        }
        catch (UnknownHostException ex) {
            Logger.getLogger(CycLFormat.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex2) {
            Logger.getLogger(CycLFormat.class.getName()).log(Level.SEVERE, null, ex2);
        }
        catch (CycApiException ex3) {
            Logger.getLogger(CycLFormat.class.getName()).log(Level.SEVERE, null, (Throwable)ex3);
        }
        return null;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 61 ms
	
	Decompiled with Procyon 0.5.32.
*/