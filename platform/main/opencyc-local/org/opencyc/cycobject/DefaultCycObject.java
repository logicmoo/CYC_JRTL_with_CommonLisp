package org.opencyc.cycobject;

import java.util.Map;
import java.util.Arrays;
import org.opencyc.api.CycObjectFactory;
import org.opencyc.api.CycAccess;
import org.opencyc.api.CompactHLIDConverter;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import java.math.BigInteger;
import org.opencyc.inference.params.InferenceParameters;
import java.util.ArrayList;
import org.opencyc.util.StringUtils;
import java.util.LinkedHashMap;
import java.util.List;

public abstract class DefaultCycObject implements CycObject
{
    public static final String objectXMLTag = "cycl-object";
    private static final List emptyList;
    private static final int MAX_ENTRIES = 20000;
    private static final LinkedHashMap<String, Object> compactExternalIdToCycObjectCache;
    private static final LinkedHashMap<Object, String> cycObjectToCompactExternalIdCache;
    
    public String cyclify() {
        return this.toString();
    }
    
    public String cyclifyWithEscapeChars() {
        return this.cyclify();
    }
    
    public static String cyclifyWithEscapeChars(final Object obj) {
        return cyclifyWithEscapeChars(obj, false);
    }
    
    public static String cyclifyWithEscapeChars(final Object obj, final boolean isApi) {
        if (obj == null || !isCycLObject(obj)) {
            throw new RuntimeException("Cannot cyclify (escaped): '" + obj + "'.");
        }
        if (obj instanceof CycObject) {
            return ((CycObject)obj).cyclifyWithEscapeChars();
        }
        if (obj instanceof String) {
            final String str = (String)obj;
            if (StringUtils.is7BitASCII(str)) {
                return "\"" + StringUtils.escapeDoubleQuotes(str) + "\"";
            }
            return StringUtils.unicodeEscaped(str, isApi);
        }
        else {
            if (obj instanceof Character) {
                return StringUtils.escapeDoubleQuotes(cyclify(obj));
            }
            if (obj instanceof Boolean) {
                return (obj == Boolean.FALSE) ? "nil" : "t";
            }
            if (obj instanceof Double) {
                return obj.toString().replaceFirst("E", "d");
            }
            if (obj instanceof Float) {
                return obj.toString().replaceFirst("E", "d");
            }
            return obj.toString();
        }
    }
    
    public static String cyclify(final Object obj) {
        if (obj == null) {
            throw new RuntimeException("Cannot cyclify null obj");
        }
        if (!isCycLObject(obj)) {
            throw new RuntimeException("Cannot cyclify: '" + obj + "' (" + obj.getClass().getName() + ").");
        }
        if (obj instanceof CycObject) {
            return ((CycObject)obj).cyclify();
        }
        if (obj instanceof String) {
            return "\"" + (String)obj + "\"";
        }
        if (!(obj instanceof Character)) {
            return obj.toString();
        }
        final Character theChar = (Character)obj;
        if (theChar == ' ') {
            return "#\\Space";
        }
        if (theChar == '\n') {
            return "#\\Newline";
        }
        if (theChar == '\r') {
            return "#\\Return";
        }
        if (theChar == '\t') {
            return "#\\Tab";
        }
        if (Character.isWhitespace(theChar)) {
            throw new IllegalArgumentException("Don't know how to trasmit the whitespace character: " + (int)theChar);
        }
        return "#\\" + obj;
    }
    
    public static List getReferencedConstants(final Object obj) {
        if (obj == null) {
            return new ArrayList();
        }
        if (obj == null || !isCycLObject(obj)) {
            throw new RuntimeException("Got an object that is not a valid CycL term: '" + obj + "' (" + obj.getClass().getName() + ").");
        }
        if (!(obj instanceof CycObject)) {
            return new ArrayList();
        }
        return ((CycObject)obj).getReferencedConstants();
    }
    
    public List getReferencedConstants() {
        return DefaultCycObject.emptyList;
    }
    
    public static String stringApiValue(final Object obj) {
        if (obj == null || !isCycLObject(obj)) {
            throw new RuntimeException(obj + " cannot be converted to a form suitable for use as a String api expression value.");
        }
        if (obj instanceof CycObject) {
            return ((CycObject)obj).stringApiValue();
        }
        if (obj instanceof InferenceParameters) {
            return ((InferenceParameters)obj).stringApiValue();
        }
        return cyclifyWithEscapeChars(obj, true);
    }
    
    public static String stringApiValue(final boolean val) {
        return val ? "t" : "nil";
    }
    
    public static String currentOpenCycURIForHLID(final String id) {
        return "http://sw.opencyc.org/concept/" + id;
    }
    
    public static String currentOpenCycURIForCycLString(final String cycl) {
        return "http://sw.opencyc.org/concept/en/" + cycl;
    }
    
    public static boolean isCycLObject(final Object obj) {
        return obj instanceof CycObject || obj instanceof InferenceParameters || obj instanceof Boolean || obj instanceof String || obj instanceof Integer || obj instanceof Character || obj instanceof Long || obj instanceof BigInteger || obj instanceof Guid || obj instanceof Float || obj instanceof Double;
    }
    
    public static String toPrettyString(final Object obj) {
        if (obj instanceof String) {
            return "\"" + obj.toString() + "\"";
        }
        if (obj instanceof CycList) {
            return ((CycList)obj).toPrettyString("");
        }
        return obj.toString();
    }
    
