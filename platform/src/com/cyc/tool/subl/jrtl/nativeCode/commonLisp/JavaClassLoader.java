/*
 * JavaClassLoader.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: JavaClassLoader.java 12298 2009-12-18 21:50:54Z ehuelsmann $
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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JavaClassLoader extends ClassLoader {

	private static JavaClassLoader persistentInstance;

	private static Set<String> packages = Collections.synchronizedSet(new HashSet<String>());

	private static void definePackage(String packageName) {
		if (packageName != null && !JavaClassLoader.packages.contains(packageName)) {
			JavaClassLoader.persistentInstance.definePackage(packageName, "", "1.0", "", "", "1.0", "", null);
			JavaClassLoader.packages.add(packageName);
		}
	}

	public static JavaClassLoader getPersistentInstance() {
		return JavaClassLoader.getPersistentInstance(null);
	}

	public static JavaClassLoader getPersistentInstance(String packageName) {
		if (JavaClassLoader.persistentInstance == null)
			JavaClassLoader.persistentInstance = new JavaClassLoader();
		JavaClassLoader.definePackage(packageName);
		return JavaClassLoader.persistentInstance;
	}

	public JavaClassLoader() {
		super(JavaClassLoader.class.getClassLoader());
	}

	public Class<?> loadClassFromByteArray(byte[] classbytes) {
		return this.loadClassFromByteArray(null, classbytes);
	}

	public Class<?> loadClassFromByteArray(String className, byte[] classbytes) {
		try {
			long length = classbytes.length;
			if (length < Integer.MAX_VALUE) {
				Class<?> c = this.defineClass(className, classbytes, 0, (int) length);
				if (c != null) {
					this.resolveClass(c);
					return c;
				}
			}
		} catch (LinkageError e) {
			throw e;
		} catch (Throwable t) {
			Debug.trace(t);
		}
		return null;
	}

	public Class<?> loadClassFromByteArray(String className, byte[] bytes, int offset, int length) {
		try {
			Class<?> c = this.defineClass(className, bytes, offset, length);
			if (c != null) {
				this.resolveClass(c);
				return c;
			}
		} catch (VerifyError e) {
			Lisp.error(new LispError("Class verification failed: " + e.getMessage()));
		} catch (Throwable t) {
			Debug.trace(t);
		}
		return null;
	}
}
