/**
 * 
 */
package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

/**
 * @author Administrator
 *
 */
public @interface DeclaredLispSymbol {
	public String name() default MISSING;
	public String pkg() default MISSING;
	public boolean export() default false;
	final static String MISSING = "#:MISSING";
}
