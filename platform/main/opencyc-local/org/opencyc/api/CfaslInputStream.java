package org.opencyc.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DateFormat;
import java.util.HashMap;
import org.opencyc.cycobject.CycAssertion;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.CycVariable;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.ByteArray;
import org.opencyc.cycobject.Guid;
import org.opencyc.cycobject.CycSymbol;
import java.math.BigInteger;
import java.io.IOException;
import java.lang.reflect.Method;
import org.opencyc.util.Log;
import java.io.InputStream;
import java.util.Map;
import java.io.BufferedInputStream;

public class CfaslInputStream extends BufferedInputStream
{
    public static final int API_TRACE_NONE = 0;
    public static final int API_TRACE_MESSAGES = 1;
    public static final int API_TRACE_DETAILED = 2;
    public int trace;
    public boolean reportCfaslErrors;
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
    protected static final int CFASL_GUID = 43;
    protected static final int CFASL_BYTE_VECTOR = 26;
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
    protected static final int DEFAULT_READ_LIMIT = 8192;
    private static final Map<Integer, String> CFASL_OPCODE_DESCRIPTIONS;
    protected boolean isInvalidObject;
    
    public CfaslInputStream(final InputStream in) {
        super(in, 8192);
        this.trace = 0;
        this.reportCfaslErrors = false;
        this.isInvalidObject = false;
        if (Log.current == null) {
            Log.makeLog("cfasl.log");
        }
    }
    
    public boolean isInvalidObject() {
        return this.isInvalidObject;
    }
    
    public void resetIsInvalidObject() {
        this.isInvalidObject = false;
    }
    
    public Object readObject() throws IOException {
        final int cfaslOpcode = this.readCfaslOpcode();
        Object o = null;
        if (this.trace == 2) {
            debugNote("reading opcode = " + cfaslOpcode + " (" + CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.get(cfaslOpcode) + ")");
        }
        if (cfaslOpcode >= 128) {
            o = cfaslOpcode - 128;
            if (this.trace == 2) {
                debugNote("Reading Immediate Fixnum: " + o);
            }
        }
        if (o == null) {
            o = this.maybeReadNumber(cfaslOpcode);
        }
        if (o == null) {
            o = this.maybeReadSymbol(cfaslOpcode);
        }
        if (o == null) {
            o = this.maybeReadSequence(cfaslOpcode);
        }
        if (o == null) {
            o = this.maybeReadOther(cfaslOpcode);
        }
        if (this.trace == 2) {
            try {
                final Method safeToString = o.getClass().getMethod("safeToString", (Class<?>[])new Class[0]);
                debugNote("readObject = " + safeToString.invoke(o, new Object[0]) + " (" + o.getClass() + ")");
            }
            catch (Exception e) {
                debugNote("readObject = " + o + " (" + o.getClass() + ")");
            }
        }
        return o;
    }
    
    protected Object reportUnhandledCfaslOpcode(final int cfaslOpcode) {
        if (cfaslOpcode == -1) {
            throw new CfaslInputStreamClosedException("Cfasl connection closed by peer because of bad opcode: " + cfaslOpcode);
        }
        final String errorMessage = "Unknown cfasl opcode: " + cfaslOpcode;
        if (this.reportCfaslErrors) {
            debugWarn(errorMessage);
            return Integer.toString(cfaslOpcode);
        }
        throw new RuntimeException(errorMessage);
    }
    
    public char readChar() throws IOException {
        this.mark(8192);
        final int cfaslOpcode = this.read();
        if (cfaslOpcode == 16) {
            return (char)this.read();
        }
        this.reset();
        throw new RuntimeException("Expected a char but received opCode=" + cfaslOpcode);
    }
    
    public double readDouble() throws IOException {
        this.mark(8192);
        final int cfaslOpcode = this.read();
        switch (cfaslOpcode) {
            case 8: {
                return this.readFloatBody(false);
            }
            case 9: {
                return this.readFloatBody(true);
            }
            default: {
                this.reset();
                throw new RuntimeException("Expected a double but received OpCode=" + cfaslOpcode);
            }
        }
    }
    
