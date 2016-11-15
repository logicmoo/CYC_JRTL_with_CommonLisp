/**
 *
 */
package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

/**
 * @author Administrator
 *
 */
public @interface DeclaredLispSymbol {
	final static String MISSING = "#:MISSING";

	public boolean export() default false;

	public String name() default DeclaredLispSymbol.MISSING;

	public String pkg() default DeclaredLispSymbol.MISSING;
}
