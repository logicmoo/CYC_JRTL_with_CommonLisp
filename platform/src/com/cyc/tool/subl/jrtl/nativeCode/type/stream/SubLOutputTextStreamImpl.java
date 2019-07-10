//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;


import static org.armedbear.lisp.Keyword.APPEND_KEYWORD;
import static org.armedbear.lisp.Keyword.CREATE_KEYWORD;
import static org.armedbear.lisp.Keyword.ERROR_KEYWORD;
import static org.armedbear.lisp.Keyword.OUTPUT_KEYWORD;
import static org.armedbear.lisp.Keyword.TEXT_KEYWORD_CHARACTER;

import java.io.ByteArrayOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLOutputTextStreamImpl extends AbstractSubLTextStream implements SubLOutputTextStream {
	SubLOutputTextStreamImpl(int initialByteSizeForString) {
		super(	TEXT_KEYWORD_CHARACTER, OUTPUT_KEYWORD, APPEND_KEYWORD,
				CREATE_KEYWORD);
		freshLine = true;
		out = new ByteArrayOutputStream(initialByteSizeForString);
		writer = new OutputStreamWriter(out, SubLStream.DEFAULT_CHARSET);
		writer =  asBuffredWriter(writer);
	}

	SubLOutputTextStreamImpl(OutputStream outStream) {
		super(TEXT_KEYWORD_CHARACTER, OUTPUT_KEYWORD, ERROR_KEYWORD,
				ERROR_KEYWORD);
		freshLine = true;
		this.out = outStream;
		writer = new OutputStreamWriter(outStream, SubLStream.DEFAULT_CHARSET);
		writer = asBuffredWriter(writer);
	}

	SubLOutputTextStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(filename, TEXT_KEYWORD_CHARACTER, OUTPUT_KEYWORD, ifExists, ifNotExists);
		freshLine = true;
	}


//	public SubLOutputTextStreamImpl(SubLSymbol binaryKeyword, SubLSymbol inputKeyword, SubLSymbol inputKeyword2,
//			SubLSymbol errorKeyword, SubLSymbol errorKeyword2) {
//		super( binaryKeyword, inputKeyword, errorKeyword, errorKeyword2);
//
//	}
//
//
//	public SubLOutputTextStreamImpl(SubLSymbol binaryKeyword, SubLSymbol outputKeyword, SubLSymbol errorKeyword,
//			SubLSymbol errorKeyword2) {
//		super( binaryKeyword, outputKeyword, errorKeyword, errorKeyword2);
//	}

//	public SubLOutputTextStreamImpl(String filename, SubLSymbol binaryKeyword, SubLSymbol outputKeyword,
//			SubLSymbol ifExists, SubLSymbol ifNotExists) {
//		super(filename,binaryKeyword,outputKeyword,ifExists,ifNotExists);
//	}

	@Override
	public synchronized void close() {
		if (isClosed())
			return;
		super.close();
		try {
			if (writer != null) {
				try {
					writer.flush();
				} catch (Exception ex) {
				}
				writer.close();
				out = null;
				writer = null;
				//writer = null;
			}
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			close();
		} catch (Exception e) {
			Errors.error("Unable to close stream.", e);
		}
	}

	@Override
	public boolean lispEquals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof SubLOutputTextStreamImpl))
			return false;
		SubLOutputTextStreamImpl imp2 = (SubLOutputTextStreamImpl) obj;
		final OutputStream out2 = imp2.out;
		return out == out2;
	}

	@Override
	public void flush() {
		this.ensureOpen("FLUSH");
		if (shouldParentDoWork()) {
			super.flush();
			return;
		}
		try {
			writer.flush();
		} catch (InterruptedIOException ioe) {
			Threads.possiblyHandleInterrupts(false);
			this.flush();
		} catch (Exception e) {
			Errors.error("Error flushing stream.", e);
		}
	}

	@Override
	public boolean freshLine() {
		return freshLine;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return this;
	}

	@Override
	public String getStringOutput() {
		if (!isStringOutputStream())
			Errors.error("Can't get the stream string output for non-string streams.");
		this.ensureOpen("GET-STRING-OUTPUT");
		ByteArrayOutputStream byteStream = (ByteArrayOutputStream) out;
		try {
			this.flush();
			String result = byteStream.toString(SubLStream.DEFAULT_CHARSET.name());
			byteStream.reset();
			return result;
		} catch (Exception e) {
			return Errors.error("Unsupported charset: " + SubLStream.DEFAULT_CHARSET, e).getStringValue();
		}
	}

	@Override
	public boolean isStringOutputStream() {
		return out != null && out instanceof ByteArrayOutputStream;
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
		this.ensureOpen("WRITE");
		if (shouldParentDoWork())
			super.write(b);
		else
			try {
				out.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void write(byte[] b, int off, int len) {
		this.ensureOpen("WRITE");
		if (shouldParentDoWork())
			super.write(b, off, len);
		else
			try {
				out.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void write(int b) {
		this.ensureOpen("WRITE");
		if (shouldParentDoWork())
			super.write(b);
		else
			try {
				out.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.write(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeChar(char b) {
		this.ensureOpen("WRITE-CHAR");
		if (shouldParentDoWork())
			super.write(b);
		else
			try {
				writer.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < 1)
					this.writeChar(b);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b) {
		this.ensureOpen("WRITE-CHAR");
		if (shouldParentDoWork())
			super.writeChar(b);
		else
			try {
				writer.write(b);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < b.length)
					this.writeChar(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeChar(char[] b, int off, int len) {
		this.ensureOpen("WRITE-CHAR");
		if (shouldParentDoWork())
			super.writeChar(b, off, len);
		else
			try {
				writer.write(b, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeChar(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
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
	public void writeString(String str) {
		this.ensureOpen("WRITE-STRING");
		if (shouldParentDoWork())
			super.write(str);
		else
			try {
				writer.write(str);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < str.length())
					this.writeString(str, ioe.bytesTransferred, str.length() - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}

	@Override
	public void writeString(String str, int off, int len) {
		this.ensureOpen("WRITE-STRING");
		if (shouldParentDoWork())
			super.write(str, off, len);
		else
			try {
				writer.write(str, off, len);
			} catch (InterruptedIOException ioe) {
				Threads.possiblyHandleInterrupts(false);
				if (ioe.bytesTransferred < len)
					this.writeString(str, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
			} catch (Exception e) {
				Errors.error("Error writing stream.", e);
			}
		freshLine = false;
	}
}
