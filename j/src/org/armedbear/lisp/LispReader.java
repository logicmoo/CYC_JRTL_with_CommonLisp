/*
 * LispReader.java
 *
 * Copyright (C) 2002-2003 Peter Graves
 * $Id: LispReader.java,v 1.3 2003-02-14 02:03:58 piso Exp $
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

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.io.StringReader;

// Not to be confused with a real Lisp reader... ;)
public final class LispReader extends Lisp
{
    private final PushbackReader reader;

    private int offset;

    public LispReader(InputStream in)
    {
        reader =
            new PushbackReader(new BufferedReader(new InputStreamReader(in)));
    }

    public LispReader(String s)
    {
        reader = new PushbackReader(new BufferedReader(new StringReader(s)));
    }

    public int getOffset()
    {
        return offset;
    }

    private int read() throws IOException
    {
        int c = reader.read();
        if (c >= 0)
            ++offset;
        return c;
    }

    private void unread(int c) throws IOException
    {
        reader.unread(c);
        --offset;
    }

    private void clearInput() throws LispException
    {
        try {
            while (reader.ready())
                read();
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    // Throws EndOfFileException if the file ends in the middle of an object
    // representation, otherwise returns EOF at end of file.
    public LispObject readObject(boolean recursive) throws LispException
    {
        String token;
        try {
            token = readToken();
        }
        catch (EndOfFileException e) {
            return EOF;
        }
        if (token.equals(",@") || token.equals(",."))
            return new Cons(symbol(token),
                            new Cons(readObject(true), NIL));
        if (token.equals("'") || token.equals("`") || token.equals(","))
            return new Cons(symbol(token),
                            new Cons(readObject(true), NIL));
        if (token.equals("#"))
            return dispatchMacroChar();
        if (token.equals("("))
            return readList();
        if (token.equals(")"))
            throw new LispException("unmatched ')'");
        if (token.equals("\""))
            return readString();
        return makeObject(token);
    }

    // Never returns null.
    public String readLine() throws LispException
    {
        StringBuffer sb = new StringBuffer();
        while (true) {
            try {
                int ch = read();
                if (ch < 0)
                    return sb.toString();
                switch (ch) {
                    case 10:
                    case 13:
                        return sb.toString();
                    default:
                        sb.append((char)ch);
                }
            }
            catch (IOException e) {
                throw new StreamError(e);
            }
        }
    }

    private String readToken() throws LispException
    {
        while (true) {
            try {
                char c;
                do {
                    int ch = read();
                    if (ch < 0)
                        throw new EndOfFileException();
                    c = (char) ch;
                } while (Character.isWhitespace(c));
                if (c == ';') {
                    skipComment();
                    continue;
                }
                switch (c) {
                    case '(':
                        return "(";
                    case ')':
                        return ")";
                    case '\'':
                        return "'";
                    case '`':
                        return "`";
                    case ',': {
                        int ch = read();
                        if (ch < 0)
                            throw new EndOfFileException();
                        c = (char) ch;
                        if (c == '@')
                            return ",@";
                        if (c == '.')
                            return ",.";
                        unread(c);
                        return ",";
                    }
                    case '@':
                        return "@";
                    case '"':
                        return "\"";
                    case '#':
                        return "#";
                    default:
                        return gatherToken(c);
                }
            }
            catch (IOException e) {
                throw new StreamError(e);
            }
        }
    }

    private LispObject dispatchMacroChar() throws LispException
    {
        int ch;
        try {
            ch = read();
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
        if (ch < 0)
            throw new EndOfFileException();
        char c = (char) ch;
        switch (c) {
            case '\'':
                return new Cons(Symbol.FUNCTION,
                                new Cons(readObject(true), NIL));
            case '(':
                return new Vector(readList());
            case '\\':
                return readChar();
            case '+':
            case '-':
                return handleFeature(c);
            case ':':
                return readUninternedSymbol();
            case '|':
                skipBalancedComment();
                return readObject(true);
            default:
                clearInput();
                throw new LispException("unsupported '#' macro character '" +
                                        (char) ch + '\'');
        }
    }

    // FIXME
    private LispObject handleFeature(char c) throws LispException
    {
        LispObject feature = readObject(true);
        LispObject form = readObject(true);
        if (feature instanceof Symbol) {
            if (((Symbol)feature).getName().equalsIgnoreCase("armedbear")) {
                if (c == '+')
                    return form;
                else
                    return readObject(true);
            } else {
                if (c == '+')
                    return readObject(true);
                else
                    return form;
            }
        }
        Debug.assertTrue(false);
        return NIL;
    }

    private LispObject readUninternedSymbol() throws LispException
    {
        return new Symbol(readToken());
    }

    private void skipComment() throws StreamError
    {
        try {
            while (true) {
                int c = read();
                if (c < 0)
                    return;
                if (c == '\n')
                    return;
            }
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    private void skipBalancedComment() throws StreamError
    {
        try {
            while (true) {
                int c = read();
                if (c < 0)
                    return;
                if (c == '|') {
                    c = read();
                    if (c == '#')
                        return;
                } else if (c == '#') {
                    c = read();
                    if (c == '|')
                        skipBalancedComment(); // Nested comment. Recurse!
                }
            }
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    private String gatherToken(char initialChar) throws StreamError
    {
        return _gatherToken(initialChar).toUpperCase();
    }

    private String _gatherToken(char initialChar) throws StreamError
    {
        try {
            StringBuffer sb = new StringBuffer();
            sb.append(initialChar);
            while (true) {
                int ch = read();
                if (ch < 0)
                    break;
                char c = (char) ch;
                if (Character.isWhitespace(c))
                    return sb.toString();
                switch (c) {
                    case '(':
                    case ')':
                        unread(c);
                        return sb.toString();
                    default:
                        sb.append(c);
                }
            }
            return sb.toString();
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    private LispObject makeObject(String token) throws LispException
    {
        char c = token.charAt(0);
        if (c == '-' || Character.isDigit(token.charAt(0))) {
            try {
                return new Fixnum(Integer.parseInt(token));
            }
            catch (NumberFormatException e) {
                // Fall through...
            }
        }
        if (token.equals("T"))
            return T;
        if (token.equals("NIL"))
            return NIL;
        if (c == ':') {
            Symbol symbol = intern(token.substring(1), PACKAGE_KEYWORD);
            symbol.setSymbolValue(symbol);
            symbol.setConstant(true);
            symbol.setExternal(true);
            return symbol;
        }
        int index = token.indexOf("::");
        if (index > 0) {
            String packageName = token.substring(0, index);
            String symbolName = token.substring(index + 2);
            Package pkg = Packages.findPackage(packageName);
            if (pkg == null)
                throw new LispException("package \"" + packageName +
                    "\" not found");
            return intern(symbolName, pkg);
        }
        index = token.indexOf(':');
        if (index > 0) {
            String packageName = token.substring(0, index);
            String symbolName = token.substring(index + 1);
            Package pkg = Packages.findPackage(packageName);
            if (pkg == null)
                throw new LispException("package \"" + packageName +
                    "\" not found");
            Symbol symbol = pkg.findSymbol(symbolName);
            if (symbol == null)
                throw new LispException("symbol \"" + symbolName +
                    "\" not found in package " + packageName);
            if (!symbol.isExternal())
                throw new LispException("symbol \"" + symbolName +
                    "\" is not external in package " + packageName);
            return symbol;
        }
        return intern(token, getCurrentPackage());
    }

    private LispObject readList() throws LispException
    {
        Cons first = null;
        Cons last = null;
        while (true) {
            String token = readToken();
            if (token.equals(")"))
                return first == null ? NIL : first;
            if (token.equals(".")) {
                LispObject obj = readObject(true);
                last.setCdr(obj);
                continue;
            }
            LispObject obj = null;
            if (token.equals(",@") || token.equals(",."))
                obj = new Cons(symbol(token),
                               new Cons(readObject(true), NIL));
            else if (token.equals("'") || token.equals("`") || token.equals(","))
                obj = new Cons(symbol(token),
                               new Cons(readObject(true), NIL));
            else if (token.equals("#"))
                obj = dispatchMacroChar();
            else if (token.equals("("))
                obj = readList();
            else if (token.equals("\""))
                obj = readString();
            else
                obj = makeObject(token);
            if (obj != null) {
                if (first == null) {
                    first = new Cons(obj, NIL);
                    last = first;
                } else {
                    last.setCdr(new Cons(obj, NIL));
                    last = (Cons) last.cdr();
                }
            } else
                Debug.assertTrue(false);
        }
    }

    // We've just read the opening quote char.
    private LispObject readString() throws LispException
    {
        try {
            StringBuffer sb = new StringBuffer();
            while (true) {
                int ch = read();
                if (ch < 0)
                    throw new EndOfFileException();
                char c = (char) ch;
                if (c == '\\') {
                    // Single escape.
                    ch = read();
                    if (ch < 0)
                        throw new EndOfFileException();
                    sb.append((char)ch);
                    continue;
                }
                if (c == '"')
                    break;
                // Default.
                sb.append(c);
            }
            return new LispString(sb.toString());
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    // We've just read "#\".
    private LispObject readChar() throws LispException
    {
        try {
            int ch = read();
            if (ch < 0)
                throw new EndOfFileException();
            char c = (char) ch;
            String token = _gatherToken(c);
            if (token.length() == 1)
                return new LispCharacter(token.charAt(0));
            String lower = token.toLowerCase();
            if (lower.equals("tab"))
                return new LispCharacter('\t');
            if (lower.equals("linefeed"))
                return new LispCharacter('\n');
            if (lower.equals("newline"))
                return new LispCharacter('\n');
            if (lower.equals("page"))
                return new LispCharacter('\f');
            if (lower.equals("return"))
                return new LispCharacter('\r');
            if (lower.equals("space"))
                return new LispCharacter(' ');
            throw new LispException("bad character");
        }
        catch (IOException e) {
            throw new StreamError(e);
        }
    }

    private static Symbol symbol(String token) throws LispException
    {
        if (token.equals("'"))
            return Symbol.QUOTE;
        if (token.equals("`"))
            return Symbol.BACKQUOTE;
        if (token.equals(","))
            return Symbol.COMMA;
        if (token.equals(",@"))
            return Symbol.COMMA_ATSIGN;
        if (token.equals(",."))
            return Symbol.COMMA_DOT;
        throw new LispException("internal error");
    }
}
