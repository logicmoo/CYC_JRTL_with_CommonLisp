/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import static org.armedbear.lisp.Keyword.ERROR_KEYWORD;
import static org.armedbear.lisp.Keyword.IO_KEYWORD;
import static org.armedbear.lisp.Keyword.TEXT_KEYWORD_CHARACTER;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
public class SubLInOutTextStreamImpl extends AbstractSubLTextStream
		implements SubLInOutTextStream, SubLOutputTextStream, SubLInputTextStream {
	protected SubLInOutTextStreamImpl() {
		super(TEXT_KEYWORD_CHARACTER, IO_KEYWORD, ERROR_KEYWORD,
				ERROR_KEYWORD);
		freshLine = false;
	}

	SubLInOutTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, TEXT_KEYWORD_CHARACTER, IO_KEYWORD, ifExists, ifNotExists);
		freshLine = false;
	}

	SubLInOutTextStreamImpl(SubLInputTextStream inStream, SubLOutputTextStream outStream) {
		super(TEXT_KEYWORD_CHARACTER, IO_KEYWORD, ERROR_KEYWORD,
				ERROR_KEYWORD);
		freshLine = false;
		this.inStream =(Stream) inStream;
		this.outStream =(Stream) outStream;
		if (inStream == null || outStream == null)
			Errors.error("Unable to create in/out stream.");
	}

	public SubLInOutTextStreamImpl(Symbol twoWayStream) {
		super(twoWayStream);
		setElementType(TEXT_KEYWORD_CHARACTER);
        direction = Keyword.IO_KEYWORD;
	}

	SubLInOutTextStreamImpl(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
	}

	SubLInOutTextStreamImpl(String filename, SubLSymbol elementType, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, elementType, IO_KEYWORD, ifExists, ifNotExists);
	}
	protected Stream inStream;
	protected Stream outStream;
	//private boolean freshLine;

//	@Override
//	public Stream makeLispStream() {
//		return new TwoWayStream(inStream.toLispObject(), outStream.toLispObject());
//	}


	@Override
	public synchronized void close() {
		if (shouldParentDoWork()) {
			super.close();
			return;
		}
		if (isClosed())
			return;
		super.close();
		try {
			try {
				if (outStream != null)
					outStream.close();
			} finally {
				if (inStream != null)
					inStream.close();
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	@Override
	public void flush() {
		if (shouldParentDoWork()) {
			super.flush();
			return;
		}
		toOutputTextStream().flush();
	}

	@Override
	public boolean freshLine() {
		if (shouldParentDoWork())
			return freshLine;
		return toOutputTextStream().freshLine();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		if (shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		return toInputBinaryStream().readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		if (shouldParentDoWork())
			return super.readByteSequenceToString(str);
		return toInputBinaryStream().readByteSequenceToString(str);
	}

	@Override
	public int readChar() {
		if (shouldParentDoWork())
			return super.readChar();
		return toInputTextStream().readChar();
	}

	@Override
	public int readChar(char[] b) {
		if (shouldParentDoWork())
			return super.readChar(b);
		return toInputTextStream().readChar(b);
	}

	@Override
	public int readChar(char[] b, int off, int len) {
		if (shouldParentDoWork())
			return super.readChar(b, off, len);
		return toInputTextStream().readChar(b, off, len);
	}

	@Override
	public boolean ready() {
		if (shouldParentDoWork())
			return super.ready();
		return toInputTextStream().ready();
	}

	@Override
	public long skip(long n) {
		if (shouldParentDoWork())
			return super.skip(n);
		return toInputTextStream().skip(n);
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLInputBinaryStream) inStream;
	}

	@Override
	public SubLInputStream toInputStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLInputStream) inStream;
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLInputTextStream) inStream;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLOutputBinaryStream) outStream;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLOutputStream) outStream;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		if (shouldParentDoWork())
			return this;
		return (SubLOutputTextStream) outStream;
	}

	@Override
	public void unread(int c) {
		if (shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		toInputTextStream().unread(c);
	}

	@Override
	public void writeChar(char b) {
		if (shouldParentDoWork()) {
			super.writeChar(b);
			return;
		}
		toOutputTextStream().writeChar(b);
	}

	@Override
	public void writeChar(char[] b) {
		if (shouldParentDoWork()) {
			super.writeChar(b);
			return;
		}
		toOutputTextStream().writeChar(b);
	}

	@Override
	public void writeChar(char[] b, int off, int len) {
		if (shouldParentDoWork()) {
			super.writeChar(b, off, len);
			return;
		}
		toOutputTextStream().writeChar(b, off, len);
	}

	@Override
	public void writeNewline() {
		if (shouldParentDoWork()) {
			super.write(getNewline());
			return;
		}
		toOutputTextStream().writeNewline();
	}

	@Override
	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		if (shouldParentDoWork())
			super.writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		toOutputBinaryStream().writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
	}

	@Override
	public void writeString(String str) {
		if (shouldParentDoWork()) {
			super.write(str);
			return;
		}
		toOutputTextStream().writeString(str);
	}

	@Override
	public void writeString(String str, int off, int len) {
		if (shouldParentDoWork()) {
			super.write(str, off, len);
			return;
		}
		toOutputTextStream().writeString(str, off, len);
	}
}
