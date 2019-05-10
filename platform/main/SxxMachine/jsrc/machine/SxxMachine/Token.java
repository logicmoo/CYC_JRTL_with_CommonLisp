package SxxMachine;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.PushbackReader;

/**
 * The <code>Token</code> class contains methods for character input/output.<br>
 * <font color="red">This document is under construction.</font>
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.2.5
 */
public class Token {
    public static final int TOKEN_ERROR = -2;
    public static final int TOKEN_END_OF_FILE = -1;
    public static final int TOKEN_INTEGER = 'I';
    public static final int TOKEN_LONG = 'L';
    public static final int TOKEN_DOUBLE = 'D';
    public static final int TOKEN_ATOM = 'A';
    public static final int TOKEN_VARIABLE = 'V';
    public static final int TOKEN_STRING = 'S';
    public static final int TOKEN_CHAR = '\'';

    public static boolean isSolo(int c) {
        return (c == '!' || c == ';');
    }

    public static boolean isSymbol(int c) {
        switch (c) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '\\':
            case '^':
            case '<':
            case '>':
            case '=':
            case '`':
            case '~':
            case ':':
            case '.':
            case '?':
            case '@':
            case '#':
            case '$':
            case '&':
                return true;
            default:
                return false;
        }
    }

    /*
     * public static int read_token(StringBuffer s, PushbackReader in) This method
     * reads one token from the input "in", sets the string, and returns the token
     * type. Type String -2 "error message" -1 "end_of_file" '.' "." full stop ' '
     * " " space or comment or unknown chars ',' "," '(' "(" ')' ")" '[' "[" ']' "]"
     * '{' "{" '}' "}" ',' "," '|' "|" 'I' "decimal" positive integer 'L' "decimal"
     * positive long 'D' "decimal" positive double 'A' "atom name" 'V'
     * "variable name" 'S' "string"
     */
    public static int read_token(StringBuilder s, PushbackReader in) throws IOException {
        int c, c1;
        int rc;
        c = in.read(); // get 1st. char
        if (c == -1) {
            s.append("end_of_file");
            return TOKEN_END_OF_FILE;
        }
        if (Character.isDigit((char) c)) {
            return read_number(c, s, in);
        }
        if (Character.isLowerCase((char) c)) {
            rc = read_word(c, s, in);
            if (rc > 0)
                rc = 'A';
            return rc;
        }
        if (Character.isUpperCase((char) c) || c == '_') {
            rc = read_word(c, s, in);
            if (rc > 0)
                rc = 'V';
            return rc;
        }
        switch (c) {
            case '(':
            case ')':
            case '[':
            case ']':
            case '{':
            case '}':
            case ',':
            case '|':
                s.append((char) c);
                return c;
            case '.': /* full stop or symbol */
                c1 = in.read();
                if (c1 == -1 || c1 <= ' ') {
                    s.append(".");
                    return '.';
                }
                in.unread(c1);
                break;
            case '%': /* one line comment */
                s.append(" ");
                while ((c1 = in.read()) != '\n') {
                    if (c1 == -1)
                        return ' ';
                }
                return ' ';
            case '/': /* start of comment or symbol */
                if ((c1 = in.read()) == '*') {
                    s.append(" ");
                    while (true) {
                        while ((c1 = in.read()) != '*') {
                            if (c1 == -1) {
                                s.append("unexpected end_of_file");
                                return -2;
                            }
                        }
                        if ((c1 = in.read()) == '/')
                            return ' ';
                        in.unread(c1);
                    }
                }
                in.unread(c1);
                break;
            case '\'':
                rc = read_quoted(c, s, in);
                if (rc > 0)
                    rc = 'A';
                return rc;
            case '"':
                rc = read_quoted(c, s, in);
                if (rc > 0)
                    rc = 'S';
                return rc;
            case '-':
                // need special handling for Integer.MIN_VALUE - it must be returned with the
                // sign symbol,
                // otherwise Integer.parseInt() will fail to parse it
                c1 = in.read();
                StringBuilder s1 = new StringBuilder("-");
                if (Character.isDigit((char) c1)) {
                    // potential match, have to read whole number
                    rc = read_number(c1, s1, in);
                    try {
                        if (rc == TOKEN_INTEGER && Integer.parseInt(s1.toString()) == Integer.MIN_VALUE) {
                            s.append(s1);
                            return TOKEN_INTEGER;
                        }
                        if (rc == TOKEN_LONG && Long.parseLong(s1.toString()) == Long.MIN_VALUE) {
                            s.append(s1);
                            return TOKEN_LONG;
                        }
                        if (rc == TOKEN_CHAR && Long.parseLong(s1.toString()) == Long.MIN_VALUE) {
                            s.append(s1);
                            return TOKEN_LONG;
                        }
                    } catch (Exception e) {
                        // ignore and unread the number and handle minus and number separately
                    }
                } else {
                    s1.append((char) c1); // append for subsequent unread
                }
                // unread s1 except first character in it
                char[] cbuf = new char[s1.length() - 1];
                s1.getChars(1, s1.length(), cbuf, 0);
                in.unread(cbuf);
                rc = read_symbol(c, s, in);
                if (rc > 0) {
                    rc = 'A';
                }
                return rc;
            default:
                break;
        }
        if (isSolo(c)) {
            s.append((char) c);
            return 'A';
        }
        if (isSymbol(c)) {
            rc = read_symbol(c, s, in);
            if (rc > 0)
                rc = 'A';
            return rc;
        }
        s.append(" ");
        return ' ';
    }

    /**
     *
     * @param c
     * @param s
     * @param in
     * @return {@link Token#TOKEN_INTEGER} or {@link Token#TOKEN_LONG} or
     *         {@link Token#TOKEN_DOUBLE}
     * @throws IOException
     */
    public static int read_number(int c, StringBuilder s, PushbackReader in) throws IOException {
        int c1, c2, c3;
        in.unread(c);
        for (c1 = in.read(); Character.isDigit((char) c1); c1 = in.read()) {
            s.append((char) c1);
        }
        if (c1 == 'L') {
            return TOKEN_LONG;
        }
        if (c1 == '\'') {
            s.delete(0, s.length());
            c1 = in.read();
            s.append((char) c1);
            return TOKEN_CHAR;
        }
        if (c1 != '.') {
            in.unread(c1);
            return number_type(s);
        }
        c2 = in.read();
        if (!Character.isDigit((char) c2)) {
            in.unread(c2);
            in.unread(c1);
            return number_type(s);
        }
        s.append((char) c1);
        in.unread(c2);
        for (c1 = in.read(); Character.isDigit((char) c1); c1 = in.read()) {
            s.append((char) c1);
        }
        // in.unread(c1);
        // return 2;
        if (c1 != 'E' && c1 != 'e') {
            in.unread(c1);
            return TOKEN_DOUBLE;
        }
        c2 = in.read();
        if (c2 == '-' || c2 == '+') {
            c3 = in.read();
            if (!Character.isDigit((char) c3)) {
                in.unread(c3);
                in.unread(c2);
                in.unread(c1);
                return TOKEN_DOUBLE;
            }
            s.append((char) c1);
            s.append((char) c2);
            in.unread(c3);
        } else if (Character.isDigit((char) c2)) {
            s.append((char) c1);
            in.unread(c2);
        } else {
            in.unread(c2);
            in.unread(c1);
            return TOKEN_DOUBLE;
        }
        for (c1 = in.read(); Character.isDigit((char) c1); c1 = in.read()) {
            s.append((char) c1);
        }
        in.unread(c1);
        return TOKEN_DOUBLE;
    }

    private static int number_type(StringBuilder s) {
        int length = s.length();
        if (length < 10) {
            return TOKEN_INTEGER;
        } else if (length > 10) {
            return TOKEN_LONG;
        }
        try {
            Integer.parseInt(s.toString());
            return TOKEN_INTEGER;
        } catch (NumberFormatException e) {
            return TOKEN_LONG;
        }
    }

    public static int read_word(int c, StringBuilder s, PushbackReader in) throws IOException {
        int c1;
        in.unread(c);
        for (;;) {
            c1 = in.read();
            if (!Character.isLetterOrDigit((char) c1) && c1 != '_')
                break;
            s.append((char) c1);
        }
        in.unread(c1);
        return 1;
    }

    public static int read_quoted(int quote, StringBuilder s, PushbackReader in) throws IOException {
        int rc;
        int c1;
        for (;;) {
            c1 = in.read();
            if (c1 == -1 || c1 == '\n') {
                in.unread(c1);
                return -2;
            } else if (c1 == quote) {
                c1 = in.read();
                if (c1 != quote) {
                    in.unread(c1);
                    return 1;
                }
                c1 = quote;
            } else if (c1 == '\\') {
                rc = escapeSequences(c1, s, in);
                if (rc > 0)
                    continue;
                else
                    return -2;
            }
            s.append((char) c1);
        }
    }

    /**
     * @param backslash
     */
    public static int escapeSequences(int backslash, StringBuilder s, PushbackReader in) throws IOException {
        int c;
        c = in.read();
        switch (c) {
            case 'b': // backspace
                s.append((char) 8);
                break;
            case 't': // horizontal tab
                s.append((char) 9);
                break;
            case 'n': // newline
                s.append((char) 10);
                break;
            case 'v': // vertical tab
                s.append((char) 11);
                break;
            case 'f': // form feed
                s.append((char) 12);
                break;
            case 'r': // carriage return
                s.append((char) 13);
                break;
            case 'e': // escape
                s.append((char) 27);
                break;
            case 'd': // delete
                s.append((char) 127);
                break;
            case 'a': // alarm
                s.append((char) 7);
                break;
            default:
                s.append((char) c);
                return 2;
        }
        return 1;
    }

    public static int read_symbol(int c, StringBuilder s, PushbackReader in) throws IOException {
        int c1;
        s.append((char) c);
        // in.unread(c);
        for (;;) {
            c1 = in.read();
            if (!isSymbol(c1))
                break;
            s.append((char) c1);
        }
        in.unread(c1);
        return 1;
    }

    /* Write */
    public static void write_string(String s, PrintWriter out) {
        out.print(s);
    }

    public static void writeq_string(String s, PrintWriter out) {
        char[] ch;
        ch = s.toCharArray();
        if ((getStringType(s) == 3)) {
            out.print("\'");
            for (char aCh : ch) {
                if (aCh == '\'')
                    out.print("\\\'");
                else if (aCh == '\\')
                    out.print("\\\\");
                else if (aCh == 8) // backspace
                    out.print("\\b");
                else if (aCh == 9) // horizontal tab
                    out.print("\\t");
                else if (aCh == 10) // newline
                    out.print("\\n");
                else if (aCh == 11) // vertical tab
                    out.print("\\v");
                else if (aCh == 12) // form feed
                    out.print("\\f");
                else if (aCh == 13) // carriage return
                    out.print("\\r");
                else if (aCh == 27) // escape
                    out.print("\\e");
                else if (aCh == 127) // delete
                    out.print("\\d");
                else if (aCh == 7) // alarm
                    out.print("\\a");
                else
                    out.print(aCh);
            }
            out.print("\'");
        } else {
            write_string(s, out);
        }
    }

    public static String toQuotedString(String s) {
        int st = getStringType(s);
        if (st == 0)
            return s;
        if ((st == 3)) {
            StringBuilder quoted = new StringBuilder(s.length() * 2);
            // char[] ch = s.toCharArray();
            quoted.append("\'");
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c == '\'')
                    quoted.append("\\\'");
                else if (c == '\\')
                    quoted.append("\\\\");
                else if (c == 8) // backspace
                    quoted.append("\\b");
                else if (c == 9) // horizontal tab
                    quoted.append("\\t");
                else if (c == 10) // newline
                    quoted.append("\\n");
                else if (c == 11) // vertical tab
                    quoted.append("\\v");
                else if (c == 12) // form feed
                    quoted.append("\\f");
                else if (c == 13) // carriage return
                    quoted.append("\\r");
                else if (c == 27) // escape
                    quoted.append("\\e");
                else if (c == 127) // delete
                    quoted.append("\\d");
                else if (c == 7) // alarm
                    quoted.append("\\a");
                else
                    quoted.append(c);
            }
            quoted.append("\'");
            return quoted.toString();
        } else {
            return s;
        }
    }

    public static void toQuotedString(String s, StringBuilder quoted) {
        if ((getStringType(s) == 3)) {
            quoted.append("\'");
            int len = s.length();
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c == '\'')
                    quoted.append("\\\'");
                else if (c == '\\')
                    quoted.append("\\\\");
                else if (c == 8) // backspace
                    quoted.append("\\b");
                else if (c == 9) // horizontal tab
                    quoted.append("\\t");
                else if (c == 10) // newline
                    quoted.append("\\n");
                else if (c == 11) // vertical tab
                    quoted.append("\\v");
                else if (c == 12) // form feed
                    quoted.append("\\f");
                else if (c == 13) // carriage return
                    quoted.append("\\r");
                else if (c == 27) // escape
                    quoted.append("\\e");
                else if (c == 127) // delete
                    quoted.append("\\d");
                else if (c == 7) // alarm
                    quoted.append("\\a");
                else
                    quoted.append(c);
            }
            quoted.append("\'");
        } else {
            quoted.append(s);
        }
    }

    /*
     * return value: 0 : if string is a lower case alphnum 1 : if string is a symbol
     * 2 : if string is a solo 3 : others
     */
    public static int getStringType(String s) {
        if (s.equals("[]") || s.equals("{}"))
            return 0;
        if (s.equals("") || s.equals("."))
            return 3;
        if (s.equals("!") || s.equals(";"))
            return 2;
        char p = s.charAt(0);
        int len = s.length();
        if (Character.isLowerCase(p)) {
            for (int i = 1; i < len; i++) {
                p = s.charAt(i);
                if (!Character.isLetterOrDigit(p) && p != '_')
                    return 3;
            }
            return 0;
        }
        if (isSymbol(s.charAt(0))) {
            for (int i = 1; i < len; i++) {
                p = s.charAt(i);
                if (!isSymbol(p))
                    return 3;
            }
            return 1;
        }
        return 3;
    }
}
