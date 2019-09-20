package org.opencyc.api;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.UUID;
import org.opencyc.cycobject.ByteArray;
import java.math.BigDecimal;
import org.opencyc.cycobject.CycFormula;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.opencyc.util.ResultSetSlice;
import org.opencyc.cycobject.CycAssertion;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.cycobject.CycSymbol;
import org.opencyc.cycobject.Guid;
import java.lang.reflect.Method;
import org.opencyc.cycobject.CycList;
import java.util.List;
import org.opencyc.util.StringUtils;
import java.math.BigInteger;
import java.io.IOException;
import org.opencyc.util.Log;
import java.io.OutputStream;
import java.io.BufferedOutputStream;

public class CfaslOutputStream extends BufferedOutputStream
{
    public static final int API_TRACE_NONE = 0;
    public static final int API_TRACE_MESSAGES = 1;
    public static final int API_TRACE_DETAILED = 2;
    public int trace;
    protected static final int CFASL_IMMEDIATE_FIXNUM_CUTOFF = 128;
    protected static final int CFASL_IMMEDIATE_FIXNUM_OFFSET = 128;
    protected static final int CFASL_P_8BIT_INT = 0;
    protected static final int CFASL_N_8BIT_INT = 1;
    protected static final int CFASL_P_16BIT_INT = 2;
    protected static final int CFASL_N_16BIT_INT = 3;
    protected static final int CFASL_P_24BIT_INT = 4;
    protected static final int CFASL_N_24BIT_INT = 5;
    protected static final int CFASL_P_32BIT_INT = 6;
    protected static final int CFASL_N_32BIT_INT = 7;
    protected static final int CFASL_P_FLOAT = 8;
    protected static final int CFASL_N_FLOAT = 9;
    protected static final int CFASL_KEYWORD = 10;
    protected static final int CFASL_SYMBOL = 11;
    protected static final int CFASL_NIL = 12;
    protected static final int CFASL_LIST = 13;
    protected static final int CFASL_VECTOR = 14;
    protected static final int CFASL_STRING = 15;
    protected static final int CFASL_CHARACTER = 16;
    protected static final int CFASL_DOTTED = 17;
    protected static final int CFASL_HASHTABLE = 18;
    protected static final int CFASL_BTREE_LOW_HIGH = 19;
    protected static final int CFASL_BTREE_LOW = 20;
    protected static final int CFASL_BTREE_HIGH = 21;
    protected static final int CFASL_BTREE_LEAF = 22;
    protected static final int CFASL_P_BIGNUM = 23;
    protected static final int CFASL_N_BIGNUM = 24;
    protected static final int CFASL_LEGACY_GUID = 25;
    protected static final int CFASL_BYTE_VECTOR = 26;
    protected static final int CFASL_RESULT_SET_SLICE = 27;
    protected static final int CFASL_CONSTANT = 30;
    protected static final int CFASL_NART = 31;
    protected static final int CFASL_COMPLETE_CONSTANT = 32;
    protected static final int CFASL_ASSERTION = 33;
    protected static final int CFASL_ASSERTION_SHELL = 34;
    protected static final int CFASL_ASSERTION_DEF = 35;
    protected static final int CFASL_SOURCE = 36;
    protected static final int CFASL_SOURCE_DEF = 37;
    protected static final int CFASL_AXIOM = 38;
    protected static final int CFASL_AXIOM_DEF = 39;
    protected static final int CFASL_VARIABLE = 40;
    protected static final int CFASL_INDEX = 41;
    protected static final int CFASL_COMPLETE_VARIABLE = 42;
    protected static final int CFASL_SPECIAL_OBJECT = 50;
    protected static final int CFASL_EXTERNALIZATION = 51;
    protected static final int CFASL_UNICODE_CHAR = 52;
    protected static final int CFASL_UNICODE_STRING = 53;
    protected static final int CFASL_DICTIONARY = 64;
    protected static final int CFASL_SERVER_DEATH = -1;
    
    public CfaslOutputStream(final OutputStream out) {
        super(out);
        this.trace = 0;
        if (Log.current == null) {
            Log.makeLog("cfasl.log");
        }
    }
    
    public CfaslOutputStream(final OutputStream out, final int size) {
        super(out, size);
        this.trace = 0;
        if (Log.current == null) {
            Log.makeLog("cfasl.log");
        }
    }
    
