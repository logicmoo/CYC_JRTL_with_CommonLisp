/* pg.java */

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import org.armedbear.j.JavaMode;
import org.armedbear.j.KeyMap;

public class pg
{
    // Map Tab to slideIn and ShiftTab to slideOut globally and in Java mode.
    public void run()
    {
        trace("pg.run");
        KeyMap km = KeyMap.getGlobalKeyMap();
        km.mapKey(KeyEvent.VK_TAB, 0, "slideIn");
        km.mapKey(KeyEvent.VK_TAB, InputEvent.SHIFT_MASK, "slideOut");
        km = JavaMode.getMode().getKeyMap();
        km.mapKey(KeyEvent.VK_TAB, 0, "slideIn");
        km.mapKey(KeyEvent.VK_TAB, InputEvent.SHIFT_MASK, "slideOut");
    }

    private static void trace(String s)
    {
        System.err.println(s);
    }
}