/*
 * java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Site.java 11391 2008-11-15 22:38:34Z vvoutilainen $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.HashSet;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Nil.NIL;

public final class IkvmSite {
    
  /**
   * Unpack and create a temporary file from a .NET Assembly if needed
   * 
   * @param {@link java.io.File} jfile
   * @return temporary {@link java.io.File} unpacked from a .NET Assembly
   */
  public static File ikvmFileSafe(File jfile) {
    if (!isIKVM()) return jfile;
    try {
      final File ifile = ikvmFile(jfile.getPath());
      //if (ifile.exists())
    	  return ifile;
    } catch (IOException e) {
    }
    return jfile;
  }

  final static HashMap extractionMap = new HashMap();
  
  final static HashSet<String> unsupportedABCLFiles = new HashSet<String>() {
	  {
		  add("com/cyc/tool/subl/jrtl/nativeCode/commonLisp/top-level.abcl");
		  add("com/cyc/tool/subl/jrtl/nativeCode/commonLisp/error.abcl");
		  add("com/cyc/tool/subl/jrtl/nativeCode/commonLisp/print.abcl");
		  add("/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/top-level.abcl");
		  add("/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/error.abcl");
		  add("/com/cyc/tool/subl/jrtl/nativeCode/commonLisp/print.abcl");
	  }
  };

  /**
   * Unpack and create a temporary file from a .NET Assembly
   * 
   * @param {@link java.lang.String} filename
   * @return temporary {@link java.io.File} unpacked from a .NET Assembly
   */
  public static File ikvmFile(String filename) throws IOException {
    File file = new File(filename);
    if (!isIKVM()) return file;
    if (unsupportedABCLFiles.contains(filename)) {  
    	printDebug("Skipping use of " + filename);
    	return new File(filename+".error");
    }
    if (file.exists())  {
        printDebug("exists = " + file);        
    	return file;
    }
    // directories are real even when they do not yet exist
    try {
        if (file.isDirectory()) {
            printDebug("directory = " + file);        
      	  return file;
        }
      } catch (Throwable dotnetOnly) {
      }    
      if (!isIKVMDll()) {
          printDebug("not found (not dll anyways) = " + file);        
      	return file;
      }
    if (file.getPath().endsWith("top-level.abcl")) {
        printDebug("looking for and not unpacking= " + file);        
    	return file;
    }
    {
      File knownFile = (File) extractionMap.get(filename);
      if (knownFile != null) {
  	    printDebug("extracted already = " + file);        
    	  return knownFile;
      }
    }
    printDebug("searching for = " + file);        

    URL res = Lisp.class.getResource(filename);
    if (res == null) {
      if (Utilities.isPlatformWindows || isIKVMDll()) {
        String revSlash = filename.replace("\\", "/");
        //someone stripped the "/" ?
        if (revSlash.charAt(0) != '/') revSlash = "/" + revSlash;
        if (!revSlash.equals(filename)) {
          res = Lisp.class.getResource(revSlash);
        }
      }
    }
    if (res == null) {
      printDebug("No File = " + file);            
      return file;//throw new FileNotFoundException(filename);
    }
    printDebug("Using = " + file);            
    if (res.getProtocol().equals("ikvmres")) {
      URLConnection connection = res.openConnection();
      InputStream in = connection.getInputStream();
      if (in != null) {
        {
          String ikvmFileWithExt = new File(filename).getName();
          int index = ikvmFileWithExt.lastIndexOf(File.separatorChar);
          if (index > 0) ikvmFileWithExt = ikvmFileWithExt.substring(index);
          //  index = ext.lastIndexOf('.');
          //if (index > 0) ext = ext.substring(index);
          file = new File(IKVM_LISP_TEMP, ikvmFileWithExt);
          //  file = File.createTempFile(IKVM_LISP_TEMP.getParent(), ext);//.getTempFile(cacheDir);
          printDebug("Unpacking Dll file " + filename + " to " + file);//IKVM_LISP_TEMP.getParent() +"$"+ ext);
        }
        if (!file.exists()) {
          file.getParentFile().mkdirs();
        }
        printDebug("baking " + file + " from " + filename);
        OutputStream out = new FileOutputStream(file);
        byte[] buf = new byte[4096];
        int bytesRead;
        in = new DataInputStream(in);
        //          int total = 0;
        while ((bytesRead = in.read(buf)) > 0) {
          //            printDebug("read="+bytesRead);
          //            int print = 10;
          //            if (bytesRead<print) print = bytesRead;
          //            for (int printi=0;printi<print;printi++) {
          //              printDebug(" // byte="+buf[printi] + " c="+((char)buf[printi]));
          //            }
          //            total += bytesRead;

          out.write(buf, 0, bytesRead);
        }
        //          printDebug("write="+total);
        out.close();
        in.close();
        extractionMap.put(filename, file);
        //        printDebug("zipFileName 1.1 = " + file);            
        return file;
      }
    }
    return file;
  }

  private static final String IKVM_LISP_HOME;
  private static final File IKVM_LISP_TEMP;

  private static boolean knowsAboutIKVM = false;
  private static boolean isIKVM = false;
  private static boolean isIKVMDll = false;
  private static Class ivkmRuntimeClass = null;
  // Method descriptor #8 (Lcli/System/RuntimeTypeHandle;)Ljava/lang/Class;
  //public static native java.lang.Class getClassFromTypeHandle(cli.System.RuntimeTypeHandle arg0);
  
  // Method descriptor #10 (Ljava/lang/Object;)Ljava/lang/Class;
  //public static native java.lang.Class getClassFromObject(java.lang.Object arg0);
  
  // Method descriptor #12 (Lcli/System/Exception;)V
  //public static native void throwException(cli.System.Exception arg0);
  
  // Method descriptor #14 (Lcli/System/Type;)Ljava/lang/Class;
  //public static native java.lang.Class getFriendlyClassFromType(cli.System.Type arg0);
  
  // Method descriptor #16 (Ljava/lang/Class;)Lcli/System/Type;
  //public static native cli.System.Type getInstanceTypeFromClass(java.lang.Class arg0);
  
  // Method descriptor #18 (Ljava/lang/Throwable;)Ljava/lang/Throwable;
  public static native java.lang.Throwable mapException(java.lang.Throwable arg0);
  public static synchronized boolean isIKVM() /*throws ConditionThrowable*/{
    if (!knowsAboutIKVM) {
      knowsAboutIKVM = true;
      String vmname = System.getProperty("java.vm.name");
      if (vmname == null || !vmname.toLowerCase().contains("ikvm")) return false;
      isIKVM = true;     
      try {
//    	  import ikvm.runtime.ClassPathAssemblyClassLoader;
  //  	  import gnu.java.net.protocol.ikvmres.Handler;")
    	  ivkmRuntimeClass = Class.forName("ikvm.runtime.Util");
      } catch (ClassNotFoundException e) {
    	  e.printStackTrace();
      }
      try {
        addIkvmFeature();
      } catch (ControlTransfer e) {
    	  e.printStackTrace();
      }
      URL url = Lisp.class.getResource("boot.lisp");
      if (url != null) {
    	  printDebug("boot.lisp == " + url);
        String protocol = url.getProtocol();
        if (protocol != null && protocol.equals("ikvmres")) {
          isIKVMDll = true;
        }
      }
      printDebug("isIKVM="+isIKVM+ " isIKVMDll=" + isIKVMDll +" isWin=" + Utilities.isPlatformWindows + " isNix=" + Utilities.isPlatformUnix);
    }
    return isIKVM;
  }

  /**
   * 
   */
  private static void addIkvmFeature() throws ControlTransfer {
    // TODO Auto-generated method stub
    SubLSymbol featureVar = LispSymbols.FEATURES;
    SubLObject features = featureVar.symbolValue();
    features = features.push(Lisp.internKeyword("IKVM"));
    featureVar.setSymbolValue(features);
  }

  public static boolean isIKVMDll() {
    return isIKVM() && isIKVMDll;
  }

  static {
    String lispHome = null;
    File lispTemp = null;
    isIKVM();
    URL url = Lisp.class.getResource("boot.lisp");
    if (url != null) {
      String protocol = url.getProtocol();
      if (protocol != null && (protocol.equals("file") || (protocol.equals("ikvmres")))) {
        String path = url.getPath();
        int index = path.lastIndexOf('/');
        if (index >= 0) {
          lispHome = path.substring(0, index + 1);
          if (Utilities.isPlatformWindows) {
            if (lispHome.length() > 0 && lispHome.charAt(0) == '/') lispHome = lispHome.substring(1);
          }
        }
      }
    }
    printDebug("Lisp home = " + lispHome);
    try {
      lispTemp = File.createTempFile("ikvm", null).getParentFile();
      File subdir = new File(lispTemp.getAbsolutePath()+"/ikvm");
    	  subdir.mkdirs();
    	  if (subdir.isDirectory())
    		  lispTemp = subdir;      
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    IKVM_LISP_TEMP = lispTemp;
    IKVM_LISP_HOME = lispHome;
  }

  public static final String getIKVMLispHome() {
    return IKVM_LISP_HOME;
  }

  public static void printDebug(String string) {	  
	//if(isIKVMDll())System.err.println("// IKVM " + string);	
 }

// ### *ikvm-lisp-home*
  private static final SubLSymbol _IKVM_LISP_HOME_ = exportSpecial("*IKVM-LISP-HOME*", PACKAGE_EXT, NIL);

  static {
    try {
      String s = getIKVMLispHome();
      if (s != null) _IKVM_LISP_HOME_.setSymbolValue(new Pathname(s));
    } catch (Throwable t) {
      Debug.trace(t);
    }
  }
}
