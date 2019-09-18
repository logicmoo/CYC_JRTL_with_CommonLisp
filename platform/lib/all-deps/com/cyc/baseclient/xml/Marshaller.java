package com.cyc.baseclient.xml;

import com.cyc.baseclient.cycobject.CycVariable;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.CycArrayList;
import com.cyc.baseclient.cycobject.CycSymbol;
import com.cyc.baseclient.cycobject.CycGuid;
import com.cyc.baseclient.cycobject.ByteArray;
import com.cyc.baseclient.cycobject.CycNart;
import java.io.*;

/**
 * Provides the behavior of a CYC-ML marshaller.<p>
 *
 * @version $Id: Marshaller.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */

public class Marshaller {

    /**
     * Marshalls the given object into its CYC-ML XML representation.
     *
     * @param object the object for marshalling
     * @return the CYC-ML XML representation string
     */
    public static String marshall(Object object) throws IOException {
        if (object instanceof CycGuid)
            return ((CycGuid) object).toXMLString();
        else if (object instanceof CycSymbol)
            return ((CycSymbol) object).toXMLString();
        else if (object instanceof CycVariable)
            return ((CycVariable) object).toXMLString();
        else if (object instanceof CycConstant)
            return ((CycConstant) object).toXMLString();
        else if (object instanceof CycNart)
            return ((CycNart) object).toXMLString();
        else if (object instanceof CycArrayList)
            return ((CycArrayList) object).toXMLString();
        else if (object instanceof String)
            return "<string>" + (String) object + "</string>\n";
        else if (object instanceof Integer)
            return "<integer>" + ((Integer) object).toString() + "</integer>\n";
        else if (object instanceof Double)
            return "<double>" + ((Double) object).toString() + "</double>\n";
        else if (object instanceof ByteArray)
            return ((ByteArray) object).toXMLString();
        else
            throw new IOException("Invalid object for marshalling " + object);
    }

}
