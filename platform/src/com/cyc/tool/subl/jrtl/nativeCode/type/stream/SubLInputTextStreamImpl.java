//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

import org.armedbear.lisp.Keyword;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLInputTextStreamImpl extends AbstractSubLTextStream implements SubLInputTextStream {
	public SubLInputTextStreamImpl(FileDescriptor fileDesc, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(Keyword.TEXT_KEYWORD_CHARACTER, Keyword.INPUT_KEYWORD, ifExists, ifNotExists);
		in = new FileInputStream(fileDesc);
		InputStream javaBufferedInStream = in;//javaBufferedInStream = new BufferedInputStream(in);
		pushbackStream = new PushbackInputStream(javaBufferedInStream);
	}

	SubLInputTextStreamImpl(ByteBuffer byteBuffer) {
		super(Keyword.TEXT_KEYWORD_CHARACTER, Keyword.INPUT_KEYWORD, Keyword.ERROR,
				Keyword.ERROR);
		this.readByteBuffer = byteBuffer;
	}

	SubLInputTextStreamImpl(ByteBuffer byteBuffer, int start) {
		this(byteBuffer);
		if (start > 0)
			setInputIndex(start);
	}

	SubLInputTextStreamImpl(InputStream inStream) {
		super(Keyword.TEXT_KEYWORD_CHARACTER, Keyword.INPUT_KEYWORD, Keyword.ERROR,
				Keyword.ERROR);
		this.in = inStream;
		InputStream javaBufferedInStream = inStream;//		javaBufferedInStream = new BufferedInputStream(inStream);
		pushbackStream = new PushbackInputStream(javaBufferedInStream);
		reader = new PushbackReader(new InputStreamReader(inStream));
	}

	SubLInputTextStreamImpl(InputStream inStream, int start) {
		this(inStream);
		setInputIndex(start);
	}

	SubLInputTextStreamImpl(Socket socket) {
		super(Keyword.TEXT_KEYWORD_CHARACTER, Keyword.INPUT_KEYWORD, Keyword.ERROR,
				Keyword.ERROR);
		this.socket = socket;
		try {
			in = socket.getInputStream();
		} catch (IOException ioe) {
			Errors.error("Unable to open stream for socket; " + socket, ioe);
		}
		InputStream javaBufferedInStream = in;//javaBufferedInStream = new BufferedInputStream(in);
		pushbackStream = new PushbackInputStream(javaBufferedInStream);
		reader = new PushbackReader(new InputStreamReader(javaBufferedInStream));
	}

	SubLInputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, Keyword.TEXT_KEYWORD_CHARACTER, Keyword.INPUT_KEYWORD, ifExists, ifNotExists);
	}

	public SubLInputTextStreamImpl(String filename, SubLSymbol binaryKeyword, SubLSymbol inputKeyword,
			SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, binaryKeyword, inputKeyword, ifExists, ifNotExists);
	}

	public SubLInputTextStreamImpl(SubLSymbol binaryKeyword, SubLSymbol inputKeyword, SubLSymbol errorKeyword,
			SubLSymbol errorKeyword2) {
		super( binaryKeyword, inputKeyword, errorKeyword, errorKeyword2);

	}

	private boolean isSocketConnectionDead() {
		if (socket == null)
			return false;
		try {
			socket.sendUrgentData(32);
		} catch (Exception ex) {
			return true;
		}
		return false;
	}

	private int socketRead() {
		while (!isClosed())
			try {
				int curByte = pushbackStream.read();
				if (curByte >= 0)
					incrementInputIndex(1L);
				return curByte;
			} catch (SocketTimeoutException ste) {
				Threads.possiblyHandleInterrupts(true);
			} catch (IOException ioe) {
				return -1;
			} catch (Exception e) {
				Errors.error("Unable to read character from stream: " + this, e);
			}
		return -1;
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
	public int read() {
		if (shouldParentDoWork())
			return super.read();
		this.ensureOpen("READ");
		if (socket != null)
			return socketRead();
		boolean ready = false;
		while (!isClosed()) {
			try {
				ready = pushbackStream.available() > 0;
			} catch (Exception e) {
				return -1;
			}
			if (ready)
				try {
					int result = pushbackStream.read();
					if (result >= 0)
						incrementInputIndex(1L);
					return result;
				} catch (Exception e) {
					Errors.error("Unable to read character from stream: " + this, e);
					continue;
				}
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
		return -1;
	}

	@Override
	public int read(byte[] b) {
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
		return -1;
	}

	@Override
	public int read(byte[] b, int off, int len) {
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[], off, len)");
		return -1;
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
				curChar = this.read();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		else
			for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
				curChar = this.read();
				if (curChar == -1L)
					throw new RuntimeException("EOF");
				result |= curChar << i;
			}
		return result;
	}

	@Override
	public int readByteSequenceToString(SubLString str) {
		if (shouldParentDoWork())
			return super.readByteSequenceToString(str);
		int curChar = 1;
		this.ensureOpen("READ-BYTE-SEQUENCE-TO-STRING");
		for (int i = 0, size = str.size(); i < size; ++i) {
			curChar = this.read();
			if (curChar == -1)
				return -1;
			str.set(i, (char) curChar);
		}
		return curChar;
	}

	@Override
	public int readChar() {
		return this.read();
	}

	@Override
	public int readChar(char[] b) {
		this.ensureOpen("READ-CHAR");
		Errors.unimplementedMethod("SubLInputTextStreamImpl.read(byte[])");
		return -1;
	}

	@Override
	public int readChar(char[] b, int off, int len) {
		int curChar = -1;
		int i = off;
		for (int size = off + len; i < size; ++i) {
			curChar = this.read();
			if (curChar == -1)
				break;
			b[i] = (char) curChar;
		}
		return i;
	}

	@Override
	public boolean ready() {
		if (shouldParentDoWork())
			return super.ready();
		this.ensureOpen("READY");
		try {
			return pushbackStream.available() > 0;
		} catch (Exception e) {
			Errors.error("Error on stream: " + this);
			return false;
		}
	}

	@Override
	public long skip(long n) {
		if (shouldParentDoWork())
			return super.skip(n);
		this.ensureOpen("SKIP");
		try {
			long result = pushbackStream.skip(n);
			if (result >= 0L)
				incrementInputIndex(result);
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
	public SubLInputTextStream toInputTextStream() {
		return this;
	}

	@Override
	public void unread(int c) {
		if (shouldParentDoWork()) {
			super.unread(c);
			return;
		}
		this.ensureOpen("UNREAD");
		try {
			pushbackStream.unread(c);
			incrementInputIndex(-1L);
		} catch (Exception e) {
			Errors.error("Unable to unread character from stream.", e);
		}
	}
}
