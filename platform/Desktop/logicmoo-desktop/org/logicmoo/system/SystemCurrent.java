//
// For LarKC
//
package org.logicmoo.system;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.Reader;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;

import org.armedbear.j.Buffer;
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
import com.netbreeze.swing.editors.ThrowableBeanInfo;

import bsh.ConsoleInterface;

public class SystemCurrent
{

	public static InputStream originalSystemIn = System.in;
	public static PrintStream originalSystemOut = System.out;
	public static PrintStream originalSystemErr = System.err;
	public static Thread originalSystemThread = Thread.currentThread();
	public static InOutErr originalInOutErr = new InOutErr("originalInOutErr " + originalSystemThread.getName());
	static
	{
		originalInOutErr.in = originalSystemIn;
		originalInOutErr.out = originalSystemOut;
		originalInOutErr.err = originalSystemErr;
	}

	static ThreadLocal<InOutErr> SystemInOutErr = new ThreadLocal<InOutErr>()
	{
		@Override
		protected InOutErr initialValue()
		{
			return new InOutErr(Thread.currentThread().getName());
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
		if (in instanceof In)
		{
			currentIO().in = originalSystemIn;
			return;
		}
		InputStream is2 = underlyingStream(in);
		if (is2 instanceof In)
		{
			currentIO().in = originalSystemIn;
			return;
		}
		currentIO().in = in;
	}

	public static Thread takeOwnerShip()
	{
		final Thread currentThread = Thread.currentThread();
		final InOutErr inOutErr = currentIO();
		if (inOutErr.in != null && inOutErr.in != originalSystemIn) { return currentThread; }
		Thread was;
		synchronized (justSuspended)
		{
			was = currentOwner;
			if (currentOwner == null)
			{
				currentOwner = currentThread;
			}
			else if (currentOwner == currentThread)
			{

			}
			else
			{
				currentOwner.suspend();
				justSuspended.set(currentOwner);
				currentOwner = currentThread;
			}
		}
		return was;
	}

	public static void releaseOwnerShip()
	{
		final Thread currentThread = Thread.currentThread();
		final InOutErr inOutErr = currentIO();
		if (inOutErr.in != originalSystemIn) { return; }

		synchronized (justSuspended)
		{
			final Thread suspendedWhom = justSuspended.get();
			if (currentOwner == null)
			{
				if (suspendedWhom != null)
				{
					suspendedWhom.resume();
					currentOwner = suspendedWhom;
				}
				return;
			}
			else if (currentOwner == currentThread)
			{
				currentOwner = null;
				if (suspendedWhom != null)
				{
					suspendedWhom.resume();
					currentOwner = suspendedWhom;
				}
				return;
			}
			else
			{
				if (suspendedWhom != null)
				{
					suspendedWhom.resume();
					currentOwner = suspendedWhom;
				}
				return;
			}

		}
	}

	static Thread currentOwner = null;
	static ThreadLocal<Thread> justSuspended = new ThreadLocal<Thread>();

	private static InputStream currentSystemInput()
	{
		final Thread currentThread = Thread.currentThread();
		final InOutErr inOutErr = currentIO();

		if (originalInOutErr == inOutErr)
		{
			synchronized (justSuspended)
			{
				if (currentOwner == null)
				{
					currentOwner = currentThread;
				}
				else if (currentOwner != currentThread)
				{
					//
					throw new Error("Take owership first!");
				}
			}
		}
		InputStream is = inOutErr.in;
		if (is instanceof In) return originalSystemIn;
		if (is == null)
		{
			if (currentThread == originalSystemThread) { return originalSystemIn; }
		}
		InputStream is2 = underlyingStream(is);
		if (is2 instanceof In) return originalSystemIn;
		return is;
	}

	private static InOutErr currentIO()
	{
		return SystemInOutErr.get();
	}

	private static InputStream underlyingStream(final InputStream is)
	{
		if (is == null) return null;
		InputStream is2 = is;
		Class clz = is.getClass();
		tryAgain: do
		{
			try
			{
				Field f = clz.getDeclaredField("in");
				if (InputStream.class.isAssignableFrom(f.getType()))
				{
					f.setAccessible(true);
					is2 = (InputStream) f.get(is);
					return is2;
				}
			} catch (NoSuchFieldException e)
			{
				clz = clz.getSuperclass();
				if (clz != null) continue tryAgain;
			} catch (Throwable e)
			{
				e.printStackTrace();
			}
			return is;
		} while (true);
	}

	private static OutputStream underlyingStream(final OutputStream is)
	{
		if (is == null) return null;
		OutputStream is2 = is;
		Class clz = is.getClass();
		tryAgain: do
		{
			try
			{
				Field f = clz.getDeclaredField("out");
				if ((!Modifier.isStatic(f.getModifiers())) && InputStream.class.isAssignableFrom(f.getType()))
				{
					f.setAccessible(true);
					is2 = (OutputStream) f.get(is);
					return is2;
				}
			} catch (NoSuchFieldException e)
			{
				clz = clz.getSuperclass();
				if (clz != null) continue tryAgain;
			} catch (Throwable e)
			{
				e.printStackTrace();
			}
			return is;
		} while (true);
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
		if (out instanceof Out)
		{
			currentIO().out = originalSystemOut;
			return;
		}
		OutputStream is2 = underlyingStream(out);
		if (is2 instanceof Out)
		{
			currentIO().out = originalSystemOut;
			return;
		}
		currentIO().out = out;
	}

	public static final ThreadLocalPrintStream tlout = new ThreadLocalPrintStream()
	{
		@Override
		public OutputStream getOutputStream()
		{
			OutputStream is = currentIO().out;
			if (is instanceof Out) return originalSystemOut;
			if (is == null)
			{
				if (Thread.currentThread() == originalSystemThread) { return originalSystemOut; }
			}
			OutputStream is2 = underlyingStream(is);
			if (is2 instanceof Out) return originalSystemOut;
			return is;
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
		if (err instanceof Out)
		{
			currentIO().err = originalSystemErr;
			return;
		}
		OutputStream is2 = underlyingStream(err);
		if (is2 instanceof Out)
		{
			currentIO().err = err;
			return;
		}
		currentIO().err = err;
	}

	public static final ThreadLocalPrintStream tlerr = new ThreadLocalPrintStream()
	{
		@Override
		public OutputStream getOutputStream()
		{
			OutputStream is = currentIO().out;
			if (is instanceof Out) return originalSystemErr;
			if (is == null)
			{
				if (Thread.currentThread() == originalSystemThread) { return originalSystemErr; }
			}
			OutputStream is2 = underlyingStream(is);
			if (is2 instanceof Out) return originalSystemErr;
			return is;
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

		//		public In get()
		//		{
		//			return in;
		//		}

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

		@Override
		public synchronized void mark(final int n)
		{
			currentSystemInput().mark(n);
		}

		@Override
		public synchronized void reset() throws IOException
		{
			currentSystemInput().reset();
		}

		@Override
		public boolean markSupported()
		{
			return currentSystemInput().markSupported();
		}

		@Override
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

		@Override
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
		if (!(System.in instanceof In) || System.in != in) System.setIn(in);
		if (!(System.out instanceof Out) || System.out != out) System.setOut(out);
		if (!(System.err instanceof Out) || System.err != err) System.setErr(err);
		SystemInOutErr.set(originalInOutErr);
	}
}

class InOutErr
{
	private String name;

	public InOutErr(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return name;
	}

	transient InputStream in;
	transient PrintStream out;
	transient PrintStream err;
}
