/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import static org.armedbear.lisp.Keyword.*;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLOutputBinaryStreamImpl extends AbstractSubLBinaryStream implements SubLOutputBinaryStream {
    SubLOutputBinaryStreamImpl(FileDescriptor fileDesc, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
	super(elementType, direction, ifExists, ifNotExists);
	out = new FileOutputStream(fileDesc);
	out = new BufferedOutputStream(out);
	init();
    }

    SubLOutputBinaryStreamImpl(OutputStream outStream) {
	super(BINARY_KEYWORD, OUTPUT_KEYWORD, ERROR_KEYWORD, ERROR_KEYWORD);
	this.out = outStream;
	out = new BufferedOutputStream(outStream);
	init();
    }

    SubLOutputBinaryStreamImpl(String filename, SubLSymbol ifExists, SubLSymbol ifNotExists) {
	super(filename, BINARY_KEYWORD, OUTPUT_KEYWORD, ifExists, ifNotExists);
	init();
    }

    private void init() {
	if (isRandomAccess())
	    return;
    }

    @Override
    public synchronized void close() {
	if (isClosed())
	    return;
	try {
	    if (out != null) {
		try {
		    out.flush();
		} catch (Exception ex) {
		}
		out.close();
		out = null;
		//out = null;
	    }
	} catch (InterruptedIOException ioe) {
	    Threads.possiblyHandleInterrupts(false);
	    close();
	} catch (Exception e) {
	    Errors.error("Unable to close stream.", e);
	} finally {
	    super.close();
	}
    }

    @Override
    public void flush() {
	this.ensureOpen("FLUSH");
	if (isRandomAccess()) {
	    super.flush();
	    return;
	}
	try {
	    out.flush();
	} catch (InterruptedIOException ioe) {
	    Threads.possiblyHandleInterrupts(false);
	    this.flush();
	} catch (Exception e) {
	    Errors.error("Error flushing stream.", e);
	}
    }

    @Override
    public SubLStream getStream(boolean followSynonymStream) {
	return this;
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
    public void write(byte[] b) {
	this.ensureOpen("WRITE");
	if (isRandomAccess()) {
	    super.write(b);
	    return;
	}
	try {
	    out.write(b);
	} catch (InterruptedIOException ioe) {
	    Threads.possiblyHandleInterrupts(false);
	    if (ioe.bytesTransferred < b.length)
		this.write(b, ioe.bytesTransferred, b.length - ioe.bytesTransferred);
	} catch (Exception e) {
	    Errors.error("Error writing stream.", e);
	}
    }

    @Override
    public void write(byte[] b, int off, int len) {
	this.ensureOpen("WRITE");
	if (isRandomAccess()) {
	    super.write(b, off, len);
	    return;
	}
	try {
	    out.write(b, off, len);
	} catch (InterruptedIOException ioe) {
	    Threads.possiblyHandleInterrupts(false);
	    if (ioe.bytesTransferred < len)
		this.write(b, ioe.bytesTransferred + off, len - ioe.bytesTransferred);
	} catch (Exception e) {
	    Errors.error("Error writing stream.", e);
	}
    }

    @Override
    public void write(int b) {
	this.ensureOpen("WRITE");
	if (isRandomAccess()) {
	    super.write(b);
	    return;
	}
	try {
	    out.write(b);
	} catch (InterruptedIOException ioe) {
	    Threads.possiblyHandleInterrupts(false);
	    if (ioe.bytesTransferred < 1)
		this.write(b);
	} catch (Exception e) {
	    Errors.error("Error writing stream.", e);
	}
    }
}