    public int readInt() throws IOException {
        this.mark(8192);
        final int cfaslOpcode = this.read();
        if (cfaslOpcode >= 128) {
            return cfaslOpcode - 128;
        }
        switch (cfaslOpcode) {
            case 0: {
                return this.readFixnumBody(1, false);
            }
            case 1: {
                return this.readFixnumBody(1, true);
            }
            case 2: {
                return this.readFixnumBody(2, false);
            }
            case 3: {
                return this.readFixnumBody(2, true);
            }
            case 4: {
                return this.readFixnumBody(3, false);
            }
            case 5: {
                return this.readFixnumBody(3, true);
            }
            case 6: {
                return this.readFixnumBody(4, false);
            }
            case 7: {
                return this.readFixnumBody(4, true);
            }
            default: {
                this.reset();
                throw new RuntimeException("Expected an int but received OpCode=" + cfaslOpcode);
            }
        }
    }
    
    private int readCfaslOpcode() throws IOException {
        if (this.trace == 2) {
            debugNote("Reading CFASL opcode.");
        }
        int cfaslOpcode = this.read();
        if (this.trace == 2) {
            debugNote("Read CFASL opcode: " + cfaslOpcode);
        }
        if (cfaslOpcode == 51) {
            if (this.trace == 2) {
                debugNote("reading opcode = " + cfaslOpcode + " (" + CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.get(cfaslOpcode) + ")");
            }
            cfaslOpcode = this.read();
        }
        return cfaslOpcode;
    }
    
    private int readFixnumBody(final int nBytes, final boolean shouldBeNegative) throws IOException {
        if (this.trace == 2) {
            debugNote("readFixnumBody isNegative=" + shouldBeNegative + " length=" + nBytes);
        }
        if (nBytes > 4) {
            throw new ArithmeticException("Cannot fit " + nBytes + " bytes into an int");
        }
        int num = 0;
        for (int i = 0; i < nBytes; ++i) {
            final int j = this.read();
            if (this.trace == 2) {
                debugNote("\t" + j);
            }
            num |= j << 8 * i;
        }
        if (num < 0) {
            throw new ArithmeticException("Overflow: " + (num & 0xFFFFFFFFL) + " does not fit into an int");
        }
        return shouldBeNegative ? (-num) : num;
    }
    
    private BigInteger readBignumBody(final boolean shouldBeNegative) throws IOException {
        final int length = this.readInt();
        if (this.trace == 2) {
            debugNote("readBignumBody shouldBeNegative=" + shouldBeNegative + " length=" + length);
        }
        final byte[] b = new byte[length];
        for (int i = length - 1; i >= 0; --i) {
            final int j = this.readInt();
            if (this.trace == 2) {
                debugNote("\t" + j);
            }
            b[i] = (byte)j;
        }
        return new BigInteger(shouldBeNegative ? -1 : 1, b);
    }
    
    private double readFloatBody(final boolean shouldBeNegative) throws IOException {
        if (this.trace == 2) {
            debugNote("readFloatBody shouldBeNegative=" + shouldBeNegative);
        }
        final Object obj = this.readObject();
        long signif;
        if (obj instanceof BigInteger) {
            final BigInteger bi = (BigInteger)obj;
            if (bi.bitCount() >= 64) {
                throw new ArithmeticException("Overflow reading significand of float");
            }
            signif = bi.longValue();
        }
        else {
            signif = ((Number)obj).longValue();
        }
        final long exp = this.readInt();
        if (this.trace == 2) {
            debugNote("readFloatBody shouldBeNegative=" + shouldBeNegative + " signif=" + signif + " exp= " + exp);
        }
        final Double absoluteValue = signif * Math.pow(2.0, exp);
        return shouldBeNegative ? (-absoluteValue) : ((double)absoluteValue);
    }
    
    public CycSymbol readKeyword() throws IOException {
        String keywordString = (String)this.readObject();
        if (!keywordString.startsWith(":")) {
            keywordString = ":" + keywordString;
        }
        return CycObjectFactory.makeCycSymbol(keywordString);
    }
    
    public Object readSymbol() throws IOException {
        if (this.trace >= 2) {
            debugNote("About to read symbol name.");
        }
        final Object response = this.readObject();
        if (!(response instanceof String)) {
            throw new CycApiException("Expecting  a String, got: " + response.getClass() + " for object: " + response);
        }
        final String name = (String)response;
        if (name.startsWith("?")) {
            return CycObjectFactory.makeCycVariable(name);
        }
        return CycObjectFactory.makeCycSymbol(name);
    }
    
