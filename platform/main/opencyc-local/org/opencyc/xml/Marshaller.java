package org.opencyc.xml;

import java.io.IOException;
import org.opencyc.cycobject.ByteArray;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.cycobject.Guid;

public class Marshaller
{
    public static String marshall(final Object object) throws IOException {
        if (object instanceof Guid) {
            return ((Guid)object).toXMLString();
        }
        if (object instanceof CycSymbol) {
            return ((CycSymbol)object).toXMLString();
        }
        if (object instanceof CycVariable) {
            return ((CycVariable)object).toXMLString();
        }
        if (object instanceof CycConstant) {
            return ((CycConstant)object).toXMLString();
        }
        if (object instanceof CycNart) {
            return ((CycNart)object).toXMLString();
        }
        if (object instanceof CycList) {
            return ((CycList)object).toXMLString();
        }
        if (object instanceof String) {
            return "<string>" + (String)object + "</string>\n";
        }
        if (object instanceof Integer) {
            return "<integer>" + ((Integer)object).toString() + "</integer>\n";
        }
        if (object instanceof Double) {
            return "<double>" + ((Double)object).toString() + "</double>\n";
        }
        if (object instanceof ByteArray) {
            return ((ByteArray)object).toXMLString();
        }
        throw new IOException("Invalid object for marshalling " + object);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 37 ms
	
	Decompiled with Procyon 0.5.32.
*/