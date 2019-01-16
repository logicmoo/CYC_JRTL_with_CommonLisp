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
import java.io.Reader;
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

import bsh.ConsoleInterface;

public class SystemCurrent
{

	public static InputStream originalSystemIn = System.in;
	public static PrintStream originalSystemOut = System.out;
	public static PrintStream originalSystemErr = System.err;

	static InheritableThreadLocal<InOutErr> SystemInOutErr = new InheritableThreadLocal<InOutErr>()
	{
		@Override
		protected InOutErr initialValue()
		{
			return new InOutErr();
		}
	};

	/**
	 * Reassigns the "standard" input stream.
	 *
	 * <p>First, if there is a security manager, its <code>checkPermission</code>
	 * method is called with a <code>RuntimePermission("setIO")</code> permission
	 *  to see if it's ok to reassign the "standard" input stream.
	 * <p>
	 *
	 * @param in the new standard input stream.
	 *
	 * @throws SecurityException
	 *        if a security manager exists and its
	 *        <code>checkPermission</code> method doesn't allow
	 *        reassigning of the standard input stream.
	 *
	 * @see SecurityManager#checkPermission
	 * @see java.lang.RuntimePermission
	 *
	 * @since   JDK1.1
	 */
	public static void setIn(InputStream in)
	{
		SystemInOutErr.get().in = in;
	}

	private static InputStream currentSystemInput()
	{
		InputStream willBe = SystemCurrent.SystemInOutErr.get().in;
		if (willBe instanceof In || willBe == null) { return originalSystemIn; }
		return willBe;
	}

	public static final In in = new SystemCurrent.In("#<System.in>");

	/**
	 * Reassigns the "standard" output stream.
	 *
	 * <p>First, if there is a security manager, its <code>checkPermission</code>
	 * method is called with a <code>RuntimePermission("setIO")</code> permission
	 *  to see if it's ok to reassign the "standard" output stream.
	 *
	 * @param out the new standard output stream
	 *
	 * @throws SecurityException
	 *        if a security manager exists and its
	 *        <code>checkPermission</code> method doesn't allow
	 *        reassigning of the standard output stream.
	 *
	 * @see SecurityManager#checkPermission
	 * @see java.lang.RuntimePermission
	 *
	 * @since   JDK1.1
	 */
	public static void setOut(PrintStream out)
	{
		SystemInOutErr.get().out = out;
	}

	public static final ThreadLocalPrintStream tlout = new ThreadLocalPrintStream()
	{
		public OutputStream getOutputStream()
		{
			PrintStream willBe = SystemCurrent.SystemInOutErr.get().out;
			if (willBe instanceof Out || willBe == null) { return originalSystemOut; }
			return willBe;
		}
	};
	public static final Out out = new Out("#<System.out>", tlout);

	/**
	 * Reassigns the "standard" error output stream.
	 *
	 * <p>First, if there is a security manager, its <code>checkPermission</code>
	 * method is called with a <code>RuntimePermission("setIO")</code> permission
	 *  to see if it's ok to reassign the "standard" error output stream.
	 *
	 * @param err the new standard error output stream.
	 *
	 * @throws SecurityException
	 *        if a security manager exists and its
	 *        <code>checkPermission</code> method doesn't allow
	 *        reassigning of the standard error output stream.
	 *
	 * @see SecurityManager#checkPermission
	 * @see java.lang.RuntimePermission
	 *
	 * @since   JDK1.1
	 */
	public static void setErr(PrintStream err)
	{
		SystemInOutErr.get().err = err;
	}

	public static final ThreadLocalPrintStream tlerr = new ThreadLocalPrintStream()
	{
		public OutputStream getOutputStream()
		{
			PrintStream willBe = SystemCurrent.SystemInOutErr.get().err;
			if (willBe instanceof Out || willBe == null) { return originalSystemErr; }
			return willBe;
		}
	};
	public static final Out err = new Out("#<System.err>", tlerr);

	static
	{
		setupIO();
	}

	static public class In extends InputStream
	{
		private String named;

		public In get()
		{
			return in;
		}

		public In(String n)
		{
			this.named = n;
		}

		@Override
		public String toString()
		{
			return named;
		}

		@Override
		public int read() throws IOException
		{
			InputStream is = currentSystemInput();
			if (is.available() < 1) { return is.read(); }
			return is.read();
		}

		@Override
		public int read(byte[] array, int n, int n2) throws IOException
		{
			InputStream is = currentSystemInput();
			return is.read(array, n, n2);
		}

		@Override
		public int available() throws IOException
		{
			return currentSystemInput().available();
		}

		public synchronized void mark(final int n)
		{
			currentSystemInput().mark(n);
		}

		public synchronized void reset() throws IOException
		{
			currentSystemInput().reset();
		}

		public boolean markSupported()
		{
			return currentSystemInput().markSupported();
		}

		public void close() throws IOException
		{
			currentSystemInput().close();
		}
	}

	static public class Out extends PrintStream
	{
		private String named;

		protected Out(String n, OutputStream out)
		{
			super(out);
			this.named = n;
		}

		@Override
		public String toString()
		{
			return named;
		}
	}

	private static abstract class ThreadLocalPrintStream extends OutputStream
	{
		@Override
		public void write(int b) throws IOException
		{
			OutputStream redirect = getOutputStream();
			if (redirect != null) redirect.write(b);
		}

		abstract OutputStream getOutputStream();

		final public void close()
		{
			OutputStream redirect = getOutputStream();
			if (redirect != null) try
			{
				redirect.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		@Override
		public void flush() throws IOException
		{
			OutputStream redirect = getOutputStream();
			if (redirect != null)
			{
				try
				{
					redirect.flush();
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				super.flush();
			}  
		}
	}

	public static void setupIO()
	{
		if (true) return;
		if (!(System.in instanceof In) || System.in != in) System.setIn(in);
		if (!(System.out instanceof Out) || System.out != out) System.setOut(out);
		if (!(System.err instanceof Out) || System.err != err) System.setErr(err);
	}
}

class InOutErr
{
	transient InputStream in;
	transient PrintStream out;
	transient PrintStream err;
}
