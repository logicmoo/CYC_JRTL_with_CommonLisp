/*
 * XmlParserImpl.java
 *
 * Copyright (C) 2000-2002 Peter Graves
 * $Id: XmlParserImpl.java,v 1.1.1.1 2002-09-24 16:08:57 piso Exp $
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
 */

package org.armedbear.j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Stack;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeModel;
import org.xml.sax.AttributeList;
import org.xml.sax.DocumentHandler;
import org.xml.sax.HandlerBase;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.ParserFactory;

public final class XmlParserImpl extends HandlerBase implements Runnable,
    DocumentHandler
{
    private String parserClassName;
    private boolean aelfred;
    private Buffer buffer;
    private Reader reader;
    private TreeModel treeModel;
    private Stack stack;
    private Exception exception;
    private DefaultMutableTreeNode current;
    private Locator locator;

    public XmlParserImpl()
    {
    }

    public String getParserClassName()
    {
        return parserClassName;
    }

    public void setBuffer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public void setReader(Reader reader)
    {
        this.reader = reader;
    }

    public Exception getException()
    {
        return exception;
    }

    public void run()
    {
        exception = null;
        // Parser must be associated with a buffer.
        if (buffer == null)
            return;
        InputSource inputSource = null;
        final File file = buffer.getFile();
        if (reader != null) {
            inputSource = new InputSource(reader);
        } else if (file != null) {
            try {
                InputStream inputStream = file.getInputStream();
                if (inputStream != null) {
                    inputSource = new InputSource(inputStream);
                    String encoding = file.getEncoding();
                    if (encoding != null) {
                        inputSource.setEncoding(encoding);
                        Log.debug("parser encoding is " + encoding);
                    }
                }
            }
            catch (IOException e) {
                Log.error(e);
            }
        }
        if (inputSource == null)
            return;
        if (file != null) {
            if (file.isRemote())
                inputSource.setSystemId(file.netPath());
            else
                inputSource.setSystemId("file://".concat(file.canonicalPath()));
        }
        treeModel = null;
        stack = new Stack();
        Parser parser = getParser();
        if (parser != null) {
            parser.setDocumentHandler(this);
            parser.setErrorHandler(this);
            parser.setEntityResolver(this);
            buffer.exception = null;
            try {
                parser.parse(inputSource);
            }
            catch (Exception e) {
                exception = e;
                buffer.exception = e;
            }
        }
    }

    private Parser getParser()
    {
        Parser parser = null;
        String className =
            Editor.preferences().getStringProperty("org.xml.sax.parser");
        if (className == null) {
            className = System.getProperty("org.xml.sax.parser");
            if (className == null)
                className = "org.armedbear.j.aelfred.SAXDriver";
        }
        try {
            parser = ParserFactory.makeParser(className);
        }
        catch (Exception e) {}
        if (parser == null) {
            // Last resort. See if there's something in the CLASSPATH that we
            // know how to use.
            String[] knownParsers = {
                "com.sun.xml.parser.Parser",
                "org.apache.xerces.parsers.SAXParser",
                "com.jclark.xml.sax.Driver"
            };
            for (int i = 0; i < knownParsers.length; i++) {
                try {
                    parser = ParserFactory.makeParser(knownParsers[i]);
                    break;
                }
                catch (Exception e) {}
            }
        }
        if (parser == null) {
            parserClassName = null;
            aelfred = false;
            Log.error("no parser found");
        } else {
            parserClassName = parser.getClass().getName();
            Log.debug("using ".concat(parserClassName));
            if (parserClassName.equals("org.armedbear.j.aelfred.SAXDriver"))
                aelfred = true;
            else
                aelfred = false;
        }
        return parser;
    }

    public InputSource resolveEntity(String publicId, String systemId)
    {
        if (systemId == null)
            return null;
        if (Platform.isPlatformWindows() && systemId.startsWith("file://")) {
            // Strip "file://" prefix.
            String filename = systemId.substring(7);
            // Make sure there's a colon after the drive letter.
            if (filename.length() > 2 && filename.charAt(1) == '/')
                filename = filename.substring(0, 1) + ':' + filename.substring(1);
            // Make sure the slashes are pointing the right way.
            filename = File.normalize(filename);
            try {
                return new InputSource(new FileInputStream(filename));
            }
            catch (FileNotFoundException e) {}
            // FileNotFoundException was thrown.
            if (filename.length() > 3 && filename.charAt(1) == ':'
                && filename.charAt(2) == '\\') {
                // Try relative to buffer's directory.
                File file = File.getInstance(buffer.getFile().getParentFile(),
                    filename.substring(3));
                try {
                    return new InputSource(new FileInputStream(file.canonicalPath()));
                }
                catch (Exception e) {}
            }
        }
        if (aelfred) {
            // There's no way to tell aelfred about new system identifiers, so
            // URLs relative to the new entity won't be resolved correctly if
            // we return an input stream here. Don't use caching if we're
            // using aelfred!
            Log.debug("using aelfred - cache not supported");
            return null;
        }
        if (!buffer.getBooleanProperty(Property.ENABLE_CACHE)) {
            Log.debug("cache disabled");
            return null;
        }
        if (systemId.startsWith("http://")) {
            Cache cache = Cache.getCache();
            if (cache != null) {
                Log.debug("checking cache for ".concat(systemId));
                File file = cache.get(systemId);
                if (file == null) {
                    Log.debug("caching ".concat(systemId));
                    file = cache.put(systemId);
                }
                if (file != null) {
                    try {
                        Log.debug("returning input stream from cache");
                        InputSource inputSource =
                            new InputSource(file.getInputStream());
                        inputSource.setSystemId(systemId);
                        return inputSource;
                    }
                    catch (Exception e) {
                        Log.error(e);
                    }
                }
            }
        }
        return null;
    }

    public void setDocumentLocator(Locator locator)
    {
        this.locator = locator;
    }

    public void startElement(String name, AttributeList attributes) throws SAXException
    {
        int lineNumber = 0;
        int columnNumber = 0;
        if (locator != null) {
            lineNumber = locator.getLineNumber();
            columnNumber = locator.getColumnNumber();
        }
        DefaultMutableTreeNode node =
            new DefaultMutableTreeNode(new XmlTreeElement(name, attributes,
                lineNumber, columnNumber));
        if (treeModel == null)
            treeModel = new DefaultTreeModel(node);
        else {
            Debug.assertTrue(current != null);
            current.insert(node, current.getChildCount());
            stack.push(current);
        }
        current = node;
    }

    public void endElement(String name)
    {
        if (stack.empty())
            current = null;
        else
            current = (DefaultMutableTreeNode) stack.pop();
    }

    public TreeModel getTreeModel()
    {
        return treeModel;
    }
}
