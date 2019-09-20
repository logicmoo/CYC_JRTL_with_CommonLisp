package org.opencyc.xml;

public class TextUtil
{
    public static String doEntityReference(final String text) {
        final StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); ++i) {
            final char ch = text.charAt(i);
            if (ch == '<') {
                result.append("&lt;");
            }
            else if (ch == '&') {
                result.append("&amp;");
            }
            else if (ch == '>') {
                result.append("&gt;");
            }
            else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    public static String undoEntityReference(final String text) {
        String result = text.replaceAll("&lt;", "<");
        result = result.replaceAll("&amp;", "&");
        result = result.replaceAll("&gt;", ">");
        return result;
    }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 35 ms
	
	Decompiled with Procyon 0.5.32.
*/