    public String stringApiValue() {
        return this.cyclifyWithEscapeChars();
    }
    
    public Object cycListApiValue() {
        return this.cyclify();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("cycl-object", indent, relative, true);
        xmlWriter.print(this.stringApiValue());
        xmlWriter.printXMLEndTag("cycl-object", -indent, true);
    }
    
    public static String toCompactExternalId(final String cycObject) throws IOException {
        return CompactHLIDConverter.converter().toCompactHLId(cycObject);
    }
    
    public static String toCompactExternalId(final Number cycObject) throws IOException {
        return CompactHLIDConverter.converter().toCompactHLId(cycObject);
    }
    
    public static String toCompactExternalId(final Object cycObject, final CycAccess access) throws IOException {
        if (cycObject == null || !isCycLObject(cycObject)) {
            throw new IllegalArgumentException(cycObject + "is not a valid CycL object.");
        }
        if (cycObject instanceof Number) {
            return CompactHLIDConverter.converter().toCompactHLId((Number)cycObject);
        }
        if (cycObject instanceof CycNumber) {
            return CompactHLIDConverter.converter().toCompactHLId(((CycNumber)cycObject).getNumber());
        }
        if (cycObject instanceof String) {
            return CompactHLIDConverter.converter().toCompactHLId((String)cycObject);
        }
        Object result = DefaultCycObject.cycObjectToCompactExternalIdCache.get(cycObject);
        if (result != null) {
            return (String)result;
        }
        result = access.converseObject((Object)("(compact-hl-external-id-string " + stringApiValue(cycObject) + ")"));
        if (!(result instanceof String)) {
            throw new RuntimeException("Got invalid result: " + result);
        }
        DefaultCycObject.cycObjectToCompactExternalIdCache.put(cycObject, (String)result);
        return (String)result;
    }
    
    public static Object fromCompactExternalId(final String compactExternalId, final CycAccess access) throws IOException {
        if (compactExternalId == null || "".equals(compactExternalId)) {
            throw new IllegalArgumentException(compactExternalId + "is not a valid compact external id.");
        }
        Object result = DefaultCycObject.compactExternalIdToCycObjectCache.get(compactExternalId);
        if (result != null) {
            return result;
        }
        if (CompactHLIDConverter.converter().isNumberCompactHLId(compactExternalId)) {
            final Number num = (Number)CompactHLIDConverter.converter().fromCompactHLId(compactExternalId);
            result = CycObjectFactory.makeCycNumber(num);
        }
        else {
            result = access.converseObject((Object)("(find-cycl-object-by-compact-hl-external-id-string " + stringApiValue(compactExternalId) + ")"));
        }
        DefaultCycObject.compactExternalIdToCycObjectCache.put(compactExternalId, result);
        return result;
    }
    
    public static Object fromPossibleCompactExternalId(final String compactExternalId, final CycAccess access) throws IOException {
        if (compactExternalId == null || "".equals(compactExternalId)) {
            throw new IllegalArgumentException(compactExternalId + "is not a valid compact external id.");
        }
        Object result = DefaultCycObject.compactExternalIdToCycObjectCache.get(compactExternalId);
        if (result != null) {
            return result;
        }
        if (CompactHLIDConverter.converter().isNumberCompactHLId(compactExternalId)) {
            final Number num = (Number)CompactHLIDConverter.converter().fromCompactHLId(compactExternalId);
            result = CycObjectFactory.makeCycNumber(num);
        }
        else {
            result = access.converseList((Object)("(multiple-value-list (maybe-find-object-by-compact-hl-external-id-string " + stringApiValue(compactExternalId) + "))"));
            if (((CycList)result).second() == CycObjectFactory.nil) {
                return null;
            }
        }
        DefaultCycObject.compactExternalIdToCycObjectCache.put(compactExternalId, ((CycList)result).first());
        return ((CycList)result).first();
    }
    
    public static boolean isCollection(final Object term, final CycAccess cycAccess) throws IOException {
        return cycAccess.isCollection(term);
    }
    
    public static int getCycObjectType(final Object object) {
        if (object instanceof ByteArray) {
            return 1;
        }
        if (object instanceof CycAssertion) {
            return 2;
        }
        if (object instanceof CycFort) {
            return 3;
        }
        if (object instanceof CycSymbol) {
            return 5;
        }
        if (object instanceof CycVariable) {
            return 6;
        }
        if (object instanceof CycList) {
            return 4;
        }
        if (object instanceof Double) {
            return 7;
        }
        if (object instanceof Float) {
            return 8;
        }
        if (object instanceof Guid) {
            return 9;
        }
        if (object instanceof Integer) {
            return 10;
        }
        if (object instanceof Long) {
            return 11;
        }
        if (object instanceof BigInteger) {
            return 13;
        }
        if (object instanceof String) {
            return 12;
        }
        return 0;
    }
    
    static {
        emptyList = Arrays.asList(new Object[0]);
        compactExternalIdToCycObjectCache = new LinkedHashMap() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry eldest) {
                return this.size() > 20000;
            }
        };
        cycObjectToCompactExternalIdCache = new LinkedHashMap() {
            @Override
            protected boolean removeEldestEntry(final Map.Entry eldest) {
                return this.size() > 20000;
            }
        };
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 145 ms
	
	Decompiled with Procyon 0.5.32.
*/