package com.cyc.baseclient.xml;

import com.cyc.baseclient.datatype.StringUtils;

/**
 * Provides utility methods for XML text processing.<p>
 *
 * @version $Id: TextUtil.java 150787 2014-04-26 01:55:03Z nwinant $
 * @author Stephen L. Reed
 */

public class TextUtil {

    /**
     * Performs xml special character substitution.
     *
     * @param text the text be examined for xml special characters
     * @return the text with xml special character substitution
     */
    public static String doEntityReference (String text) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '<')
                result.append("&lt;");
            else if (ch == '&')
                result.append("&amp;");
            else if (ch == '>')
                result.append("&gt;");
            else
                result.append(ch);
        }
        return result.toString();
    }

    /**
     * Transforms xml special character substitution to plain text
     *
     * @param text the text be examined for xml special characters
     * @return the text with xml special character substitution
     */
    public static String undoEntityReference (String text) {
        String result = text.replaceAll("&lt;", "<");
        result = result.replaceAll("&amp;", "&");
        result = result.replaceAll("&gt;", ">");
        return result;
    }
}
