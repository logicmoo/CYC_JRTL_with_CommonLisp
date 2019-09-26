/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;

import org.armedbear.lisp.BroadcastStream;
import org.armedbear.lisp.Stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLBroadcastStream extends BroadcastStream implements SubLOutputTextStream, SubLOutputBinaryStream {
	SubLBroadcastStream() {
		this((SubLOutputStream[]) null);
	}

	public SubLBroadcastStream(SubLOutputStream[] streams) {
		super(asOutputStreams(streams));
		isClosed = false;
		freshLine = true;
	}

	private static Stream[] asOutputStreams(SubLOutputStream[] ostreams) {
		if (ostreams == null)
			return null;
		Stream[] streams = new Stream[ostreams.length];
		System.arraycopy(ostreams, 0, streams, 0, streams.length);
		return streams;
	}

	public SubLBroadcastStream(Stream[] streams) {
		super(streams);
	}

	public static void main(String[] args) {
	}

	//private SubLOutputStream[] streams;
	//private boolean isClosed;
	//	private boolean freshLine;

	@Override
	public synchronized void close() {
		isClosed = true;
	}

	@Override
	public void flush() {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				streams[i].flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public boolean freshLine() {
		return freshLine;
	}

	@Override
	public FileDescriptor getFD() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	@Override
	public File getFile() {
		Errors.error("Illegal operation on a non-random access stream.");
		return null;
	}

	@Override
	public long getFilePointer() {
		return 0L;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public SubLList getStreams() {
		return SubLObjectFactory.makeList(streams);
	}

	@Override
	public boolean isClosed() {
		return isClosed;
	}

	@Override
	public boolean isRandomAccess() {
		return false;
	}

	@Override
	public long file_length() {
		return 0L;
	}

	@Override
	public void seek(long pos) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	@Override
	public void setLength(long newLength) {
		Errors.error("Illegal operation on a non-random access stream.");
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return this;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return this;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		return this;
	}

	@Override
	public void write(byte[] b) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputBinaryStream) streams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void write(byte[] b, int off, int len) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputBinaryStream) streams[i]).write(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void write(int b) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputBinaryStream) streams[i]).write(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeChar(char b) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputTextStream) streams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputTextStream) streams[i]).writeChar(b);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b, int off, int len) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputTextStream) streams[i]).writeChar(b, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeNewline() {
		this.writeString(getNewline());
		freshLine = true;
	}

	@Override
	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				streams[i].writePositiveIntegerAsByteSequence(integer, bytesInInteger, useNetworkByteOrder);
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public void writeString(String str) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputTextStream) streams[i]).writeString(str);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	@Override
	public void writeString(String str, int off, int len) {
		try {
			for (int i = 0, size = streams.length; i < size; ++i)
				((SubLOutputTextStream) streams[i]).writeString(str, off, len);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
		freshLine = false;
	}

	//	@Override
	//	public SubLSymbol getName() {
	//		return getType();
	//	}
	@Override
	public SubLSymbol getElementType() {
		final int size = streams.length;
		for (int i = 0; i < size; ++i) {
			SubLSymbol et = streams[i].getElementType();
			if (et != null) {
				return et;
			}
			//			((SubLOutputTextStream) streams[i]).writeString(str);
		}
		return super.getElementType();
	}
}
