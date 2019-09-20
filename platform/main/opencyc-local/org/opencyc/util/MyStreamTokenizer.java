package org.opencyc.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MyStreamTokenizer
{
    private Reader reader;
    private InputStream input;
    private char[] buf;
    private int peekc;
    private static final int NEED_CHAR = Integer.MAX_VALUE;
    private static final int SKIP_LF = 2147483646;
    private boolean pushedBack;
    private boolean forceLower;
    private int LINENO;
    private boolean eolIsSignificantP;
    private boolean slashSlashCommentsP;
    private boolean slashStarCommentsP;
    private byte[] ctype;
    private static final byte CT_WHITESPACE = 1;
    private static final byte CT_DIGIT = 2;
    private static final byte CT_ALPHA = 4;
    private static final byte CT_QUOTE = 8;
    private static final byte CT_COMMENT = 16;
    public int ttype;
    public static final int TT_EOF = -1;
    public static final int TT_EOL = 10;
    public static final int TT_NUMBER = -2;
    public static final int TT_WORD = -3;
    private static final int TT_NOTHING = -4;
    public String sval;
    public double nval;
    
    private MyStreamTokenizer() {
        this.reader = null;
        this.input = null;
        this.buf = new char[20];
        this.peekc = Integer.MAX_VALUE;
        this.LINENO = 1;
        this.eolIsSignificantP = false;
        this.slashSlashCommentsP = false;
        this.slashStarCommentsP = false;
        this.ctype = new byte[256];
        this.ttype = -4;
        this.wordChars(97, 122);
        this.wordChars(65, 90);
        this.wordChars(160, 255);
        this.whitespaceChars(0, 32);
        this.commentChar(47);
        this.quoteChar(34);
        this.quoteChar(39);
        this.parseNumbers();
    }
    
    public MyStreamTokenizer(final InputStream is) {
        this();
        if (is == null) {
            throw new NullPointerException();
        }
        this.input = is;
    }
    
    public MyStreamTokenizer(final Reader r) {
        this();
        if (r == null) {
            throw new NullPointerException();
        }
        this.reader = r;
    }
    
    public void resetSyntax() {
        int i = this.ctype.length;
        while (--i >= 0) {
            this.ctype[i] = 0;
        }
    }
    
    public void wordChars(int low, int hi) {
        if (low < 0) {
            low = 0;
        }
        if (hi >= this.ctype.length) {
            hi = this.ctype.length - 1;
        }
        while (low <= hi) {
            final byte[] ctype = this.ctype;
            final int n = low++;
            ctype[n] |= 0x4;
        }
    }
    
    public void whitespaceChars(int low, int hi) {
        if (low < 0) {
            low = 0;
        }
        if (hi >= this.ctype.length) {
            hi = this.ctype.length - 1;
        }
        while (low <= hi) {
            this.ctype[low++] = 1;
        }
    }
    
    public void ordinaryChars(int low, int hi) {
        if (low < 0) {
            low = 0;
        }
        if (hi >= this.ctype.length) {
            hi = this.ctype.length - 1;
        }
        while (low <= hi) {
            this.ctype[low++] = 0;
        }
    }
    
    public void ordinaryChar(final int ch) {
        if (ch >= 0 && ch < this.ctype.length) {
            this.ctype[ch] = 0;
        }
    }
    
    public void commentChar(final int ch) {
        if (ch >= 0 && ch < this.ctype.length) {
            this.ctype[ch] = 16;
        }
    }
    
    public void quoteChar(final int ch) {
        if (ch >= 0 && ch < this.ctype.length) {
            this.ctype[ch] = 8;
        }
    }
    
    public void parseNumbers() {
        for (int i = 48; i <= 57; ++i) {
            final byte[] ctype = this.ctype;
            final int n = i;
            ctype[n] |= 0x2;
        }
        final byte[] ctype2 = this.ctype;
        final int n2 = 46;
        ctype2[n2] |= 0x2;
        final byte[] ctype3 = this.ctype;
        final int n3 = 45;
        ctype3[n3] |= 0x2;
    }
    
    public void eolIsSignificant(final boolean flag) {
        this.eolIsSignificantP = flag;
    }
    
    public void slashStarComments(final boolean flag) {
        this.slashStarCommentsP = flag;
    }
    
    public void slashSlashComments(final boolean flag) {
        this.slashSlashCommentsP = flag;
    }
    
    public void lowerCaseMode(final boolean fl) {
        this.forceLower = fl;
    }
    
    private int read() throws IOException {
        if (this.reader != null) {
            return this.reader.read();
        }
        if (this.input != null) {
            return this.input.read();
        }
        throw new IllegalStateException();
    }
    
    public int nextToken() throws IOException {
        if (this.pushedBack) {
            this.pushedBack = false;
            return this.ttype;
        }
        final byte[] ct = this.ctype;
        this.sval = null;
        int c = this.peekc;
        if (c < 0) {
            c = Integer.MAX_VALUE;
        }
        if (c == 2147483646) {
            c = this.read();
            if (c < 0) {
                return this.ttype = -1;
            }
            if (c == 10) {
                c = Integer.MAX_VALUE;
            }
        }
        if (c == Integer.MAX_VALUE) {
            c = this.read();
            if (c < 0) {
                return this.ttype = -1;
            }
        }
        this.ttype = c;
        this.peekc = Integer.MAX_VALUE;
        int ctype;
        for (ctype = ((c < 256) ? ct[c] : 4); (ctype & 0x1) != 0x0; ctype = ((c < 256) ? ct[c] : 4)) {
            if (c == 13) {
                ++this.LINENO;
                if (this.eolIsSignificantP) {
                    this.peekc = 2147483646;
                    return this.ttype = 10;
                }
                c = this.read();
                if (c == 10) {
                    c = this.read();
                }
            }
            else {
                if (c == 10) {
                    ++this.LINENO;
                    if (this.eolIsSignificantP) {
                        return this.ttype = 10;
                    }
                }
                c = this.read();
            }
            if (c < 0) {
                return this.ttype = -1;
            }
        }
        if ((ctype & 0x2) != 0x0) {
            boolean neg = false;
            if (c == 45) {
                c = this.read();
                if (c != 46 && (c < 48 || c > 57)) {
                    this.peekc = c;
                    return this.ttype = 45;
                }
                neg = true;
            }
            double v = 0.0;
            int decexp = 0;
            int seendot = 0;
            while (true) {
                if (c == 46 && seendot == 0) {
                    seendot = 1;
                }
                else {
                    if (48 > c || c > 57) {
                        break;
                    }
                    v = v * 10.0 + (c - 48);
                    decexp += seendot;
                }
                c = this.read();
            }
            this.peekc = c;
            if (decexp != 0) {
                double denom = 10.0;
                --decexp;
                while (decexp > 0) {
                    denom *= 10.0;
                    --decexp;
                }
                v /= denom;
            }
            this.nval = (neg ? (-v) : v);
            return this.ttype = -2;
        }
        if ((ctype & 0x4) != 0x0) {
            int i = 0;
            do {
                if (i >= this.buf.length) {
                    final char[] nb = new char[this.buf.length * 2];
                    System.arraycopy(this.buf, 0, nb, 0, this.buf.length);
                    this.buf = nb;
                }
                this.buf[i++] = (char)c;
                c = this.read();
                ctype = ((c < 0) ? 1 : ((c < 256) ? ct[c] : 4));
            } while ((ctype & 0x6) != 0x0);
            this.peekc = c;
            this.sval = String.copyValueOf(this.buf, 0, i);
            if (this.forceLower) {
                this.sval = this.sval.toLowerCase();
            }
            return this.ttype = -3;
        }
        if ((ctype & 0x8) != 0x0) {
            this.ttype = c;
            int i = 0;
            int d = this.read();
            while (d >= 0 && d != this.ttype) {
                if (d == 92) {
                    final int first;
                    c = (first = this.read());
                    if (c >= 48 && c <= 55) {
                        c -= 48;
                        int c2 = this.read();
                        if (48 <= c2 && c2 <= 55) {
                            c = (c << 3) + (c2 - 48);
                            c2 = this.read();
                            if (48 <= c2 && c2 <= 55 && first <= 51) {
                                c = (c << 3) + (c2 - 48);
                                d = this.read();
                            }
                            else {
                                d = c2;
                            }
                        }
                        else {
                            d = c2;
                        }
                    }
                    else {
                        switch (c) {
                            case 97: {
                                c = 7;
                                break;
                            }
                            case 98: {
                                c = 8;
                                break;
                            }
                            case 102: {
                                c = 12;
                                break;
                            }
                            case 110: {
                                c = 10;
                                break;
                            }
                            case 114: {
                                c = 13;
                                break;
                            }
                            case 116: {
                                c = 9;
                                break;
                            }
                            case 118: {
                                c = 11;
                                break;
                            }
                        }
                        d = this.read();
                    }
                }
                else {
                    c = d;
                    d = this.read();
                }
                if (i >= this.buf.length) {
                    final char[] nb2 = new char[this.buf.length * 2];
                    System.arraycopy(this.buf, 0, nb2, 0, this.buf.length);
                    this.buf = nb2;
                }
                this.buf[i++] = (char)c;
            }
            this.peekc = ((d == this.ttype) ? Integer.MAX_VALUE : d);
            this.sval = String.copyValueOf(this.buf, 0, i);
            return this.ttype;
        }
        if (c == 47 && (this.slashSlashCommentsP || this.slashStarCommentsP)) {
            c = this.read();
            if (c == 42 && this.slashStarCommentsP) {
                for (int prevc = 0; (c = this.read()) != 47 || prevc != 42; prevc = c) {
                    if (c == 13) {
                        ++this.LINENO;
                        c = this.read();
                        if (c == 10) {
                            c = this.read();
                        }
                    }
                    else if (c == 10) {
                        ++this.LINENO;
                        c = this.read();
                    }
                    if (c < 0) {
                        return this.ttype = -1;
                    }
                }
                return this.nextToken();
            }
            if (c == 47 && this.slashSlashCommentsP) {
                while ((c = this.read()) != 10 && c != 13 && c >= 0) {}
                this.peekc = c;
                return this.nextToken();
            }
            if ((ct[47] & 0x10) != 0x0) {
                while ((c = this.read()) != 10 && c != 13 && c >= 0) {}
                this.peekc = c;
                return this.nextToken();
            }
            this.peekc = c;
            return this.ttype = 47;
        }
        else {
            if ((ctype & 0x10) != 0x0) {
                while ((c = this.read()) != 10 && c != 13 && c >= 0) {}
                this.peekc = c;
                return this.nextToken();
            }
            return this.ttype = c;
        }
    }
    
    public void pushBack() {
        if (this.ttype != -4) {
            this.pushedBack = true;
        }
    }
    
    public int lineno() {
        return this.LINENO;
    }
    
    @Override
    public String toString() {
        String ret = null;
        switch (this.ttype) {
            case -1: {
                ret = "EOF";
                break;
            }
            case 10: {
                ret = "EOL";
                break;
            }
            case -3: {
                ret = this.sval;
                break;
            }
            case -2: {
                ret = "n=" + this.nval;
                break;
            }
            case -4: {
                ret = "NOTHING";
                break;
            }
            default: {
                if (this.ttype < 256 && (this.ctype[this.ttype] & 0x8) != 0x0) {
                    ret = this.sval;
                    break;
                }
                final char[] s = new char[3];
                s[0] = (s[2] = '\'');
                s[1] = (char)this.ttype;
                ret = new String(s);
                break;
            }
        }
        return "Token[" + ret + "], line " + this.LINENO;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 149 ms
	
	Decompiled with Procyon 0.5.32.
*/