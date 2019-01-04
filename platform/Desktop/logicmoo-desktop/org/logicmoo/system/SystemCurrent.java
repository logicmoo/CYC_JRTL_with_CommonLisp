//
// For LarKC
//
package org.logicmoo.system;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;

import org.armedbear.lisp.IntegrityError;
import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Symbol;
import org.logicmoo.system.SystemCurrent.Out.PrintOutputStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SystemCurrent {

	static public abstract class In extends InputStream {

		private InputStream wazOnce;
		private String named;

		public In(String n) {
			this.named = n;
		}

		@Override
		public String toString() {
			return named;
		}

		public abstract InputStream getIn();

		public InputStream getSomeInStrm() {
			InputStream was = getIn();
			// System.setIn(null);
			if (was == this)
				throw new RuntimeException("was=this");
			if (was instanceof In)
				throw new RuntimeException("was instanceof In");
			if (was == in)
				throw new RuntimeException("was==in");
			if (wazOnce == null) {
				wazOnce = was;
			} else {
				if (was == null) {
					return wazOnce;
				}
			}
			return was;
		}

		@Override
		public int read() throws IOException {
			InputStream is = getSomeInStrm();
			if (is.available() < 1) {
				return is.read();
			}
			return is.read();
		}

		@Override
		public int read(byte[] array, int n, int n2) throws IOException {
			InputStream is = getSomeInStrm();
			return is.read(array, n, n2);
		}
		@Override
		public int available() throws IOException {
			return getSomeInStrm().available();
		}

		public synchronized void mark(final int n) {
			getSomeInStrm().mark(n);
		}

		public synchronized void reset() throws IOException {
			getSomeInStrm().reset();
		}

		public boolean markSupported() {
			return getSomeInStrm().markSupported();
		}

		public void close() throws IOException {
			getSomeInStrm().close();
		}
	}

	static public abstract class Out extends OutputStream {


		public class PrintOutputStream extends PrintStream {
			final String named;
			private OutputStream was;

			public PrintOutputStream(String naimed, OutputStream out) {
				super(out);
				this.named = naimed;
				this.was = out;
			}

			public OutputStream getOutputStream() {
				return was;
			}

			@Override
			public String toString() {
				return named;
			}
		}

		private String named;
		private PrintOutputStream ps;

		protected Out(String n) {
			this.named = n;
			wazFirst = getOutStream();
		}

		abstract public OutputStream getOutStream();

		public PrintOutputStream getPrintStream() {
			if (ps == null)
				ps = new PrintOutputStream(named, this);
			return ps;
		}

		OutputStream wazWonce;
		final OutputStream wazFirst;

		final public void close() throws IOException {
			OutputStream was = someOutput();
			was.close();
		}

		final public OutputStream someOutput() {
			OutputStream was = getOutStream();
			if (was == this)
				throw new RuntimeException("was==this OUT");
			if (was == out)
				throw new RuntimeException("was==out");
			if (was == err)
				throw new RuntimeException("was==err");
			if (was instanceof Out)
				throw new RuntimeException("was Out");
			if (was instanceof PrintOutputStream)
				throw new RuntimeException("was Synonym");
			if (was == null)
				return wazWonce;
			return wazWonce = was;
		}

		@Override
		final public void write(int b) throws IOException {
			OutputStream os = someOutput();
			os.write(b);
		}

		@Override
		final public void flush() throws IOException {
			someOutput().flush();
		}
	}

	static InheritableThreadLocal<InputStream> SystemIn = new InheritableThreadLocal<InputStream>() {
		@Override
		protected InputStream initialValue() {
			return System.in;
		}
	};

	public static final SystemCurrent.In in = new SystemCurrent.In("#<System.in>") {
		@Override
		public InputStream getIn() {
			return SystemIn.get();
		}

	};
	public static final PrintOutputStream out = (new SystemCurrent.Out("#<System.out>") {
		@Override
		public OutputStream getOutStream() {
			return System.out;
		}
	}).getPrintStream();
	public static final PrintOutputStream err = (new SystemCurrent.Out("#<System.err>") {
		public OutputStream getOutStream() {
			return System.err;
		}
	}).getPrintStream();

}
