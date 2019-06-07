/*
 * adjust_array.java
 *
 * Copyright (C) 2004-2007 Peter Graves
 * $Id$
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

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

import java.lang.reflect.*;
import java.util.*;

public class setenv {

	// ###setenv var string
	static class pf_setenv extends Primitive {
		public pf_setenv() {
			super("setenv", PACKAGE_EXT, true);
		}

		public static void setEnv(String name, String value) {
			try {
				Map<String, String> env = System.getenv();
				Class<?> cl = env.getClass();
				Field field = cl.getDeclaredField("m");
				field.setAccessible(true);
				Map<String, String> writableEnv = (Map<String, String>) field.get(env);
				writableEnv.put(name, value);
			} catch (Exception e) {
				throw new IllegalStateException("Failed to set environment variable (*Nix-Only)", e);
			}
		}

		@Override
		public LispObject execute(LispObject[] args) {

			if (args.length != 2)
				return error(new WrongNumberOfArgumentsException(this, 2));
			String name = args[0].STRING().getStringValue();
			LispObject valu = args[1].STRING();
			setEnv(name, valu.getStringValue());
			return valu;
		}
	}

	private static final Primitive var_pf_setenv = new pf_setenv();

	// ###set-system-property var string
	public static class set_system_property extends Primitive {
		public set_system_property() {
			super("set-system-property", PACKAGE_JVM, true);
		}

		public static String setProp(String name, String value) {
			try {
				System.setProperty(name, value);
				return System.getProperty(name, null);
			} catch (Exception e) {
				throw new IllegalStateException("Failed to set Property variable " + name + " from "
						+ System.getProperty(name, null) + " to " + value, e);
			}
		}

		@Override
		public LispObject execute(LispObject[] args) {

			if (args.length != 2)
				return error(new WrongNumberOfArgumentsException(this, 2));
			String name = args[0].STRING().getStringValue();
			LispObject valu = args[1].STRING();
			String result = setProp(name, valu.getStringValue());
			return makeStringOrJNull(result);
		}

	}

	private static final Primitive pf_set_system_property = new set_system_property();

	// ###get-system-property var string
	public static class get_system_property extends Primitive {
		public get_system_property() {
			super("get-system-property", PACKAGE_JVM, true);
		}

		public static String getProp(String name, String defalt) {
			try {

				return System.getProperty(name, defalt);
			} catch (Exception e) {
				throw new IllegalStateException("Failed to get Property variable " + name, e);
			}
		}

		@Override
		public LispObject execute(LispObject[] args) {

			final boolean d = args.length == 2;
			if (!d && args.length != 1)
				return error(new WrongNumberOfArgumentsException(this, 1));
			if (args.length != 2)
				return error(new WrongNumberOfArgumentsException(this, 2));
			LispObject valu = null;
			String name = args[0].STRING().getStringValue();
			if (d) {
				valu = args[1].STRING();
			}
			String result = getProp(name, valu.getStringValue());
			return makeStringOrJNull(result);
		}

	}

	private static final Primitive pf_get_system_property = new get_system_property();
}
