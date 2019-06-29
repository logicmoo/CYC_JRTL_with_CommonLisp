/*
 * Created on 19.04.2004
 * 
 *  
 */
package org.eclisp.ui.editor.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

/**
 * Manager for colors used in the Java editor
 * 
 * @author soul
 */
public class LispColorProvider {

    public static final RGB MULTI_LINE_COMMENT = new RGB(128, 0, 0);
    public static final RGB SINGLE_LINE_COMMENT = new RGB(128, 128, 0);
    public static final RGB KEYWORD = new RGB(0, 0, 128);
    public static final RGB TYPE = new RGB(0, 0, 128);
    public static final RGB STRING = new RGB(0, 128, 0);
    public static final RGB DEFAULT = new RGB(0, 0, 0);

    public static final RGB KEYWORD_BACKGROUND = new RGB(128, 255, 0);
    
    protected Map colorTable = new HashMap(10);

    /**
     * Release all of the color resources held onto by the receiver.
     */
    public void dispose() {
        Iterator e = colorTable.values().iterator();
        while (e.hasNext())
            ((Color) e.next()).dispose();
    }

    /**
     * Return the Color that is stored in the Color table as rgb.
     */
    public Color getColor(RGB rgb) {
        Color color = (Color) colorTable.get(rgb);
        if (color == null) {
            color = new Color(Display.getCurrent(), rgb);
            colorTable.put(rgb, color);
        }
        return color;
    }

}