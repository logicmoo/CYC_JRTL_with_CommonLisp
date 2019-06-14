/**
 * 
 */
package org.logicmoo.system;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.Annotation;

import javax.management.Attribute;

import org.armedbear.j.RemoteShell;

/**
 * @author Administrator
 *
 */
public class BeanShellCntrl {

	/**
	 * @author Administrator
	 *
	 */
	@Retention(RetentionPolicy.RUNTIME)
	static public @interface LispMethod {
		// Guess based on method name
		String prologName() default "";

		String symbolName() default "";

		String packageName() default "";

		boolean exported() default true;

		// use false is symbol macro
		boolean evalArgs() default true;

		// Arg has method name
		boolean popFront() default false;
	}

	public static boolean started_from_prolog;

	/**
	 * 
	 */
	public static void init_swipl_server() {
		// TODO Auto-generated method stub
		if (true)
			throw new AbstractMethodError("Auto-generated method stub:  BeanShellCntrl.init_swipl_server");

	}

	/**
	 * @param class1
	 */
	public static void scanForExports(Class<RemoteShell> class1) {
		// TODO Auto-generated method stub
		if (true)
			throw new AbstractMethodError("Auto-generated method stub:  BeanShellCntrl.scanForExports");

	}

}
