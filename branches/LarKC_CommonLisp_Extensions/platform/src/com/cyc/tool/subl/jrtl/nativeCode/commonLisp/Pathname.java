/*
 * Pathname.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: Pathname.java 12551 2010-03-16 18:06:28Z mevenson $
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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Pathname extends AbstractLispObject {

    protected SubLObject host = NIL;
    protected SubLObject device = NIL;
    protected SubLObject directory = NIL;
    protected SubLObject name = NIL;
    // A string, NIL, :WILD or :UNSPECIFIC.
    protected SubLObject type = NIL;
    // A positive integer, or NIL, :WILD, :UNSPECIFIC, or :NEWEST.
    protected SubLObject version = NIL;

    private String namestring;

    /** The protocol for changing any instance field (i.e. 'host', 'type', etc.)
     *  is to call this method after changing the field to recompute the namestring.
     *  We could do this with setter/getters, but that choose not to in order to avoid the
     *  performance indirection penalty.
     */
    public void invalidateNamestring() {
        namestring = null;
    }

    protected Pathname() {}

    /** Copy constructor which shares no structure with the original. */
    protected Pathname(Pathname p) {
        if (p.host != NIL) {
            if (p.host instanceof SubLString) {
                host = makeString(((SubLString)p.host).getString());
            } else  if (p.host instanceof SubLSymbol) {
                host = p.host;
            } else {
                Debug.assertTrue(false);
            }
        }
        if (p.device != NIL) {
            if (p.device instanceof SubLString) {
                device = makeString(((SubLString)p.device).getString());
            } else if (p.device instanceof SubLCons) {
                SubLCons jars = (SubLCons)p.device;
                device = makeCons(NIL, NIL);
                SubLObject first = jars.first();
                if (first instanceof SubLString) {
                    ((SubLCons)device).setFirst(makeString(((SubLString)first).getString()));
                } else if (first instanceof Pathname) {
                    ((SubLCons)device).setFirst(new Pathname((Pathname)first));
                } else {
                    Debug.assertTrue(false);
                }
                if (!jars.rest().equals(NIL)) {
                    if (jars.rest() instanceof SubLCons) {
                        ((SubLCons)device).setCdr(makeCons(new Pathname((Pathname)jars.rest().first()), NIL));
                    } else { 
                        Debug.assertTrue(false);
                    }
                }
            } else if (p.device instanceof SubLSymbol) {
                device = p.device;
            } else {
                Debug.assertTrue(false);
            }                
        }
        if (p.directory != NIL) {
            if (p.directory instanceof SubLCons) {
                directory = NIL;
                for (SubLObject list = p.directory; list != NIL; list = list.rest()) {
                    SubLObject o = list.first();
                    if (o instanceof SubLSymbol) {
                        directory = directory.push(o);
                    } else if (o instanceof SubLString) {
                        directory = directory.push(makeString(((SubLString)o).getString()));
                    } else {
                        Debug.assertTrue(false);
                    }
                }
                directory.nreverse();
            } else {
                Debug.assertTrue(false);
            }
        }
        if (p.name != NIL) {
            if (p.name instanceof SubLString) {
                name = makeString(((SubLString)p.name).getString());
            } else if (p.name instanceof SubLSymbol) {
                name = p.name;
            } else {
                Debug.assertTrue(false);
            }
        } 
        if (p.type != NIL) {
            if (p.type instanceof SubLString) {
                type = makeString(((SubLString)p.type).getString());
            } else if (p.type instanceof SubLSymbol) {
                type = p.type;
            } else {
                Debug.assertTrue(false);
            }
        }
    }

    public Pathname(String s) {
        init(s);
    }

    public static boolean isSupportedProtocol(String protocol) {
        return "jar".equals(protocol) || "file".equals(protocol);
    }

    public Pathname(URL url) {
        String protocol = url.getProtocol();
        if (!isSupportedProtocol(protocol)) {
            error(new LispError("Unsupported URL: '" + url.toString() + "'"));
        }

        if ("jar".equals(protocol)) {
            init(url.toString());
            return;
        } else if ("file".equals(protocol)) {
            String s;
            try {
                s = URLDecoder.decode(url.getPath(), "UTF-8");
            } catch (java.io.UnsupportedEncodingException uee) {
                // Can't happen: every Java is supposed to support
                // at least UTF-8 encoding
                Debug.assertTrue(false);
                s = null;
            }
            if (s != null) {
		if (Utilities.isPlatformWindows) {
		    //  Workaround for Java's idea of URLs
		    //  new (URL"file:///c:/a/b").getPath() --> "/c:/a/b"
                    //  whereas we need "c" to be the DEVICE.
		    if (s.length() > 2 
			&& s.charAt(0) == '/'
			&& s.charAt(2) == ':') {
			s = s.substring(1);
		    }
		}
                init(s);
                return;
            }
        }
        error(new LispError("Failed to construct Pathname from URL: "
                            + "'" + url.toString() + "'"));
    }

    static final private String jarSeparator = "!/";
    private final void init(String s) {
        if (s == null) {
            return;
        }
        if (s.equals(".") || s.equals("./")
          || (Utilities.isPlatformWindows && s.equals(".\\"))) {
            directory = makeCons(Keyword.RELATIVE);
            return;
        }
        if (s.equals("..") || s.equals("../")) {
            directory = list(Keyword.RELATIVE, Keyword.UP);
            return;
        }
        if (Utilities.isPlatformWindows) {
            if (s.startsWith("\\\\")) {
                //UNC path support
                // match \\<server>\<share>\[directories-and-files]

                int shareIndex = s.indexOf('\\', 2);
                int dirIndex = s.indexOf('\\', shareIndex + 1);

                if (shareIndex == -1 || dirIndex == -1) {
                    error(new LispError("Unsupported UNC path format: \"" + s + '"'));
                }

                host = makeString(s.substring(2, shareIndex));
                device = makeString(s.substring(shareIndex + 1, dirIndex));

                Pathname p = new Pathname(s.substring(dirIndex));
                directory = p.directory;
                name = p.name;
                type = p.type;
                version = p.version;
                return;
            }
        }

        // A JAR file
        if (s.startsWith("jar:") && s.endsWith(jarSeparator)) {
            SubLObject jars = NIL;
            int i = s.lastIndexOf(jarSeparator, s.length() - jarSeparator.length() - 1);
            String jar = null;
            if (i == -1) {
                jar = s;
            } else {
                // There can be no more than two jar references and the
                // inner one must be a file reference within the outer.
                jar = "jar:file:" + s.substring(i + jarSeparator.length());
                s = s.substring("jar:".length(), i + jarSeparator.length());
                Pathname p = new Pathname(s);
                SubLObject first = ((SubLCons) p.device).first();
                if (first instanceof SubLString) {
                    jars = jars.push(first);
                } else {
                    jars = jars.push(p.device.first());
                }
            }
            if (jar.startsWith("jar:file:")) {
                String jarString = jar.substring("jar:".length(),
                  jar.length() - jarSeparator.length());
                // Use URL constructor to normalize Windows' use of device
                URL url = null;
                try {
                    url = new URL(jarString);
                } catch (MalformedURLException e) {
                    error(new LispError("Failed to parse '" + jarString + "'"
                            + " as URL:"
                            + e.getMessage()));
                }
                Pathname jarPathname = new Pathname(url);
                if (jarString.endsWith(jarSeparator)) {
                    jars = jars.push(jarPathname.device);
                } else {
                    jars = jars.push(jarPathname);
                }
            } else {
                URL url = null;
                try {
                    url = new URL(jar.substring("jar:".length(), jar.length() - 2));
                    jars = jars.push(makeString(url.toString()));
                } catch (MalformedURLException e) {
                    error(new LispError("Failed to parse url '" + url + "'"
                      + e.getMessage()));
                }
            }
            jars = jars.nreverse();
            device = jars;
            return;
        }

        // An entry in a JAR file
        final int separatorIndex = s.lastIndexOf(jarSeparator);
        if (separatorIndex > 0 && s.startsWith("jar:")) {
            final String jarURL = s.substring(0, separatorIndex + jarSeparator.length());
            Pathname d = new Pathname(jarURL);
            if (device instanceof SubLCons) {
                SubLObject[] jars = d.copyToArray();
                //  XXX Is this ever reached?  If so, need to append lists
                Debug.assertTrue(false);
            } else {
                device = d.device;
            }
            s = "/" + s.substring(separatorIndex + jarSeparator.length());
            Pathname p = new Pathname(s);
            directory = p.directory;
            name = p.name;
            type = p.type;
            version = p.version;
            return;
        }

        if (Utilities.isPlatformWindows) {
            if (!s.contains(jarSeparator)) {
                s = s.replace("/", "\\");
            } else {
              StringBuilder result = new StringBuilder();
              for (int i = 0; i < s.length(); i++) {
                  char c = s.charAt(i);
                  if ( c != '/') {
                      result.append(c);
                  } else {
                      if (i != 0 && s.charAt(i-1) != '!') {
                          result.append("\\");
                      } else {
                          result.append(c);
                      }
                  }
              }
              s = result.toString();
            }
        }

        // Expand user home directories
        if (Utilities.isPlatformUnix) {
            if (s.equals("~")) {
                s = System.getProperty("user.home").concat("/");
            } else if (s.startsWith("~/")) {
                s = System.getProperty("user.home").concat(s.substring(1));
            }
        }
        namestring = s;
        if (Utilities.isPlatformWindows) {
            if (s.length() >= 2 && s.charAt(1) == ':') {
                device = makeString(s.charAt(0));
                s = s.substring(2);
            }
        }
        String d = null;
        // Find last file separator char.
        if (Utilities.isPlatformWindows) {
            for (int i = s.length(); i-- > 0;) {
                char c = s.charAt(i);
                if (c == '/' || c == '\\') {
                    d = s.substring(0, i + 1);
                    s = s.substring(i + 1);
                    break;
                }
            }
        } else {
            for (int i = s.length(); i-- > 0;) {
                if (s.charAt(i) == '/') {
                    d = s.substring(0, i + 1);
                    s = s.substring(i + 1);
                    break;
                }
            }
        }
        if (d != null) {
            if (s.equals("..")) {
                d = d.concat(s);
                s = "";
            }
            directory = parseDirectory(d);
        }
        if (s.startsWith(".") 
            // No TYPE can be parsed
            && (s.indexOf(".", 1) == -1 
                || s.substring(s.length() -1).equals("."))) {
            name = makeString(s);
            return;
        }
        int index = s.lastIndexOf('.');
        String n = null;
        String t = null;
        if (index > 0) {
            n = s.substring(0, index);
            t = s.substring(index + 1);
        } else if (s.length() > 0) {
            n = s;
        }
        if (n != null) {
            if (n.equals("*")) {
                name = Keyword.WILD;
            } else {
                name = makeString(n);
            }
        }
        if (t != null) {
            if (t.equals("*")) {
                type = Keyword.WILD;
            } else {
                type = makeString(t);
            }
        }
    }

    private static final SubLObject parseDirectory(String d) {
        if (d.equals("/") || (Utilities.isPlatformWindows && d.equals("\\"))) {
            return makeCons(Keyword.ABSOLUTE);
        }
        SubLObject result;
        if (d.startsWith("/") || (Utilities.isPlatformWindows && d.startsWith("\\"))) {
            result = makeCons(Keyword.ABSOLUTE);
        } else {
            result = makeCons(Keyword.RELATIVE);
        }
        StringTokenizer st = new StringTokenizer(d, "/\\");
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            SubLObject obj;
            if (token.equals("*")) {
                obj = Keyword.WILD;
            } else if (token.equals("**")) {
                obj = Keyword.WILD_INFERIORS;
            } else if (token.equals("..")) {
                if (result.first() instanceof SubLString) {
                    result = result.rest();
                    continue;
                }
                obj = Keyword.UP;
            } else {
                obj = makeString(token);
            }
            result = makeCons(obj, result);
        }
        return result.nreverse();
    }

    @Override
    public SubLObject getParts() {
        SubLObject parts = NIL;
        parts = parts.push(makeCons("HOST", host));
        parts = parts.push(makeCons("DEVICE", device));
        parts = parts.push(makeCons("DIRECTORY", directory));
        parts = parts.push(makeCons("NAME", name));
        parts = parts.push(makeCons("TYPE", type));
        parts = parts.push(makeCons("VERSION", version));
        return parts.nreverse();
    }

    @Override
    public SubLObject typeOf() {
        return LispSymbols.PATHNAME;
    }

    @Override
    public SubLObject classOf() {
        return BuiltInClass.PATHNAME;
    }

    @Override
    public SubLObject typep(SubLObject type) {
        if (type == LispSymbols.PATHNAME) {
            return T;
        }
        if (type == BuiltInClass.PATHNAME) {
            return T;
        }
        return super.typep(type);
    }

    public final SubLObject getDevice() {
        return device;
    }

    public String getNamestring() {
        if (namestring != null) {
            return namestring;
        }
        if (name == NIL && type != NIL) {
            Debug.assertTrue(namestring == null);
            return null;
        }
        if (directory instanceof SubLString) {
            Debug.assertTrue(false);
        }
        StringBuilder sb = new StringBuilder();
        // "If a pathname is converted to a namestring, the symbols NIL and
        // :UNSPECIFIC cause the field to be treated as if it were empty. That
        // is, both NIL and :UNSPECIFIC cause the component not to appear in
        // the namestring." 19.2.2.2.3.1
        if (host != NIL) {
            Debug.assertTrue(host instanceof SubLString);
            if (!(this instanceof LogicalPathname)) {
                sb.append("\\\\"); //UNC file support; if there's a host, it's a UNC path.
            }
            sb.append(host.getString());
            if (this instanceof LogicalPathname) {
                sb.append(':');
            } else {
                sb.append(File.separatorChar);
            }
        }
        if (device == NIL) {
        } else if (device == Keyword.UNSPECIFIC) {
        } else if (device instanceof SubLCons) {
            SubLObject[] jars = ((SubLCons) device).copyToArray();
            int i = 0;
            if (jars[0] instanceof SubLString) {
                sb.append("jar:");
                sb.append(((SubLString) jars[0]).getString());
                sb.append("!/");
                i = 1;
            }
            StringBuilder prefix = new StringBuilder();
            for (; i < jars.length; i++) {
                prefix.append("jar:");
                if (i == 0) {
                    sb.append("file:");
                }
                if (jars[i] instanceof Pathname) {
                    sb.append(((Pathname) jars[i]).getNamestring());
                }
                sb.append("!/");
            }
            sb = prefix.append(sb);
        } else if (device instanceof SubLString
          && device.getString().startsWith("jar:")) {
            sb.append(device.getString());
        } else if (device instanceof SubLString) {
            sb.append(device.getString());
            if (this instanceof LogicalPathname
              || host == NIL) {
                sb.append(':'); // non-UNC paths
            }
        } else {
            Debug.assertTrue(false);
        }
        String directoryNamestring = getDirectoryNamestring();
        if (isJar()) {
            if (directoryNamestring.startsWith("/")) {
                sb.append(directoryNamestring.substring(1));
            } else {
                sb.append(directoryNamestring);
            }
        } else {
            sb.append(directoryNamestring);
        }
        if (name instanceof SubLString) {
            String n = name.getString();
            if (n.indexOf(File.separatorChar) >= 0) {
                Debug.assertTrue(namestring == null);
                return null;
            }
            sb.append(n);
        } else if (name == Keyword.WILD) {
            sb.append('*');
        }
        if (type != NIL && type != Keyword.UNSPECIFIC) {
            sb.append('.');
            if (type instanceof SubLString) {
                String t = type.getString();
                if (t.indexOf('.') >= 0) {
                    Debug.assertTrue(namestring == null);
                    return null;
                }
                sb.append(t);
            } else if (type == Keyword.WILD) {
                sb.append('*');
            } else {
                Debug.assertTrue(false);
            }
        }
        if (this instanceof LogicalPathname) {
            if (version.isInteger()) {
                sb.append('.');
                int base = LispSymbols.PRINT_BASE.symbolValue().intValue();
                if (version instanceof Fixnum) {
                    sb.append(Integer.toString(((Fixnum) version).value, base).toUpperCase());
                } else if (version instanceof Bignum) {
                    sb.append(((Bignum) version).bigIntegerValue().toString(base).toUpperCase());
                }
            } else if (version == Keyword.WILD) {
                sb.append(".*");
            } else if (version == Keyword.NEWEST) {
                sb.append(".NEWEST");
            }
        }
        return namestring = sb.toString();
    }

    protected String getDirectoryNamestring() {
        validateDirectory(true);
        StringBuilder sb = new StringBuilder();
        // "If a pathname is converted to a namestring, the symbols NIL and
        // :UNSPECIFIC cause the field to be treated as if it were empty. That
        // is, both NIL and :UNSPECIFIC cause the component not to appear in
        // the namestring." 19.2.2.2.3.1
        if (directory != NIL) {
            final char separatorChar;
            if (device instanceof SubLCons) {
                separatorChar = '/'; // Jar file.
            } else {
                separatorChar = File.separatorChar;
            }
            SubLObject temp = directory;
            SubLObject part = temp.first();
            temp = temp.rest();
            if (part == Keyword.ABSOLUTE) {
                sb.append(separatorChar);
            } else if (part == Keyword.RELATIVE) {
                if (temp == NIL) {
                    // #p"./"
                    sb.append('.');
                    sb.append(separatorChar);
                }
                // else: Nothing to do.
            } else {
                error(new FileError("Unsupported directory component "
                  + part.writeToString() + ".",
                  this));
            }
            while (temp != NIL) {
                part = temp.first();
                if (part instanceof SubLString) {
                    sb.append(part.getString());
                } else if (part == Keyword.WILD) {
                    sb.append('*');
                } else if (part == Keyword.WILD_INFERIORS) {
                    sb.append("**");
                } else if (part == Keyword.UP) {
                    sb.append("..");
                } else {
                    error(new FileError("Unsupported directory component " + part.writeToString() + ".",
                      this));
                }
                sb.append(separatorChar);
                temp = temp.rest();
            }
        }
        return sb.toString();
    }

    /** @return The representation of this pathname suitable for referencing an entry in a Zip/JAR file */
    protected String asEntryPath() {
        Pathname p = new Pathname();
        p.directory = directory;
        p.name = name;
        p.type = type;
        String path = p.getNamestring();
        StringBuilder result = new StringBuilder();
        if (Utilities.isPlatformWindows) {
	    for (int i = 0; i < path.length(); i++) {
		char c = path.charAt(i);
		if (c == '\\') {
		    result.append('/');
		} else {
		    result.append(c);
		}
	    }
        } else  {
            result.append(path);
        }
        // Entries in jar files are always relative, but Pathname
        // directories are :ABSOLUTE.
        if (result.length() > 1
          && result.substring(0, 1).equals("/")) {
            return result.substring(1);
        }
        return result.toString();
    }

    @Override
    public boolean equal(SubLObject obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pathname) {
            Pathname p = (Pathname) obj;
            if (Utilities.isPlatformWindows) {
                if (!host.equalp(p.host)) {
                    return false;
                }
                if (!device.equalp(p.device)) {
                    return false;
                }
                if (!directory.equalp(p.directory)) {
                    return false;
                }
                if (!name.equalp(p.name)) {
                    return false;
                }
                if (!type.equalp(p.type)) {
                    return false;
                }
                // Ignore version component.
                //if (!version.equalp(p.version))
                //    return false;
            } else {
                // Unix.
                if (!host.equal(p.host)) {
                    return false;
                }
                if (!device.equal(p.device)) {
                    return false;
                }
                if (!directory.equal(p.directory)) {
                    return false;
                }
                if (!name.equal(p.name)) {
                    return false;
                }
                if (!type.equal(p.type)) {
                    return false;
                }
                // Ignore version component.
                //if (!version.equal(p.version))
                //    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean equalp(SubLObject obj) {
        return equal(obj);
    }

    @Override
    public int sxhash() {
        return ((host.sxhash()
          ^ device.sxhash()
          ^ directory.sxhash()
          ^ name.sxhash()
          ^ type.sxhash()) & 0x7fffffff);
    }

    @Override
    public String writeToString() {
        final LispThread thread = LispThread.currentThread();
        boolean printReadably = (LispSymbols.PRINT_READABLY.symbolValue(thread) != NIL);
        boolean printEscape = (LispSymbols.PRINT_ESCAPE.symbolValue(thread) != NIL);
        boolean useNamestring;
        String s = null;
        s = getNamestring();
        if (s != null) {
            useNamestring = true;
            if (printReadably) {
                // We have a namestring. Check for pathname components that
                // can't be read from the namestring.
                if (host != NIL || version != NIL) {
                    useNamestring = false;
                } else if (name instanceof SubLString) {
                    String n = name.getString();
                    if (n.equals(".") || n.equals("..")) {
                        useNamestring = false;
                    } else if (n.indexOf(File.separatorChar) >= 0) {
                        useNamestring = false;
                    }
                }
            }
        } else {
            useNamestring = false;
        }
        StringBuilder sb = new StringBuilder();
        if (useNamestring) {
            if (printReadably || printEscape) {
                sb.append("#P\"");
            }
            final int limit = s.length();
            for (int i = 0; i < limit; i++) {
                char c = s.charAt(i);
                if (printReadably || printEscape) {
                    if (c == '\"' || c == '\\') {
                        sb.append('\\');
                    }
                }
                sb.append(c);
            }
            if (printReadably || printEscape) {
                sb.append('"');
            }
        } else {
            sb.append("#P(");
            if (host != NIL) {
                sb.append(":HOST ");
                sb.append(host.writeToString());
                sb.append(' ');
            }
            if (device != NIL) {
                sb.append(":DEVICE ");
                sb.append(device.writeToString());
                sb.append(' ');
            }
            if (directory != NIL) {
                sb.append(":DIRECTORY ");
                sb.append(directory.writeToString());
                sb.append(" ");
            }
            if (name != NIL) {
                sb.append(":NAME ");
                sb.append(name.writeToString());
                sb.append(' ');
            }
            if (type != NIL) {
                sb.append(":TYPE ");
                sb.append(type.writeToString());
                sb.append(' ');
            }
            if (version != NIL) {
                sb.append(":VERSION ");
                sb.append(version.writeToString());
                sb.append(' ');
            }
            if (sb.charAt(sb.length() - 1) == ' ') {
                sb.setLength(sb.length() - 1);
            }
            sb.append(')');
        }
        return sb.toString();
    }
    // A logical host is represented as the string that names it.
    // (defvar *logical-pathname-translations* (make-hash-table :test 'equal))
    public static EqualHashTable LOGICAL_PATHNAME_TRANSLATIONS =
      new EqualHashTable(64, NIL, NIL);
    private static final SubLSymbol _LOGICAL_PATHNAME_TRANSLATIONS_ =
      exportSpecial("*LOGICAL-PATHNAME-TRANSLATIONS*", PACKAGE_SYS,
      LOGICAL_PATHNAME_TRANSLATIONS);

    public static Pathname parseNamestring(String s) {
        return new Pathname(s);
    }

    public static Pathname parseNamestring(SubLString namestring) {
        // Check for a logical pathname host.
        String s = namestring.getString();
        String h = getHostString(s);
        if (h != null && LOGICAL_PATHNAME_TRANSLATIONS.getHT(makeString(h)) != null) {
            // A defined logical pathname host.
            return new LogicalPathname(h, s.substring(s.indexOf(':') + 1));
        }
        return new Pathname(s);
    }

    public static Pathname parseNamestring(SubLString namestring,
      SubLString host) {
        // Look for a logical pathname host in the namestring.
        String s = namestring.getString();
        String h = getHostString(s);
        if (h != null) {
            if (!h.equals(host.getString())) {
                error(new LispError("Host in " + s
                  + " does not match requested host "
                  + host.getString()));
                // Not reached.
                return null;
            }
            // Remove host prefix from namestring.
            s = s.substring(s.indexOf(':') + 1);
        }
        if (LOGICAL_PATHNAME_TRANSLATIONS.getHT(host) != null) {
            // A defined logical pathname host.
            return new LogicalPathname(host.getString(), s);
        }
        error(new LispError(host.writeToString() + " is not defined as a logical pathname host."));
        // Not reached.
        return null;
    }

    // "one or more uppercase letters, digits, and hyphens"
    protected static String getHostString(String s) {
        int colon = s.indexOf(':');
        if (colon >= 0) {
            return s.substring(0, colon).toUpperCase();
        } else {
            return null;
        }
    }

    static final void checkCaseArgument(SubLObject arg) {
        if (arg != Keyword.COMMON && arg != Keyword.LOCAL) {
            type_error(arg, list(LispSymbols.MEMBER, Keyword.COMMON,
              Keyword.LOCAL));
        }
    }
    // ### %pathname-host
    private static final Primitive _PATHNAME_HOST = new pf_pathname_host();
    private static class pf_pathname_host extends JavaPrimitive {
        pf_pathname_host() {
            super("%pathname-host", PACKAGE_SYS, false);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            checkCaseArgument(second);
            return coerceToPathname(first).host;
        }
    }
    // ### %pathname-device
    private static final Primitive _PATHNAME_DEVICE = new pf_pathname_device(); 
    private static class pf_pathname_device extends JavaPrimitive {
        pf_pathname_device() {
            super("%pathname-device", PACKAGE_SYS, false);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            checkCaseArgument(second);
            return coerceToPathname(first).device;
        }
    }
    // ### %pathname-directory
    private static final Primitive _PATHNAME_DIRECTORY = new pf_pathname_directory();
    private static class pf_pathname_directory extends JavaPrimitive {
        pf_pathname_directory() {
            super("%pathname-directory", PACKAGE_SYS, false);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            checkCaseArgument(second);
            return coerceToPathname(first).directory;
        }
    }
    // ### %pathname-name
    private static final Primitive _PATHNAME_NAME = new pf_pathname_name();
    private static class  pf_pathname_name extends JavaPrimitive {
        pf_pathname_name() {
            super ("%pathname-name", PACKAGE_SYS, false);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            checkCaseArgument(second);
            return coerceToPathname(first).name;
        }
    }
    // ### %pathname-type
    private static final Primitive _PATHNAME_TYPE = new pf_pathname_type();
    private static class pf_pathname_type extends JavaPrimitive {
        pf_pathname_type() {
            super("%pathname-type", PACKAGE_SYS, false);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            checkCaseArgument(second);
            return coerceToPathname(first).type;
        }
    }
    // ### pathname-version
    private static final Primitive PATHNAME_VERSION = new pf_pathname_version();
    private static class pf_pathname_version extends JavaPrimitive {
        pf_pathname_version() {
            super("pathname-version", "pathname");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            return coerceToPathname(arg).version;
        }
    }
    // ### namestring
    // namestring pathname => namestring
    private static final Primitive NAMESTRING = new pf_namestring();
    private static class pf_namestring extends JavaPrimitive {
        pf_namestring() {
            super("namestring", "pathname");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            Pathname pathname = coerceToPathname(arg);
            String namestring = pathname.getNamestring();
            if (namestring == null) {
                error(new SimpleError("Pathname has no namestring: "
                                      + pathname.writeToString()));
            }
            return makeString(namestring);
        }
    }
    // ### directory-namestring
    // directory-namestring pathname => namestring
    private static final Primitive DIRECTORY_NAMESTRING = new pf_directory_namestring();
    private static class pf_directory_namestring extends JavaPrimitive {
        pf_directory_namestring() {
            super("directory-namestring", "pathname");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            return makeString(coerceToPathname(arg).getDirectoryNamestring());
        }
    }
    // ### pathname pathspec => pathname
    private static final Primitive PATHNAME = new pf_pathname();
    private static class pf_pathname extends JavaPrimitive {
        pf_pathname() {
            super("pathname", "pathspec");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            return coerceToPathname(arg);
        }
    }
    // ### %parse-namestring string host default-pathname => pathname, position
    private static final Primitive _PARSE_NAMESTRING = new pf_parse_namestring();
    private static class pf_parse_namestring extends JavaPrimitive {
        pf_parse_namestring() {
            super("%parse-namestring", PACKAGE_SYS, false,
                  "namestring host default-pathname");
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second, SubLObject third) {
            final LispThread thread = LispThread.currentThread();
            final SubLString namestring = checkString(first);
            // The HOST parameter must be a string or NIL.
            if (second == NIL) {
                // "If HOST is NIL, DEFAULT-PATHNAME is a logical pathname, and
                // THING is a syntactically valid logical pathname namestring
                // without an explicit host, then it is parsed as a logical
                // pathname namestring on the host that is the host component
                // of DEFAULT-PATHNAME."
                third = coerceToPathname(third);
                if (third instanceof LogicalPathname) {
                    second = ((LogicalPathname) third).host;
                } else {
                    return thread.setValues(parseNamestring(namestring),
                                            namestring.LENGTH());
                }
            }
            Debug.assertTrue(second != NIL);
            final SubLString host = checkString(second);
            return thread.setValues(parseNamestring(namestring, host),
                                    namestring.LENGTH());
        }
    }
    // ### make-pathname
    private static final Primitive MAKE_PATHNAME = new pf_make_pathname();
    private static class pf_make_pathname extends JavaPrimitive {
        pf_make_pathname() {
            super("make-pathname",
                  "&key host device directory name type version defaults case");
        }
        @Override
        public SubLObject execute(SubLObject[] args) {
            return _makePathname(args);
        }
    }

    // Used by the #p reader.
    public static final Pathname makePathname(SubLObject args) {
        return _makePathname(args.copyToArray());
    }

    public static final Pathname makePathname(File file) {
        String namestring = null;
        try {
            namestring = file.getCanonicalPath();
        } catch (IOException e) {
            Debug.trace("Failed to make a Pathname from "
              + "." + file + "'");
            return null;
        }
        return new Pathname(namestring);
    }

    static final Pathname _makePathname(SubLObject[] args) {
        if (args.length % 2 != 0) {
            error(new ProgramError("Odd number of keyword arguments."));
        }
        SubLObject host = NIL;
        SubLObject device = NIL;
        SubLObject directory = NIL;
        SubLObject name = NIL;
        SubLObject type = NIL;
        SubLObject version = NIL;
        Pathname defaults = null;
        boolean deviceSupplied = false;
        boolean nameSupplied = false;
        boolean typeSupplied = false;
        for (int i = 0; i < args.length; i += 2) {
            SubLObject key = args[i];
            SubLObject value = args[i + 1];
            if (key == Keyword.HOST) {
                host = value;
            } else if (key == Keyword.DEVICE) {
                device = value;
                deviceSupplied = true;
            } else if (key == Keyword.DIRECTORY) {
                if (value instanceof SubLString) {
                    directory = list(Keyword.ABSOLUTE, value);
                } else if (value == Keyword.WILD) {
                    directory = list(Keyword.ABSOLUTE, Keyword.WILD);
                } else {
                    directory = value;
                }
            } else if (key == Keyword.NAME) {
                name = value;
                nameSupplied = true;
            } else if (key == Keyword.TYPE) {
                type = value;
                typeSupplied = true;
            } else if (key == Keyword.VERSION) {
                version = value;
            } else if (key == Keyword.DEFAULTS) {
                defaults = coerceToPathname(value);
            } else if (key == Keyword.CASE) {
                // Ignored.
            }
        }
        if (defaults != null) {
            if (host == NIL) {
                host = defaults.host;
            }
            if (directory == NIL && defaults != null) {
                directory = defaults.directory;
            }
            if (!deviceSupplied) {
                device = defaults.device;
            }
            if (!nameSupplied) {
                name = defaults.name;
            }
            if (!typeSupplied) {
                type = defaults.type;
            }
        }
        final Pathname p;
        final boolean logical;
        if (host != NIL) {
            if (host instanceof SubLString) {
                host = LogicalPathname.canonicalizeStringComponent((SubLString) host);
            }
            if (LOGICAL_PATHNAME_TRANSLATIONS.getHT(host) == null) {
                // Not a defined logical pathname host.
                error(new LispError(host.writeToString() + " is not defined as a logical pathname host."));
            }
            p = new LogicalPathname();
            logical = true;
            p.host = host;
            p.device = Keyword.UNSPECIFIC;
        } else {
            p = new Pathname();
            logical = false;
        }
        if (device != NIL) {
            if (logical) {
                // "The device component of a logical pathname is always :UNSPECIFIC."
                if (device != Keyword.UNSPECIFIC) {
                    error(new LispError("The device component of a logical pathname must be :UNSPECIFIC."));
                }
            } else {
                p.device = device;
            }
        }
        if (directory != NIL) {
            if (logical) {
                if (directory.isList()) {
                    SubLObject d = NIL;
                    while (directory != NIL) {
                        SubLObject component = directory.first();
                        if (component instanceof SubLString) {
                            d = d.push(LogicalPathname.canonicalizeStringComponent((SubLString) component));
                        } else {
                            d = d.push(component);
                        }
                        directory = directory.rest();
                    }
                    p.directory = d.nreverse();
                } else if (directory == Keyword.WILD || directory == Keyword.WILD_INFERIORS) {
                    p.directory = directory;
                } else {
                    error(new LispError("Invalid directory component for logical pathname: " + directory.writeToString()));
                }
            } else {
                p.directory = directory;
            }
        }
        if (name != NIL) {
            if (logical && name instanceof SubLString) {
                p.name = LogicalPathname.canonicalizeStringComponent((SubLString) name);
            } else if (name instanceof SubLString) {
                p.name = validateStringComponent((SubLString) name);
            } else {
                p.name = name;
            }
        }
        if (type != NIL) {
            if (logical && type instanceof SubLString) {
                p.type = LogicalPathname.canonicalizeStringComponent((SubLString) type);
            } else {
                p.type = type;
            }
        }
        p.version = version;
        return p;
    }

    private static final SubLString validateStringComponent(SubLString s) {
        final int limit = s.cl_length();
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (c == '/' || c == '\\' && Utilities.isPlatformWindows) {
                error(new LispError("Invalid character #\\" + c
                  + " in pathname component \"" + s
                  + '"'));
                // Not reached.
                return null;
            }
        }
        return s;
    }

    private final boolean validateDirectory(boolean signalError) {
        SubLObject temp = directory;
        while (temp != NIL) {
            SubLObject first = temp.first();
            temp = temp.rest();
            if (first == Keyword.ABSOLUTE || first == Keyword.WILD_INFERIORS) {
                SubLObject second = temp.first();
                if (second == Keyword.UP || second == Keyword.BACK) {
                    if (signalError) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(first.writeToString());
                        sb.append(" may not be followed immediately by ");
                        sb.append(second.writeToString());
                        sb.append('.');
                        error(new FileError(sb.toString(), this));
                    }
                    return false;
                }
            }
        }
        return true;
    }
    // ### pathnamep
    private static final Primitive PATHNAMEP = new pf_pathnamep();
    private static class pf_pathnamep extends JavaPrimitive  {
        pf_pathnamep() {
            super("pathnamep", "object");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            return arg instanceof Pathname ? T : NIL;
        }
    }
    // ### logical-pathname-p
    private static final Primitive LOGICAL_PATHNAME_P = new pf_logical_pathname_p();
    private static class pf_logical_pathname_p extends JavaPrimitive {
        pf_logical_pathname_p() {
            super("logical-pathname-p", PACKAGE_SYS, true, "object");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            return arg instanceof LogicalPathname ? T : NIL;
        }
    }
    // ### user-homedir-pathname &optional host => pathname
    private static final Primitive USER_HOMEDIR_PATHNAME = new pf_user_homedir_pathname();
    private static class pf_user_homedir_pathname extends JavaPrimitive {
        pf_user_homedir_pathname() {
            super("user-homedir-pathname", "&optional host");
        }
        @Override
        public SubLObject execute(SubLObject[] args) {
            switch (args.length) {
            case 0: {
                String s = System.getProperty("user.home");
                if (!s.endsWith(File.separator)) {
                    s = s.concat(File.separator);
                }
                return new Pathname(s);
            }
            case 1:
                return NIL; // ??? huh? -- ME 20100206
            default:
                return error(new WrongNumberOfArgumentsException(this));
            }
        }
    }

    // ### list-directory directory
    private static final Primitive LIST_DIRECTORY = new pf_list_directory();
    private static class pf_list_directory extends JavaPrimitive {
        pf_list_directory() {
            super("list-directory", PACKAGE_SYS, true, "directory");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            Pathname pathname = coerceToPathname(arg);
            if (pathname instanceof LogicalPathname) {
                pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
            }

            SubLObject result = NIL;
            if (pathname.isJar()) {
                String directory = pathname.asEntryPath();
                Debug.assertTrue(directory != null);  // We should only be listing directories

                if (pathname.device.rest() instanceof SubLCons) {
                    return error(new FileError("Unimplemented directory listing of JAR within JAR.", pathname));
                }

                if (directory.length() == 0) {
                    directory = "/*";
                } else {
                    if (directory.endsWith("/")) {
                        directory = "/" + directory + "*";
                    } else {
                        directory = "/" + directory + "/*";
                    }
                }
                SubLString wildcard = makeString(directory);
                SubLString wildcardDirectory = makeString(directory + "/");

                ZipFile jar = ZipCache.get(pathname.device.first());
                SubLObject matches;
                for (Enumeration<? extends ZipEntry> entries = jar.entries(); 
                     entries.hasMoreElements();) {
                    ZipEntry entry = entries.nextElement();
                    String entryName = "/" + entry.getName();

                    if (entryName.endsWith("/")) {
                        matches = LispSymbols.PATHNAME_MATCH_P
                            .execute(makeString(entryName), wildcardDirectory);
                    } else {
                        matches = LispSymbols.PATHNAME_MATCH_P.
                            execute(makeString(entryName), wildcard);
                    }
                    if (!matches.equals(NIL)) {
                        String namestring = new String(pathname.getNamestring());
                        namestring = namestring.substring(0, namestring.lastIndexOf("!/") + 2)
                                 + entry.getName();
                        Pathname p = new Pathname(namestring);
                        result = makeCons(p, result);
                    }
                }
                return result;
            }

            String s = pathname.getNamestring();
            if (s != null) {
                File f = new File(s);
                if (f.isDirectory()) {
                    try {
                        File[] files = f.listFiles();
                        for (int i = files.length; i-- > 0;) {
                            File file = files[i];
                            Pathname p;
                            if (file.isDirectory()) {
                                p = Utilities.getDirectoryPathname(file);
                            } else {
                                p = new Pathname(file.getCanonicalPath());
                            }
                            result = makeCons(p, result);
                        }
                    } catch (IOException e) {
                        return error(new FileError("Unable to list directory " + pathname.writeToString() + ".",
                                                   pathname));
                    } catch (SecurityException e) {
                        Debug.trace(e);
                    } catch (NullPointerException e) {
                        Debug.trace(e);
                    }
                }
            }
            return result;
        }
    }

    // ### match-wild-jar-pathname wild-jar-pathname
    static final Primitive MATCH_WILD_JAR_PATHNAME = new pf_match_wild_jar_pathname();
    private static class pf_match_wild_jar_pathname extends JavaPrimitive {
        pf_match_wild_jar_pathname() {
            super("match-wild-jar-pathname", PACKAGE_SYS, false, "wild-jar-pathname");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            Pathname pathname = coerceToPathname(arg);
            if (pathname instanceof LogicalPathname) {
                pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
            }
            if (!pathname.isJar()) {
                return new FileError("Not a jar pathname.", pathname);
            }
            if (!pathname.isWild()) {
                return new FileError("Not a wild pathname.", pathname);
            }
            Pathname jarPathname = new Pathname(pathname);
            jarPathname.directory = NIL;
            jarPathname.name = NIL;
            jarPathname.type = NIL;
            jarPathname.invalidateNamestring();
            // will propagate an appropiate Lisp error if jarPathname
            // doesn't exist.
            SubLObject jarTruename = truename(jarPathname, true); 

            SubLObject result = NIL;
            String wild = "/" + pathname.asEntryPath();

            if (pathname.device.rest() instanceof SubLCons) {
                return error(new FileError("Unimplemented directory listing of JAR within JAR.", pathname));
            }
            
            final SubLString wildcard = makeString(wild);

            ZipFile jar = ZipCache.get(pathname.device.first());

            for (Enumeration<? extends ZipEntry> entries = jar.entries(); entries.hasMoreElements();) {
                ZipEntry entry = entries.nextElement();
                String entryName = "/" + entry.getName();
                
                SubLObject matches = LispSymbols.PATHNAME_MATCH_P
                    .execute(makeString(entryName), wildcard);

                if (!matches.equals(NIL)) {
                    String namestring = new String(pathname.getNamestring());
                    namestring = namestring.substring(0, namestring.lastIndexOf("!/") + 2)
                        + entry.getName();
                    Pathname p = new Pathname(namestring);
                    result = makeCons(p, result);
                }
            }
            return result;
        }
    }

    public boolean isAbsolute()  {
        if (!directory.equals(NIL) || !(directory == null)) {
            if (directory instanceof SubLCons) {
                if (((SubLCons)directory).first().equals(Keyword.ABSOLUTE)) {
                    return true;
                }
            }
        }
        return false;
    }

    // ### PATHNAME-JAR-P 
    private static final Primitive PATHNAME_JAR_P = new pf_pathname_jar_p();
    private static class pf_pathname_jar_p extends JavaPrimitive {
        pf_pathname_jar_p() {
            super("pathname-jar-p", PACKAGE_SYS, true, "pathname",
                  "Predicate for whether PATHNAME references a JAR.");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            Pathname p = coerceToPathname(arg);
            return p.isJar() ? T : NIL;
        }
    }

    public boolean isJar() {
        if (device instanceof SubLCons) {
            return true;
        }
        return false;
    }

    public boolean isWild() {
        if (host == Keyword.WILD || host == Keyword.WILD_INFERIORS) {
            return true;
        }
        if (device == Keyword.WILD || device == Keyword.WILD_INFERIORS) {
            return true;
        }
        if (directory instanceof SubLCons) {
            if (memq(Keyword.WILD, directory)) {
                return true;
            }
            if (memq(Keyword.WILD_INFERIORS, directory)) {
                return true;
            }
        }
        if (name == Keyword.WILD || name == Keyword.WILD_INFERIORS) {
            return true;
        }
        if (type == Keyword.WILD || type == Keyword.WILD_INFERIORS) {
            return true;
        }
        if (version == Keyword.WILD || version == Keyword.WILD_INFERIORS) {
            return true;
        }
        return false;
    }
    // ### %wild-pathname-p
    private static final Primitive _WILD_PATHNAME_P = new pf_wild_pathname_p();
    static final class pf_wild_pathname_p extends JavaPrimitive {
        pf_wild_pathname_p() {
            super("%wild-pathname-p", PACKAGE_SYS, true);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            Pathname pathname = coerceToPathname(first);
            if (second == NIL) {
                return pathname.isWild() ? T : NIL;
            }
            if (second == Keyword.DIRECTORY) {
                if (pathname.directory instanceof SubLCons) {
                    if (memq(Keyword.WILD, pathname.directory)) {
                        return T;
                    }
                    if (memq(Keyword.WILD_INFERIORS, pathname.directory)) {
                        return T;
                    }
                }
                return NIL;
            }
            SubLObject value;
            if (second == Keyword.HOST) {
                value = pathname.host;
            } else if (second == Keyword.DEVICE) {
                value = pathname.device;
            } else if (second == Keyword.NAME) {
                value = pathname.name;
            } else if (second == Keyword.TYPE) {
                value = pathname.type;
            } else if (second == Keyword.VERSION) {
                value = pathname.version;
            } else {
                return error(new ProgramError("Unrecognized keyword "
                                              + second.writeToString() + "."));
            }
            if (value == Keyword.WILD || value == Keyword.WILD_INFERIORS) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    // ### merge-pathnames pathname &optional default-pathname default-version"
    private static final Primitive MERGE_PATHNAMES = new pf_merge_pathnames();
    static final class pf_merge_pathnames extends JavaPrimitive {
        pf_merge_pathnames() {
            super("merge-pathnames", "pathname &optional default-pathname default-version");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            Pathname pathname = coerceToPathname(arg);
            Pathname defaultPathname =
                coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue());
            SubLObject defaultVersion = Keyword.NEWEST;
            return mergePathnames(pathname, defaultPathname, defaultVersion);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            Pathname pathname = coerceToPathname(first);
            Pathname defaultPathname =
                coerceToPathname(second);
            SubLObject defaultVersion = Keyword.NEWEST;
            return mergePathnames(pathname, defaultPathname, defaultVersion);
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second,
                                  SubLObject third) {
            Pathname pathname = coerceToPathname(first);
            Pathname defaultPathname =
                coerceToPathname(second);
            SubLObject defaultVersion = third;
            return mergePathnames(pathname, defaultPathname, defaultVersion);
        }
    }

    public static final Pathname mergePathnames(Pathname pathname, Pathname defaultPathname) {
        return mergePathnames(pathname, defaultPathname, Keyword.NEWEST);
    }

    public static final Pathname mergePathnames(final Pathname pathname,
                                                final Pathname defaultPathname,
                                                final SubLObject defaultVersion) 
    {
        Pathname result;
        Pathname p = new Pathname(pathname);
        Pathname d;

        if (pathname instanceof LogicalPathname) {
            result = new LogicalPathname();
            d = new Pathname(defaultPathname);
        } else {
            result = new Pathname();
            if (defaultPathname instanceof LogicalPathname) {
                d = LogicalPathname.translateLogicalPathname((LogicalPathname) defaultPathname);
            } else {
                d = new Pathname(defaultPathname);
            }
        }
        if (pathname.host != NIL) {
            result.host = p.host;
        } else {
            result.host = d.host;
        }

        if (pathname.device != NIL) { // XXX if device represent JARs we want to merge
            result.device = p.device;
        } else {
            result.device = d.device;
        }

        if (pathname.isJar()) {
            SubLCons jars = (SubLCons)result.device;
            SubLObject jar = jars.first();
            if (jar instanceof Pathname) {
                Pathname defaults = new Pathname(d);
                if (defaults.isJar()) {
                    defaults.device = NIL;
                }
                Pathname o = mergePathnames((Pathname)jar, defaults);
                if (o.directory instanceof SubLCons
                    && ((SubLCons)o.directory).cl_length() == 1) { // i.e. (:ABSOLUTE) or (:RELATIVE)
                    o.directory = NIL;
                }
                ((SubLCons)result.device).setFirst(o);
            }
            result.directory = p.directory;
        } else {
            result.directory = mergeDirectories(p.directory, d.directory);
        }

        // A JAR always has absolute directories
        // if (result.isJar()
        //     && result.directory instanceof Cons
        //     && result.directory.car().equals(Keyword.ABSOLUTE)) {
        //     if (result.directory.cdr().equals(NIL)) {
        //         result.directory = NIL;
        //     } else {
        //         ((Cons)result.directory).car = Keyword.RELATIVE;
        //     }
        // }

        if (pathname.name != NIL) {
            result.name = p.name;
        } else {
            result.name = d.name;
        }
        if (pathname.type != NIL) {
            result.type = p.type;
        } else {
            result.type = d.type;
        }
        if (pathname.version != NIL) {
            result.version = pathname.version;
        } else if (pathname.name instanceof SubLString) {
            result.version = defaultVersion;
        } else if (defaultPathname.version != NIL) {
            result.version = defaultPathname.version;
        } else {
            result.version = defaultVersion;
        }
        if (pathname instanceof LogicalPathname) {
            // When we're returning a logical
            result.device = Keyword.UNSPECIFIC;
            if (result.directory.isList()) {
                SubLObject original = result.directory;
                SubLObject canonical = NIL;
                while (original != NIL) {
                    SubLObject component = original.first();
                    if (component instanceof SubLString) {
                        component = LogicalPathname.canonicalizeStringComponent((SubLString) component);
                    }
                    canonical = canonical.push(component);
                    original = original.rest();
                }
                result.directory = canonical.nreverse();
            }
            if (result.name instanceof SubLString) {
                result.name = LogicalPathname.canonicalizeStringComponent((SubLString) result.name);
            }
            if (result.type instanceof SubLString) {
                result.type = LogicalPathname.canonicalizeStringComponent((SubLString) result.type);
            }
        }
        result.invalidateNamestring();
        return result;
    }

    private static final SubLObject mergeDirectories(SubLObject dir,
                                                     SubLObject defaultDir) {
        if (dir == NIL) {
            return defaultDir;
        }
        if (dir.first() == Keyword.RELATIVE && defaultDir != NIL) {
            SubLObject result = NIL;
            while (defaultDir != NIL) {
                result = makeCons(defaultDir.first(), result);
                defaultDir = defaultDir.rest();
            }
            dir = dir.rest(); // Skip :RELATIVE.
            while (dir != NIL) {
                result = makeCons(dir.first(), result);
                dir = dir.rest();
            }
            SubLObject[] array = result.copyToArray();
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] == Keyword.BACK) {
                    if (array[i + 1] instanceof SubLString || array[i + 1] == Keyword.WILD) {
                        array[i] = null;
                        array[i + 1] = null;
                    }
                }
            }
            result = NIL;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    result = makeCons(array[i], result);
                }
            }
            return result;
        }
        return dir;
    }

    public static final SubLObject truename(Pathname pathname) {
        return truename(pathname, false);
    }

    public static final SubLObject truename(SubLObject arg) {
        return truename(arg, false);
    }

    public static final SubLObject truename(SubLObject arg, boolean errorIfDoesNotExist) {
        final Pathname pathname = coerceToPathname(arg);
        return truename(pathname, errorIfDoesNotExist);
    }

    /** @return The canonical TRUENAME as a Pathname if the pathname
     * exists, otherwise returns NIL or possibly a subtype of
     * LispError if there are logical problems with the input.
     */
    public static final SubLObject truename(Pathname pathname,
                                            boolean errorIfDoesNotExist) 
    {
        if (pathname instanceof LogicalPathname) {
            pathname = LogicalPathname.translateLogicalPathname((LogicalPathname) pathname);
        }
        if (pathname.isWild()) {
            return error(new FileError("Bad place for a wild pathname.",
                                       pathname));
        }
        if (!(pathname.device instanceof SubLCons)) {
            pathname
                = mergePathnames(pathname,
                                 coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue()),
                                 NIL);
            final String namestring = pathname.getNamestring();
            if (namestring == null) {
                return error(new FileError("Pathname has no namestring: " 
                                           + pathname.writeToString(),
                                           pathname));
            }
            
            final File file = new File(namestring);
            if (file.isDirectory()) {
                return Utilities.getDirectoryPathname(file);
            }
            if (file.exists()) {
                try {
                    return new Pathname(file.getCanonicalPath());
                } catch (IOException e) {
                    return error(new FileError(e.getMessage(), pathname));
                }
            }
        } else
        jarfile: {
            // Possibly canonicalize jar file directory
            SubLCons jars = (SubLCons) pathname.device;
            SubLObject o = jars.first();
            if (o instanceof Pathname) {
                SubLObject truename = Pathname.truename((Pathname)o, errorIfDoesNotExist);
                if (truename != null
                    && truename instanceof Pathname) {
                    jars.setFirst((Pathname)truename);
                } else {
                    break jarfile;
                }
            }

            // Check for existence of a JAR file and/or JarEntry
            //
            // Cases:
            // 1.  JAR
            // 2.  JAR in JAR
            // 3.  JAR with Entry
            // 4.  JAR in JAR with Entry
            ZipFile jarFile = ZipCache.get(jars.first());
            String entryPath = pathname.asEntryPath();
            if (jarFile != null) {
                if (jars.rest() instanceof SubLCons) {
                  Pathname inner = (Pathname) jars.rest().first();
                  InputStream inputStream = Utilities.getInputStream(jarFile, inner);
                  if (inputStream != null) {
                      if (entryPath.length() == 0) {
                          return pathname; // Case 2
                      } else {
                          ZipInputStream zipInputStream
                              = new ZipInputStream(inputStream);
                          ZipEntry entry = Utilities.getEntry(zipInputStream,
                                                              entryPath,
                                                              false);
                          if (entry != null) {
                              // XXX this could possibly be a directory?
                              return pathname; // Case 4
                         }
                      }
                  }
                } else {
                    if (entryPath.length() == 0) {
                        return pathname; // Case 1
                    } else {
                        ZipEntry entry = jarFile.getEntry(entryPath);
                        if (entry != null) {
                            // ensure this isn't a directory
                            try {
                                InputStream input = jarFile.getInputStream(entry);
                                if (input != null) {
                                    return pathname; // Case 3
                                }
                            } catch (IOException e) {
                                break jarfile;
                            }
                        }
                    }
                }
            }
        }
        error:
        if (errorIfDoesNotExist) {
            StringBuilder sb = new StringBuilder("The file ");
            sb.append(pathname.writeToString());
            sb.append(" does not exist.");
            return error(new FileError(sb.toString(), pathname));
        }
        return NIL;
    }


    /** Make a JarURL from a Pathname that references a file */
    private static URL makeJarURL(Pathname p) {
        String jarURL = "jar:file:" + p.getNamestring() + "!/";
        URL result = null;
        try {
            result = new URL(jarURL);
        } catch (MalformedURLException ex) {
            // XXX
            Debug.trace("Could not form URL from pathname "
              + "'" + jarURL + "'"
              + " because " + ex);
        }
        return result;
    }

    protected static URL makeURL(SubLObject device) {
        URL result = null;
        try {
        if (device instanceof SubLString) {
            result = new URL(((SubLString)device).getString());
        } else {
        // XXX ensure that we have cannonical path.
            Pathname p = (Pathname)device;
            result = new URL("file:" + p.getNamestring());
        }
        } catch (MalformedURLException e) {
            Debug.trace("Could not form URL from " + device);
        }
        return result;
    }

    public InputStream getInputStream() {
        InputStream result = null;
        if (isJar()) {
            String entryPath = asEntryPath();
            // XXX We only return the bytes of an entry in a JAR
            Debug.assertTrue(entryPath != null);
            ZipFile jarFile = ZipCache.get(device.first());
            Debug.assertTrue(jarFile != null);
            // Is this a JAR within a JAR?
            if (device.rest() instanceof SubLCons) {
                Pathname inner = (Pathname) device.rest().first();
                InputStream input = Utilities.getInputStream(jarFile, inner);
                ZipInputStream zipInputStream = new ZipInputStream(input);
                result =  Utilities.getEntryAsInputStream(zipInputStream, entryPath);
            } else {
                ZipEntry entry = jarFile.getEntry(entryPath);
		if (entry == null) {
		    Debug.trace("Failed to get InputStream for "    
				+ "'" + getNamestring() + "'");

		    Debug.assertTrue(false);
		}
                try {
                    result = jarFile.getInputStream(entry);
                } catch (IOException e) {
                    Debug.trace("Failed to get InputStream from "
                                + "'" + getNamestring() + "'"
                                + ": " + e);
                }
            }
        } else {
            File file = Utilities.getFile(this);
            try { 
                result = new FileInputStream(file);
            } catch (IOException e) {
                Debug.trace("Failed to get InputStream for read from "
                                + "'" + getNamestring() + "'"
                                + ": " + e);
            }
        }
        return result;
    }

    /** @return Time in milliseconds since the UNIX epoch at which the
     * resource was last modified, or 0 if the time is unknown.
     */
    public long getLastModified() {
        if (!(device instanceof SubLCons)) {
            File f = Utilities.getFile(this);
            return f.lastModified();
        }
        // JAR cases
        // 0.  JAR from URL 
        // 1.  JAR
        // 2.  JAR in JAR
        // 3.  Entry in JAR
        // 4.  Entry in JAR in JAR
        String entryPath = asEntryPath();
        SubLCons d = (SubLCons)device;
        if (d.rest().equals(NIL)) {
            if (entryPath.length() == 0) {
                SubLObject o = d.first();
                if (o instanceof SubLString) {
                    // 0. JAR from URL
                    // URL u = makeJarURL(o.getStringValue());
                    // XXX unimplemented
                    Debug.assertTrue(false);
                    // URLConnection c = null;
                    // try {
                    //   c = u.openConnection();
                    // } catch(IOException e) {
                    //   Debug.trace("Failed to open Connection for URL "
                    //               + "'" + u + "'");
                    //   return 0;
                    // }
                    // c.getLastModified();
                } else  {  
                    // 1. JAR
                    return ((Pathname)o).getLastModified();
                }
            } else {
                // 3. Entry in JAR
                final ZipEntry entry 
                    = ZipCache.get(device.first()).getEntry(entryPath);
                if (entry == null) {
                    return 0;
                }
                final long time = entry.getTime();
                if (time == -1) {
                    return 0;
                }
                return time;
            }
        } else {
            ZipFile outerJar = ZipCache.get(d.first());
            if (entryPath.length() == 0) {
                // 4.  JAR in JAR
                String jarPath = ((Pathname)d.rest()).asEntryPath();
                final ZipEntry entry = outerJar.getEntry(jarPath);
                final long time = entry.getTime();
                if (time == -1) {
                    return 0;
                }
                return time;
            } else {
                // 5. Entry in JAR in JAR
                String innerJarPath = ((Pathname)d.rest()).asEntryPath();
                ZipEntry entry = outerJar.getEntry(entryPath);
                ZipInputStream innerJarInputStream
                    = Utilities.getZipInputStream(outerJar, innerJarPath);
                ZipEntry innerEntry = Utilities.getEntry(innerJarInputStream,
                                                         entryPath);
                long time = innerEntry.getTime();
                if (time == -1) {
                    return 0;
                }
                return time;
            }
        }
        return 0;
    }

    // ### mkdir pathname
    private static final Primitive MKDIR = new pf_mkdir();
    private static class pf_mkdir extends JavaPrimitive {
        pf_mkdir() {
            super("mkdir", PACKAGE_SYS, false, "pathname");
        }

        @Override
        public SubLObject execute(SubLObject arg) {
            final Pathname pathname = coerceToPathname(arg);
            if (pathname.isWild()) {
                error(new FileError("Bad place for a wild pathname.", pathname));
            }
            Pathname defaultedPathname =
                mergePathnames(pathname,
                               coerceToPathname(LispSymbols.DEFAULT_PATHNAME_DEFAULTS.symbolValue()),
                               NIL);
            File file = Utilities.getFile(defaultedPathname);
            return file.mkdir() ? T : NIL;
        }
    }

    // ### rename-file filespec new-name => defaulted-new-name, old-truename, new-truename
    private static final Primitive RENAME_FILE = new pf_rename_file();
    private static class pf_rename_file extends JavaPrimitive {
        pf_rename_file() {
            super("rename-file", "filespec new-name");
        }
        @Override
        public SubLObject execute(SubLObject first, SubLObject second) {
            final Pathname original = (Pathname) truename(first, true);
            final String originalNamestring = original.getNamestring();
            Pathname newName = coerceToPathname(second);
            if (newName.isWild()) {
                error(new FileError("Bad place for a wild pathname.", newName));
            }
            newName = mergePathnames(newName, original, NIL);
            final String newNamestring;
            if (newName instanceof LogicalPathname) {
                newNamestring = LogicalPathname.translateLogicalPathname((LogicalPathname) newName).getNamestring();
            } else {
                newNamestring = newName.getNamestring();
            }
            if (originalNamestring != null && newNamestring != null) {
                final File source = new File(originalNamestring);
                final File destination = new File(newNamestring);
                if (Utilities.isPlatformWindows) {
                    if (destination.isFile()) {
			ZipCache.remove(destination);
                        destination.delete();
                    }
                }
                if (source.renameTo(destination)) { // Success!
                        return LispThread.currentThread().setValues(newName, original,
                                                                    truename(newName, true));
                }
            }
            return error(new FileError("Unable to rename "
                                       + original.writeToString()
                                       + " to " + newName.writeToString()
                                       + "."));
        }
    }

    // ### file-namestring pathname => namestring
    private static final Primitive FILE_NAMESTRING = new pf_file_namestring();
    private static class pf_file_namestring extends JavaPrimitive {
        pf_file_namestring() {
            super("file-namestring", "pathname");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            Pathname p = coerceToPathname(arg);
            StringBuilder sb = new StringBuilder();
            if (p.name instanceof SubLString) {
                sb.append(p.name.getString());
            } else if (p.name == Keyword.WILD) {
                sb.append('*');
            } else {
                return NIL;
            }
            if (p.type instanceof SubLString) {
                sb.append('.');
                sb.append(p.type.getString());
            } else if (p.type == Keyword.WILD) {
                sb.append(".*");
            }
            return makeString(sb);
        }
    }

    // ### host-namestring pathname => namestring
    private static final Primitive HOST_NAMESTRING = new pf_host_namestring();
    private static class pf_host_namestring extends JavaPrimitive {
        pf_host_namestring() {
            super("host-namestring", "pathname");
        }
        @Override
        public SubLObject execute(SubLObject arg) {
            return coerceToPathname(arg).host;
        }
    }
    
    public String toString() {
        return getNamestring();
    }

    static {
        SubLObject obj = LispSymbols.DEFAULT_PATHNAME_DEFAULTS.getSymbolValue();
        LispSymbols.DEFAULT_PATHNAME_DEFAULTS.setSymbolValue(coerceToPathname(obj));
    }
}

