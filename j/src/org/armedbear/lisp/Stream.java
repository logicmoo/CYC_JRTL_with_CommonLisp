/*
 * Stream.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Stream.java,v 1.138 2005-10-17 15:44:44 piso Exp $
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
import java.util.BitSet;

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
    private Writer writer;

    // The number of characters on the current line of output (-1 if unknown).
    protected int charPos;

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
            InputStreamReader inputStreamReader;
            try {
                inputStreamReader =
                    new InputStreamReader(inputStream, "ISO-8859-1");
            }
            catch (java.io.UnsupportedEncodingException e) {
                Debug.trace(e);
                inputStreamReader =
                    new InputStreamReader(inputStream);
            }
            reader = new PushbackReader(new BufferedReader(inputStreamReader),
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
            try {
                writer = new OutputStreamWriter(outputStream, "ISO-8859-1");
            }
            catch (java.io.UnsupportedEncodingException e) {
                Debug.trace(e);
                writer = new OutputStreamWriter(outputStream);
            }
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

    public boolean isCharacterInputStream() throws ConditionThrowable
    {
        return isCharacterStream && isInputStream;
    }

    public boolean isBinaryInputStream() throws ConditionThrowable
    {
        return isBinaryStream && isInputStream;
    }

    public boolean isCharacterOutputStream() throws ConditionThrowable
    {
        return isCharacterStream && isOutputStream;
    }

    public boolean isBinaryOutputStream() throws ConditionThrowable
    {
        return isBinaryStream && isOutputStream;
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

    public LispObject classOf()
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
    public final int getLineNumber()
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
                           boolean recursive, LispThread thread)
        throws ConditionThrowable
    {
        LispObject result = readPreservingWhitespace(eofError, eofValue,
                                                     recursive, thread);
        if (result != eofValue && !recursive) {
            if (_charReady()) {
                int n = _readChar();
                if (n >= 0) {
                    char c = (char) n;
                    Readtable rt = (Readtable) _READTABLE_.symbolValue(thread);
                    if (!rt.isWhitespace(c))
                        _unreadChar(c);
                }
            }
        }
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        else
            return result;
    }

    // ### *sharp-equal-alist*
    // internal symbol
    private static final Symbol _SHARP_EQUAL_ALIST_ =
        internSpecial("*SHARP-EQUAL-ALIST*", PACKAGE_SYS, NIL);

    public LispObject readPreservingWhitespace(boolean eofError,
                                               LispObject eofValue,
                                               boolean recursive,
                                               LispThread thread)
        throws ConditionThrowable
    {
        if (recursive) {
            final Readtable rt = (Readtable) _READTABLE_.symbolValue(thread);
            while (true) {
                int n = _readChar();
                if (n < 0) {
                    if (eofError)
                        return signal(new EndOfFile(this));
                    else
                        return eofValue;
                }
                char c = (char) n;
                if (rt.isWhitespace(c))
                    continue;
                LispObject result = processChar(c, rt);
                if (result != null)
                    return result;
            }
        } else {
            thread.bindSpecial(_SHARP_EQUAL_ALIST_, NIL);
            return readPreservingWhitespace(eofError, eofValue, true, thread);
        }
    }

    public LispObject faslRead(boolean eofError, LispObject eofValue,
                               boolean recursive, LispThread thread)
        throws ConditionThrowable
    {
        LispObject result = faslReadPreservingWhitespace(eofError, eofValue,
                                                         recursive, thread);
        if (result != eofValue && !recursive) {
            if (_charReady()) {
                int n = _readChar();
                if (n >= 0) {
                    char c = (char) n;
                    Readtable rt = FaslReadtable.getInstance();
                    if (!rt.isWhitespace(c))
                        _unreadChar(c);
                }
            }
        }
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        else
            return result;
    }

    private final LispObject faslReadPreservingWhitespace(boolean eofError,
                                                          LispObject eofValue,
                                                          boolean recursive,
                                                          LispThread thread)
        throws ConditionThrowable
    {
        if (recursive) {
            final Readtable rt = FaslReadtable.getInstance();
            while (true) {
                int n = _readChar();
                if (n < 0) {
                    if (eofError)
                        return signal(new EndOfFile(this));
                    else
                        return eofValue;
                }
                char c = (char) n;
                if (rt.isWhitespace(c))
                    continue;
                LispObject result = processChar(c, rt);
                if (result != null)
                    return result;
            }
        } else {
            thread.bindSpecial(_SHARP_EQUAL_ALIST_, NIL);
            return faslReadPreservingWhitespace(eofError, eofValue, true, thread);
        }
    }

    private final LispObject processChar(char c, Readtable rt)
        throws ConditionThrowable
    {
        final LispObject handler = rt.getReaderMacroFunction(c);
        if (handler instanceof ReaderMacroFunction)
            return ((ReaderMacroFunction)handler).execute(this, c);
        if (handler != null && handler != NIL)
            return handler.execute(this, LispCharacter.getInstance(c));
        return readToken(c, rt);
    }

    public LispObject readPathname() throws ConditionThrowable
    {
        LispObject obj = read(true, NIL, false, LispThread.currentThread());
        if (obj instanceof AbstractString)
            return Pathname.parseNamestring((AbstractString)obj);
        if (obj.listp())
            return Pathname.makePathname(obj);
        return signal(new TypeError("#p requires a string or list argument."));
    }

    public LispObject faslReadPathname() throws ConditionThrowable
    {
        LispObject obj = faslRead(true, NIL, false, LispThread.currentThread());
        if (obj instanceof AbstractString)
            return Pathname.parseNamestring((AbstractString)obj);
        if (obj.listp())
            return Pathname.makePathname(obj);
        return signal(new TypeError("#p requires a string or list argument."));
    }

    public LispObject readSymbol() throws ConditionThrowable
    {
        final Readtable rt =
            (Readtable) _READTABLE_.symbolValue(LispThread.currentThread());
        FastStringBuffer sb = new FastStringBuffer();
        _readToken(sb, rt);
        return new Symbol(sb.toString());
    }

    public LispObject readSymbol(Readtable rt) throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer();
        _readToken(sb, rt);
        return new Symbol(sb.toString());
    }

    public LispObject readStructure() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject obj = read(true, NIL, false, thread);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (obj.listp()) {
            Symbol structure = checkSymbol(obj.car());
            LispClass c = LispClass.findClass(structure);
            if (!(c instanceof StructureClass))
                return signal(new ReaderError(structure.getName() +
                                              " is not a defined structure type.",
                                              this));
            LispObject args = obj.cdr();
            Symbol DEFSTRUCT_DEFAULT_CONSTRUCTOR =
                PACKAGE_SYS.intern("DEFSTRUCT-DEFAULT-CONSTRUCTOR");
            LispObject constructor =
                DEFSTRUCT_DEFAULT_CONSTRUCTOR.getSymbolFunctionOrDie().execute(structure);
            final int length = args.length();
            if ((length % 2) != 0)
                return signal(new ReaderError("Odd number of keyword arguments following #S: " +
                                              obj.writeToString(),
                                              this));
            LispObject[] array = new LispObject[length];
            LispObject rest = args;
            for (int i = 0; i < length; i += 2) {
                LispObject key = rest.car();
                if (key instanceof Symbol && ((Symbol)key).getPackage() == PACKAGE_KEYWORD) {
                    array[i] = key;
                } else {
                    array[i] = PACKAGE_KEYWORD.intern(javaString(key));
                }
                array[i + 1] = rest.cadr();
                rest = rest.cddr();
            }
            return funcall(constructor.getSymbolFunctionOrDie(), array,
                           thread);
        }
        return signal(new ReaderError("Non-list following #S: " +
                                      obj.writeToString(),
                                      this));
    }

    public LispObject faslReadStructure() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject obj = faslRead(true, NIL, false, thread);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (obj.listp()) {
            Symbol structure = checkSymbol(obj.car());
            LispClass c = LispClass.findClass(structure);
            if (!(c instanceof StructureClass))
                return signal(new ReaderError(structure.getName() +
                                              " is not a defined structure type.",
                                              this));
            LispObject args = obj.cdr();
            Symbol DEFSTRUCT_DEFAULT_CONSTRUCTOR =
                PACKAGE_SYS.intern("DEFSTRUCT-DEFAULT-CONSTRUCTOR");
            LispObject constructor =
                DEFSTRUCT_DEFAULT_CONSTRUCTOR.getSymbolFunctionOrDie().execute(structure);
            final int length = args.length();
            if ((length % 2) != 0)
                return signal(new ReaderError("Odd number of keyword arguments following #S: " +
                                              obj.writeToString(),
                                              this));
            LispObject[] array = new LispObject[length];
            LispObject rest = args;
            for (int i = 0; i < length; i += 2) {
                LispObject key = rest.car();
                if (key instanceof Symbol && ((Symbol)key).getPackage() == PACKAGE_KEYWORD) {
                    array[i] = key;
                } else {
                    array[i] = PACKAGE_KEYWORD.intern(javaString(key));
                }
                array[i + 1] = rest.cadr();
                rest = rest.cddr();
            }
            return funcall(constructor.getSymbolFunctionOrDie(), array,
                           thread);
        }
        return signal(new ReaderError("Non-list following #S: " +
                                      obj.writeToString(),
                                      this));
    }

    public LispObject readList(boolean requireProperList, boolean useFaslReadtable)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        Cons first = null;
        Cons last = null;
        Readtable rt = null;
        if (useFaslReadtable)
            rt = FaslReadtable.getInstance();
        while (true) {
            if (!useFaslReadtable)
                rt = (Readtable) _READTABLE_.symbolValue(thread);
            char c = flushWhitespace(rt);
            if (c == ')') {
                return first == null ? NIL : first;
            }
            if (c == '.') {
                int n = _readChar();
                if (n < 0)
                    return signal(new EndOfFile(this));
                char nextChar = (char) n;
                if (isTokenDelimiter(nextChar, rt)) {
                    if (last == null) {
                        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
                            return NIL;
                        else
                            return signal(new ReaderError("Nothing appears before . in list.",
                                                          this));
                    }
                    _unreadChar(nextChar);
                    LispObject obj = read(true, NIL, true, thread);
                    if (requireProperList) {
                        if (!obj.listp())
                            signal(new ReaderError("The value " +
                                                   obj.writeToString() +
                                                   " is not of type " +
                                                   Symbol.LIST.writeToString() + ".",
                                                   this));
                    }
                    last.setCdr(obj);
                    continue;
                }
                // normal token beginning with '.'
                _unreadChar(nextChar);
            }
            LispObject obj = processChar(c, rt);
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

    private static final boolean isTokenDelimiter(char c, Readtable rt)
        throws ConditionThrowable
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
                return rt.isWhitespace(c);
        }
    }

    public LispObject readDispatchChar(char dispChar, boolean useFaslReadtable)
        throws ConditionThrowable
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
        final LispThread thread = LispThread.currentThread();
        final Readtable rt;
        if (useFaslReadtable)
            rt = FaslReadtable.getInstance();
        else
            rt = (Readtable) _READTABLE_.symbolValue(thread);
        LispObject fun = rt.getDispatchMacroCharacter(dispChar, c);
        if (fun instanceof DispatchMacroFunction)
            return ((DispatchMacroFunction)fun).execute(this, c, numArg);
        if (fun != NIL) {
            LispObject result =
                thread.execute(fun, this, LispCharacter.getInstance(c),
                               (numArg < 0) ? NIL : new Fixnum(numArg));
            LispObject[] values = thread.getValues();
            if (values != null && values.length == 0)
                result = null;
            thread.clearValues();
            return result;
        }
        return signal(new ReaderError("No dispatch function defined for #\\" + c,
                                      this));
    }

    public LispObject readCharacterLiteral(Readtable rt, LispThread thread)
        throws ConditionThrowable
    {
        int n = _readChar();
        if (n < 0)
            return signal(new EndOfFile(this));
        char c = (char) n;
        FastStringBuffer sb = new FastStringBuffer(c);
        while (true) {
            n = _readChar();
            if (n < 0)
                break;
            c = (char) n;
            if (rt.isWhitespace(c))
                break;
            if (c == '(' || c == ')') {
                _unreadChar(c);
                break;
            }
            sb.append(c);
        }
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (sb.length() == 1)
            return LispCharacter.getInstance(sb.charAt(0));
        String token = sb.toString();
        n = LispCharacter.nameToChar(token);
        if (n >= 0)
            return LispCharacter.getInstance((char)n);
        return signal(new LispError("Unrecognized character name: \"" + token + '"'));
    }

    public void skipBalancedComment() throws ConditionThrowable
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

    public LispObject readArray(int rank) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject obj = read(true, NIL, true, thread);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        switch (rank) {
            case -1:
                return signal(new ReaderError("No dimensions argument to #A.", this));
            case 0:
                return new ZeroRankArray(T, obj, false);
            case 1: {
                if (obj.listp() || obj instanceof AbstractVector)
                    return new SimpleVector(obj);
                return signal(new ReaderError(obj.writeToString() + " is not a sequence.",
                                              this));
            }
            default:
                return new SimpleArray_T(rank, obj);
        }
    }

    public LispObject faslReadArray(int rank) throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject obj = faslRead(true, NIL, true, thread);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        switch (rank) {
            case -1:
                return signal(new ReaderError("No dimensions argument to #A.", this));
            case 0:
                return new ZeroRankArray(T, obj, false);
            case 1: {
                if (obj.listp() || obj instanceof AbstractVector)
                    return new SimpleVector(obj);
                return signal(new ReaderError(obj.writeToString() + " is not a sequence.",
                                              this));
            }
            default:
                return new SimpleArray_T(rank, obj);
        }
    }

    public LispObject readComplex() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject obj = read(true, NIL, true, thread);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (obj instanceof Cons && obj.length() == 2)
            return Complex.getInstance(obj.car(), obj.cadr());
        // Error.
        FastStringBuffer sb = new FastStringBuffer("Invalid complex number format");
        if (this instanceof FileStream) {
            Pathname p = ((FileStream)this).getPathname();
            if (p != null) {
                String namestring = p.getNamestring();
                if (namestring != null) {
                    sb.append(" in #P\"");
                    sb.append(namestring);
                    sb.append('"');
                }
            }
            sb.append(" at offset ");
            sb.append(_getFilePosition());
        }
        sb.append(": #C");
        sb.append(obj.writeToString());
        return signal(new ReaderError(sb.toString(), this));
    }

    public LispObject faslReadComplex() throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject obj = faslRead(true, NIL, true, thread);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (obj instanceof Cons && obj.length() == 2)
            return Complex.getInstance(obj.car(), obj.cadr());
        // Error.
        FastStringBuffer sb = new FastStringBuffer("Invalid complex number format");
        if (this instanceof FileStream) {
            Pathname p = ((FileStream)this).getPathname();
            if (p != null) {
                String namestring = p.getNamestring();
                if (namestring != null) {
                    sb.append(" in #P\"");
                    sb.append(namestring);
                    sb.append('"');
                }
            }
            sb.append(" at offset ");
            sb.append(_getFilePosition());
        }
        sb.append(": #C");
        sb.append(obj.writeToString());
        return signal(new ReaderError(sb.toString(), this));
    }

    private String readMultipleEscape(Readtable rt) throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer();
        while (true) {
            int n = _readChar();
            if (n < 0) {
                signal(new EndOfFile(this));
                // Not reached.
                return null;
            }
            char c = (char) n;
            byte syntaxType = rt.getSyntaxType(c);
            if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
                n = _readChar();
                if (n < 0) {
                    signal(new EndOfFile(this));
                    // Not reached.
                    return null;
                }
                sb.append((char)n);
                continue;
            }
            if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE)
                break;
            sb.append(c);
        }
        return sb.toString();
    }

    private static final int findUnescapedSingleColon(String s, BitSet flags)
    {
        if (flags == null)
            return s.indexOf(':');
        final int limit = s.length();
        for (int i = 0; i < limit; i++) {
            if (s.charAt(i) == ':' && !flags.get(i)) {
                return i;
            }
        }
        return -1;
    }

    private static final int findUnescapedDoubleColon(String s, BitSet flags)
    {
        if (flags == null)
            return s.indexOf("::");
        final int limit = s.length() - 1;
        for (int i = 0; i < limit; i++) {
            if (s.charAt(i) == ':' && !flags.get(i)) {
                if (s.charAt(i + 1) == ':' && !flags.get(i + 1)) {
                    return i;
                }
            }
        }
        return -1;
    }

    private final LispObject readToken(char c, Readtable rt)
        throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer(c);
        final LispThread thread = LispThread.currentThread();
        BitSet flags = _readToken(sb, rt);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        final LispObject readtableCase = rt.getReadtableCase();
        final String token;
        if (readtableCase == Keyword.INVERT)
            token = invert(sb.toString(), flags);
        else
            token = sb.toString();
        final int length = token.length();
        if (length > 0) {
            final char firstChar = token.charAt(0);
            if (flags == null) {
                if (firstChar == '.') {
                    // Section 2.3.3: "If a token consists solely of dots (with
                    // no escape characters), then an error of type READER-
                    // ERROR is signaled, except in one circumstance: if the
                    // token is a single dot and appears in a situation where
                    // dotted pair notation permits a dot, then it is accepted
                    // as part of such syntax and no error is signaled."
                    boolean ok = false;
                    for (int i = length; i-- > 1;) {
                        if (token.charAt(i) != '.') {
                            ok = true;
                            break;
                        }
                    }
                    if (!ok) {
                        final String message;
                        if (length > 1)
                            message = "Too many dots.";
                        else
                            message = "Dot context error.";
                        return signal(new ReaderError(message, this));
                    }
                }
                final int radix = getReadBase(thread);
                if ("+-.0123456789".indexOf(firstChar) >= 0) {
                    LispObject number = makeNumber(token, length, radix);
                    if (number != null)
                        return number;
                } else if (Character.digit(firstChar, radix) >= 0) {
                    LispObject number = makeNumber(token, length, radix);
                    if (number != null)
                        return number;
                }
            }
            if (firstChar == ':')
                if (flags == null || !flags.get(0))
                    return PACKAGE_KEYWORD.intern(token.substring(1));
            int index = findUnescapedDoubleColon(token, flags);
            if (index > 0) {
                String packageName = token.substring(0, index);
                String symbolName = token.substring(index + 2);
                Package pkg = Packages.findPackage(packageName);
                if (pkg == null)
                    return signal(new LispError("Package \"" + packageName +
                                                "\" not found."));
                return pkg.intern(symbolName);
            }
            index = findUnescapedSingleColon(token, flags);
            if (index > 0) {
                final String packageName = token.substring(0, index);
                Package pkg = Packages.findPackage(packageName);
                if (pkg == null)
                    return signal(new PackageError("Package \"" + packageName +
                                                   "\" not found."));
                final String symbolName = token.substring(index + 1);
                final SimpleString s = new SimpleString(symbolName);
                Symbol symbol = pkg.findExternalSymbol(s);
                if (symbol != null)
                    return symbol;
                // Error!
                if (pkg.findInternalSymbol(s) != null)
                    return signal(new ReaderError("The symbol \"" + symbolName +
                                                  "\" is not external in package " +
                                                  packageName + '.',
                                                  this));
                else
                    return signal(new ReaderError("The symbol \"" + symbolName +
                                                  "\" was not found in package " +
                                                  packageName + '.',
                                                  this));
            }
        }
        // Intern token in current package.
        return ((Package)_PACKAGE_.symbolValue(thread)).intern(new SimpleString(token));
    }

    private final BitSet _readToken(FastStringBuffer sb, Readtable rt)
        throws ConditionThrowable
    {
        BitSet flags = null;
        final LispObject readtableCase = rt.getReadtableCase();
        if (sb.length() > 0) {
            Debug.assertTrue(sb.length() == 1);
            char c = sb.charAt(0);
            byte syntaxType = rt.getSyntaxType(c);
            if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
                int n = _readChar();
                if (n < 0) {
                    signal(new EndOfFile(this));
                    // Not reached.
                    return flags;
                }
                sb.setCharAt(0, (char) n);
                flags = new BitSet(1);
                flags.set(0);
            } else if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE) {
                sb.setLength(0);
                sb.append(readMultipleEscape(rt));
                flags = new BitSet(sb.length());
                for (int i = sb.length(); i-- > 0;)
                    flags.set(i);
            } else if (rt.isInvalid(c)) {
                rt.checkInvalid(c, this); // Signals a reader-error.
            } else if (readtableCase == Keyword.UPCASE) {
                sb.setCharAt(0, LispCharacter.toUpperCase(c));
            } else if (readtableCase == Keyword.DOWNCASE) {
                sb.setCharAt(0, LispCharacter.toLowerCase(c));
            }
        }
        while (true) {
            int n = _readChar();
            if (n < 0)
                break;
            char c = (char) n;
            if (rt.isWhitespace(c)) {
                _unreadChar(n);
                break;
            }
            byte syntaxType = rt.getSyntaxType(c);
            if (syntaxType == Readtable.SYNTAX_TYPE_TERMINATING_MACRO) {
                _unreadChar(c);
                break;
            }
            rt.checkInvalid(c, this);
            if (syntaxType == Readtable.SYNTAX_TYPE_SINGLE_ESCAPE) {
                n = _readChar();
                if (n < 0)
                    break;
                sb.append((char)n);
                if (flags == null)
                    flags = new BitSet(sb.length());
                flags.set(sb.length() - 1);
                continue;
            }
            if (syntaxType == Readtable.SYNTAX_TYPE_MULTIPLE_ESCAPE) {
                int begin = sb.length();
                sb.append(readMultipleEscape(rt));
                int end = sb.length();
                if (flags == null)
                    flags = new BitSet(sb.length());
                for (int i = begin; i < end; i++)
                    flags.set(i);
                continue;
            }
            if (readtableCase == Keyword.UPCASE)
                c = LispCharacter.toUpperCase(c);
            else if (readtableCase == Keyword.DOWNCASE)
                c = LispCharacter.toLowerCase(c);
            sb.append(c);
        }
        return flags;
    }

    public static final String invert(String s, BitSet flags)
    {
        // Section 23.1.2: "When the readtable case is :INVERT, then if all of
        // the unescaped letters in the extended token are of the same case,
        // those (unescaped) letters are converted to the opposite case."
        final int limit = s.length();
        final int LOWER = 1;
        final int UPPER = 2;
        int state = 0;
        for (int i = 0; i < limit; i++) {
            // We only care about unescaped characters.
            if (flags != null && flags.get(i))
                continue;
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                if (state == LOWER)
                    return s; // Mixed case.
                state = UPPER;
            }
            if (Character.isLowerCase(c)) {
                if (state == UPPER)
                    return s; // Mixed case.
                state = LOWER;
            }
        }
        FastStringBuffer sb = new FastStringBuffer(limit);
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (flags != null && flags.get(i)) // Escaped.
                sb.append(c);
            else if (Character.isUpperCase(c))
                sb.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                sb.append(Character.toUpperCase(c));
            else
                sb.append(c);
        }
        return sb.toString();
    }

    private static final int getReadBase(LispThread thread)
        throws ConditionThrowable
    {
        final int readBase;
        try {
            readBase = ((Fixnum)_READ_BASE_.symbolValue(thread)).value;
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

    private final LispObject makeNumber(String token, int length, int radix)
        throws ConditionThrowable
    {
        if (length == 0)
            return null;
        if (token.indexOf('/') >= 0)
            return makeRatio(token, radix);
        if (token.charAt(length - 1) == '.') {
            radix = 10;
            token = token.substring(0, --length);
        }
        boolean numeric = true;
        if (radix == 10) {
            for (int i = length; i-- > 0;) {
                char c = token.charAt(i);
                if (c < '0' || c > '9') {
                    if (i > 0 || (c != '-' && c != '+')) {
                        numeric = false;
                        break;
                    }
                }
            }
        } else {
            for (int i = length; i-- > 0;) {
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
            return makeFloat(token, length);
        if (token.charAt(0) == '+')
            token = token.substring(1);
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

    private final LispObject makeRatio(String token, int radix)
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
            // Check the denominator here, before calling number(), so we can
            // signal a READER-ERROR, as required by ANSI, instead of DIVISION-
            // BY-ZERO.
            if (denominator.signum() == 0)
                signal(new ReaderError("Division by zero.", this));
            return number(numerator, denominator);
        }
        catch (NumberFormatException e) {
            return null;
        }
    }

    private static final LispObject makeFloat(final String token,
                                              final int length)
        throws ConditionThrowable
    {
        if (length == 0)
            return null;
        FastStringBuffer sb = new FastStringBuffer();
        int i = 0;
        boolean maybe = false;
        char marker = 0;
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
            c = token.charAt(i);
            if ("esfdlESFDL".indexOf(c) >= 0) {
                // Exponent marker.
                maybe = true;
                marker = LispCharacter.toUpperCase(c);
                if (marker == 'S')
                    marker = 'F';
                else if (marker == 'L')
                    marker = 'D';
                else if (marker == 'E') {
                    LispObject format = _READ_DEFAULT_FLOAT_FORMAT_.symbolValue();
                    if (format == Symbol.SINGLE_FLOAT || format == Symbol.SHORT_FLOAT)
                        marker = 'F';
                    else
                        marker = 'D';
                }
                sb.append('E');
                ++i;
            }
        }
        if (!maybe)
            return null;
        // Append rest of token.
        sb.append(token.substring(i));
        try {
            if (marker == 0) {
                LispObject format = _READ_DEFAULT_FLOAT_FORMAT_.symbolValue();
                if (format == Symbol.SINGLE_FLOAT || format == Symbol.SHORT_FLOAT)
                    marker = 'F';
                else
                    marker = 'D';
            }
            if (marker == 'D')
                return new DoubleFloat(Double.parseDouble(sb.toString()));
            else
                return new SingleFloat(Float.parseFloat(sb.toString()));
        }
        catch (NumberFormatException e) {
            return null;
        }
    }

    public LispObject readRadix(int radix) throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer();
        final LispThread thread = LispThread.currentThread();
        final Readtable rt =
            (Readtable) _READTABLE_.symbolValue(thread);
        boolean escaped = (_readToken(sb, rt) != null);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (escaped)
            return signal(new ReaderError("Illegal syntax for number.", this));
        String s = sb.toString();
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

    public LispObject faslReadRadix(int radix) throws ConditionThrowable
    {
        FastStringBuffer sb = new FastStringBuffer();
        final LispThread thread = LispThread.currentThread();
        final Readtable rt = FaslReadtable.getInstance();
        boolean escaped = (_readToken(sb, rt) != null);
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        if (escaped)
            return signal(new ReaderError("Illegal syntax for number.", this));
        String s = sb.toString();
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

    private char flushWhitespace(Readtable rt) throws ConditionThrowable
    {
        while (true) {
            int n = _readChar();
            if (n < 0) {
                signal(new EndOfFile(this));
                // Not reached.
                return 0;
            }
            char c = (char) n;
            if (!rt.isWhitespace(c))
                return c;
        }
    }

    public LispObject readDelimitedList(char delimiter)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        LispObject result = NIL;
        while (true) {
            Readtable rt = (Readtable) _READTABLE_.symbolValue(thread);
            char c = flushWhitespace(rt);
            if (c == delimiter)
                break;
            LispObject obj = processChar(c, rt);
            if (obj != null)
                result = new Cons(obj, result);
        }
        if (_READ_SUPPRESS_.symbolValue(thread) != NIL)
            return NIL;
        else
            return result.nreverse();
    }

    // read-line &optional stream eof-error-p eof-value recursive-p
    // => line, missing-newline-p
    // recursive-p is ignored
    public LispObject readLine(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        final LispThread thread = LispThread.currentThread();
        FastStringBuffer sb = new FastStringBuffer();
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
    public LispObject readChar() throws ConditionThrowable
    {
        int n = _readChar();
        if (n < 0)
            return signal(new EndOfFile(this));
        return LispCharacter.getInstance((char)n);
    }

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
        _unreadChar(c.value);
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
        _writeChar('\n');
        return NIL;
    }

    public LispObject freshLine() throws ConditionThrowable
    {
        if (charPos == 0)
            return NIL;
        _writeChar('\n');
        return T;
    }

    public void print(char c) throws ConditionThrowable
    {
        _writeChar(c);
    }

    // PRIN1 produces output suitable for input to READ.
    // Binds *PRINT-ESCAPE* to true.
    public void prin1(LispObject obj) throws ConditionThrowable
    {
        LispThread thread = LispThread.currentThread();
        SpecialBinding lastSpecialBinding = thread.lastSpecialBinding;
        thread.bindSpecial(_PRINT_ESCAPE_, T);
        try {
            _writeString(obj.writeToString());
        }
        finally {
            thread.lastSpecialBinding = lastSpecialBinding;
        }
    }

    public LispObject listen() throws ConditionThrowable
    {
        return _charReady() ? T : NIL;
    }

    public LispObject fileLength() throws ConditionThrowable
    {
        return signal(new TypeError(this, Symbol.FILE_STREAM));
    }

    public LispObject fileStringLength(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof LispCharacter) {
            if (Utilities.isPlatformWindows) {
                if (((LispCharacter)arg).value == '\n')
                    return Fixnum.TWO;
            }
            return Fixnum.ONE;
        }
        if (arg instanceof AbstractString) {
            if (Utilities.isPlatformWindows) {
                int fileStringLength = 0;
                char[] chars = ((AbstractString)arg).getStringChars();
                for (int i = chars.length; i-- > 0;) {
                    if (chars[i] == '\n')
                        fileStringLength += 2;
                    else
                        ++fileStringLength;
                }
                return number(fileStringLength);

            }
            return number(arg.length());
        }
        return signal(new TypeError(arg.writeToString() +
                                    " is neither a string nor a character."));
    }

    // Returns -1 at end of file.
    protected int _readChar() throws ConditionThrowable
    {
        try {
            int n = reader.read();
            ++offset;
            if (n == '\r') {
                if (interactive && Utilities.isPlatformWindows())
                    return _readChar();
            }
            if (n == '\n')
                ++lineNumber;
            return n;
        }
        catch (NullPointerException e) {
            // reader is null
            streamNotCharacterInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
        // Not reached.
        return -1;
    }

    protected void _unreadChar(int n) throws ConditionThrowable
    {
        try {
            reader.unread(n);
            --offset;
            if (n == '\n')
                --lineNumber;
        }
        catch (NullPointerException e) {
            // reader is null
            streamNotCharacterInputStream();
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
        catch (NullPointerException e) {
            // reader is null
            streamNotCharacterInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
        // Not reached.
        return false;
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
        catch (NullPointerException e) {
            // writer is null
            streamNotCharacterOutputStream();
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
        catch (NullPointerException e) {
            if (writer == null)
                streamNotCharacterOutputStream();
            else
                throw e;
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
        catch (NullPointerException e) {
            if (writer == null)
                streamNotCharacterOutputStream();
            else
                throw e;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        try {
            writer.write(s);
            writer.write('\n');
            writer.flush();
            charPos = 0;
        }
        catch (NullPointerException e) {
            // writer is null
            streamNotCharacterOutputStream();
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
        catch (NullPointerException e) {
            // out is null
            streamNotBinaryOutputStream();
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
            writer.write('\n');
            writer.flush();
            charPos = 0;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    protected LispObject streamNotInputStream() throws ConditionThrowable
    {
        return signal(new StreamError(this, writeToString() + " is not an input stream."));
    }

    protected LispObject streamNotCharacterInputStream() throws ConditionThrowable
    {
        return signal(new StreamError(this, writeToString() + " is not a character input stream."));
    }

    protected LispObject streamNotOutputStream() throws ConditionThrowable
    {
        return signal(new StreamError(this, writeToString() + " is not an output stream."));
    }

    protected LispObject streamNotBinaryOutputStream() throws ConditionThrowable
    {
        return signal(new StreamError(this, writeToString() + " is not a binary output stream."));
    }

    protected LispObject streamNotCharacterOutputStream() throws ConditionThrowable
    {
        return signal(new StreamError(this, writeToString() + " is not a character output stream."));
    }

    // ### file-position
    private static final Primitive FILE_POSITION =
        new Primitive("file-position", "stream &optional position-spec")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            final Stream stream;
            try {
                stream = (Stream) arg;
            }
            catch (ClassCastException e) {
                return signalTypeError(arg, Symbol.STREAM);
            }
            return stream.getFilePosition();
        }
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            final Stream stream;
            try {
                stream = (Stream) first;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.STREAM);
            }
            return stream.setFilePosition(second);
        }
    };

    // ### stream-line-number
    private static final Primitive STREAM_LINE_NUMBER =
        new Primitive("stream-line-number", PACKAGE_SYS, false, "stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkStream(arg);
            return new Fixnum(stream.getLineNumber() + 1);
        }
    };

    // ### stream-offset
    private static final Primitive STREAM_OFFSET =
        new Primitive("stream-offset", PACKAGE_SYS, false, "stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkStream(arg);
            return number(stream.getOffset());
        }
    };

    // ### stream-charpos stream => position
    private static final Primitive STREAM_CHARPOS =
        new Primitive("stream-charpos", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Stream stream = checkCharacterOutputStream(arg);
            return new Fixnum(stream.getCharPos());
        }
    };

    // ### stream-%set-charpos stream newval => newval
    private static final Primitive STREAM_SET_CHARPOS =
        new Primitive("stream-%set-charpos", PACKAGE_SYS, false)
    {
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            Stream stream = checkCharacterOutputStream(first);
            stream.setCharPos(Fixnum.getValue(second));
            return second;
        }
    };
}
