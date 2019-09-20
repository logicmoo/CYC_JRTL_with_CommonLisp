package org.opencyc.cycobject;

import java.util.Collection;
import java.util.ArrayList;
import org.opencyc.api.CycObjectFactory;
import java.io.Reader;
import java.io.StringReader;
import java.io.IOException;
import org.opencyc.api.CycApiException;
import org.opencyc.api.CycAccess;
import org.opencyc.util.MyStreamTokenizer;
import org.opencyc.util.StackWithPointer;

public class CycListParser
{
    private int tok;
    private boolean endQuote;
    private boolean dot;
    private boolean dotWord;
    private boolean dotParen;
    private int parenLevel;
    private StackWithPointer readStack;
    private StackWithPointer quoteStack;
    private String currentString;
    protected MyStreamTokenizer st;
    protected CycAccess cycAccess;
    private static final String consMarkerSymbol = "**consMarkerSymbol**";
    private static final int STWORD = -3;
    private static final int STNUMBER = -2;
    public static int verbosity;
    private static boolean useNewReduceDottedPairs;
    
    public CycListParser(final CycAccess cycAccess) {
        this.endQuote = false;
        this.dot = false;
        this.dotWord = false;
        this.dotParen = false;
        this.parenLevel = 0;
        this.readStack = new StackWithPointer();
        this.quoteStack = new StackWithPointer();
        this.currentString = "";
        this.cycAccess = cycAccess;
    }
    
    public CycList read(final String string) throws CycApiException {
        this.currentString = string;
        this.st = makeStreamTokenizer(string);
        return this.read(this.st);
    }
    
