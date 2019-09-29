package org.timepedia.exporter.client.test;

/**
 * Class used to run assert-equals in Jsni tests.
 * 
 * This class is packet with gwt-exporter so as we can use it either
 * in tests and samples modules.
 * 
 * @author manolo
 */
public class JsTestUtil {

  public final String name;
  
  public JsTestUtil(Class<?> clz) {
    this.name = clz.getName().replaceAll("^.+\\.", "");
  }
  
  private String failed = "";
  
  public boolean isFailed() {
    return !failed.isEmpty();
  }
  
  public String getFailed() {
    return failed;
  }
  
  private native <T> void print(T s) /*-{
		if ($wnd.console && $wnd.console.log) {
			$wnd.console.log(s);
		} else {
			$wnd.alert(s);
		}
  }-*/;

  private native <T> String arrToStr(T o) /*-{
		var ret = '';
		for ( var i = 0; i < o.length; i++)
			ret += (i > 0 ? "," : "") + String(o[i]);
		return ret;
  }-*/;

  /**
   * Checks that both parameters have the same string representation.
   * 
   * In case of arrays, it converts them to a comma separated string.
   * In case of numbers, it removes .0 part. 
   * In case of classNames it compares just the unqualified name of the class.
   */
  public <T> void assertEquals(T a, T b) {
    String sb = (b != null && b.toString().matches(".*(Array|\\[).*"))
        ? arrToStr(b) : b == null ? "null" : b.toString();
    String ss = "";
    while (!ss.equals(sb)) {
      ss = sb;
      sb = sb.replaceAll("(^|,)[^,]+[\\$\\.]([A-Z][\\w]+)\\$*(,|$)", "$1$2$3");
    }
    sb = sb.replaceAll("\\.0+([^\\d])", "$1");
    if (a == null && b == null || a != null
        && a.toString().equals(sb.toString())) {
      print("OK -> " + sb);
    } else {
      String atype = (a != null ? a.getClass().getName() : String.valueOf(a));
      String btype = (b != null ? b.getClass().getName() : String.valueOf(b));
      String msg = "ERROR -> [" + atype + "] " + a + " <=> [" + btype + "] " + sb;
      failed += (failed.isEmpty() ? "" : "\n") + msg;
    }
  }
}