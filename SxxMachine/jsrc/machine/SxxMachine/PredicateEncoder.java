package SxxMachine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The <code>PredicateEncoder</code> class contains static methods for encoding
 * predicate names.<br>
 * The predicate with <code>hoge:f/n</code> is encoded to
 * <code>hoge.PRED_f_n</code>, where <code>hoge</code> is package name,
 * <code>f</code> is predicate name, and <code>n</code> is arity.<br>
 *
 * When encoding a predicate name, we apply the following rules:<br>
 * <ul>
 * <li>The alphanumeric characters &ldquo;<code>a</code>&rdquo; through
 * &ldquo;<code>z</code>&rdquo;, &ldquo;<code>A</code>&rdquo; through
 * &ldquo;<code>Z</code>&rdquo; and &ldquo;<code>0</code>&rdquo; through
 * &ldquo;<code>9</code>&rdquo; remain the same.
 * <li>The special characters &ldquo;<code>_</code>&rdquo; and
 * &ldquo;<code>$</code>&rdquo; remain the same.
 * <li>All other characters are first converted into a list of character codes.
 * Then each character code is represented by the 5-character string
 * &ldquo;<code>$XYZW</code>&rdquo;, where <code>XYZW</code> is the four-digit
 * hexadecimal representation of the character code.
 * </ul>
 *
 * For example, a predicate with <code>hoge:(=..)/2</code> is encoded to
 * <code>hoge.PRED_$003D$002E$002E_2</code>.
 *
 * @author Mutsunori Banbara (banbara@kobe-u.ac.jp)
 * @author Naoyuki Tamura (tamura@kobe-u.ac.jp)
 * @version 1.1
 */
public class PredicateEncoder {
    /**
     * Returns a string representation of class for the predicate with the given
     * arguments.
     *
     * @param pkg
     *            package name
     * @param functor
     *            predicate name
     * @param arity
     *            predicate arity
     * @return a string representation of class for the predicate that corresponds
     *         to <code>pkg:functor/arity</code>.
     */

    public static String encode(String pkg, String functor, int arity) {
        char[] x = functor.toCharArray();
        StringBuilder sb = new StringBuilder(pkg == null ? 0 : pkg.length() + x.length * 5 + 10);
        sb.append("PRED_");
        int i = 0;
        int s = i;
        while (i < x.length) {
            if (!((x[i] >= 'a' && x[i] <= 'z') || (x[i] >= 'A' && x[i] <= 'Z') || (x[i] >= '0' && x[i] <= '9')
                    || x[i] == '_' || x[i] == '$')) {
                sb.append(x, s, i - s);
                String hex = Long.toHexString(x[i]).toUpperCase();
                int hl = hex.length();
                if (hl > 7) {
                    hex = hex.substring(4, 8);
                } else
                    while (hl < 4) {
                        hex = "0" + hex;
                        hl++;
                    }
                sb.append('$').append(hex);
                s = i + 1;
            }
            i++;
        }
        if (s < x.length) {
            sb.append(x, s, x.length - s);
        }
        sb.append('_').append(arity);

        if (pkg != null) {
            if (!pkg.endsWith("$"))
                pkg += ".";
        } else {
            pkg = "";
        }
        return pkg + sb.toString();
    }

    public static String decodeFunctor_2(String className) {
        // Remove the Java package name, if present.
        int dot = className.lastIndexOf('.');
        if (0 < dot)
            className = className.substring(dot + 1);

        // Trim the common PRED_ prefix.
        if (className.startsWith("PRED_"))
            className = className.substring("PRED_".length());

        // Drop the arity from the end.
        int us = className.lastIndexOf('_');
        if (0 < us)
            className = className.substring(0, us);

        Pattern p = Pattern.compile("\\$([0-9A-F]{4})");
        Matcher m = p.matcher(className);
        StringBuffer r = new StringBuffer();
        while (m.find()) {
            char c = (char) Integer.parseInt(m.group());
            m.appendReplacement(r, Character.toString(c));
        }
        m.appendTail(r);
        return r.toString();
    }

    public static int decodeArity(String className) {
        // Drop the arity from the end.
        int finish = className.lastIndexOf('_');
        if (finish < 0) {
            return -1;
        }
        if (className.endsWith("_2"))
            return 2;
        if (className.endsWith("_1"))
            return 1;
        if (className.endsWith("_3"))
            return 3;
        if (className.endsWith("_0"))
            return 0;
        if (className.endsWith("_4"))
            return 4;
        if (className.endsWith("_5"))
            return 5;
        if (className.endsWith("_6"))
            return 6;
        if (className.endsWith("_7"))
            return 7;
        if (className.endsWith("_8"))
            return 8;
        if (className.endsWith("_9"))
            return 9;
        return Integer.parseInt(className.substring(finish) + 1);
    }

    public static String decodeFunctor(String className) {
        String s = decodeFunctor0(className);
        if (s == null || s.startsWith("FILE_") || s.length() == 0) {
            //new RuntimeException("decodeFunctor: " + className).printStackTrace();
            return null;
        }
        return s;
    }

    private static String decodeFunctor0(String className) {
        int length = className.length();
        // Remove the Java package name, if present.
        int start = className.lastIndexOf('.');
        start++;
        // Trim the common PRED_ prefix.
        if (className.regionMatches(start, "FILE_", 0, 5)) {
            start += 5;
        }
        // Trim the common PRED_ prefix.
        if (className.regionMatches(start, "PRED_", 0, 5)) {
            start += 5;
        }
        // Drop the arity from the end.
        int finish = className.lastIndexOf('_');
        if (finish < 0) {
            finish = length;
        }
        // replace $XXXX with character with code XXXX
        StringBuilder sb = new StringBuilder(length);
        int index = start;
        int middle = index;
        while (index < finish) {
            index = className.indexOf('$', index);
            if (index < 0) {
                index = finish;
            } else if (index + 4 < finish) {
                try {
                    int c = Integer.parseInt(className.substring(index + 1, index + 5), 16);
                    sb.append(className.substring(middle, index));
                    switch (c) {
                        case '\\':
                            sb.append("\\\\");
                            break;
                        case '$':
                            sb.append("\\$");
                        default:
                            sb.append((char) c);
                            break;
                    }
                    index = middle = index + 5;
                } catch (NumberFormatException e) {
                    index++;
                }
            } else {
                index++;
            }
        }
        if (middle < finish) {
            sb.append(className.substring(middle, finish));
        }
        return sb.toString();
    }

    public static void main(String argv[]) {
        String p = argv[0];
        String f = argv[1];
        int n = (Integer.valueOf(argv[2])).intValue();
        System.out.println(p + ":" + f + "/" + n);
        System.out.println(PredicateEncoder.encode(p, f, n));
    }
}
