/*
 * Stream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: Stream.java,v 1.45 2004-03-12 00:28:29 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.PushbackReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigInteger;

public class Stream extends LispObject
{
    protected LispObject elementType;
    protected boolean isInputStream;
    protected boolean isOutputStream;
    protected boolean isCharacterStream;
    protected boolean isBinaryStream;

    private boolean interactive;
    private boolean open = true;

    // Character input.
    private PushbackReader reader;
    protected int offset;
    protected int lineNumber;

    // Character output.
    private static final String lineSeparator = System.getProperty("line.separator");
    private Writer writer;

    // The number of characters on the current line of output (-1 if unknown).
    private int charPos;

    // Binary input.
    private BufferedInputStream in;

    // Binary output.
    private BufferedOutputStream out;

    protected Stream()
    {
    }

    // Input stream constructors.
    public Stream(InputStream inputStream, LispObject elementType)
    {
        this.elementType = elementType;
        if (elementType == Symbol.CHARACTER || elementType == Symbol.BASE_CHAR) {
            isCharacterStream = true;
            reader = new PushbackReader(new BufferedReader(new InputStreamReader(inputStream)),
                                        2);
        } else {
            isBinaryStream = true;
            in = new BufferedInputStream(inputStream);
        }
        isInputStream = true;
        isOutputStream = false;
    }

    public Stream(InputStream inputStream, LispObject elementType, boolean interactive)
    {
        this(inputStream, elementType);
        setInteractive(interactive);
    }

    // Output stream constructors.
    public Stream(OutputStream outputStream, LispObject elementType)
    {
        this.elementType = elementType;
        if (elementType == Symbol.CHARACTER || elementType == Symbol.BASE_CHAR) {
            isCharacterStream = true;
            writer = new OutputStreamWriter(outputStream);
        } else {
            isBinaryStream = true;
            out = new BufferedOutputStream(outputStream);
        }
        isInputStream = false;
        isOutputStream = true;
    }

    public Stream(OutputStream outputStream, LispObject elementType,
                  boolean interactive)
    {
        this(outputStream, elementType);
        setInteractive(interactive);
    }

    public boolean isInputStream() throws ConditionThrowable
    {
        return isInputStream;
    }

    public boolean isOutputStream() throws ConditionThrowable
    {
        return isOutputStream;
    }

    public boolean isCharacterStream() throws ConditionThrowable
    {
        return isCharacterStream;
    }

    public boolean isBinaryStream() throws ConditionThrowable
    {
        return isBinaryStream;
    }

    public boolean isInteractive()
    {
        return interactive;
    }

    public void setInteractive(boolean b)
    {
        interactive = b;
    }

    public boolean isOpen()
    {
        return open;
    }

    public void setOpen(boolean b)
    {
        open = b;
    }

    public LispObject typeOf()
    {
        return Symbol.STREAM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.STREAM;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject getElementType() throws ConditionThrowable
    {
        return elementType;
    }

    // Character input.
    public int getOffset()
    {
        return offset;
    }

    // Character input.
    public int getLineNumber()
    {
        return lineNumber;
    }

    protected void setWriter(Writer writer)
    {
        this.writer = writer;
    }

    // Character output.
    public int getCharPos()
    {
        return charPos;
    }

    // Character output.
    public void setCharPos(int n)
    {
        charPos = n;
    }

    public LispObject read(boolean eofError, LispObject eofValue,
                           boolean recursive)
        throws ConditionThrowable
    {
        LispObject result = readPreservingWhitespace(eofError, eofValue,
                                                     recursive);
        if (result != eofValue && !recursive) {
            if (_charReady()) {
                int n = _readChar();
                if (n >= 0) {
                    char c = (char) n;
                    if (!Character.isWhitespace(c))
                        _unreadChar(c);
                }
            }
        }
        if (_READ_SUPPRESS_.symbolValueNoThrow() != NIL)
            return NIL;
        else
            return result;
    }

    public LispObject readPreservingWhitespace(boolean eofError,
                                               LispObject eofValue,
                                               boolean recursive)
        throws ConditionThrowable
    {
        while (true) {
            int n = _readChar();
            if (n < 0) {
                if (eofError)
                    return signal(new EndOfFile(this));
                else
                    return eofValue;
            }
            char c = (char) n;
            if (Character.isWhitespace(c))
                continue;
            LispObject result = processChar(c);
            if (result != null)
                return result;
        }
    }

    private LispObject processChar(char c) throws ConditionThrowable
    {
        LispObject handler = getCurrentReadtable().getReaderMacroFunction(c);
        if (handler instanceof ReaderMacroFunction)
            return ((ReaderMacroFunction)handler).execute(this, c);
        switch (c) {
//             case '"':
//                 return LispReader.READ_STRING.execute(this, c);
            case '\'':
                return readQuote();
            case '(':
                return readList();
//             case ')':
//                 return readRightParen();
//             case ';':
//                 return LispReader.READ_COMMENT.execute(this, c);
            case ',':
                return readComma();
            case '`':
                return readBackquote();
            case '#':
                return readSharp();
            case '|':
                // Let readToken() process the multiple escape.
                _unreadChar(c);
                return makeSymbol(readToken());
            case ':':
                return PACKAGE_KEYWORD.intern(readToken());
            default:
                return makeObject(readToken(c));
        }
    }

    private LispObject readPathname() throws ConditionThrowable
    {
        LispObject obj = read(true, NIL, false);
        if (obj instanceof AbstractString)
            return new Pathname(obj.getStringValue());
        if (obj.listp())
            return Pathname.makePathname(obj);
        return signal(new TypeError("#p requires a string or list argument."));
    }

    private LispObject readStructure() throws ConditionThrowable
    {
        LispObject obj = read(true, NIL, false);
        if (_READ_SUPPRESS_.symbolValueNoThrow() != NIL)
            return NIL;
        if (obj.listp()) {
            Symbol structure = checkSymbol(obj.car());
            LispClass c = LispClass.findClass(structure);
            if (!(c instanceof StructureClass)) {
                return signal(new ReaderError(structure.getName() +
                                              " is not a defined structure type."));
            }
            LispObject args = obj.cdr();
            Package pkg = checkPackage(structure.getPackage());
            Symbol constructor = pkg.intern("MAKE-" + structure.getName());
            return funcall(constructor.getSymbolFunctionOrDie(),
                           args.copyToArray(), LispThread.currentThread());
        }
        return signal(new ReaderError("Non-list following #S: " + obj));
    }

    private LispObject readQuote() throws ConditionThrowable
    {
        return new Cons(Symbol.QUOTE, new Cons(read(true, NIL, true)));
    }

    private LispObject readList() throws ConditionThrowable
    {
        Cons first = null;
        Cons last = null;
        while (true) {
            char c = flushWhitespace();
            if (c == ')') {
                return first == null ? NIL : first;
            }
            if (c == '.') {
                int n = _readChar();
                if (n < 0)
                    return signal(new EndOfFile(this));
                char nextChar = (char) n;
                if (nextChar == ',') {
                    LispObject obj = readComma();
                    last.setCdr(obj);
                    continue;
                } else if (isTokenDelimiter(nextChar)) {
                    if (last == null)
                        return signal(new LispError("nothing appears before . in list"));
                    LispObject obj = read(true, NIL, true);
                    last.setCdr(obj);
                    continue;
                } else {
                    // normal token beginning with '.'
                    _unreadChar(nextChar);
                }
            }
            LispObject obj = processChar(c);
            if (obj == null) {
                // A comment.
                continue;
            }
            if (first == null) {
                first = new Cons(obj);
                last = first;
            } else {
                Cons newCons = new Cons(obj);
                last.setCdr(newCons);
                last = newCons;
            }
        }
    }

    private static boolean isTokenDelimiter(char c)
    {
        switch (c) {
            case '"':
            case '\'':
            case '(':
            case ')':
            case ',':
            case ';':
            case '`':
                return true;
            default:
                return Character.isWhitespace(c);
        }
    }

    private LispObject readComma() throws ConditionThrowable
    {
        int n = _readChar();
        if (n < 0)
            return signal(new EndOfFile(this));
        char c = (char) n;
        switch (c) {
            case '@':
                return new Cons(Symbol.COMMA_ATSIGN,
                                new Cons(read(true, NIL, true), NIL));
            case '.':
                return new Cons(Symbol.COMMA_DOT,
                                new Cons(read(true, NIL, true), NIL));
            default:
                _unreadChar(c);
                return new Cons(Symbol.COMMA,
                                new Cons(read(true, NIL, true), NIL));
        }
    }

    private LispObject readBackquote() throws ConditionThrowable
    {
        return new Cons(Symbol.BACKQUOTE, new Cons(read(true, NIL, true)));
    }

    private LispObject readSharp() throws ConditionThrowable
    {
        int numArg = -1;
        char c;
        while (true) {
            int n = _readChar();
            if (n < 0)
                return signal(new EndOfFile(this));
            c = (char) n;
            if (c < '0' || c > '9')
                break;
            if (numArg < 0)
                numArg = 0;
            numArg = numArg * 10 + c - '0';
        }
        LispObject fun =
            getCurrentReadtable().getDispatchMacroCharacter('#', c);
        if (fun != NIL) {
            LispObject[] args = new LispObject[3];
            final LispThread thread = LispThread.currentThread();
            LispObject result = funcall3(fun,
                                         this,
                                         LispCharacter.getInstance(c),
                                         (numArg < 0) ? NIL : new Fixnum(numArg),
                                         thread);
            LispObject[] values = thread.getValues();
            if (values != null && values.length == 0)
                result = null;
            thread.clearValues();
            return result;
        }
        switch (c) {
            case '\'':
                return new Cons(Symbol.FUNCTION,
                                new Cons(read(true, NIL, true)));
            case '(':
                return new SimpleVector(readList());
            case '\\':
                return readCharacterLiteral();
            case '+':
            case '-':
                return handleFeature(c);
            case ':':
                // An uninterned symbol.
                return new Symbol(readToken());
            case '|':
                skipBalancedComment();
                return null;
            case '.':
                return eval(read(true, NIL, true), new Environment(),
                            LispThread.currentThread());
            case '*':
                return readBitVector();
            case 'a':
            case 'A':
                return readArray(numArg);
            case 'b':
            case 'B':
                return readRadix(2);
            case 'c':
            case 'C':
                return readComplex();
            case 'o':
            case 'O':
                return readRadix(8);
            case 'p':
            case 'P':
                return readPathname();
            case 'r':
            case 'R':
                return readRadix(numArg);
            case 's':
            case 'S':
                return readStructure();
            case 'x':
            case 'X':
                return readRadix(16);
            default:
                //clearInput();
                //return signal(new LispError("unsupported '#' macro character '" +
                //    c + '\'');
                return null;
        }
    }

    private LispObject readCharacterLiteral() throws ConditionThrowable
    {
        int n = _readChar();
        if (n < 0)
            return signal(new EndOfFile(this));
        char c = (char) n;
        StringBuffer sb = new StringBuffer();
        sb.append(c);
        while (true) {
            n = _readChar();
            if (n < 0)
                break;
            c = (char) n;
            if (Character.isWhitespace(c))
                break;
            if (c == '(' || c == ')') {
                _unreadChar(c);
                break;
            }
            sb.append(c);
        }
        if (_READ_SUPPRESS_.symbolValueNoThrow() != NIL)
            return NIL;
        String token = sb.toString();
        if (token.length() == 1)
            return LispCharacter.getInstance(token.charAt(0));
        n = nameToChar(token);
        if (n >= 0)
            return LispCharacter.getInstance((char)n);
        return signal(new LispError("Unrecognized character name: \"" + token + '"'));
    }

    // FIXME
    private LispObject handleFeature(char c) throws ConditionThrowable
    {
        LispObject feature = read(true, NIL, true);
        LispObject form = read(true, NIL, true);
        if (feature instanceof Symbol) {
            if (((Symbol)feature).getName().equalsIgnoreCase("armedbear")) {
                if (c == '+')
                    return form;
                else
                    return null;
            } else {
                if (c == '+')
                    return null;
                else
                    return form;
            }
        }
        return null;
    }

    private void skipBalancedComment() throws ConditionThrowable
    {
        while (true) {
            int n = _readChar();
            if (n < 0)
                return;
            if (n == '|') {
                n = _readChar();
                if (n == '#')
                    return;
                else
                    _unreadChar(n);
            } else if (n == '#') {
                n = _readChar();
                if (n == '|')
                    skipBalancedComment(); // Nested comment. Recurse!
                else
                    _unreadChar(n);
            }
        }
    }

    private LispObject readBitVector() throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer();
        while (true) {
            int n = _readChar();
            if (n < 0)
                break;
            char c = (char) n;
            if (c == '0' || c == '1')
                sb.append(c);
            else {
                _unreadChar(c);
                break;
            }
        }
        return new SimpleBitVector(sb.toString());
    }

    private LispObject readArray(int rank) throws ConditionThrowable
    {
        LispObject obj = read(true, NIL, true);
        switch (rank) {
            case 0:
                return new ZeroRankArray(T, obj, false);
            case 1:
                return new SimpleVector(obj);
            default:
                return new SimpleArray(rank, obj);
        }
    }

    private LispObject readComplex() throws ConditionThrowable
    {
        LispObject obj = read(true, NIL, true);
        if (obj instanceof Cons && obj.length() == 2)
            return Complex.getInstance(obj.car(), obj.cadr());
        return signal(new LispError("invalid complex number format #C" + obj));
    }

    private String readMultipleEscape() throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer();
        while (true) {
            int n = _readChar();
            if (n < 0)
                break;
            char c = (char) n;
            if (c == '\\') {
                n = _readChar();
                if (n < 0) {
                    signal(new EndOfFile(this));
                    // Not reached.
                    return null;
                }
                sb.append((char)n);
                continue;
            }
            if (c == '|')
                break;
            sb.append(c);
        }
        return sb.toString();
    }

    private final String readToken() throws ConditionThrowable
    {
        return readToken(new StringBuffer());
    }

    private final String readToken(char firstChar) throws ConditionThrowable
    {
        StringBuffer sb = new StringBuffer();
        sb.append(firstChar);
        return readToken(sb);
    }

    private final String readToken(StringBuffer sb) throws ConditionThrowable
    {
        LispObject readtableCase = getCurrentReadtable().getReadtableCase();
        if (sb.length() > 0) {
            Debug.assertTrue(sb.length() == 1);
            char c = sb.charAt(0);
            if (c == '\\') {
                int n = _readChar();
                if (n < 0) {
                    signal(new EndOfFile(this));
                    // Not reached.
                    return null;
                }
                sb.setCharAt(0, (char) n);
            } else if (readtableCase == Keyword.UPCASE) {
                sb.setCharAt(0, Utilities.toUpperCase(c));
            } else if (readtableCase == Keyword.DOWNCASE) {
                sb.setCharAt(0, Utilities.toLowerCase(c));
            }
        }
      loop:
        while (true) {
            int n = _readChar();
            if (n < 0)
                break;
            char c = (char) n;
            if (Character.isWhitespace(c))
                break;
            switch (c) {
                case '(':
                case ')':
                    _unreadChar(c);
                    break loop;
                case '\\':
                    n = _readChar();
                    if (n < 0)
                        break loop;
                    sb.append((char)n);
                    break;
                case '|':
                    sb.append(readMultipleEscape());
                    break;
                default:
                    if (readtableCase == Keyword.UPCASE)
                        c = Utilities.toUpperCase(c);
                    else if (readtableCase == Keyword.DOWNCASE)
                        c = Utilities.toLowerCase(c);
                    sb.append(c);
            }
        }
        if (readtableCase == Keyword.INVERT)
            return invert(sb.toString());
        return sb.toString();
    }

    private static LispObject makeObject(String token) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        if (_READ_SUPPRESS_.symbolValueNoThrow(thread) != NIL)
            return NIL;
        if (token.length() > 0) {
            final char firstChar = token.charAt(0);
            if ("-+0123456789".indexOf(firstChar) >= 0) {
                LispObject number = makeNumber(token, getReadBase());
                if (number != null)
                    return number;
            }
            final int radix = getReadBase();
            if (Character.digit(firstChar, radix) >= 0) {
                LispObject number = makeNumber(token, radix);
                if (number != null)
                    return number;
            }
        }
        return makeSymbol(token);
    }

    private static LispObject makeSymbol(String token) throws ConditionThrowable
    {
        if (token.length() > 0) {
            if (token.charAt(0) == ':')
                return PACKAGE_KEYWORD.intern(token.substring(1));
            int index = token.indexOf("::");
            if (index > 0) {
                String packageName = token.substring(0, index);
                String symbolName = token.substring(index + 2);
                Package pkg = Packages.findPackage(packageName);
                if (pkg == null)
                    return signal(new LispError("Package \"" + packageName +
                                                "\" not found."));
                return pkg.intern(symbolName);
            }
            index = token.indexOf(':');
            if (index > 0) {
                String packageName = token.substring(0, index);
                String symbolName = token.substring(index + 1);
                Package pkg = Packages.findPackage(packageName);
                if (pkg == null)
                    return signal(new PackageError("Package \"" + packageName +
                                                   "\" not found."));
                Symbol symbol = pkg.findExternalSymbol(symbolName);
                if (symbol != null)
                    return symbol;
                // Error!
                if (pkg.findInternalSymbol(symbolName) != null)
                    return signal(new LispError("The symbol \"" + symbolName +
                                                "\" is not external in package " +
                                                packageName + '.'));
                else
                    return signal(new LispError("The symbol \"" + symbolName +
                                                "\" was not found in package " +
                                                packageName + '.'));
            }
        }
        // Intern token in current package.
        final LispThread thread = LispThread.currentThread();
        return ((Package)_PACKAGE_.symbolValueNoThrow(thread)).intern(token);
    }

    private static final int getReadBase() throws ConditionThrowable
    {
        final int readBase;
        try {
            readBase = ((Fixnum)_READ_BASE_.symbolValue()).value;
        }
        catch (ClassCastException e) {
            // The value of *READ-BASE* is not a Fixnum.
            signal(new LispError("The value of *READ-BASE* is not of type '(INTEGER 2 36)."));
            // Not reached.
            return 10;
        }
        if (readBase < 2 || readBase > 36) {
            signal(new LispError("The value of *READ-BASE* is not of type '(INTEGER 2 36)."));
            // Not reached.
            return 10;
        }
        return readBase;
    }

    private static final LispObject makeNumber(String token, int radix)
        throws ConditionThrowable
    {
        if (token.indexOf('/') >= 0)
            return makeRatio(token, radix);
        if (token.endsWith(".")) {
            radix = 10;
            token = token.substring(0, token.length()-1);
        }
        boolean numeric = true;
        if (radix == 10) {
            for (int i = token.length(); i-- > 0;) {
                char c = token.charAt(i);
                if (c < '0' || c > '9') {
                    if (i > 0 || (c != '-' && c != '+')) {
                        numeric = false;
                        break;
                    }
                }
            }
        } else {
            for (int i = token.length(); i-- > 0;) {
                char c = token.charAt(i);
                if (Character.digit(c, radix) < 0) {
                    if (i > 0 || (c != '-' && c != '+')) {
                        numeric = false;
                        break;
                    }
                }
            }
        }
        if (!numeric) // Can't be an integer.
            return makeFloat(token);
        try {
            return new Fixnum(Integer.parseInt(token, radix));
        }
        catch (NumberFormatException e) {}
        // parseInt() failed.
        try {
            return new Bignum(new BigInteger(token, radix));
        }
        catch (NumberFormatException e) {}
        // Not a number.
        return null;
    }

    private static final LispObject makeRatio(String token, int radix)
        throws ConditionThrowable
    {
        final int index = token.indexOf('/');
        if (index < 0)
            return null;
        try {
            BigInteger numerator =
                new BigInteger(token.substring(0, index), radix);
            BigInteger denominator =
                new BigInteger(token.substring(index + 1), radix);
            return number(numerator, denominator);
        }
        catch (NumberFormatException e) {}
        return null;
    }

    private static LispObject makeFloat(String token) throws ConditionThrowable
    {
        final int length = token.length();
        if (length == 0)
            return null;
        StringBuffer sb = new StringBuffer();
        int i = 0;
        boolean maybe = false;
        char c = token.charAt(i);
        if (c == '-' || c == '+') {
            sb.append(c);
            ++i;
        }
        while (i < length) {
            c = token.charAt(i);
            if (c == '.' || (c >= '0' && c <= '9')) {
                if (c == '.')
                    maybe = true;
                sb.append(c);
                ++i;
            } else
                break;
        }
        if (i < length) {
            if ("esfdlESFDL".indexOf(token.charAt(i)) >= 0) {
                // Exponent marker.
                maybe = true;
                sb.append('E');
                ++i;
            }
        }
        if (!maybe)
            return null;
        // Append rest of token.
        sb.append(token.substring(i));
        try {
            return new LispFloat(Double.parseDouble(sb.toString()));
        }
        catch (NumberFormatException e) {
            return null;
        }
    }

    private LispObject readRadix(int radix) throws ConditionThrowable
    {
        String s = readToken();
        if (s.indexOf('/') >= 0)
            return makeRatio(s, radix);
        try {
            return new Fixnum(Integer.parseInt(s, radix));
        }
        catch (NumberFormatException e) {}
        // parseInt() failed.
        try {
            return new Bignum(new BigInteger(s, radix));
        }
        catch (NumberFormatException e) {}
        // Not a number.
        return signal(new LispError());
    }

    private char flushWhitespace() throws ConditionThrowable
    {
        while (true) {
            int n = _readChar();
            if (n < 0) {
                signal(new EndOfFile(this));
                // Not reached.
                return 0;
            }
            char c = (char) n;
            if (!Character.isWhitespace(c))
                return c;
        }
    }

    // read-line &optional stream eof-error-p eof-value recursive-p
    // => line, missing-newline-p
    // recursive-p is ignored
    public LispObject readLine(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        StringBuffer sb = new StringBuffer();
        while (true) {
            int n = _readChar();
            if (n < 0) {
                if (sb.length() == 0) {
                    if (eofError)
                        return signal(new EndOfFile(this));
                    return thread.setValues(eofValue, T);
                }
                return thread.setValues(new SimpleString(sb), T);
            }
            if (n == '\n')
                return thread.setValues(new SimpleString(sb), NIL);
            else
                sb.append((char)n);
        }
    }

    // read-char &optional stream eof-error-p eof-value recursive-p => char
    // recursive-p is ignored
    public LispObject readChar(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        int n = _readChar();
        if (n < 0) {
            if (eofError)
                return signal(new EndOfFile(this));
            else
                return eofValue;
        }
        return LispCharacter.getInstance((char)n);
    }

    // read-char-no-hang &optional stream eof-error-p eof-value recursive-p => char
    // recursive-p is ignored
    public LispObject readCharNoHang(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        return _charReady() ? readChar(eofError, eofValue) : NIL;
    }

    // unread-char character &optional input-stream => nil
    public LispObject unreadChar(LispCharacter c) throws ConditionThrowable
    {
        _unreadChar(c.getValue());
        return NIL;
    }

    public LispObject finishOutput() throws ConditionThrowable
    {
        _finishOutput();
        return NIL;
    }

    // clear-input &optional input-stream => nil
    public LispObject clearInput() throws ConditionThrowable
    {
        _clearInput();
        return NIL;
    }

    public LispObject getFilePosition() throws ConditionThrowable
    {
        long pos = _getFilePosition();
        return pos >= 0 ? number(pos) : NIL;
    }

    public LispObject setFilePosition(LispObject arg) throws ConditionThrowable
    {
        return _setFilePosition(arg) ? T : NIL;
    }

    // close stream &key abort => result
    // Must return true if stream was open, otherwise implementation-dependent.
    public LispObject close(LispObject abort) throws ConditionThrowable
    {
        _close();
        return T;
    }

    public String toString()
    {
        return unreadableString("STREAM");
    }

    // read-byte stream &optional eof-error-p eof-value => byte
    // Reads an 8-bit byte.
    public LispObject readByte(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        int n = _readByte();
        if (n < 0) {
            if (eofError)
                return signal(new EndOfFile(this));
            else
                return eofValue;
        }
        return new Fixnum(n);
    }

    public LispObject terpri() throws ConditionThrowable
    {
        _writeString(lineSeparator);
        return NIL;
    }

    public LispObject freshLine() throws ConditionThrowable
    {
        if (charPos == 0)
            return NIL;
        _writeString(lineSeparator);
        return T;
    }

    public void print(char c) throws ConditionThrowable
    {
        _writeChar(c);
    }

    // PRINC is just like PRIN1 except that the output has no escape
    // characters. It binds *PRINT-ESCAPE* to false and *PRINT-READABLY* to
    // false. The general rule is that output from PRINC is intended to look
    // good to people, while output from PRIN1 is intended to be acceptable to
    // READ.
    public void princ(LispObject obj) throws ConditionThrowable
    {
        LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        thread.bindSpecial(_PRINT_ESCAPE_, NIL);
        thread.bindSpecial(_PRINT_READABLY_, NIL);
        String s = String.valueOf(obj);
        thread.setDynamicEnvironment(oldDynEnv);
        _writeString(s);
    }

    // PRIN1 produces output suitable for input to READ.
    // Binds *PRINT-ESCAPE* to true.
    public void prin1(LispObject obj) throws ConditionThrowable
    {
        LispThread thread = LispThread.currentThread();
        Environment oldDynEnv = thread.getDynamicEnvironment();
        thread.bindSpecial(_PRINT_ESCAPE_, T);
        String s = String.valueOf(obj);
        thread.setDynamicEnvironment(oldDynEnv);
        _writeString(s);
    }

    public LispObject listen() throws ConditionThrowable
    {
        return _charReady() ? T : NIL;
    }

    public LispObject fileLength() throws ConditionThrowable
    {
        return signal(new TypeError("Stream is not associated with a file."));
    }

    public LispObject fileStringLength(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof LispCharacter)
            return Fixnum.ONE;
        else if (arg instanceof AbstractString)
            return number(arg.length());
        else
            return signal(new TypeError(String.valueOf(arg) +
                                        " is neither a string nor a character."));
    }

    // Returns -1 at end of file.
    protected int _readChar() throws ConditionThrowable
    {
        try {
            int n = reader.read();
            ++offset;
            if (n == '\n')
                ++lineNumber;
            return n;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
            // Not reached.
            return -1;
        }
    }

    protected void _unreadChar(int n) throws ConditionThrowable
    {
        try {
            reader.unread(n);
            --offset;
            if (n == '\n')
                --lineNumber;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    protected boolean _charReady() throws ConditionThrowable
    {
        try {
            return reader.ready();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
            // Not reached.
            return false;
        }
    }

    public void _writeChar(char c) throws ConditionThrowable
    {
        try {
            writer.write(c);
            if (c == '\n') {
                writer.flush();
                charPos = 0;
            } else
                ++charPos;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void _writeChars(char[] chars, int start, int end)
        throws ConditionThrowable
    {
        try {
            writer.write(chars, start, end - start);
            int index = -1;
            for (int i = end; i-- > start;) {
                if (chars[i] == '\n') {
                    index = i;
                    break;
                }
            }
            if (index < 0) {
                // No newline.
                charPos += (end - start);
            } else {
                charPos = end - (index + 1);
                writer.flush();
            }
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        try {
            writer.write(s);
            int index = s.lastIndexOf('\n');
            if (index < 0)
                charPos += s.length();
            else {
                charPos = s.length() - (index + 1);
                writer.flush();
            }
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        try {
            writer.write(s);
            writer.write(lineSeparator);
            writer.flush();
            charPos = 0;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    // Reads an 8-bit byte.
    public int _readByte() throws ConditionThrowable
    {
        try {
            return in.read(); // Reads an 8-bit byte.
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
            // Not reached.
            return -1;
        }
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n) throws ConditionThrowable
    {
        try {
            out.write(n); // Writes an 8-bit byte.
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void _finishOutput() throws ConditionThrowable
    {
        try {
            if (writer != null)
                writer.flush();
            if (out != null)
                out.flush();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void _clearInput() throws ConditionThrowable
    {
        if (reader != null) {
            while (_charReady())
                _readChar();
        } else if (in != null) {
            try {
                while (in.available() > 0)
                    in.read();
            }
            catch (IOException e) {
                signal(new StreamError(this, e));
            }
        }
    }

    protected long _getFilePosition() throws ConditionThrowable
    {
        return -1;
    }

    protected boolean _setFilePosition(LispObject arg) throws ConditionThrowable
    {
        return false;
    }

    public void _close() throws ConditionThrowable
    {
        try {
            if (reader != null)
                reader.close();
            if (in != null)
                in.close();
            if (writer != null)
                writer.close();
            if (out != null)
                out.close();
            setOpen(false);
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void printStackTrace(Throwable t) throws ConditionThrowable
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        try {
            writer.write(sw.toString());
            writer.write(lineSeparator);
            writer.flush();
            charPos = 0;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    // ### file-position
    private static final Primitive FILE_POSITION =
        new Primitive("file-position", "stream &optional position-spec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return checkStream(arg).getFilePosition();
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return checkStream(first).setFilePosition(second);
        }
    };

    private static final Primitive1 STREAM_LINE_NUMBER =
        new Primitive1("stream-line-number", PACKAGE_SYS, false, "stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkStream(arg);
            return number(stream.getLineNumber() + 1);
        }
    };

    private static final Primitive1 STREAM_OFFSET =
        new Primitive1("stream-offset", PACKAGE_SYS, false, "stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkStream(arg);
            return number(stream.getOffset());
        }
    };
}
