/*
 * zip.java
 *
 * Copyright (C) 2005 Peter Graves
 * $Id: zip.java 12402 2010-01-26 11:15:48Z mevenson $
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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

// ### zip pathname pathnames
public class zip extends JavaPrimitive {
	private static Primitive zip = new zip();

	private zip() {
		super("zip", Lisp.PACKAGE_SYS, true, "pathname pathnames &optional topdir");
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		Pathname zipfilePathname = Lisp.coerceToPathname(first);
		byte[] buffer = new byte[4096];
		try {
			String zipfileNamestring = zipfilePathname.getNamestring();
			if (zipfileNamestring == null)
				return Lisp.error(new SimpleError("Pathname has no namestring: " + zipfilePathname.writeToString()));
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfileNamestring));
			SubLObject list = second;
			while (list != Lisp.NIL) {
				Pathname pathname = Lisp.coerceToPathname(list.first());
				String namestring = pathname.getNamestring();
				if (namestring == null) {
					// Clean up before signalling error.
					out.close();
					File zipfile = new File(zipfileNamestring);
					zipfile.delete();
					return Lisp.error(new SimpleError("Pathname has no namestring: " + pathname.writeToString()));
				}
				File file = new File(namestring);
				FileInputStream in = new FileInputStream(file);
				ZipEntry entry = new ZipEntry(file.getName());
				out.putNextEntry(entry);
				int n;
				while ((n = in.read(buffer)) > 0)
					out.write(buffer, 0, n);
				out.closeEntry();
				in.close();
				list = list.rest();
			}
			out.close();
		} catch (IOException e) {
			return Lisp.error(new LispError(e.getMessage()));
		}
		return zipfilePathname;
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
		Pathname zipfilePathname = Lisp.coerceToPathname(first);
		byte[] buffer = new byte[4096];
		try {
			String zipfileNamestring = zipfilePathname.getNamestring();
			if (zipfileNamestring == null)
				return Lisp.error(new SimpleError("Pathname has no namestring: " + zipfilePathname.writeToString()));
			ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfileNamestring));
			Pathname root = Lisp.coerceToPathname(third);
			String rootPath = root.getDirectoryNamestring();
			int rootPathLength = rootPath.length();
			Set<String> directories = new HashSet<String>();
			SubLObject list = second;
			while (list != Lisp.NIL) {
				Pathname pathname = Lisp.coerceToPathname(list.first());
				String namestring = pathname.getNamestring();
				if (namestring == null) {
					// Clean up before signalling error.
					out.close();
					File zipfile = new File(zipfileNamestring);
					zipfile.delete();
					return Lisp.error(new SimpleError("Pathname has no namestring: " + pathname.writeToString()));
				}
				String directory = "";
				String dir = pathname.getDirectoryNamestring();
				if (dir.length() > rootPathLength) {
					String d = dir.substring(rootPathLength);
					int i = 0;
					int j;
					while ((j = d.indexOf(File.separator, i)) != -1) {
						i = j + 1;
						directory = d.substring(0, j).replace(File.separatorChar, '/') + "/";
						if (!directories.contains(directory)) {
							directories.add(directory);
							ZipEntry entry = new ZipEntry(directory);
							out.putNextEntry(entry);
							out.closeEntry();
						}
					}
				}
				File file = new File(namestring);
				if (file.isDirectory()) {
					list = list.rest();
					continue;
				}
				FileInputStream in = new FileInputStream(file);
				ZipEntry entry = new ZipEntry(directory + file.getName());
				out.putNextEntry(entry);
				int n;
				while ((n = in.read(buffer)) > 0)
					out.write(buffer, 0, n);
				out.closeEntry();
				in.close();
				list = list.rest();
			}
			out.close();
		} catch (IOException e) {
			return Lisp.error(new LispError(e.getMessage()));
		}
		return zipfilePathname;
	}
}
