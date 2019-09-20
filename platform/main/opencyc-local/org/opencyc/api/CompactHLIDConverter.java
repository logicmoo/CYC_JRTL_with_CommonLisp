package org.opencyc.api;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.opencyc.util.Base64Url;
import java.io.OutputStream;
import java.util.List;
import org.opencyc.util.Base64;
import java.io.ByteArrayOutputStream;

public class CompactHLIDConverter
{
    private final ByteArrayOutputStream byteStream;
    private final CfaslOutputStream cfaslStream;
    private final Base64 base64;
    private static CompactHLIDConverter converter;
    private static final List<Integer> numberOpCodes;
    
    private CompactHLIDConverter() {
        this.byteStream = new ByteArrayOutputStream();
        this.cfaslStream = new CfaslOutputStream((OutputStream)this.byteStream);
        this.base64 = (Base64)new Base64Url();
    }
    
    public static CompactHLIDConverter converter() {
        return CompactHLIDConverter.converter;
    }
    
    public synchronized String toCompactHLId(final Object obj) throws IOException {
        return this.toCompactHLIdStringInternal(obj);
    }
    
    public synchronized String toCompactHLId(final String obj) throws IOException {
        return this.toCompactHLIdStringInternal(obj);
    }
    
    public synchronized String toCompactHLId(final Number obj) throws IOException {
        return this.toCompactHLIdStringInternal(obj);
    }
    
    public String toOpenCycURI(final Object obj) throws IOException {
        return "http://sw.opencyc.org/concept/" + this.toCompactHLId(obj);
    }
    
    public String toOpenCycURI(final String num) throws IOException {
        return "http://sw.opencyc.org/concept/" + this.toCompactHLId(num);
    }
    
    public String toOpenCycURI(final Number num) throws IOException {
        return "http://sw.opencyc.org/concept/" + this.toCompactHLId(num);
    }
    
    public String toOpenCyReadableURI(final Object obj) throws IOException {
        if (obj instanceof Number) {
            return this.toOpenCycReadableURI((Number)obj);
        }
        if (obj instanceof String) {
            return this.toOpenCycReadableURI((String)obj);
        }
        throw new IllegalArgumentException(obj + " is neither a String nor a Number.");
    }
    
    public String toOpenCycReadableURI(final String num) throws IOException {
        return "http://sw.opencyc.org/concept/en/" + this.toOwlNlId(num);
    }
    
    public String toOpenCycReadableURI(final Number num) throws IOException {
        return "http://sw.opencyc.org/concept/en/" + this.toOwlNlId(num);
    }
    
    public String toOwlNlId(final Object obj) {
        if (obj instanceof Number) {
            return this.toOwlNlId((Number)obj);
        }
        if (obj instanceof String) {
            return this.toOwlNlId((String)obj);
        }
        throw new IllegalArgumentException(obj + " is neither a String nor a Number.");
    }
    
    public String toOwlNlId(final Number num) {
        return num.toString();
    }
    
    public String toOwlNlId(final String str) {
        return "STRING_" + str;
    }
    
    public synchronized Object fromCompactHLId(String id) throws IOException {
        id = padWithEqualSigns(id);
        final byte[] buf = this.base64.decode(id);
        final CfaslInputStream cfaslInStream = new CfaslInputStream((InputStream)new ByteArrayInputStream(buf));
        final Object result = cfaslInStream.readObject();
        return result;
    }
    
    public boolean isStringCompactHLId(final String id) throws IOException {
        final byte[] bytes = this.base64.decode(padWithEqualSigns(id));
        final CfaslInputStream cfaslInStream = new CfaslInputStream((InputStream)new ByteArrayInputStream(bytes));
        final Integer obj1 = cfaslInStream.read();
        final Integer obj2 = cfaslInStream.read();
        return this.isStringCompactHLId(obj1, obj2);
    }
    
    public boolean isNumberCompactHLId(final String id) throws IOException {
        final byte[] bytes = this.base64.decode(padWithEqualSigns(id));
        if (bytes == null) {
            return false;
        }
        final CfaslInputStream cfaslInStream = new CfaslInputStream((InputStream)new ByteArrayInputStream(bytes));
        final Integer obj1 = cfaslInStream.read();
        final Integer obj2 = cfaslInStream.read();
        return this.isNumberCompactHLId(obj1, obj2);
    }
    
