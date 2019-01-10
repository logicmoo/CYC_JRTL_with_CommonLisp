package org.opencyc.javashell;

import java.util.Hashtable;

/**
 * A simple test class loader capable of loading from
 * multiple sources, such as local files or a URL.<br><br>
 *
 * This class is derived from an article by Chuck McManis
 * http://www.javaworld.com/javaworld/jw-10-1996/indepth.src.html
 * with large modifications.<br><br>
 *
 * Note that this has been updated to use the non-deprecated version of
 * defineClass() -- JDM.<br><br>
 *
 * Simplified by siege on 4-27-01<br><br>
 *
 * @author Jack Harich - 8/18/97
 * @author John D. Mitchell - 99.03.04
 * @author Siege - 2001.04.26
 */
public abstract class MultiClassLoader extends ClassLoader {

	private Hashtable classes = new Hashtable();
	private char classNameReplacementChar;


	public MultiClassLoader() {
		//empty
	}


	/**
	 * This is a simple version for external clients since they
	 * will always want the class resolved before it is returned
	 * to them.
	 */
	public Class loadClass(String className) throws ClassNotFoundException {
		return loadClass(className, true);
	}


	public synchronized Class loadClass(String className, boolean resolveIt) throws ClassNotFoundException {
		Class result;
		byte[] classBytes;

		//----- Check our local cache of classes
		result = (Class)classes.get(className);
		if(result != null)
			return result;

		//----- Check with the primordial class loader
		try {
			return super.findSystemClass(className);
		} catch (ClassNotFoundException e) {
			//empty
		}

		//----- Try to load it from preferred source
		classBytes = loadClassBytes(className);
		if(classBytes == null)
			throw new ClassNotFoundException();

		//----- Define it (parse the class file)
		result = defineClass(className, classBytes, 0, classBytes.length);
		if(result == null)
			throw new ClassFormatError();

		//----- Resolve if necessary
		if(resolveIt)
			resolveClass(result);

		// Done
		classes.put(className, result);
		return result;
	}


	/**
	 * This optional call allows a class name such as
	 * "COM.test.Hello" to be changed to "COM_test_Hello",
	 * which is useful for storing classes from different
	 * packages in the same retrival directory.
	 * In the above example the char would be '_'.
	 */
	public void setClassNameReplacementChar(char replacement) {
		classNameReplacementChar = replacement;
	}


	protected abstract byte[] loadClassBytes(String className);


	protected String formatClassName(String className) {
		if (classNameReplacementChar == '\u0000')
			return className.replace('.', '/') + ".class";
		else
			return className.replace('.', classNameReplacementChar) + ".class";
	}

}
