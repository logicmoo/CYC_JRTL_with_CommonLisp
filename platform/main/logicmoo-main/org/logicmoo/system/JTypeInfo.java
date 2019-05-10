/**
 *
 */
package org.logicmoo.system;

/**
 * @author Administrator
 */
public abstract class JTypeInfo /*extends JVMImpl*/{

	static final int TOSTRING = "toString()L/java/lang/String;".intern().hashCode();

	/**
	 * @param clazz
	 * @param thizClazzDefault
	 */
	public JTypeInfo(Class clazz, Object thizClazzDefault) {
		//   super(clazz, thizClazzDefault);
	}

	// SubLFiles.declareFunction(me, "sxhash_rot", "SXHASH-ROT", 2, 0, false);
	abstract int findCallStaticSubLMethod(String me, String javaMethodName, String lispSymbolName, int minArgs, int optionalArgs, boolean usesRest);

} // end CPPReflection