    public Guid readLegacyGuid() throws IOException {
        final Guid guid = CycObjectFactory.makeGuid((String)this.readObject());
        if (this.trace == 2) {
            debugNote("readLegacyGuid: " + guid);
        }
        return guid;
    }
    
    public Guid readGuid() throws IOException {
        final byte[] data = new byte[16];
        for (int i = 0; i < 16; ++i) {
            final int currByte = this.read();
            if (currByte == -1) {
                throw new RuntimeException("Illegal end of stream");
            }
            data[i] = (byte)currByte;
        }
        final Guid guid = CycObjectFactory.makeGuid(data);
        if (this.trace == 2) {
            debugNote("readGuid: " + guid);
        }
        return guid;
    }
    
    public Integer readUnicodeChar() throws IOException {
        int off;
        int len;
        byte[] s;
        for (off = 0, len = this.readInt(), s = new byte[len]; off < len; off += this.read(s, off, len - off)) {}
        final String charString = new String(s, "UTF-8");
        final int retval = charString.charAt(0);
        if (this.trace == 2) {
            debugNote("readUnicodeChar: 0x" + Integer.toHexString(retval));
        }
        return new Integer(retval);
    }
    
    public String readUnicodeString() throws IOException {
        int off;
        int len;
        byte[] s;
        for (off = 0, len = this.readInt(), s = new byte[len]; off < len; off += this.read(s, off, len - off)) {}
        final String retval = new String(s, "UTF-8");
        if (this.trace == 2) {
            debugNote("readUnicodeString: " + retval);
        }
        return retval;
    }
    
    public ByteArray readByteArray() throws IOException {
        int off;
        int len;
        byte[] bytes;
        for (off = 0, len = this.readInt(), bytes = new byte[len]; off < len; off += this.read(bytes, off, len - off)) {}
        return new ByteArray(bytes);
    }
    
    public CycList readCycList() throws IOException {
        final int size = this.readInt();
        if (this.trace == 2) {
            debugNote("readCycList.size: " + size);
        }
        final CycList cycList = new CycList(size);
        for (int i = 0; i < size; ++i) {
            cycList.add(this.readObject());
        }
        if (this.trace == 2) {
            debugNote("readCycList.readObject: " + cycList.toString());
        }
        return cycList;
    }
    
    public CycList readCons() throws IOException {
        final int size = this.readInt();
        if (this.trace == 2) {
            debugNote("readCons.size: " + size);
        }
        final CycList cycList = new CycList();
        for (int i = 0; i < size; ++i) {
            final Object consObject = this.readObject();
            if (this.trace == 2) {
                if (consObject instanceof CycFort) {
                    debugNote("readCons.consObject: " + ((CycFort)consObject).toString());
                }
                else {
                    debugNote("readCons.consObject: " + consObject);
                }
            }
            cycList.add(consObject);
        }
        final Object cdrObject = this.readObject();
        if (this.trace == 2) {
            try {
                final Method safeToString = cdrObject.getClass().getMethod("safeToString", (Class<?>[])new Class[0]);
                debugNote("readCons.cdrObject: " + safeToString.invoke(cdrObject, new Object[0]));
            }
            catch (Exception e) {
                debugNote("readCons.cdrObject: " + cdrObject.toString());
            }
        }
        cycList.setDottedElement(cdrObject);
        if (this.trace == 2) {
            debugNote("readCons.readCons: " + cycList.toString());
        }
        return cycList;
    }
    
    public CycConstant readCompleteConstant() throws IOException {
        CycConstant cycConstant = null;
        final Object idObject = this.readObject();
        if (idObject instanceof Guid) {
            final Guid guid = (Guid)idObject;
            final String name = (String)this.readObject();
            cycConstant = CycObjectFactory.getCycConstantCacheByGuid(guid);
            if (cycConstant == null) {
                cycConstant = new CycConstant(name, guid);
                CycObjectFactory.addCycConstantCache(cycConstant);
            }
        }
        else if (idObject instanceof CycSymbol && idObject.equals(CycObjectFactory.makeCycSymbol(":FREE"))) {
            cycConstant = CycObjectFactory.FREE_CONSTANT;
        }
        else {
            this.readObject();
            cycConstant = CycObjectFactory.INVALID_CONSTANT;
            this.isInvalidObject = true;
        }
        if (this.trace == 2) {
            debugNote("readConstant: " + cycConstant.toString());
        }
        return cycConstant;
    }
    
