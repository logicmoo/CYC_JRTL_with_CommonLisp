package org.appdapter.core.store;

import java.util.ArrayList;
import org.appdapter.core.log.Debuggable;
import com.hp.hpl.jena.rdf.model.Resource;
import java.util.Comparator;

public final class NumericStringComparitor implements Comparator
{
    public static final Comparator<Resource> resourceComparator;
    public static final Comparator<String> stringComparator;
    static String[] sgn;
    
    public int compare(final String s1, final String s2) {
        return compareStrings(s1, s2);
    }
    
    @Override
    public int compare(final Object o1, final Object o2) {
        if (o1 instanceof Resource || o2 instanceof Resource) {
            return this.compare((Resource)o1, (Resource)o2);
        }
        return this.compare((String)o1, (String)o2);
    }
    
    public int compare(final Resource o1, final Resource o2) {
        final int c = compare(this.mostImportant(o1), this.mostImportant(o2), true);
        if (c != 0) {
            return c;
        }
        if (!o1.equals((Object)o2)) {
            Debuggable.notImplemented(new Object[] { "compare", o1, o2 });
        }
        return 1;
    }
    
    public static int compare(final String[] s1, final String[] s2, final boolean mayDemposeString) {
        for (int i = 0; i != s1.length; ++i) {
            if (i == s2.length) {
                return 1;
            }
            if (mayDemposeString) {
                final int comp = compareStrings(s1[i], s2[i]);
                if (comp != 0) {
                    return comp;
                }
            }
            else {
                final int comp = compareNoDecomp(s1[i], s2[i]);
                if (comp != 0) {
                    return comp;
                }
            }
        }
        if (s1.length == s2.length) {
            return 0;
        }
        return -1;
    }
    
    public static int compareNoDecomp(final String s1, final String s2) {
        if (s1 == null) {
            if (s2 == null) {
                return 0;
            }
            return 1;
        }
        else {
            if (s2 == null) {
                return -1;
            }
            if (s1.length() == 0) {
                if (s2.length() == 0) {
                    return 0;
                }
                return -1;
            }
            else {
                if (s2.length() == 0) {
                    return 1;
                }
                if (s1.length() > 0 && Character.isDigit(s1.charAt(0)) && Character.isDigit(s2.charAt(0))) {
                    final Double d1 = calcValue(s1);
                    final Double d2 = calcValue(s2);
                    final int mcomp = (int)Math.signum(d1.compareTo(d2));
                    if (mcomp != 0) {
                        return mcomp;
                    }
                }
                int comp = s1.compareToIgnoreCase(s2);
                if (comp == 0) {
                    comp = s1.compareTo(s2);
                }
                if (comp == 0) {
                    return 0;
                }
                return comp;
            }
        }
    }
    
    public static Double calcValue(final String s2) {
        try {
            return Double.parseDouble(s2);
        }
        catch (NumberFormatException nfe) {
            return Double.NaN;
        }
    }
    
    public static int compareStrings(final String s1, final String s2) {
        if (s1 == null) {
            if (s2 == null) {
                return 0;
            }
            return 1;
        }
        else {
            if (s2 == null) {
                return -1;
            }
            if (s1.length() == 0) {
                if (s2.length() == 0) {
                    return 0;
                }
                return -1;
            }
            else {
                if (s2.length() == 0) {
                    return 1;
                }
                final String[] tokens1 = tokens(s1);
                final String[] tokens2 = tokens(s2);
                return compare(tokens1, tokens2, false);
            }
        }
    }
    
    public static String[] tokens(final String s2) {
        final ArrayList<String> al = new ArrayList<String>();
        StringBuffer sofar = new StringBuffer();
        boolean wasDigit = Character.isDigit(s2.charAt(0));
        final char[] charArray = s2.toCharArray();
        for (int j = 0; j < charArray.length; ++j) {
            final char c = charArray[j];
            final boolean isDigit = Character.isDigit(c);
            if (wasDigit != isDigit) {
                wasDigit = isDigit;
                al.add(sofar.toString());
                sofar = new StringBuffer();
                sofar.append(c);
            }
            else {
                sofar.append(c);
            }
        }
        if (sofar.length() > 0) {
            al.add(sofar.toString());
        }
        return al.toArray(new String[al.size()]);
    }
    
    public static void main(final String[] args) {
        showCompare("abc223", "223abc");
        showCompare("a22", "a2");
        showCompare("abcd", "a2");
        showCompare("M1L3P1ForTablet_control_12", "M1L3P1ForTablet_control_13");
        showCompare("M1L3P1ForTablet_control_12", "M1L3P1ForTablet_control_11");
        showCompare("M1L3P1ForTablet_control_12", "M1L3P1ForTablet_control_2");
    }
    
    private static void showCompare(final String s1, final String s2) {
        final int comp = compareStrings(s1, s2);
        System.out.println(s1 + " " + NumericStringComparitor.sgn[(int)Math.signum(comp) + 1] + " " + s2);
    }
    
    private String[] mostImportant(final Resource o2) {
        if (o2.isAnon()) {
            return new String[] { "", "" + o2.getId() };
        }
        if (!o2.isURIResource()) {
            return new String[] { null, "\"" + o2 };
        }
        final String ns = o2.getNameSpace();
        if (ns != null && ns.contains("w3.")) {
            return new String[] { "", o2.getLocalName() };
        }
        return new String[] { o2.getLocalName(), ns };
    }
    
    static {
        resourceComparator = new NumericStringComparitor();
        stringComparator = new NumericStringComparitor();
        NumericStringComparitor.sgn = new String[] { "<", "==", ">" };
    }
}

/*

	Total time: 48 ms
	
*/