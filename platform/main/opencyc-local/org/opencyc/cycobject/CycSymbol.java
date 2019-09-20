package org.opencyc.cycobject;

import org.opencyc.xml.TextUtil;
import java.io.IOException;
import org.opencyc.xml.XMLWriter;
import org.opencyc.xml.XMLStringWriter;
import org.opencyc.api.CycObjectFactory;
import java.util.Locale;
import java.io.Serializable;

public class CycSymbol extends DefaultCycObject implements Serializable
{
    private boolean shouldQuote;
    private boolean isSpecialPackageName;
    private boolean isSpecialSymbolName;
    private String packageName;
    private String symbolName;
    public static final String cycSymbolXMLTag = "symbol";
    public static final String KEYWORD_PACKAGE = "KEYWORD";
    public static final String PACKAGE_SEPARATOR = ":";
    public static final String SYMBOL_NAME_QUOTE = "|";
    
    public CycSymbol(final String packageName, final String symbolName) {
        this(packageName, symbolName, true);
    }
    
    public CycSymbol(String packageName, String symbolName, final boolean shouldQuote) {
        this.shouldQuote = true;
        this.isSpecialPackageName = false;
        this.isSpecialSymbolName = false;
        this.packageName = "";
        if (symbolName == null || symbolName.equals("")) {
            throw new IllegalArgumentException("Got null symbol name.");
        }
        this.shouldQuote = shouldQuote;
        final int sepLength = ":".length();
        final int quoteLength = "|".length();
        if (symbolName.startsWith(":")) {
            symbolName = symbolName.substring(sepLength, symbolName.length());
            packageName = "KEYWORD";
        }
        if (packageName == null) {
            packageName = "";
        }
        if (symbolName.length() > 2 * quoteLength && symbolName.startsWith("|") && symbolName.endsWith("|")) {
            symbolName = symbolName.substring(quoteLength, symbolName.length() - quoteLength);
        }
        if (packageName.length() > 2 * quoteLength && packageName.startsWith("|") && packageName.endsWith("|")) {
            packageName = packageName.substring(quoteLength, packageName.length() - quoteLength);
        }
        if (!isValidSymbolName(packageName) || !canonicalizeName(packageName).equals(packageName)) {
            this.isSpecialPackageName = true;
        }
        if (!isValidSymbolName(symbolName) || !canonicalizeName(symbolName).equals(symbolName)) {
            this.isSpecialSymbolName = true;
        }
        this.symbolName = symbolName;
        this.packageName = packageName;
    }
    
    public CycSymbol(final String symbolName, final boolean shouldQuote) {
        this(null, canonicalizeName(symbolName), shouldQuote);
    }
    
    public CycSymbol(final String symbolName) {
        this(null, canonicalizeName(symbolName));
    }
    
    public static String canonicalizeName(final String symbolNameAnyCase) {
        return symbolNameAnyCase.toUpperCase(Locale.ENGLISH);
    }
    
    public String toString() {
        if (this.isKeyword()) {
            return ":" + this.getSymbolNamePrecise();
        }
        return this.getSymbolNamePrecise();
    }
    
    public String toFullString() {
        return this.toFullString(null);
    }
    
    public String toCanonicalString() {
        return canonicalizeName(this.toString());
    }
    
    public String toFullString(final String relativePackageName) {
        if (this.packageName.equals(relativePackageName) || this.isKeyword()) {
            return this.toString();
        }
        return this.toFullStringForced();
    }
    
    public String toFullStringForced() {
        return this.getPackageNamePrecise() + ":" + this.getSymbolNamePrecise();
    }
    
    public boolean toBoolean() {
        return this.toCanonicalString().equals("T");
    }
    
    public String getSymbolName() {
        return this.symbolName;
    }
    
    public String getPackageName() {
        return this.packageName;
    }
    
    public String getSymbolNamePrecise() {
        return getSymbolStringRep(this.symbolName, this.isSpecialSymbolName);
    }
    
    public String getPackageNamePrecise() {
        return getSymbolStringRep(this.packageName, this.isSpecialPackageName);
    }
    
    private static final String getSymbolStringRep(final String str, final boolean isSpecial) {
        if (isSpecial) {
            return "|" + str + "|";
        }
        return str;
    }
    
    public boolean equals(final Object object) {
        return object == this || (object instanceof CycSymbol && object != null && ((CycSymbol)object).toFullStringForced().equals(this.toFullStringForced()));
    }
    
    public int hashCode() {
        return this.toFullStringForced().hashCode();
    }
    
    public boolean isKeyword() {
        return "KEYWORD".equals(this.packageName);
    }
    
    public boolean shouldQuote() {
        return this.shouldQuote;
    }
    
    public String stringApiValue() {
        if (this.isKeyword() || !this.shouldQuote()) {
            return this.toString();
        }
        return "(QUOTE " + this.toString() + ")";
    }
    
    public Object cycListApiValue() {
        if (this.isKeyword() || !this.shouldQuote()) {
            return this;
        }
        return CycList.makeCycList((Object[])new CycSymbol[] { CycObjectFactory.quote, this });
    }
    
    public int compareTo(final Object object) {
        if (!(object instanceof CycSymbol)) {
            throw new ClassCastException("Must be a CycSymbol object");
        }
        return this.toFullStringForced().compareTo(((CycSymbol)object).toFullStringForced());
    }
    
    public static boolean isValidSymbolName(final String string) {
        for (int i = 0; i < string.length(); ++i) {
            final char c = string.charAt(i);
            if (!Character.isLetterOrDigit(c) && c != '`' && c != '-' && c != '_' && c != '*' && c != '?' && c != '+' && c != '>' && c != '<' && c != '=' && c != '/' && c != '&' && c != ':') {
                return false;
            }
        }
        return true;
    }
    
    public String toXMLString() throws IOException {
        final XMLStringWriter xmlStringWriter = new XMLStringWriter();
        this.toXML((XMLWriter)xmlStringWriter, 0, false);
        return xmlStringWriter.toString();
    }
    
    public void toXML(final XMLWriter xmlWriter, final int indent, final boolean relative) throws IOException {
        xmlWriter.printXMLStartTag("symbol", indent, relative, false);
        xmlWriter.print(TextUtil.doEntityReference(this.toString()));
        xmlWriter.printXMLEndTag("symbol");
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 90 ms
	
	Decompiled with Procyon 0.5.32.
*/