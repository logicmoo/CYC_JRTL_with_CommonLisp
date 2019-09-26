/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.net.SocketTimeoutException;

import org.armedbear.lisp.Keyword;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInputBinaryStreamImpl extends AbstractSubLBinaryStream implements SubLInputBinaryStream {
	SubLInputBinaryStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(Keyword.BINARY_KEYWORD, Keyword.INPUT_KEYWORD, ifExists, ifNotExists);
		in = new FileInputStream(fileDesc);
		InputStream javaBufferedInStream = in;// new BufferedInputStream(in);
		pushbackStream = new PushbackInputStream(javaBufferedInStream);
		reader = new PushbackReader(new InputStreamReader(in));
		init();
	}

	SubLInputBinaryStreamImpl(InputStream inStream) {
		super(Keyword.BINARY_KEYWORD, Keyword.INPUT_KEYWORD, Keyword.ERROR_KEYWORD, Keyword.ERROR_KEYWORD);
		this.in = inStream;
		pushbackStream = new PushbackInputStream(inStream);
		reader = new PushbackReader(new InputStreamReader(pushbackStream));
		init();
	}

	SubLInputBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, Keyword.BINARY_KEYWORD, Keyword.INPUT_KEYWORD, ifExists, ifNotExists);
		init();
	}

	private void init() {
		if (isRandomAccess())
			return;
	}

	private int readInternal() {
		boolean ready = false;
		while (true) {
			try {
				ready = pushbackStream.available() > 0;
			} catch (Exception e) {
				Errors.error("Unable to read character from stream: " + this, e);
			}
			if (ready)
				try {
					int result = pushbackStream.read();
					if (result >= 0)
						incrementInputIndex(1L);
					return result;
				} catch (SocketTimeoutException ste) {
					Threads.possiblyHandleInterrupts(false);
					continue;
				} catch (Exception e) {
					Errors.error("Unable to read character from stream: " + this, e);
					continue;
				}
			if (isClosed())
				return -1;
			try {
				Threads.possiblyHandleInterrupts(true);
				Thread.currentThread();
				Thread.sleep(5L);
			} catch (InterruptedException ie) {
				Threads.possiblyHandleInterrupts(false);
			}
			if (isClosed())
				return -1;
		}
	}

	@Override
	public synchronized void close() {
		if (isClosed())
			return;
		super.close();
		try {
			if (pushbackStream != null) {
				pushbackStream.close();
				in = null;
				//javaBufferedInStream = null;
				pushbackStream = null;
			}
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public long numBytesAvailable() {
		if (isClosed())
			return 0L;
		if (isRandomAccess())
			return super.numBytesAvailable();
		try {
			return pushbackStream.available();
		} catch (Exception e) {
			Errors.error("Unable to get available bytes for stream.", e);
			return -1L;
		}
	}

	@Override
	public int readWithTimeOut(long deadline) {
		if (shouldParentDoWork())
			return super.readWithTimeOut(deadline);
		this.ensureOpen("READ-CHAR");
		return readInternal();
	}

	@Override
	public int read(byte[] b) {
		if (isRandomAccess())
			return super.read(b);
		this.ensureOpen("READ");
		try {
			int result = pushbackStream.read(b);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to read character from stream.", e);
			return -1;
		}
	}

	@Override
	public int read(byte[] b, int off, int len) {
		if (isRandomAccess())
			return super.read(b, off, len);
		this.ensureOpen("READ");
		try {
			int result = pushbackStream.read(b, off, len);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to read character from stream.", e);
			return -1;
		}
	}

	@Override
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		if (shouldParentDoWork())
			return super.readByteSequenceToPositiveInteger(bytesInInteger, useNetworkByteOrder);
		this.ensureOpen("READ-BYTES-SEQUENCE-TO-POSITIVE-INTEGER");
		if (bytesInInteger > 8 || bytesInInteger < 0)
			Errors.error("Bytes in integer is too large: " + bytesInInteger);
		long result = 0L;
		long curChar = -1L;
		if (useNetworkByteOrder)
			for (int i = (bytesInInteger - 1) * 8; i >= 0; i -= 8) {
				curChar = readInternal();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		else
			for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
				curChar = readInternal();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		return result;
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		try {
			if (shouldParentDoWork())
				return super.readByteSequenceToString(str);
			this.ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
			int curChar = 1;
			for (int i = 0, size = str.size(); i < size; ++i) {
				curChar = readInternal();
				if (curChar == -1)
					return -1;
				str.setInternal(i, (char) curChar);
			}
			return curChar;
		} finally {
			str.setMutated();
		}
	}

	@Override
	public long skip(long n) {
		if (isRandomAccess())
			return super.skip(n);
		this.ensureOpen("SKIP");
		try {
			long result = pushbackStream.skip(n);
			return result;
		} catch (Exception e) {
			Errors.error("Unable to skip characters.", e);
			return -1L;
		}
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return this;
	}

	@Override
	public SubLInputStream toInputStream() {
		return this;
	}

	@Override
	public void unread(int c) {
		if (isRandomAccess()) {
			super.unread(c);
			return;
		}
		this.ensureOpen("UNREAD");
		try {
			pushbackStream.unread(c);
		} catch (Exception e) {
			Errors.error("Unable to unread character from stream.", e);
		}
	}
}