    public String remainingString() {
        final StringBuffer remainingStringBuffer = new StringBuffer();
        final int tok = this.tok;
        final MyStreamTokenizer st = this.st;
        if (tok == -1) {
            return "";
        }
        this.st.resetSyntax();
        try {
            while (true) {
                this.tok = this.st.nextToken();
                final int tok2 = this.tok;
                final MyStreamTokenizer st2 = this.st;
                if (tok2 == -1) {
                    break;
                }
                remainingStringBuffer.append((char)this.tok);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
        return remainingStringBuffer.toString();
    }
    
    protected static MyStreamTokenizer makeStreamTokenizer(final String string) {
        final StringReader stringReader = new StringReader(string);
        final MyStreamTokenizer st = new MyStreamTokenizer((Reader)stringReader);
        st.resetSyntax();
        st.ordinaryChar(40);
        st.ordinaryChar(41);
        st.ordinaryChar(39);
        st.ordinaryChar(96);
        st.ordinaryChar(46);
        st.whitespaceChars(0, 32);
        st.quoteChar(34);
        st.wordChars(48, 57);
        st.wordChars(97, 122);
        st.wordChars(65, 90);
        st.wordChars(160, 255);
        st.wordChars(61, 61);
        st.wordChars(43, 43);
        st.wordChars(45, 45);
        st.wordChars(95, 95);
        st.wordChars(60, 60);
        st.wordChars(62, 62);
        st.wordChars(42, 42);
        st.wordChars(47, 47);
        st.wordChars(35, 35);
        st.wordChars(58, 58);
        st.wordChars(33, 33);
        st.wordChars(36, 36);
        st.wordChars(63, 63);
        st.wordChars(37, 37);
        st.wordChars(38, 38);
        st.wordChars(46, 46);
        st.slashSlashComments(false);
        st.slashStarComments(false);
        st.commentChar(59);
        st.wordChars(63, 63);
        st.wordChars(37, 37);
        st.wordChars(38, 38);
        st.eolIsSignificant(false);
        return st;
    }
    
    public CycList read(final MyStreamTokenizer st) throws CycApiException {
        this.endQuote = false;
        try {
            while (true) {
                this.tok = st.nextToken();
                if (CycListParser.verbosity > 0) {
                    System.out.println("sval: " + st.sval + "  st: " + st.toString() + "  tok: " + this.tok);
                }
                if (this.endQuote) {
                    this.endQuote = false;
                    st.pushBack();
                    this.scanRightParen();
                }
                else if (this.tok == -1) {
                    if (this.readStack.sp > 0) {
                        throw new RuntimeException("Invalid expression, sval: " + st.sval + "  st: " + st.toString() + "  tok: " + this.tok + "\nreadStack: " + this.readStack.toString() + "\nstring: " + this.currentString);
                    }
                    break;
                }
                else {
                    switch (this.tok) {
                        case -3: {
                            this.scanWord(st);
                            break;
                        }
                        case -2: {
                            throw new RuntimeException("Unexpected number");
                        }
                        case 34: {
                            this.scanString(st);
                            break;
                        }
                        case 39: {
                            this.scanQuote();
                            continue;
                        }
                        case 96: {
                            this.scanBackquote();
                            continue;
                        }
                        case 40: {
                            this.ScanLeftParen();
                            continue;
                        }
                        case 41: {
                            this.scanRightParen();
                            break;
                        }
                        case 44: {
                            this.scanComma(st);
                            break;
                        }
                        case 45: {
                            this.scanMinus();
                            break;
                        }
                        default: {
                            throw new CycApiException("Invalid symbol: " + st.toString() + " token: " + this.tok + "\nstring: " + this.currentString);
                        }
                    }
                }
                if (this.readStack.sp > 0 && this.parenLevel == 0) {
                    final Object object = this.readStack.pop();
                    if (object.equals(CycObjectFactory.nil)) {
                        return new CycList((Collection)new ArrayList());
                    }
                    if (CycListParser.useNewReduceDottedPairs) {
                        final CycList cycList = (CycList)object;
                        this.reduceDottedPairs(cycList);
                        return cycList;
                    }
                    return (CycList)this.reduceDottedPairsOld(object);
                }
            }
        }
        catch (IOException ioe) {
            throw new RuntimeException(ioe.getMessage());
        }
        throw new RuntimeException("End of stream");
    }
    
    private void scanQuote() {
        if (CycListParser.verbosity > 5) {
            System.out.println("'");
        }
        if (this.parenLevel > 0 && this.parenLevel != this.readStack.sp) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push((Object)"**consMarkerSymbol**");
        this.quoteStack.push((Object)new Integer(++this.parenLevel));
        this.readStack.push((Object)CycObjectFactory.quote);
    }
    
    private void scanFunctionQuote() {
        if (CycListParser.verbosity > 5) {
            System.out.println("#'");
        }
        if (this.parenLevel > 0 && this.parenLevel != this.readStack.sp) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push((Object)"**consMarkerSymbol**");
        this.quoteStack.push((Object)new Integer(++this.parenLevel));
        this.readStack.push((Object)CycObjectFactory.makeCycSymbol("function"));
    }
    
    private void ScanLeftParen() {
        if (CycListParser.verbosity > 5) {
            System.out.println("(");
        }
        this.readStack.push((Object)"**consMarkerSymbol**");
        ++this.parenLevel;
    }
    
    private void scanRightParen() {
        if (CycListParser.verbosity > 5) {
            System.out.println(")");
        }
        if (this.parenLevel == 0) {
            throw new RuntimeException("read: Extra right parenthesis");
        }
        if (this.readStack.sp == this.parenLevel && this.readStack.peek().equals(CycObjectFactory.cons)) {
            this.readStack.pop();
        }
        this.readStack.push((Object)CycObjectFactory.nil);
        --this.parenLevel;
        this.checkQuotes();
        while (this.readStack.sp > 2) {
            final Object remainingElements = this.readStack.pop();
            final Object firstElement = this.readStack.pop();
            try {
                if (!this.readStack.peek().equals("**consMarkerSymbol**") || firstElement.equals("**consMarkerSymbol**") || remainingElements.equals("**consMarkerSymbol**")) {
                    this.readStack.push(firstElement);
                    this.readStack.push(remainingElements);
                    break;
                }
                this.readStack.pop();
                this.readStack.push((Object)CycList.construct(firstElement, remainingElements));
            }
            catch (Exception e) {
                e.printStackTrace();
                System.err.flush();
            }
        }
    }
    
    private void scanNumber(final String string) {
        Double parsedNumber = null;
        try {
            parsedNumber = new Double(string);
        }
        catch (NumberFormatException e) {
            if (string.contains("d")) {
                parsedNumber = new Double(string.replaceFirst("d", "E"));
            }
        }
        Object number = null;
        if (CycListParser.verbosity > 5) {
            System.out.println(string);
        }
        final Double doubleNumber = parsedNumber;
        final Integer integerNumber = new Integer((int)(Object)doubleNumber);
        final Long longNumber = new Long((long)(Object)doubleNumber);
        if (integerNumber == (double)doubleNumber) {
            number = integerNumber;
        }
        else if (longNumber == (double)doubleNumber) {
            number = longNumber;
        }
        else {
            number = doubleNumber;
        }
        if (this.parenLevel > 0 && this.parenLevel != this.readStack.sp) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push(number);
        this.checkQuotes();
    }
    
    private void scanMinus() {
        if (CycListParser.verbosity > 5) {
            System.out.println("-");
        }
        final CycSymbol w = CycObjectFactory.makeCycSymbol("-");
        if (this.parenLevel > 0 && this.readStack.sp != this.parenLevel) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push((Object)w);
        this.checkQuotes();
    }
    
    private void scanBackquote() {
        if (CycListParser.verbosity > 5) {
            System.out.println("`");
        }
        final CycSymbol w = CycObjectFactory.makeCycSymbol("`");
        if (this.parenLevel > 0 && this.readStack.sp != this.parenLevel) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push((Object)w);
        this.checkQuotes();
    }
    
    private void scanComma(final MyStreamTokenizer st) throws IOException {
        CycSymbol w;
        if (st.nextToken() == 64) {
            if (CycListParser.verbosity > 5) {
                System.out.println(",@");
            }
            w = CycObjectFactory.makeCycSymbol(",@");
        }
        else {
            if (CycListParser.verbosity > 5) {
                System.out.println(",");
            }
            w = CycObjectFactory.makeCycSymbol(",");
        }
        st.pushBack();
        if (this.parenLevel > 0 && this.readStack.sp != this.parenLevel) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push((Object)w);
        this.checkQuotes();
    }
    
    private void scanWord(final MyStreamTokenizer st) throws IOException, CycApiException {
        if (CycListParser.verbosity > 5) {
            System.out.println(st.sval);
        }
        Object w = null;
        final char firstChar = st.sval.charAt(0);
        if (st.sval.startsWith("#$")) {
            w = this.cycAccess.getKnownConstantByName(st.sval);
        }
        else if (firstChar == '?') {
            w = CycObjectFactory.makeCycVariable(st.sval);
        }
        else if (st.sval.equals("#")) {
            final int nextTok = st.nextToken();
            if (nextTok == 39) {
                this.scanFunctionQuote();
                return;
            }
            st.pushBack();
            w = CycObjectFactory.makeCycSymbol(st.sval);
        }
        else {
            if ((firstChar == '-' && !st.sval.equals("-")) || Character.isDigit(firstChar)) {
                this.scanNumber(st.sval);
                return;
            }
            w = CycObjectFactory.makeCycSymbol(st.sval);
        }
        if (this.parenLevel > 0 && this.readStack.sp != this.parenLevel) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push(w);
        this.checkQuotes();
    }
    
    private void scanString(final MyStreamTokenizer st) {
        String string = new String(st.sval);
        while (true) {
            final int index = string.indexOf("`~");
            if (index == -1) {
                break;
            }
            final String line1 = new String(string.substring(0, index));
            final String line2 = new String(string.substring(index + 2));
            string = line1 + "\r\n" + line2;
        }
        if (CycListParser.verbosity > 5) {
            System.out.println(st.sval);
        }
        if (this.parenLevel > 0 && this.readStack.sp != this.parenLevel) {
            this.readStack.push((Object)"**consMarkerSymbol**");
        }
        this.readStack.push((Object)string);
        this.checkQuotes();
    }
    
    private void checkQuotes() {
        if (!this.quoteStack.empty() && (int)this.quoteStack.peek() == this.parenLevel) {
            this.quoteStack.pop();
            this.endQuote = true;
        }
    }
    
    private void reduceDottedPairs(final Object s) {
        if (s instanceof CycList) {
            final CycList cycList = (CycList)s;
            for (int i = 0; i < cycList.size(); ++i) {
                final Object item = cycList.get(i);
                if (item instanceof CycList) {
                    this.reduceDottedPairs(item);
                }
                else if (item.equals(CycObjectFactory.dot)) {
                    final Object nextItem = cycList.get(i + 1);
                    cycList.remove(i);
                    cycList.remove(i);
                    ++i;
                    if (nextItem instanceof CycList) {
                        this.reduceDottedPairs(nextItem);
                        cycList.addAll((Collection)nextItem);
                    }
                    else {
                        cycList.setDottedElement(nextItem);
                    }
                }
            }
        }
    }
    
    private Object reduceDottedPairsOld(final Object s) {
        if (!(s instanceof CycList)) {
            return s;
        }
        final CycList cycList = (CycList)s;
        if (cycList.size() == 0) {
            return s;
        }
        if (cycList.size() != 3 || !cycList.second().equals(CycObjectFactory.dot)) {
            final Object firstReducedDottedPair = this.reduceDottedPairsOld(cycList.first());
            final Object restReducedDottedPair = this.reduceDottedPairsOld(cycList.rest());
            final CycList constructedCycList = CycList.construct(firstReducedDottedPair, restReducedDottedPair);
            return constructedCycList;
        }
        final Object first = this.reduceDottedPairsOld(cycList.first());
        final Object third = this.reduceDottedPairsOld(cycList.third());
        if (cycList.third() instanceof CycList) {
            final CycList reducedCycList = new CycList(first);
            reducedCycList.addAll((Collection)third);
            if (!((CycList)third).isProperList()) {
                reducedCycList.setDottedElement(((CycList)third).getDottedElement());
            }
            return reducedCycList;
        }
        final CycList improperList = new CycList(first);
        improperList.setDottedElement(third);
        return improperList;
    }
    
    static {
        CycListParser.verbosity = 0;
        CycListParser.useNewReduceDottedPairs = true;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 135 ms
	
	Decompiled with Procyon 0.5.32.
*/