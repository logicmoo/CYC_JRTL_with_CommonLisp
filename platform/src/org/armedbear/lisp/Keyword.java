/*
 * Keyword.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: Keyword.java 12290 2009-11-30 22:28:50Z vvoutilainen $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Keyword {
	public static SubLSymbol ABCL = Lisp.internKeyword("ABCL"), ABORT = Lisp.internKeyword("ABORT"),
			ABSOLUTE = Lisp.internKeyword("ABSOLUTE"), ADJUSTABLE = Lisp.internKeyword("ADJUSTABLE"),
			ALLOW_OTHER_KEYS = Lisp.internKeyword("ALLOW-OTHER-KEYS"), ANSI_CL = Lisp.internKeyword("ANSI-CL"),
			APPEND = Lisp.internKeyword("APPEND"), ARMEDBEAR = Lisp.internKeyword("ARMEDBEAR"),
			BACK = Lisp.internKeyword("BACK"), BOOLEAN = Lisp.internKeyword("BOOLEAN"),
			CAPITALIZE = Lisp.internKeyword("CAPITALIZE"), CAPITALIZE_FIRST = Lisp.internKeyword("CAPITALIZE-FIRST"),
			CASE = Lisp.internKeyword("CASE"), CAUSE = Lisp.internKeyword("CAUSE"), CHAR = Lisp.internKeyword("CHAR"),
			COMMON = Lisp.internKeyword("COMMON"), COMMON_LISP = Lisp.internKeyword("COMMON-LISP"),
			COMPILE_TOPLEVEL = Lisp.internKeyword("COMPILE-TOPLEVEL"), COUNT_ONLY = Lisp.internKeyword("COUNT-ONLY"),
			CREATE = Lisp.internKeyword("CREATE"), DARWIN = Lisp.internKeyword("DARWIN"),
			DATUM = Lisp.internKeyword("DATUM"), DECLARED = Lisp.internKeyword("DECLARED"),
			DEFAULT = Lisp.internKeyword("DEFAULT"), DEFAULTS = Lisp.internKeyword("DEFAULTS"),
			DEVICE = Lisp.internKeyword("DEVICE"), DIRECTION = Lisp.internKeyword("DIRECTION"),
			DIRECTORY = Lisp.internKeyword("DIRECTORY"),
			DIRECT_SUPERCLASSES = Lisp.internKeyword("DIRECT-SUPERCLASSES"), DOWNCASE = Lisp.internKeyword("DOWNCASE"),
			ELEMENT_TYPE = Lisp.internKeyword("ELEMENT-TYPE"), END = Lisp.internKeyword("END"),
			ERROR = Lisp.internKeyword("ERROR"), EXECUTE = Lisp.internKeyword("EXECUTE"),
			EXPECTED_TYPE = Lisp.internKeyword("EXPECTED-TYPE"), EXTERNAL = Lisp.internKeyword("EXTERNAL"),
			EXTERNAL_FORMAT = Lisp.internKeyword("EXTERNAL-FORMAT"), FILL_POINTER = Lisp.internKeyword("FILL-POINTER"),
			FORMAT_ARGUMENTS = Lisp.internKeyword("FORMAT-ARGUMENTS"),
			FORMAT_CONTROL = Lisp.internKeyword("FORMAT-CONTROL"), FROM_END = Lisp.internKeyword("FROM-END"),
			FREEBSD = Lisp.internKeyword("FREEBSD"), HOST = Lisp.internKeyword("HOST"),
			IF_DOES_NOT_EXIST = Lisp.internKeyword("IF-DOES-NOT-EXIST"), IF_EXISTS = Lisp.internKeyword("IF-EXISTS"),
			INHERITED = Lisp.internKeyword("INHERITED"), INITIAL_CONTENTS = Lisp.internKeyword("INITIAL-CONTENTS"),
			INITIAL_ELEMENT = Lisp.internKeyword("INITIAL-ELEMENT"), INPUT = Lisp.internKeyword("INPUT"),
			INSTANCE = Lisp.internKeyword("INSTANCE"), INT = Lisp.internKeyword("INT"),
			INTERNAL = Lisp.internKeyword("INTERNAL"), INVERT = Lisp.internKeyword("INVERT"),
			IO = Lisp.internKeyword("IO"), J = Lisp.internKeyword("J"), JAVA_1_4 = Lisp.internKeyword("JAVA-1.4"),
			JAVA_1_5 = Lisp.internKeyword("JAVA-1.5"), JAVA_1_6 = Lisp.internKeyword("JAVA-1.6"),
			JAVA_1_7 = Lisp.internKeyword("JAVA-1.7"), KEY = Lisp.internKeyword("KEY"),
			LINUX = Lisp.internKeyword("LINUX"), LOAD_TOPLEVEL = Lisp.internKeyword("LOAD-TOPLEVEL"),
			LOCAL = Lisp.internKeyword("LOCAL"), LONG = Lisp.internKeyword("LONG"), NAME = Lisp.internKeyword("NAME"),
			NETBSD = Lisp.internKeyword("NETBSD"), NEW_VERSION = Lisp.internKeyword("NEW"),
			NEWEST = Lisp.internKeyword("NEWEST"), NICKNAMES = Lisp.internKeyword("NICKNAMES"),
			NONE = Lisp.internKeyword("NONE"), NO_ERROR = Lisp.internKeyword("NO-ERROR"),
			OBJECT = Lisp.internKeyword("OBJECT"), OPENBSD = Lisp.internKeyword("OPENBSD"),
			OPERANDS = Lisp.internKeyword("OPERANDS"), OPERATION = Lisp.internKeyword("OPERATION"),
			OUTPUT = Lisp.internKeyword("OUTPUT"), OVERFLOW = Lisp.internKeyword("OVERFLOW"),
			OVERWRITE = Lisp.internKeyword("OVERWRITE"), PACKAGE = Lisp.internKeyword("PACKAGE"),
			PATHNAME = Lisp.internKeyword("PATHNAME"), PROBE = Lisp.internKeyword("PROBE"),
			PUBLIC = Lisp.internKeyword("PUBLIC"), PRESERVE = Lisp.internKeyword("PRESERVE"),
			REF = Lisp.internKeyword("REF"), RELATIVE = Lisp.internKeyword("RELATIVE"),
			RENAME = Lisp.internKeyword("RENAME"), RENAME_AND_DELETE = Lisp.internKeyword("RENAME-AND-DELETE"),
			SIZE = Lisp.internKeyword("SIZE"), START = Lisp.internKeyword("START"),
			STATUS = Lisp.internKeyword("STATUS"), STREAM = Lisp.internKeyword("STREAM"),
			SUNOS = Lisp.internKeyword("SUNOS"), SUPERSEDE = Lisp.internKeyword("SUPERSEDE"),
			TEST = Lisp.internKeyword("TEST"), TEST_NOT = Lisp.internKeyword("TEST-NOT"),
			TIME = Lisp.internKeyword("TIME"), TOP_LEVEL = Lisp.internKeyword("TOP-LEVEL"),
			TRAPS = Lisp.internKeyword("TRAPS"), TYPE = Lisp.internKeyword("TYPE"),
			UNDERFLOW = Lisp.internKeyword("UNDERFLOW"), UNIX = Lisp.internKeyword("UNIX"),
			UNSPECIFIC = Lisp.internKeyword("UNSPECIFIC"), UP = Lisp.internKeyword("UP"),
			UPCASE = Lisp.internKeyword("UPCASE"), USE = Lisp.internKeyword("USE"),
			VERSION = Lisp.internKeyword("VERSION"), WILD = Lisp.internKeyword("WILD"),
			WILD_INFERIORS = Lisp.internKeyword("WILD-INFERIORS"), WINDOWS = Lisp.internKeyword("WINDOWS"),
			X86 = Lisp.internKeyword("X86"), X86_64 = Lisp.internKeyword("X86-64"), CDR6 = Lisp.internKeyword("CDR6");
}
