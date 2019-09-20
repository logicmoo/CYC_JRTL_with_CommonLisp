package org.opencyc.cycobject;

import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import java.util.List;

public interface CycObject extends Comparable<Object>
{
    public static final int CYCOBJECT_UNKNOWN = 0;
    public static final int CYCOBJECT_BYTEARRAY = 1;
    public static final int CYCOBJECT_CYCASSERTION = 2;
    public static final int CYCOBJECT_CYCFORT = 3;
    public static final int CYCOBJECT_CYCLIST = 4;
    public static final int CYCOBJECT_CYCSYMBOL = 5;
    public static final int CYCOBJECT_CYCVARIABLE = 6;
    public static final int CYCOBJECT_DOUBLE = 7;
    public static final int CYCOBJECT_FLOAT = 8;
    public static final int CYCOBJECT_GUID = 9;
    public static final int CYCOBJECT_INTEGER = 10;
    public static final int CYCOBJECT_LONG = 11;
    public static final int CYCOBJECT_STRING = 12;
    public static final int CYCOBJECT_BIGINTEGER = 13;
    
    String cyclify();
    
    String cyclifyWithEscapeChars();
    
    List getReferencedConstants();
    
    void toXML(final XMLWriter p0, final int p1, final boolean p2) throws IOException;
    
    String stringApiValue();
    
    Object cycListApiValue();
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 6 ms
	
	Decompiled with Procyon 0.5.32.
*/