package org.opencyc.javashell;

import java.io.*;
import java.net.*;
import java.util.*;
import java.util.jar.*;
import java.util.jar.Attributes.*;

//import com.anyware.servlet.Runner;

/**<code>NClassLoader</code> is an extension of <code>ClassLoader</code>.
 * It offers extra features such as class reloading and the ability to specify
 * a base directory to load classes from.
 */
public class NClassLoader extends ClassLoader {
    private static final char FS = File.separatorChar, NFS = (FS=='/'?'\\':'/');
    private String baseRoot = "."+FS;
    private String jarRoot = "."+FS;
    
    
    private String extension = ".class";
    private static Hashtable Servlets = new Hashtable();
    /**Sets the root directory from where classes will be loaded.
     * @param root <code>String</code> containing root directory.    
     */    
    public void setRoot(String root) {
	// System.out.println("ROOTa = '"+root+"'");
        root = root.replace(NFS, FS);
	// System.out.println("ROOTb = '"+root+"'");
        if (!root.endsWith(""+FS)) {
            root+=FS;
	    // System.out.println("ROOTc = '"+root+"'");
        }
	// System.out.println("ROOTd = '"+root+"'");
        baseRoot = root;
    }
    /**Sets the file extension of the classes you are loading, the default extension
     * is .class
     * @param ext <code>String</code> containing the file extension.
     */  
    public void setExtension(String ext) {
        if (ext != null && ext.length() > 0) {
            extension  = ext;
        }
    }
    /**Sets the jar directory where your classpath will be built from TODO!
     * @param jardir <code>String</code> containing the jar directory.
     */
    public void setJarDir(String jardir) {
        if (jardir != null && jardir.length() > 0) {
            jarRoot  = jardir;
        }
    }
    /**Uses another class loader - TODO!
     * @param parent <code>ClassLoader</code>
     */
    public NClassLoader(ClassLoader parent) {
        super(parent);
        init();
    }
    /**Constructs <code>NClassLoader</code> and sets the base dir, file extension and jar dir.
     * @param strRepositoryPath <code>String</code> containing root directory.
     * @param strExtension <code>String</code> containing the file extension.
     * @param strJarDir <code>String</code> containing the jar directory.
     */    
    public NClassLoader(String strRepositoryPath,String strExtension,String strJarDir) {
        super();
        setRoot(strRepositoryPath);
        setExtension(strExtension);
        setJarDir(strJarDir);
        init();
    }
    
