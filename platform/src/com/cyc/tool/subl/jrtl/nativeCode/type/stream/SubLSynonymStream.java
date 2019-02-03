//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLSynonymStream extends AbstractRandomAccessSubLStream {
	public SubLSynonymStream(SubLSymbol streamSymbol) {
		super(Keyword.TEXT_KEYWORD_CHARACTER, getDirection(streamSymbol),
				Keyword.ERROR_KEYWORD, Keyword.ERROR_KEYWORD);
		this.streamSymbol = (Symbol) streamSymbol;
	}

	/**
	 * @param streamSymbol
	 * @return
	 */
	public static SubLSymbol getDirection(SubLSymbol streamSymbol) {
		if(streamSymbol==null) return null;
		SubLObject o = streamSymbol.getValue();
		if(o==null) return null;
		SubLStream s = o.getStream(true);
		if(s==null) {
			return Keyword.UNDERFLOW;
		}
		SubLSymbol d = s.getDirection();
		return d.toSymbol();
	}

	private SubLSymbol streamSymbol;

	@Override
	public SubLSymbol getDirection() {
		return getStream(true).getDirection();
	}

	@Override
	public SubLSymbol getElementType() {
		return getStream(true).getElementType();
	}

	@Override
	public FileDescriptor getFD() {
		return getStream(true).getFD();
	}

	@Override
	public File getFile() {
		return getStream(true).getFile();
	}

	@Override
	public long getFilePointer() {
		return getStream(true).getFilePointer();
	}

	@Override
	public String getNewline() {
		return getStream(true).getNewline();
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		if (!followSynonymStream)
			return this;
		try {
			SubLStream result;
			for (result = streamSymbol.getValue()
					.getStream(true); result instanceof SubLSynonymStream; result = ((SubLSynonymStream) result)
							.getStreamSymbol().getValue().getStream(true)) {
			}
			return result;
		} catch (Exception e) {
			return this;
		}
	}

	@Override
	public SubLSymbol getStreamSymbol() {
		return streamSymbol;
	}

	@Override
	public SubLSymbol ifExists() {
		return getStream(true).ifExists();
	}

	@Override
	public SubLSymbol ifNotExists() {
		return getStream(true).ifNotExists();
	}

	@Override
	public boolean isInteractive() {
		return getStream(true).isInteractive();
	}

	@Override
	public boolean isRandomAccess() {
		return getStream(true).isRandomAccess();
	}

	/** throws exception if isRandomAccess() returns false */
	@Override
	public long file_length() {
		return getStream(true).file_length();
	}

	/** throws exception if isRandomAccess() returns false */
	@Override
	public void seek(long pos) {
		getStream(true).seek(pos);
	}

	@Override
	public void setIsInteractive(boolean newValue) {
		getStream(true).setIsInteractive(newValue);
	}

	/*
	 * public synchronized void close() { getStream(true).close(); }
	 *
	 * public boolean isClosed() { return getStream(true).isClosed(); }
	 */

	/** throws exception if isRandomAccess() returns false */
	@Override
	public void setLength(long newLength) {
		getStream(true).setLength(newLength);
	}

	@Override
	public void setNewline(String newline) {
		getStream(true).setNewline(newline);
	}

	/** Method created to avoid casting */
	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return getStream(true).toInputBinaryStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLInputStream toInputStream() {
		return getStream(true).toInputStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLInputTextStream toInputTextStream() {
		return getStream(true).toInputTextStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return getStream(true).toOutputBinaryStream();
	}

	/** Method created to avoid casting */
	@Override
	public SubLOutputStream toOutputStream() {
		return getStream(true).toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return getStream(true).toOutputTextStream();
	}
}