    public boolean isLiteralCompactHLId(final String id) throws IOException {
        final byte[] bytes = this.base64.decode(padWithEqualSigns(id));
        final CfaslInputStream cfaslInStream = new CfaslInputStream((InputStream)new ByteArrayInputStream(bytes));
        final Integer obj1 = cfaslInStream.read();
        final Integer obj2 = cfaslInStream.read();
        return this.isStringCompactHLId(obj1, obj2) || this.isNumberCompactHLId(obj1, obj2);
    }
    
    private synchronized String toCompactHLIdStringInternal(final Object obj) throws IOException {
        if (!(obj instanceof String) && !(obj instanceof Number)) {
            throw new IllegalArgumentException(obj + " must be either a number or a string.");
        }
        this.byteStream.reset();
        this.cfaslStream.write(51);
        this.cfaslStream.writeObject(obj);
        this.cfaslStream.flush();
        final byte[] arr$;
        final byte[] bytes = arr$ = this.byteStream.toByteArray();
        for (int wideB : arr$) {
            final byte b = (byte)wideB;
            if (wideB < 0) {
                wideB += 256;
            }
        }
        final String rawBase64UrlEncoded = this.base64.encodeBytes(bytes);
        final int equalSignPos = rawBase64UrlEncoded.indexOf(61);
        if (equalSignPos >= 0) {
            return rawBase64UrlEncoded.substring(0, equalSignPos);
        }
        return rawBase64UrlEncoded;
    }
    
    private boolean isNumberCompactHLId(final Integer code1, final Integer code2) throws IOException {
        final boolean isExternal = code1.equals(51);
        final boolean isNumber = CompactHLIDConverter.numberOpCodes.contains(code2);
        final boolean isSmallNumber = code2 >= 128;
        return isExternal && (isNumber || isSmallNumber);
    }
    
    private boolean isStringCompactHLId(final Integer code1, final Integer code2) throws IOException {
        return code1.equals(51) && code2.equals(15);
    }
    
    private static String padWithEqualSigns(String str) {
        for (int toAdd = str.length() % 4, i = 0; i < toAdd; ++i) {
            str += "=";
        }
        return str;
    }
    
    public static void main(final String[] args) {
        final Logger logger = Logger.getLogger(CompactHLIDConverter.class.toString());
        logger.info("Starting");
        try {
            logger.info("HLId for 1 is '" + converter().toCompactHLId(1) + "'.");
            logger.info("HLId for 122 is '" + converter().toCompactHLId(122) + "'.");
            logger.info("HLId for 0 is '" + converter().toCompactHLId(0) + "'.");
            logger.info("HLId for -122 is '" + converter().toCompactHLId(-122) + "'.");
            logger.info("HLId for 128 is '" + converter().toCompactHLId(128) + "'.");
            logger.info("HLId for -128 is '" + converter().toCompactHLId(-128) + "'.");
            logger.info("HLId for 128.2 is '" + converter().toCompactHLId(128.2) + "'.");
            logger.info("HLId for -128.2 is '" + converter().toCompactHLId(-128.2) + "'.");
            logger.info("Object for M4w= is " + converter().fromCompactHLId("M4w="));
            logger.info("Object for M4E= is " + converter().fromCompactHLId("M4E="));
            logger.info("Object for M4w is " + converter().fromCompactHLId("M4w"));
            logger.info("Object for Mw-EYXNiYw== is " + converter().fromCompactHLId("Mw-EYXNiYw=="));
            logger.info("Object for Mw-EYXNiYw is " + converter().fromCompactHLId("Mw-EYXNiYw"));
            logger.info("Object for Mw-IMTIzNS4xMjM is " + converter().fromCompactHLId("Mw-IMTIzNS4xMjM"));
            System.out.flush();
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
        finally {
            logger.info("Finished.");
            System.exit(0);
        }
    }
    
    static {
        CompactHLIDConverter.converter = new CompactHLIDConverter();
        numberOpCodes = Arrays.asList(24, 23, 3, 5, 7, 1, 9, 2, 4, 6, 0, 8);
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 118 ms
	
	Decompiled with Procyon 0.5.32.
*/