    public void writeBoolean(final boolean v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeBoolean = " + v);
        }
        if (v) {
            this.writeSymbol(CycObjectFactory.t);
        }
        else {
            this.writeSymbol(CycObjectFactory.nil);
        }
    }
    
    public void writeChar(final char v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeChar = " + v);
        }
        this.write(16);
        this.write(v);
    }
    
    public void writeInt(final long v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeInt = " + v);
        }
        if (-2147483648L < v && v < 2147483648L) {
            this.writeFixnum((int)v);
        }
        else {
            this.writeBignum(v);
        }
    }
    
    protected void writeFixnum(int v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("* writeFixnum(long " + v + ")");
        }
        int numBytes;
        if (v >= 0) {
            if (v < 128) {
                if (this.trace == 2) {
                    Log.current.println("Writing Immediate Fixnum: " + v);
                }
                this.write(v + 128);
                numBytes = 0;
            }
            else if (v < 128) {
                this.write(0);
                numBytes = 1;
            }
            else if (v < 32768) {
                this.write(2);
                numBytes = 2;
            }
            else if (v < 8388608) {
                this.write(4);
                numBytes = 3;
            }
            else {
                this.write(6);
                numBytes = 4;
            }
        }
        else {
            v = -v;
            if (v < 128) {
                this.write(1);
                numBytes = 1;
            }
            else if (v < 32768) {
                this.write(3);
                numBytes = 2;
            }
            else if (v < 8388608) {
                this.write(5);
                numBytes = 3;
            }
            else {
                this.write(7);
                numBytes = 4;
            }
        }
        for (int i = 0; i < numBytes; ++i) {
            if (this.trace == 2) {
                Log.current.println("f\t" + (v >>> 8 * i & 0xFF));
            }
            this.write(v >>> 8 * i);
        }
    }
    
    protected void writeBignum(long v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("* writeBignum(long " + v + ")");
        }
        if (v < 0L) {
            this.write(24);
            v = -v;
        }
        else {
            this.write(23);
        }
        final int[] parts = new int[8];
        int numBytes = 0;
        while (v > 0L) {
            parts[numBytes++] = (int)(v & 0xFFL);
            v >>>= 8;
        }
        this.writeFixnum(numBytes);
        for (int i = 0; i < numBytes; ++i) {
            if (this.trace == 2) {
                Log.current.println("b\t" + parts[i]);
            }
            this.writeFixnum(parts[i]);
        }
    }
    
    public void writeBigInteger(BigInteger v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeBigInteger = " + v);
        }
        if (v.abs().bitLength() < 32) {
            this.writeFixnum(v.intValue());
            return;
        }
        if (v.signum() < 0) {
            this.write(24);
            v = v.abs();
        }
        else {
            this.write(23);
        }
        final byte[] parts = v.toByteArray();
        this.writeFixnum(parts.length);
        for (int i = parts.length - 1; i >= 0; --i) {
            this.writeFixnum(parts[i] & 0xFF);
        }
    }
    
    public void writeDouble(double v) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeDouble = " + v);
        }
        if (Double.isNaN(v)) {
            throw new RuntimeException("Tried to send a NaN floating-point");
        }
        if (Double.isInfinite(v)) {
            throw new RuntimeException("Tried to send an infinite floating-point");
        }
        if (v < 0.0) {
            this.write(9);
            v = -v;
        }
        else {
            this.write(8);
        }
        final DecodedDouble decoded = new DecodedDouble(v);
        final int exp = decoded.exponent;
        final double sig = decoded.mantissa;
        this.writeInt((long)Math.floor(sig));
        this.writeInt(exp);
    }
    
    public void writeString(final String s) throws IOException {
        final String escapedString = this.escapeString(s);
        if (this.trace == 2) {
            Log.current.println("writeString = \"" + escapedString + "\"");
        }
        if (StringUtils.is7BitASCII(escapedString)) {
            this.write(15);
        }
        else {
            this.write(53);
        }
        final byte[] bytes = escapedString.getBytes("UTF-8");
        this.writeInt(bytes.length);
        this.write(bytes);
    }
    
    private String escapeString(final String s) {
        final StringBuffer stringBuffer = new StringBuffer();
        final char backslash = '\\';
        char previousChar = '\0';
        char ch = '\0';
        for (int i = 0; i < s.length(); ++i) {
            previousChar = ch;
            ch = s.charAt(i);
            if (ch == '\\') {
                stringBuffer.append(ch);
            }
            else if (ch == '\"') {
                if (previousChar == '\\') {
                    stringBuffer.append("\\\"");
                }
                else {
                    stringBuffer.append('\"');
                }
            }
            else {
                stringBuffer.append(ch);
            }
        }
        return stringBuffer.toString();
    }
    
    public void writeByteArray(final byte[] bytes) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeByteArray = \"" + bytes + "\"");
        }
        this.write(26);
        this.writeInt(bytes.length);
        this.write(bytes);
    }
    
    public void writeList(final List list) throws IOException {
        if (list instanceof CycList && !((CycList)list).isProperList()) {
            this.writeDottedList((CycList)list);
            return;
        }
        if (this.trace == 2) {
            if (list instanceof CycList) {
                Log.current.println("writeList = " + ((CycList)list).toString() + "\n  of size " + list.size());
            }
            else {
                Log.current.println("writeList = " + list + "\n  of size " + list.size());
            }
        }
        this.write(13);
        this.writeInt(list.size());
        for (int i = 0; i < list.size(); ++i) {
            this.writeObject(list.get(i));
        }
    }
    
    public void writeDottedList(final CycList dottedList) throws IOException {
        final int size = dottedList.getProperListSize();
        if (this.trace == 2) {
            Log.current.println("writeDottedList = " + dottedList.toString() + "\n  proper elements size " + size);
        }
        this.write(17);
        this.writeInt(size);
        for (int i = 0; i < size; ++i) {
            this.writeObject(dottedList.get(i));
        }
        final Object dottedElement = dottedList.getDottedElement();
        if (this.trace == 2) {
            try {
                final Method safeToString = dottedElement.getClass().getMethod("safeToString", (Class<?>[])new Class[0]);
                Log.current.println("writeDottedList.cdr = " + safeToString.invoke(dottedElement, new Object[0]));
            }
            catch (Exception e) {
                Log.current.println("writeDottedList.cdr = " + dottedElement);
            }
        }
        this.writeObject(dottedElement);
    }
    
    public void writeList(final Object[] list) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeList(Array) = " + list + "\n  of size " + list.length);
        }
        this.write(13);
        this.writeInt(list.length);
        for (int i = 0; i < list.length; ++i) {
            this.writeObject(list[i]);
        }
    }
    
    public void writeGuid(final Guid guid) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeGuid = " + guid);
        }
        this.write(25);
        this.writeString(guid.toString());
    }
    
    public void writeSymbol(final CycSymbol cycSymbol) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeSymbol = " + cycSymbol);
        }
        if (cycSymbol.isKeyword()) {
            this.writeKeyword(cycSymbol);
            return;
        }
        if (cycSymbol.equals((Object)CycObjectFactory.nil)) {
            if (this.trace == 2) {
                Log.current.println("writing CFASL_NIL");
            }
            this.write(12);
        }
        else {
            this.write(11);
            this.writeString(cycSymbol.toCanonicalString());
        }
    }
    
    public void writeKeyword(final CycSymbol cycSymbol) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeKeyword = " + cycSymbol);
        }
        this.write(10);
        this.writeString(cycSymbol.toCanonicalString());
    }
    
    public void writeVariable(final CycVariable cycVariable) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeVariable = " + cycVariable.toString());
        }
        final String name = cycVariable.toString();
        if (cycVariable.isHLVariable()) {
            this.write(42);
            this.writeInt(cycVariable.hlVariableId);
            this.writeString(name);
        }
        else {
            this.write(11);
            this.writeString(cycVariable.toCanonicalString());
        }
    }
    
    public void writeCompleteConstant(final CycConstant cycConstant) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeCompleteConstant = " + cycConstant.toString());
        }
        this.write(51);
        this.write(32);
        this.writeGuid(cycConstant.getGuid());
        this.writeString(cycConstant.getName());
    }
    
    public void writeNart(final CycNart cycNart) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeNart = " + cycNart.toString());
        }
        this.write(51);
        this.write(31);
        this.writeList((List)cycNart.toCycList());
    }
    
    public void writeAssertion(final CycAssertion cycAssertion) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeAssertion = " + cycAssertion.toString());
        }
        this.write(51);
        this.write(33);
        this.writeList((List)cycAssertion.getFormula());
        this.writeObject(cycAssertion.getMt());
    }
    
    public void writeResultSetSlice(final ResultSetSlice rss) throws IOException {
        if (this.trace == 2) {
            Log.current.println("writeResultSetSlice = " + rss);
        }
        final ResultSet rs = rss.resultSet();
        final int first = rss.first();
        final int last = rss.last();
        final int columnCount = rss.columnCount();
        this.write(27);
        this.writeInt(rss.rowCount());
        this.writeInt(rss.sliceRowCount());
        this.writeInt(columnCount);
        this.writeInt(first);
        try {
            rss.beforeFirst();
            for (int row = first; row <= last; ++row) {
                rs.next();
                for (int column = 1; column <= columnCount; ++column) {
                    this.writeObject(rs.getObject(column));
                }
            }
        }
        catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public void writeObject(final Object o) throws IOException {
        if (this.trace == 2) {
            try {
                if (o == null) {
                    Log.current.println("writeObject = null");
                }
                else {
                    final Method safeToString = o.getClass().getMethod("safeToString", (Class<?>[])new Class[0]);
                    Log.current.println("writeObject = " + safeToString.invoke(o, new Object[0]) + " (" + o.getClass() + ")");
                }
            }
            catch (Exception e) {
                Log.current.println("writeObject = " + o + " (" + o.getClass() + ")");
            }
        }
        if (o == null) {
            this.writeKeyword(CycObjectFactory.nul);
        }
        else if (o instanceof Guid) {
            this.writeGuid((Guid)o);
        }
        else if (o instanceof CycSymbol) {
            this.writeSymbol((CycSymbol)o);
        }
        else if (o instanceof CycVariable) {
            this.writeVariable((CycVariable)o);
        }
        else if (o instanceof CycConstant) {
            this.writeCompleteConstant((CycConstant)o);
        }
        else if (o instanceof CycNart) {
            this.writeNart((CycNart)o);
        }
        else if (o instanceof CycAssertion) {
            this.writeAssertion((CycAssertion)o);
        }
        else if (o instanceof CycFormula) {
            this.writeList(((CycFormula)o).getArgsUnmodifiable());
        }
        else if (o instanceof List) {
            this.writeList((List)o);
        }
        else if (o instanceof Boolean) {
            this.writeBoolean((boolean)o);
        }
        else if (o instanceof ResultSetSlice) {
            this.writeResultSetSlice((ResultSetSlice)o);
        }
        else if (o instanceof Character) {
            this.writeChar((char)o);
        }
        else if (o instanceof String) {
            this.writeString((String)o);
        }
        else if (o instanceof Double) {
            this.writeDouble((double)o);
        }
        else if (o instanceof Float) {
            this.writeDouble((double)o);
        }
        else if (o instanceof Long) {
            this.writeInt((long)o);
        }
        else if (o instanceof Integer) {
            this.writeInt((long)o);
        }
        else if (o instanceof Short) {
            this.writeInt((long)o);
        }
        else if (o instanceof Byte) {
            this.writeInt((long)o);
        }
        else if (o instanceof BigInteger) {
            this.writeBigInteger((BigInteger)o);
        }
        else if (o instanceof BigDecimal) {
            if (((BigDecimal)o).scale() <= 0) {
                this.writeBigInteger(((BigDecimal)o).toBigInteger());
            }
            else {
                this.writeDouble(((BigDecimal)o).doubleValue());
            }
        }
        else if (o instanceof Object[]) {
            this.writeList((Object[])o);
        }
        else if (o instanceof ByteArray) {
            this.writeByteArray(((ByteArray)o).byteArrayValue());
        }
        else if (o instanceof byte[]) {
            this.writeByteArray((byte[])o);
        }
        else if (o instanceof UUID) {
            this.writeString(o.toString());
        }
        else if (o instanceof Timestamp) {
            this.writeString(o.toString());
        }
        else if (o instanceof Date) {
            this.writeString(o.toString());
        }
        else {
            System.err.println("CfaslOutputStream: unknown class " + o.getClass().getName() + " sent as a string");
            this.writeString(o.toString());
        }
    }
    
    private static final class DecodedDouble
    {
        public final int sign;
        public final int exponent;
        public final long mantissa;
        
        public DecodedDouble(final double value) {
            final long longBits = Double.doubleToLongBits(value);
            this.sign = decodeDoubleSign(longBits);
            final int rawExponent = decodeDoubleExponent(longBits);
            final long rawMantissa = decodeDoubleMantissa(longBits);
            if (rawExponent > 0 && rawExponent < 2047) {
                this.exponent = rawExponent - 1023 - 52;
                this.mantissa = (rawMantissa | 0x10000000000000L);
            }
            else {
                if (rawExponent != 0) {
                    throw new NumberFormatException();
                }
                if (rawMantissa != 0L) {
                    this.exponent = rawExponent - 1022 - 52;
                    this.mantissa = rawMantissa;
                }
                else {
                    this.exponent = 0;
                    this.mantissa = 0L;
                }
            }
        }
        
        private static int decodeDoubleSign(final long longBits) {
            final int signBit = (int)(longBits >> 63 & 0x1L);
            if (signBit == 0) {
                return 1;
            }
            return -1;
        }
        
        private static int decodeDoubleExponent(final long longBits) {
            return (int)((longBits & 0x7FF0000000000000L) >> 52);
        }
        
        private static long decodeDoubleMantissa(final long longBits) {
            return longBits & 0xFFFFFFFFFFFFFL;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 217 ms
	
	Decompiled with Procyon 0.5.32.
*/