package org.opencyc.xml;

import java.util.HashMap;
import org.opencyc.util.Pair;
import java.util.ListIterator;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public abstract class XMLWriter {
	static final String baseIndentString = "";
	private static final Map ENTITY_REFERENCES;
	String indentString;

	public XMLWriter() {
		this.indentString = "";
	}

	public static String introduceXMLEntities(final String inputString) {
		final StringBuffer stringBuffer = new StringBuffer();
		for (int length = inputString.length(), i = 0; i < length; ++i) {
			final char c = inputString.charAt(i);
			if (XMLWriter.ENTITY_REFERENCES.containsKey(new Character(c))) {
				stringBuffer.append(XMLWriter.ENTITY_REFERENCES.get(new Character(c)));
			} else {
				stringBuffer.append(c);
			}
		}
		return stringBuffer.toString();
	}

	public void setIndent(final int indent, final boolean relative) throws RuntimeException {
		if (indent == 0 && !relative) {
			this.indentString = "";
		} else if (indent > 0) {
			final char[] ind = new char[indent];
			Arrays.fill(ind, ' ');
			final String indentString = this.indentString;
			final String offset = String.copyValueOf(ind);
			if (relative) {
				this.indentString += offset;
			} else {
				this.indentString = offset;
			}
		} else if (0 > indent) {
			if (!relative) {
				throw new RuntimeException("XMLWriter cannot have negative indentation");
			}
			final int abs = -1 * indent;
			if (this.indentString.length() < abs) {
				throw new RuntimeException("XMLWriter cannot have negative indentation");
			}
			this.indentString = this.indentString.substring(abs);
		}
	}

	public void resetIndent() {
		this.indentString = "";
	}

	public int getIndentLength() {
		return this.indentString.length();
	}

	public abstract void flush() throws IOException;

	public abstract void close() throws IOException;

	public abstract void print(final String p0) throws IOException;

	public void printSafe(final String string) throws IOException {
		this.print(introduceXMLEntities(string));
	}

	public abstract void indentPrint(final String p0, final int p1, final boolean p2) throws IOException;

	public void indentPrintSafe(final String string, final int indent, final boolean relative) throws IOException {
		final String safeString = introduceXMLEntities(string);
		this.indentPrint(safeString, indent, relative);
	}

	public void indentPrintln(final String string, final int indent, final boolean relative) throws IOException {
		this.indentPrint(string + "\n", indent, relative);
	}

	public void indentPrintSafeln(final String string, final int indent, final boolean relative) throws IOException {
		final String safeString = introduceXMLEntities(string) + "\n";
		this.indentPrint(safeString, indent, relative);
	}

	public void printXMLAtomicTag(final String tag, final int indent, final boolean relative) throws IOException {
		final String xmltag = "<" + tag + "/>";
		this.indentPrintln(xmltag, indent, relative);
	}

	public void printXMLAtomicTag(final String tag, final ListIterator attributesIterator, final int indent, final boolean relative) throws IOException {
		String attributeString = "";
		while (attributesIterator.hasNext()) {
			final Pair attributePair = (Pair) attributesIterator.next();
			attributeString = " " + (String) attributePair.component1 + "=\"" + (String) attributePair.component2 + "\"" + attributeString;
		}
		final String xmltag = "<" + tag + attributeString + "/>";
		this.indentPrintln(xmltag, indent, relative);
	}

	public void printXMLStartTag(String tag, final int indent, final boolean relative) throws IOException {
		if (tag.length() > 0 && tag.charAt(0) != '<') {
			tag = "<" + tag + ">";
		}
		this.indentPrint(tag, indent, relative);
	}

	public void printXMLAtomicTag(final String tag, final String attributeName, final String attributeValue, final int indent, final boolean relative, final boolean newline) throws IOException {
		final String attributeString = attributeName + "=\"" + attributeValue + "\"";
		final String xmltag = "<" + tag + " " + attributeString + "/>";
		if (newline) {
			this.indentPrintln(xmltag, indent, relative);
		} else {
			this.indentPrint(xmltag, indent, relative);
		}
	}

	public void printXMLStartTag(final String tag, final int indent, final boolean relative, final boolean newline) throws IOException {
		final String xmltag = "<" + tag + ">";
		if (newline) {
			this.indentPrintln(xmltag, indent, relative);
		} else {
			this.indentPrint(xmltag, indent, relative);
		}
	}

	public void printXMLStartTag(final String tag, final ListIterator attributesIterator, final int indent, final boolean relative, final boolean newline) throws IOException {
		String attributeString = "";
		while (attributesIterator.hasNext()) {
			final Pair attributePair = (Pair) attributesIterator.next();
			attributeString = " " + (String) attributePair.component1 + "=\"" + (String) attributePair.component2 + "\"" + attributeString;
		}
		final String xmltag = "<" + tag + attributeString + ">";
		if (newline) {
			this.indentPrintln(xmltag, indent, relative);
		} else {
			this.indentPrint(xmltag, indent, relative);
		}
	}

	public void printXMLStartTag(final String tag, final String attributeName, final String attributeValue, final int indent, final boolean relative, final boolean newline) throws IOException {
		final String attributeString = attributeName + "=\"" + attributeValue + "\"";
		final String xmltag = "<" + tag + " " + attributeString + ">";
		if (newline) {
			this.indentPrintln(xmltag, indent, relative);
		} else {
			this.indentPrint(xmltag, indent, relative);
		}
	}

	public void printXMLEndTag(final String tag, final int indent, final boolean relative) throws IOException {
		final String xmltag = "</" + tag + ">";
		this.indentPrintln(xmltag, indent, relative);
	}

	public void printXMLEndTag(final String tag) throws IOException {
		final String xmltag = "</" + tag + ">";
		this.print(xmltag + "\n");
	}

	static {
		(ENTITY_REFERENCES = new HashMap()).put(new Character('<'), "&lt;");
		XMLWriter.ENTITY_REFERENCES.put(new Character('&'), "&amp;");
		XMLWriter.ENTITY_REFERENCES.put(new Character('>'), "&gt;");
		XMLWriter.ENTITY_REFERENCES.put(new Character('\"'), "&quot;");
		XMLWriter.ENTITY_REFERENCES.put(new Character('\''), "&apos;");
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 121 ms
	
	Decompiled with Procyon 0.5.32.
*/