    public CycVariable readCompleteVariable() throws IOException {
        final Integer hlVariableId = (Integer)this.readObject();
        final String name = (String)this.readObject();
        final CycVariable cycVariable = new CycVariable(name, hlVariableId);
        if (this.trace == 2) {
            debugNote("readVariable: " + cycVariable.toString());
        }
        return cycVariable;
    }
    
    public CycObject readNart() throws IOException {
        CycNart cycNart = null;
        final int cfaslOpcode = this.read();
        if (cfaslOpcode == 12) {
            cycNart = CycObjectFactory.INVALID_NART;
            this.isInvalidObject = true;
        }
        else {
            if (cfaslOpcode != 13) {
                if (cfaslOpcode == 11) {
                    final String name = (String)this.readObject();
                    System.err.println("readNart, symbol=" + name);
                }
                throw new RuntimeException("reading nart, expected a list, found " + cfaslOpcode);
            }
            cycNart = new CycNart(this.readCycList());
        }
        if (this.trace == 2) {
            debugNote("readNart: " + cycNart.toString());
        }
        return (CycObject)cycNart;
    }
    
    public CycAssertion readAssertion() throws IOException {
        CycList formula = null;
        Object formulaObject = null;
        CycAssertion cycAssertion = null;
        formulaObject = this.readObject();
        if (formulaObject.toString().equals("NIL")) {
            this.readObject();
            cycAssertion = CycObjectFactory.INVALID_ASSERTION;
            this.isInvalidObject = true;
        }
        else {
            try {
                formula = (CycList)formulaObject;
                final CycObject mt = (CycObject)this.readObject();
                cycAssertion = new CycAssertion(formula, mt);
            }
            catch (ClassCastException e) {
                System.err.println("formulaObject " + formulaObject.toString() + "(" + formulaObject.getClass().getName() + ")");
            }
        }
        if (this.trace == 2) {
            debugNote("readAssertion: " + cycAssertion.toString());
        }
        return cycAssertion;
    }
    
    private Object maybeReadNumber(final int cfaslOpcode) throws IOException {
        switch (cfaslOpcode) {
            case 0: {
                return this.readFixnumBody(1, false);
            }
            case 1: {
                return this.readFixnumBody(1, true);
            }
            case 2: {
                return this.readFixnumBody(2, false);
            }
            case 3: {
                return this.readFixnumBody(2, true);
            }
            case 4: {
                return this.readFixnumBody(3, false);
            }
            case 5: {
                return this.readFixnumBody(3, true);
            }
            case 6: {
                return this.readFixnumBody(4, false);
            }
            case 7: {
                return this.readFixnumBody(4, true);
            }
            case 8: {
                return this.readFloatBody(false);
            }
            case 9: {
                return this.readFloatBody(true);
            }
            case 23: {
                return this.readBignumBody(false);
            }
            case 24: {
                return this.readBignumBody(true);
            }
            default: {
                return null;
            }
        }
    }
    
    private Object maybeReadSymbol(final int cfaslOpcode) throws IOException {
        switch (cfaslOpcode) {
            case 10: {
                return this.readKeyword();
            }
            case 11: {
                return this.readSymbol();
            }
            case 12: {
                return CycObjectFactory.nil;
            }
            default: {
                return null;
            }
        }
    }
    
    private Object maybeReadSequence(final int cfaslOpcode) throws IOException {
        switch (cfaslOpcode) {
            case 13: {
                return this.readCycList();
            }
            case 17: {
                return this.readCons();
            }
            case 14: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 15: {
                int off;
                int len;
                byte[] s;
                for (off = 0, len = this.readInt(), s = new byte[len]; off < len; off += this.read(s, off, len - off)) {}
                return new String(s, "UTF-8");
            }
            default: {
                return null;
            }
        }
    }
    
    private Object maybeReadOther(final int cfaslOpcode) throws IOException {
        switch (cfaslOpcode) {
            case 16: {
                return new Character((char)this.read());
            }
            case 18: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 19: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 20: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 21: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 22: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 25: {
                return this.readLegacyGuid();
            }
            case 43: {
                return this.readGuid();
            }
            case 53: {
                return this.readUnicodeString();
            }
            case 52: {
                return this.readUnicodeChar();
            }
            case 26: {
                return this.readByteArray();
            }
            case 30: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 31: {
                return this.readNart();
            }
            case 32: {
                return this.readCompleteConstant();
            }
            case 33: {
                return this.readAssertion();
            }
            case 34: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 35: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 36: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 37: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 38: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 39: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 40: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 41: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 42: {
                return this.readCompleteVariable();
            }
            case 50: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case 64: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            case -1: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
            default: {
                return this.reportUnhandledCfaslOpcode(cfaslOpcode);
            }
        }
    }
    