    private void init() {
        FileInputStream fi = null;
        try {
            fi = new FileInputStream(baseRoot + "MANIFEST.MF");
            manifest = new Manifest(fi);
        } catch (Exception e) {
        } finally {
            if ( null != fi ) {
                try {
                    fi.close();
                } catch (Exception e){
                }
            }
        }
    }
    /**Loads a class by name.
     * @param name <code>String</code> containing class name.
     * @return <code>Class</code> matching the name.
     * @throws <code>ClassNotFoundException</code>
     */
    @Override
	public Class loadClass(String name) throws ClassNotFoundException {
        return findClass(name);
    }
    /**Loads a class by name from a base directory.
     * @param base <code>String</code> containing the base directory.
     * @param name <code>String</code> containing class name.
     * @return <code>Class</code> matching the name that exists in the base directory.
     * @throws <code>ClassNotFoundException</code>
     */
    public Class loadClass(String base, String name) throws ClassNotFoundException {
        // System.out.println("BASE = '"+base+"' NAME = '"+name+"'");
        return findClass(base + name);
    }
    /**Loads a class by name with or without resolving it first.
     * @param name <code>String</code> containing class name.
     * @param resolve <code>boolean</code> whether to resolve the class or not.
     * @return <code>Class</code> matching the name.
     * @throws <code>ClassNotFoundException</code>
     */
    @Override
	public Class loadClass(String name, boolean resolve) throws ClassNotFoundException {
        // System.out.println("RESOLVE = '"+resolve+"' NAME = '"+name+"'");
        Class c = findClass(name);
        if (resolve) {
            resolveClass(c);
        }
        // System.out.println("GOT = '"+c+"'");
        return c;
    }
    @Override
	public Class findClass(String name) throws ClassNotFoundException {
      // System.out.println("finding class:  " + name);
        //ClassLoader lod = new ClassLoader();
        //lod.
    /*  if (
	  name.startsWith("java") 
	  || name.startsWith("org")
	  || name.startsWith("logicmoo.C")
	  || name.startsWith("logicmoo.I")
	  || name.startsWith("bsh")
	  || name.startsWith("HTTPClient") ) {
	  return Class.forName(name);
      }*/

      if (!name.startsWith("logicmoo.cmd.") && !name.startsWith("logicmoo.plugin.")) return Class.forName(name);
        
        Class c = null;
        File file = null;
        String fullname = name;
        int index = fullname.indexOf(',');
        if (index >= 0) {
            name = fullname.substring(index+1);
        }
        String path = name.replace('.', FS);
        boolean err = false;
        try {
            // System.out.println("FULLNAME = '"+fullname+"'");
          //  // System.out.println("PATH = '"+baseRoot+"' '"+path+"' '"+extension+"'");
            path = baseRoot + path + extension;
            NFileHolder nfh = (NFileHolder)Servlets.get(fullname);
            // System.out.println("nfh === " + nfh);
            file = new File(path);
            if (nfh != null) {
                long oldtime = nfh.date();
                if (oldtime>=0l) {
                    long newtime = file.lastModified();
                    nfh.date = newtime;
                    if (newtime <= oldtime) {
                      //  c = (Class)nfh.getObject();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            err = true;
        }
        
        if (c == null) {
            FileInputStream fi = null;
            try {
                // System.out.println("PATH = '"+path+"'");
                fi = new FileInputStream(path);
                byte[] classBytes = new byte[fi.available()];
                fi.read(classBytes);
                definePackage(name);
                c = defineClass(name, classBytes, 0, classBytes.length);
                resolveClass(c);
            } catch (Error e) {
                // System.out.println("111");
                e.printStackTrace();
                err = true;
            } catch (IOException ioe) {
                ioe.printStackTrace();
                err = true;
            }
            try {
                if (fi != null) {
                    fi.close();
                }
                fi = null;
            } catch (IOException ioe) {
                // System.out.println("222");
                ioe.printStackTrace();
            }
            if (err) {
		// System.out.println("err="+err+" returning system class '"+name+"'");
                try {
                    return Class.forName(name);
                } catch (Exception ie) {
                    // System.out.println("333");
                    ie.printStackTrace();
                    throw new ClassNotFoundException(name);
                }
            }
            // System.out.println("111"+c);
           NFileHolder nfh = new NFileHolder(file,c);
            // System.out.println("222"+fullname);
            // System.out.println("Storing CLASS '"+fullname+"'>'"+nfh+"'");
           Servlets.put(fullname,nfh);
            // System.out.println("333"+nfh);
        }
        return c;
    }
/*
    protected URL findResource(String name) {
        // System.out.println(getClass().getName() + " finding resource:  " + name);
        File searchResource = new File(baseRoot + name);
        URL result = null;
        if ( searchResource.exists() ) {
            try {
                return searchResource.toURL();
            } catch (MalformedURLException mfe) {
            }
        }
        return result;
    }
    protected Enumeration findResources(final String name) throws IOException {
        // System.out.println(getClass().getName() + " finding resources:  " + name);
        return new Enumeration() {
            URL resource = findResource(name);
            public boolean hasMoreElements() {
                return ( resource != null ?  true :  false);
            }
            public Object nextElement() {
                if ( !hasMoreElements() ) {
                    throw new NoSuchElementException();
                } else {
                    URL result = resource;
                    resource = null;
                    return result;
                }
            }
        };
    }
*/

    private void definePackage(String className) {
        String pkgName = className;
        int index = className.lastIndexOf('.');
        if (-1 != index) {
            pkgName = className.substring(0,index);
        }
        if ( null == manifest || getPackage(pkgName) != null) {
            return;
        }
        String specTitle, specVersion, specVendor, implTitle, implVersion, implVendor;
        Attributes attr = manifest.getMainAttributes();
        if ( null != attr) {
            specTitle = attr.getValue(Name.SPECIFICATION_TITLE);
            specVersion = attr.getValue(Name.SPECIFICATION_VERSION);
            specVendor = attr.getValue(Name.SPECIFICATION_VENDOR);
            implTitle = attr.getValue(Name.IMPLEMENTATION_TITLE);
            implVersion = attr.getValue(Name.IMPLEMENTATION_VERSION);
            implVendor = attr.getValue(Name.IMPLEMENTATION_VENDOR);
            definePackage(pkgName, specTitle, specVersion, specVendor, implTitle, implVersion, implVendor, null);
        }
    }
    private Manifest manifest;
}

