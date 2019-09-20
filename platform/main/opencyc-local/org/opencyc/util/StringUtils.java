package org.opencyc.util;

import org.opencyc.cycobject.Guid;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycNaut;
import java.io.PrintWriter;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.StringWriter;
import java.util.List;
import java.security.InvalidParameterException;
import java.util.TreeMap;
import org.opencyc.cycobject.CycConstant;
import java.util.regex.Pattern;

public class StringUtils
{
    static Pattern dumbNumericPattern;
    public static final CycConstant UNICODE_STRING_FN;
    private static TreeMap htmlEntities;
    private static final html_entity[] html_enities;
    
    public static boolean isNumeric(final String string) {
        String testString = string;
        if (string.charAt(0) == '+' || string.charAt(0) == '-') {
            if (string.length() <= 1) {
                return false;
            }
            testString = string.substring(1);
        }
        for (int i = 0; i < testString.length(); ++i) {
            if (!Character.isDigit(testString.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean hasNumericChar(final String str) {
        return StringUtils.dumbNumericPattern.matcher(str).matches();
    }
    
    public static boolean isWhitespace(final String string) {
        final int string_length = string.length();
        if (string_length == 0) {
            return false;
        }
        for (int i = 0; i < string_length; ++i) {
            if (!Character.isWhitespace(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static String stripLeading(final String string, final char ch) {
        if (string == null) {
            throw new InvalidParameterException("string cannot be null");
        }
        int index = 0;
        final int string_length = string.length();
        if (string_length == 0) {
            return string;
        }
        while (string.charAt(index) == ch) {
            if (++index >= string_length) {
                return string.substring(index);
            }
        }
        return string.substring(index);
    }
    
    public static String stripTrailing(final String string, final char ch) {
        if (string == null) {
            throw new InvalidParameterException("string cannot be null");
        }
        int index = string.length();
        if (index == 0) {
            return string;
        }
        while (index != 0) {
            if (string.charAt(--index) != ch) {
                return string.substring(0, index + 1);
            }
        }
        return string.substring(0, index + 1);
    }
    
    public static String stripLeadingBlanks(final String string) {
        if (string == null) {
            throw new InvalidParameterException("string cannot be null");
        }
        return stripLeading(string, ' ');
    }
    
    public static String stripTrailingBlanks(final String string) {
        if (string == null) {
            throw new InvalidParameterException("string cannot be null");
        }
        return stripTrailing(string, ' ');
    }
    
    public static String stripBlanks(final String string) {
        if (string == null) {
            throw new InvalidParameterException("string cannot be null");
        }
        return stripTrailing(stripLeading(string, ' '), ' ');
    }
    
    public static String change(final String string, final String fromString, final String toString) {
        if (string == null) {
            throw new InvalidParameterException("string cannot be null");
        }
        if (fromString == null) {
            throw new InvalidParameterException("fromString cannot be null");
        }
        if (toString == null) {
            throw new InvalidParameterException("toString cannot be null");
        }
        final int string_length = string.length();
        final int fromString_length = fromString.length();
        if (string_length == 0 || fromString_length == 0) {
            return string;
        }
        final StringBuffer stringBuffer = new StringBuffer(string_length * 2);
        int fromIndex = 0;
        int index = -1;
        do {
            index = string.indexOf(fromString, fromIndex);
            if (index == -1) {
                stringBuffer.append(string.substring(fromIndex));
                break;
            }
            stringBuffer.append(string.substring(fromIndex, index));
            stringBuffer.append(toString);
            fromIndex = index + fromString_length;
            index = -1;
        } while (fromIndex != string_length);
        return stringBuffer.toString();
    }
    
    public static boolean isDelimitedString(final Object object) {
        if (!(object instanceof String)) {
            return false;
        }
        final String string = (String)object;
        return string.length() >= 2 && string.startsWith("\"") && string.endsWith("\"");
    }
    
    public static String removeDelimiters(final String string) {
        final int length = string.length();
        if (length < 3) {
            throw new RuntimeException("Cannot remove delimters from " + string);
        }
        return string.substring(1, length - 1);
    }
    
    public static String wordsToPhrase(final List words) {
        final StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < words.size(); ++i) {
            if (i > 0) {
                stringBuffer.append(" ");
            }
            stringBuffer.append(words.get(i));
        }
        return stringBuffer.toString();
    }
    
    public static String escapeDoubleQuotes(final String string) {
        if (string == null) {
            return null;
        }
        final String result = string.replaceAll("\\\\", "\\\\\\\\");
        return result.replaceAll("\\\"", "\\\\\\\"");
    }
    
    public static String unescapeDoubleQuotes(final String string) {
        if (string == null) {
            return null;
        }
        final String result = string.replaceAll("\\\\\\\"", "\\\"");
        return result.replaceAll("\\\\\\\\", "\\\\");
    }
    
    public static String escapeQuoteChars(final String string) {
        if (string == null) {
            return null;
        }
        return string.replaceAll("\\\"", "\\\\\\\"");
    }
    
    public static String getStringForException(final Throwable e) {
        if (e == null) {
            return "<no exception>";
        }
        final StringWriter writer = new StringWriter();
        final PrintWriter out = new PrintWriter(new BufferedWriter(writer));
        e.printStackTrace(out);
        out.flush();
        return writer.getBuffer().toString();
    }
    
    public static boolean  is7BitASCII(String str) {
        
        int i;
        for(i=0;i<str.length();i++){
          if(str.charAt(i)>=0x80) break; // note: change to codePointAt after we switch to java 1.5
        }
        return (i==str.length());
      }
    
    public static String cyclStringToJavaString(final Object cyclString) {
        if (cyclString instanceof String) {
            return (String)cyclString;
        }
        Exception exception = null;
        try {
            final CycNaut naut = (CycNaut)CycNaut.convertIfPromising(cyclString);
            if (StringUtils.UNICODE_STRING_FN.equals((Object)naut.getFunctor())) {
                final String encoded = (String)naut.getArg(1);
                return unescapeUnicode(encoded);
            }
        }
        catch (Exception ex) {
            exception = ex;
        }
        throw new StringConversionException("Can't convert " + cyclString + " to a string.", exception);
    }
    
    public static Object cyclStringsToJavaStrings(final Object tree) {
        return cyclStringsToJavaStringsRecursive(tree);
    }
    
    private static Object cyclStringsToJavaStringsRecursive(final Object tree) {
        if (tree instanceof String) {
            return tree;
        }
        if (tree instanceof List) {
            try {
                final String canonical = cyclStringToJavaString(tree);
                return canonical;
            }
            catch (StringConversionException ex) {
                final List newItems = (List)tree;
                for (int i = 0; i < newItems.size(); ++i) {
                    newItems.set(i, cyclStringsToJavaStringsRecursive(newItems.get(i)));
                }
                if (newItems instanceof CycList && newItems.size() == 3 && StringUtils.UNICODE_STRING_FN.equals(newItems.get(1))) {
                    final CycList asCycList = (CycList)newItems;
                    if (asCycList.isProperList()) {
                        final Object oldRest = asCycList.rest();
                        try {
                            final Object newCdr = cyclStringToJavaString(oldRest);
                            asCycList.remove(2);
                            asCycList.remove(1);
                            asCycList.setDottedElement(newCdr);
                        }
                        catch (StringConversionException ex2) {}
                    }
                }
                return newItems;
            }
        }
        return tree;
    }
    
    private static String unescapeUnicode(final String encoded) {
        final int length = encoded.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char currChar = encoded.charAt(i);
            if ('&' == currChar) {
                final StringBuilder codeBuilder = new StringBuilder(6);
                if ('u' != encoded.charAt(++i)) {
                    throw new IllegalArgumentException("& not followed by u at position " + i + " in " + encoded);
                }
                for (char nextChar = encoded.charAt(++i); ';' != nextChar && i < length; nextChar = encoded.charAt(++i)) {
                    codeBuilder.append(nextChar);
                }
                sb.append((char)Integer.parseInt(codeBuilder.toString(), 16));
            }
            else {
                sb.append(currChar);
            }
        }
        return sb.toString();
    }
    
    public static String unicodeEscaped(final String str) {
        return unicodeEscaped(str, true);
    }
    
    public static String unicodeEscaped(final String str, final boolean isApi) {
        final String estr = escapeDoubleQuotes(str);
        final StringBuilder sb = new StringBuilder(str.length());
        char c = '\0';
        for (int i = 0; i < estr.length(); ++i) {
            c = estr.charAt(i);
            if (c >= ' ' && c < 0x80) {
                if (c == '&') {
                    sb.append("&u26;");
                }
                else {
                    sb.append(c);
                }
            }
            else {
                sb.append("&u");
                final String hex = Integer.toHexString(c).toUpperCase();
                if (hex.length() < 2) {
                    sb.append('0');
                }
                sb.append(hex);
                sb.append(';');
            }
        }
        if (isApi) {
            return "(list #$UnicodeStringFn \"" + sb.toString() + "\")";
        }
        return "(#$UnicodeStringFn \"" + sb.toString() + "\")";
    }
    
    public static String deEscapeHTMLescapedString(final String s) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); ++i) {
            final char c = s.charAt(i);
            if ('&' == c) {
                final int old = i;
                ++i;
                while (i < s.length() && s.charAt(i) != ';') {
                    ++i;
                }
                if (i >= s.length()) {
                    sb.append(c);
                    i = old;
                }
                else if (old + 1 == i) {
                    sb.append("&;");
                }
                else {
                    final String ent = s.substring(old + 1, i);
                    if (ent.charAt(0) == '#') {
                        final String hex = ent.substring(1);
                        try {
                            final int intv = Integer.parseInt(hex, 16);
                            sb.append((char)intv);
                        }
                        catch (NumberFormatException e) {
                            sb.append(c);
                            i = old;
                        }
                    }
                    else {
                        final char entchar = lookupEntity(ent);
                        if (entchar != '\0') {
                            sb.append(entchar);
                        }
                        else if (ent.charAt(0) == 'u' || ent.charAt(0) == 'U') {
                            final String hex2 = ent.substring(1);
                            try {
                                final int intv2 = Integer.parseInt(hex2, 16);
                                sb.append((char)intv2);
                            }
                            catch (NumberFormatException e2) {
                                sb.append(c);
                                i = old;
                            }
                        }
                        else {
                            sb.append(c);
                            i = old;
                        }
                    }
                }
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
    private static char lookupEntity(final String val) {
        final Character v = (Character) StringUtils.htmlEntities.get(val);
        if (v == null) {
            return '\0';
        }
        return v;
    }
    
    static {
        StringUtils.dumbNumericPattern = Pattern.compile(".*?[0-9]*.*");
        UNICODE_STRING_FN = new CycConstant("UnicodeStringFn", new Guid("dbc65ea5-e65c-11d8-89df-0002b3620a7d"));
        StringUtils.htmlEntities = null;
        html_enities = new html_entity[] { new html_entity("AElig", 198), new html_entity("Aacute", 193), new html_entity("Acirc", 194), new html_entity("Agrave", 192), new html_entity("Alpha", 913), new html_entity("Aring", 197), new html_entity("Atilde", 195), new html_entity("Auml", 196), new html_entity("Beta", 914), new html_entity("Ccedil", 199), new html_entity("Chi", 935), new html_entity("Dagger", 8225), new html_entity("Delta", 916), new html_entity("ETH", 208), new html_entity("Eacute", 201), new html_entity("Ecirc", 202), new html_entity("Egrave", 200), new html_entity("Epsilon", 917), new html_entity("Eta", 919), new html_entity("Euml", 203), new html_entity("Gamma", 915), new html_entity("Iacute", 205), new html_entity("Icirc", 206), new html_entity("Igrave", 204), new html_entity("Iota", 921), new html_entity("Iuml", 207), new html_entity("Kappa", 922), new html_entity("Lambda", 923), new html_entity("Mu", 924), new html_entity("Ntilde", 209), new html_entity("Nu", 925), new html_entity("OElig", 338), new html_entity("Oacute", 211), new html_entity("Ocirc", 212), new html_entity("Ograve", 210), new html_entity("Omega", 937), new html_entity("Omicron", 927), new html_entity("Oslash", 216), new html_entity("Otilde", 213), new html_entity("Ouml", 214), new html_entity("Phi", 934), new html_entity("Pi", 928), new html_entity("Prime", 8243), new html_entity("Psi", 936), new html_entity("Rho", 929), new html_entity("Scaron", 352), new html_entity("Sigma", 931), new html_entity("THORN", 222), new html_entity("Tau", 932), new html_entity("Theta", 920), new html_entity("Uacute", 218), new html_entity("Ucirc", 219), new html_entity("Ugrave", 217), new html_entity("Upsilon", 933), new html_entity("Uuml", 220), new html_entity("Xi", 926), new html_entity("Yacute", 221), new html_entity("Yuml", 376), new html_entity("Zeta", 918), new html_entity("aacute", 225), new html_entity("acirc", 226), new html_entity("acute", 180), new html_entity("aelig", 230), new html_entity("agrave", 224), new html_entity("alefsym", 8501), new html_entity("alpha", 945), new html_entity("amp", 38), new html_entity("and", 8743), new html_entity("ang", 8736), new html_entity("aring", 229), new html_entity("asymp", 8776), new html_entity("atilde", 227), new html_entity("auml", 228), new html_entity("bdquo", 8222), new html_entity("beta", 946), new html_entity("brvbar", 166), new html_entity("bull", 8226), new html_entity("cap", 8745), new html_entity("ccedil", 231), new html_entity("cedil", 184), new html_entity("cent", 162), new html_entity("chi", 967), new html_entity("circ", 710), new html_entity("clubs", 9827), new html_entity("cong", 8773), new html_entity("copy", 169), new html_entity("crarr", 8629), new html_entity("cup", 8746), new html_entity("curren", 164), new html_entity("dArr", 8659), new html_entity("dagger", 8224), new html_entity("darr", 8595), new html_entity("deg", 176), new html_entity("delta", 948), new html_entity("diams", 9830), new html_entity("divide", 247), new html_entity("eacute", 233), new html_entity("ecirc", 234), new html_entity("egrave", 232), new html_entity("empty", 8709), new html_entity("emsp", 8195), new html_entity("ensp", 8194), new html_entity("epsilon", 949), new html_entity("equiv", 8801), new html_entity("eta", 951), new html_entity("eth", 240), new html_entity("euml", 235), new html_entity("euro", 8364), new html_entity("exist", 8707), new html_entity("fnof", 402), new html_entity("forall", 8704), new html_entity("frac12", 189), new html_entity("frac14", 188), new html_entity("frac34", 190), new html_entity("frasl", 8260), new html_entity("gamma", 947), new html_entity("ge", 8805), new html_entity("gt", 62), new html_entity("hArr", 8660), new html_entity("harr", 8596), new html_entity("hearts", 9829), new html_entity("hellip", 8230), new html_entity("iacute", 237), new html_entity("icirc", 238), new html_entity("iexcl", 161), new html_entity("igrave", 236), new html_entity("image", 8465), new html_entity("infin", 8734), new html_entity("int", 8747), new html_entity("iota", 953), new html_entity("iquest", 191), new html_entity("isin", 8712), new html_entity("iuml", 239), new html_entity("kappa", 954), new html_entity("lArr", 8656), new html_entity("lambda", 955), new html_entity("lang", 9001), new html_entity("laquo", 171), new html_entity("larr", 8592), new html_entity("lceil", 8968), new html_entity("ldquo", 8220), new html_entity("le", 8804), new html_entity("lfloor", 8970), new html_entity("lowast", 8727), new html_entity("loz", 9674), new html_entity("lrm", 8206), new html_entity("lsaquo", 8249), new html_entity("lsquo", 8216), new html_entity("lt", 60), new html_entity("macr", 175), new html_entity("mdash", 8212), new html_entity("micro", 181), new html_entity("middot", 183), new html_entity("minus", 8722), new html_entity("mu", 956), new html_entity("nabla", 8711), new html_entity("nbsp", 160), new html_entity("ndash", 8211), new html_entity("ne", 8800), new html_entity("ni", 8715), new html_entity("not", 172), new html_entity("notin", 8713), new html_entity("nsub", 8836), new html_entity("ntilde", 241), new html_entity("nu", 957), new html_entity("oacute", 243), new html_entity("ocirc", 244), new html_entity("oelig", 339), new html_entity("ograve", 242), new html_entity("oline", 8254), new html_entity("omega", 969), new html_entity("omicron", 959), new html_entity("oplus", 8853), new html_entity("or", 8744), new html_entity("ordf", 170), new html_entity("ordm", 186), new html_entity("oslash", 248), new html_entity("otilde", 245), new html_entity("otimes", 8855), new html_entity("ouml", 246), new html_entity("para", 182), new html_entity("part", 8706), new html_entity("permil", 8240), new html_entity("perp", 8869), new html_entity("phi", 966), new html_entity("pi", 960), new html_entity("piv", 982), new html_entity("plusmn", 177), new html_entity("pound", 163), new html_entity("prime", 8242), new html_entity("prod", 8719), new html_entity("prop", 8733), new html_entity("psi", 968), new html_entity("quot", 34), new html_entity("rArr", 8658), new html_entity("radic", 8730), new html_entity("rang", 9002), new html_entity("raquo", 187), new html_entity("rarr", 8594), new html_entity("rceil", 8969), new html_entity("rdquo", 8221), new html_entity("real", 8476), new html_entity("reg", 174), new html_entity("rfloor", 8971), new html_entity("rho", 961), new html_entity("rlm", 8207), new html_entity("rsaquo", 8250), new html_entity("rsquo", 8217), new html_entity("sbquo", 8218), new html_entity("scaron", 353), new html_entity("sdot", 8901), new html_entity("sect", 167), new html_entity("shy", 173), new html_entity("sigma", 963), new html_entity("sigmaf", 962), new html_entity("sim", 8764), new html_entity("spades", 9824), new html_entity("sub", 8834), new html_entity("sube", 8838), new html_entity("sum", 8721), new html_entity("sup", 8835), new html_entity("sup1", 185), new html_entity("sup2", 178), new html_entity("sup3", 179), new html_entity("supe", 8839), new html_entity("szlig", 223), new html_entity("tau", 964), new html_entity("there4", 8756), new html_entity("theta", 952), new html_entity("thetasym", 977), new html_entity("thinsp", 8201), new html_entity("thorn", 254), new html_entity("tilde", 732), new html_entity("times", 215), new html_entity("trade", 8482), new html_entity("uArr", 8657), new html_entity("uacute", 250), new html_entity("uarr", 8593), new html_entity("ucirc", 251), new html_entity("ugrave", 249), new html_entity("uml", 168), new html_entity("upsih", 978), new html_entity("upsilon", 965), new html_entity("uuml", 252), new html_entity("weierp", 8472), new html_entity("xi", 958), new html_entity("yacute", 253), new html_entity("yen", 165), new html_entity("yuml", 255), new html_entity("zeta", 950), new html_entity("zwj", 8205), new html_entity("zwnj", 8204) };
        StringUtils.htmlEntities = new TreeMap();
        for (int i = 0; i < StringUtils.html_enities.length; ++i) {
            StringUtils.htmlEntities.put(StringUtils.html_enities[i].entity, new Character(StringUtils.html_enities[i].value));
        }
    }
    
    private static class StringConversionException extends IllegalArgumentException
    {
        StringConversionException(final String msg, final Throwable cause) {
            super(msg, cause);
        }
    }
    
    private static class html_entity
    {
        public String entity;
        public char value;
        
        html_entity(final String entity, final int intvalue) {
            this.entity = entity;
            this.value = (char)intvalue;
        }
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 394 ms
	
	Decompiled with Procyon 0.5.32.
*/