    private static void debugNote(final String string) {
        Debug.maybeDebugNote(string, true);
    }
    
    private static void debugWarn(final String string) {
        Debug.maybeDebugWarn(string, true);
    }
    
    static {
        (CFASL_OPCODE_DESCRIPTIONS = new HashMap<Integer, String>()).put(128, "CFASL_IMMEDIATE_FIXNUM_CUTOFF");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(128, "CFASL_IMMEDIATE_FIXNUM_OFFSET");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(0, "CFASL_P_8BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(1, "CFASL_N_8BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(2, "CFASL_P_16BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(3, "CFASL_N_16BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(4, "CFASL_P_24BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(5, "CFASL_N_24BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(6, "CFASL_P_32BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(7, "CFASL_N_32BIT_INT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(8, "CFASL_P_FLOAT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(9, "CFASL_N_FLOAT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(10, "CFASL_KEYWORD");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(11, "CFASL_SYMBOL");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(12, "CFASL_NIL");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(13, "CFASL_LIST");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(14, "CFASL_VECTOR");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(15, "CFASL_STRING");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(16, "CFASL_CHARACTER");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(17, "CFASL_DOTTED");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(18, "CFASL_HASHTABLE");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(19, "CFASL_BTREE_LOW_HIGH");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(20, "CFASL_BTREE_LOW");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(21, "CFASL_BTREE_HIGH");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(22, "CFASL_BTREE_LEAF");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(23, "CFASL_P_BIGNUM");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(24, "CFASL_N_BIGNUM");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(25, "CFASL_LEGACY_GUID");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(43, "CFASL_GUID");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(26, "CFASL_BYTE_VECTOR");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(30, "CFASL_CONSTANT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(31, "CFASL_NART");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(32, "CFASL_COMPLETE_CONSTANT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(33, "CFASL_ASSERTION");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(34, "CFASL_ASSERTION_SHELL");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(35, "CFASL_ASSERTION_DEF");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(36, "CFASL_SOURCE");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(37, "CFASL_SOURCE_DEF");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(38, "CFASL_AXIOM");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(39, "CFASL_AXIOM_DEF");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(40, "CFASL_VARIABLE");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(41, "CFASL_INDEX");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(42, "CFASL_COMPLETE_VARIABLE");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(50, "CFASL_SPECIAL_OBJECT");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(51, "CFASL_EXTERNALIZATION");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(52, "CFASL_UNICODE_CHAR");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(53, "CFASL_UNICODE_STRING");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(64, "CFASL_DICTIONARY");
        CfaslInputStream.CFASL_OPCODE_DESCRIPTIONS.put(-1, "CFASL_SERVER_DEATH");
    }
    
    private static class Debug
    {
        private static boolean DEBUG_ALL;
        private static DateFormat df;
        private static Date date;
        
        private static synchronized Date getDate() {
            if (Debug.date == null) {
                Debug.date = new Date();
            }
            else {
                Debug.date.setTime(System.currentTimeMillis());
            }
            return Debug.date;
        }
        
        private static synchronized DateFormat getDf() {
            if (Debug.df == null) {
                Debug.df = new SimpleDateFormat("HH:mm:ss.SSS");
            }
            return Debug.df;
        }
        
        private static String getTimestamp() {
            final String timestamp = getDf().format(getDate());
            return "[" + Thread.currentThread().getName() + " " + Thread.currentThread().getId() + "] " + timestamp;
        }
        
        static void maybeDebugNote(final String message, final boolean force) {
            if (Debug.DEBUG_ALL || force) {
                System.out.println(getTimestamp() + " " + message);
            }
        }
        
        static void maybeDebugWarn(final String message, final boolean force) {
            if (Debug.DEBUG_ALL || force) {
                System.err.println(getTimestamp() + " " + message);
            }
        }
        
        static {
            Debug.DEBUG_ALL = false;
            Debug.df = null;
            Debug.date = null;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 364 ms
	
	Decompiled with Procyon 0.5.32.
*/