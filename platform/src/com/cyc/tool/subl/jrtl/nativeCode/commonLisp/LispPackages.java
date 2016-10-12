/*
 * Packages.java
 *
 * Copyright (C) 2002-2007 Peter Graves <peter@armedbear.org>
 * $Id: Packages.java 12290 2009-11-30 22:28:50Z vvoutilainen $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;

public class LispPackages {
	public static ArrayList<SubLPackage> packages = new ArrayList<SubLPackage>();
	public static HashMap<String, SubLPackage> map = new HashMap<String, SubLPackage>();

	public static synchronized void addNickname(SubLPackage pkg, String nickname)

	{
		Object obj = LispPackages.findPackage(nickname);
		if (obj != null && obj != pkg) {
			Lisp.error(new PackageError("A package named " + nickname + " already exists."));
			return;
		}
		LispPackages.map.put(nickname, pkg);
	}

	public static synchronized void addPackage(SubLPackage pkg)

	{
		String name = pkg.getJavaName();
		if (LispPackages.findPackage(name) != null) {
			Lisp.error(new LispError("A package named " + name + " already exists."));
			return;
		}
		LispPackages.packages.add(pkg);
		LispPackages.map.put(name, pkg);
		List nicknames = pkg.getNicknames();
		if (nicknames != null)
			for (Iterator it = nicknames.iterator(); it.hasNext();) {
				String nickname = (String) it.next();
				LispPackages.addNickname(pkg, nickname);
			}
	}

	public static synchronized SubLPackage createPackage(String name) {
		return LispPackages.createPackage(name, 0);
	}

	public static synchronized SubLPackage createPackage(String name, int size) {
		SubLPackage pkg = LispPackages.findPackage(name);
		if (pkg == null) {
			pkg = size != 0 ? new SubLPackage(name, size) : new SubLPackage(name);
			LispPackages.packages.add(pkg);
			LispPackages.map.put(name, pkg);
		} else
			Debug.trace("package " + name + " already exists");
		return pkg;
	}

	// Removes name and nicknames from map, removes pkg from packages.
	public static synchronized boolean deletePackage(SubLPackage pkg) {
		String name = pkg.getJavaName();
		if (name != null) {
			LispPackages.map.remove(name);
			List nicknames = pkg.getNicknames();
			if (nicknames != null)
				for (Iterator it = nicknames.iterator(); it.hasNext();) {
					String nickname = (String) it.next();
					LispPackages.map.remove(nickname);
				}
			LispPackages.packages.remove(pkg);
			return true;
		}
		return false;
	}

	// Returns null if package doesn't exist.
	public static synchronized SubLPackage findPackage(String name) {
		return LispPackages.map.get(name);
	}

	public static synchronized SubLPackage[] getAllPackages() {
		SubLPackage[] array = new SubLPackage[LispPackages.packages.size()];
		LispPackages.packages.toArray(array);
		return array;
	}

	public static synchronized SubLObject listAllPackages() {
		SubLObject result = Lisp.NIL;
		for (Iterator it = LispPackages.packages.iterator(); it.hasNext();) {
			SubLPackage pkg = (SubLPackage) it.next();
			result = LispObjectFactory.makeCons(pkg, result);
		}
		return result;
	}

	public static synchronized SubLPackage makePackage(String name)

	{
		if (LispPackages.findPackage(name) != null) {
			Lisp.error(new LispError("A package named " + name + " already exists."));
			// Not reached.
			return null;
		}
		SubLPackage pkg = new SubLPackage(name);
		LispPackages.packages.add(pkg);
		LispPackages.map.put(name, pkg);
		return pkg;
	}
}
