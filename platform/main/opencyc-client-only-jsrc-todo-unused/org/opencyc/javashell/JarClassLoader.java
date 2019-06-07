package org.opencyc.javashell;


/**
 * JarClassLoader provides a minimalistic ClassLoader which shows how to
 * instantiate a class which resides in a .jar file.<br><br>
 *
 */

public class JarClassLoader extends MultiClassLoader {

    private JarResources jarResources;

    public JarClassLoader(String jarName) {
	// Create the JarResource and suck in the .jar file.
	jarResources = new JarResources (jarName);
    }


    @Override
	protected byte[] loadClassBytes(String className) {
	// Support the MultiClassLoader's class name munging facility.
	className = formatClassName (className);

	// Attempt to get the class data from the JarResource.
	return(jarResources.getResource (className));
    }

}
