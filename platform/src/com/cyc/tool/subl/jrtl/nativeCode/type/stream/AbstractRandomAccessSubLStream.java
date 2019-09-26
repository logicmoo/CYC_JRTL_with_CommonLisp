/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Symbol;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.Startup;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractRandomAccessSubLStream extends AbstractSubLStream {
	private static final long MapThreshold = 100000L;

	protected enum Direction {
		UNINIT, READ, WRITE;
	}

	protected AbstractRandomAccessSubLStream(String fileName, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		isMapped = false;
		readByteBuffer0 = null;
		writeByteBuffer0 = null;
		fileMode = "";
		underlyingFilePos = 0L;
		flushCount = 0L;
		lastDirection = Direction.UNINIT;
		isNullFile = false;
		bufSize = 16384;
		mappedBuffer = null;
		initFile(fileName);
	}

	protected AbstractRandomAccessSubLStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		isMapped = false;
		readByteBuffer0 = null;
		writeByteBuffer0 = null;
		fileMode = "";
		underlyingFilePos = 0L;
		flushCount = 0L;
		lastDirection = Direction.UNINIT;
		isNullFile = false;
		bufSize = 16384;
		this.direction = direction;
		mappedBuffer = null;
	}

	public AbstractRandomAccessSubLStream(Symbol structureClass, Symbol direction) {
		super(structureClass);
		this.direction = direction;
		isMapped = false;
		readByteBuffer0 = null;
		writeByteBuffer0 = null;
		fileMode = "";
		underlyingFilePos = 0L;
		flushCount = 0L;
		lastDirection = Direction.UNINIT;
		isNullFile = false;
		bufSize = 16384;
		mappedBuffer = null;
	}

	public File theFile;
	public RandomAccessFile raf;
	public FileChannel fileChannel;
	private boolean isMapped;
	protected ByteBuffer readByteBuffer0;
	private ByteBuffer writeByteBuffer0;
	private String fileMode;
	private long underlyingFilePos;
	private long flushCount;
	protected Direction lastDirection;
	private boolean isNullFile;
	private int bufSize;
	public MappedByteBuffer mappedBuffer;
	private boolean bothDirections;
	private boolean ioDirection;

	private long getFileSize() {
		this.ensureOpen("getFileSize");
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
					if (writeByteBuffer != null)
						this.flush();
					return fileChannel.size();
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			return getFileSize();
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			return getFileSize();
		} catch (IOException e) {
			Errors.error("Error while getting file position of stream: " + this, e);
			return -1L;
		}
	}

	private long getUnderlyingFilePos() {
		return underlyingFilePos;
	}

	private long getUnderlyingFilePosInt() {
		if (isClosed())
			return -1L;
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					return underlyingFilePos = fileChannel.position();
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(getUnderlyingFilePos());
			return getUnderlyingFilePosInt();
		} catch (ClosedChannelException cce) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(getUnderlyingFilePos());
			return getUnderlyingFilePosInt();
		} catch (IOException e) {
			Errors.error("Error while getting file position of stream: " + this, e);
			return -1L;
		}
	}

	private void incrementFilePosition(long amount) {
		incrementInputIndex(amount);
		if (isMapped)
			underlyingFilePos += amount;
	}

	private void initFile(String fileName) {
		boolean shouldMemoryMap = StreamsLow.$should_memory_map_files$.getDynamicValue() != SubLNil.NIL;
		bufSize = 16384;
		if (direction == Keyword.INPUT_KEYWORD)
			bufSize = StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue().toInteger().intValue();
		else
			bufSize = StreamsLow.$stream_initial_output_buffer_size$.getDynamicValue().toInteger().intValue();
		isNullFile = isNullFile(fileName);
		try {
			theFile = new File(fileName).getCanonicalFile();
			if (theFile.isDirectory())
				Errors.error("Can't open a directory as a stream: " + theFile);
			boolean doesExist = theFile.exists();
			boolean shouldMoveToEnd = false;
			boolean shouldTruncateToZeroLength = false;
			ioDirection = (direction == Keyword.IO_KEYWORD);
			if (direction == Keyword.OUTPUT_KEYWORD || ioDirection) {
				if (!fileMode.contains("w")) {
					fileMode += "w";
				}
				if (doesExist) {
					if (direction != Keyword.INPUT_KEYWORD) {
						if (!theFile.canWrite())
							System.err.println(";; WARNING: Don't have permissions to write file: " + theFile);
						if (ifExists == Keyword.ERROR_KEYWORD)
							Errors.error("File already exists: " + theFile);
						if (ifExists == CommonSymbols.NEW_VERSION_KEYWORD)
							shouldTruncateToZeroLength = true;
						if (ifExists == Keyword.APPEND_KEYWORD)
							shouldMoveToEnd = true;
						if (ifExists == SubLNil.NIL)
							throw new SubLStreamNilException();
					}
				} else {
					if (ifNotExists == SubLNil.NIL)
						throw new SubLStreamNilException();
					if (ifNotExists == Keyword.ERROR_KEYWORD)
						Errors.error("File does not already exist: " + theFile);
					else
						try {
							File parentFile = theFile.getParentFile();
							if (parentFile != null && !parentFile.exists())
								try {
									parentFile.mkdir();
								} catch (Exception ex) {
								}
							theFile.createNewFile();
						} catch (IOException ioe) {
							Errors.error("Could not create file: " + theFile, ioe);
						}
				}
			}
			if (direction == Keyword.INPUT_KEYWORD || ioDirection) {
				if (!fileMode.contains("r")) {
					fileMode = "r" + fileMode;
				}
				if (doesExist) {
					if (direction != Keyword.INPUT_KEYWORD) {
						if (!theFile.canRead())
							Errors.error("Don't have permissions to read file: " + theFile);
						if (ifExists == Keyword.ERROR_KEYWORD)
							Errors.error("File already exists: " + theFile);
						if (ifExists == Keyword.APPEND_KEYWORD)
							shouldMoveToEnd = true;
						if (ifExists == SubLNil.NIL)
							throw new SubLStreamNilException();
					}
				} else {
					if (ifNotExists == SubLNil.NIL)
						throw new SubLStreamNilException();
					if (ifNotExists == Keyword.ERROR_KEYWORD)
						Errors.error("File does not already exist: " + theFile);
					else
						theFile.createNewFile();
				}
			}
			raf = new RandomAccessFile(theFile, correctFileMode(theFile, fileMode));
			if (shouldTruncateToZeroLength && raf.length() > 0L)
				raf.setLength(0L);
			fileChannel = raf.getChannel();
			if (direction == Keyword.INPUT_KEYWORD || ioDirection) {

				if (fileShouldBeMapped() && shouldMemoryMap) {

					mappedBuffer = direction == Keyword.INPUT_KEYWORD ? fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, theFile.length()) : fileChannel.map(canWrite() ? FileChannel.MapMode.READ_WRITE : FileChannel.MapMode.READ_ONLY, 0L, theFile.length());
					readByteBuffer0 = mappedBuffer;
					if (writeByteBuffer0 == null) {
						//writeByteBuffer0 = mappedBuffer;
					}
					isMapped = true;
					if (theFile.length() <= 700000000L)
						mappedBuffer.load();
				} else {
					if (ioDirection || shouldMemoryMap) {
						// Startup.bp();
					}
					readByteBuffer0 = ByteBuffer.allocate(bufSize);
				}
			}
			if (direction == Keyword.OUTPUT_KEYWORD || ioDirection) {
				writeByteBuffer0 = isMapped ? getReadableByteBuffer(true) : //
						ByteBuffer.allocate(bufSize);
			}
			this.invalidateReadData();
			if (shouldMoveToEnd)
				seek(getFileSize());
		} catch (SubLException se) {
			throw se;
		} catch (IOException e) {
			Errors.error("Error opening stream: " + this, e);
		}
	}

	/**
	 * @return
	 */
	public boolean fileShouldBeMapped() {
		return theFile.length() > MapThreshold && theFile.length() < 2147483647L;
	}

	private String correctFileMode(File rTheFile, String rFileMode) {

		if ("rww".equals(rFileMode))
			rFileMode = "rw";
		if ("w".equals(rFileMode)) {
			try {
				if (!rTheFile.canRead() && rTheFile.exists()) {
					rFileMode = "w";
				} else {
					rFileMode = "rw";
				}
			} catch (SecurityException e) {
				rFileMode = "rw";
			}
		} else if ("rw".equals(rFileMode)) {
			try {
				if (!rTheFile.canWrite()) {
					rFileMode = "r";
				}
			} catch (SecurityException e) {
				rFileMode = "r";
			}
		}
		this.fileMode = rFileMode;
		return rFileMode;
	}

	private boolean isNullFile(String fileName) {
		return "/dev/null".equals(fileName.toLowerCase());
	}

	private int readInternalARASS() {
		try {
			final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
			int remaining = readByteBuffer.remaining();
			if (remaining < 1) {
				return this.readMoreData() <= 0 ? -1 : this.read();
			}
			final byte b = readByteBuffer.get();
			incrementFilePosition(1L);
			return 0xFF & b;
		} catch (BufferUnderflowException bue) {
			return this.readMoreData() <= 0 ? -1 : this.read();
		} catch (Exception e) {
			Errors.error("Unable to read character from stream: " + this, e);
			return -1;
		}
	}

	private synchronized void reopenChannel(long pos) {
		if (isClosed())
			throw new RuntimeException("Illegal attempt to quietly reopen a closed channel: " + this);
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					if (fileChannel != null && fileChannel.isOpen())
						try {
							fileChannel.close();
						} catch (Exception ex) {
						}
					if (raf != null)
						try {
							raf.close();
						} catch (Exception ex2) {
						}
					raf = new RandomAccessFile(theFile, correctFileMode(theFile, fileMode));
					(fileChannel = raf.getChannel()).position(pos);
					underlyingFilePos = pos;
					if (isMapped)
						throw new RuntimeException("Implement reopening unexpectedly closed memory mapped files.");
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (IOException e) {
			Errors.error("Error reopening file: " + theFile, e);
		}
	}

	private void setFilePosition(long pos) {
		setInputIndex(pos);
		if (isMapped)
			underlyingFilePos = pos;
	}

	private void setUnderlyingFilePos(long pos) {
		this.ensureOpen("setUnderlyingFilePos");
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					underlyingFilePos = pos;
					fileChannel.position(pos);
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(pos);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(pos);
		} catch (IOException e) {
			Errors.error("Error while setting file position of stream: " + this + " to: " + pos, e);
		} catch (RuntimeException e2) {
			Errors.error("Error while setting file position of stream: " + this + " to: " + pos, e2);
		}
	}

	@Override
	public synchronized void close() {
		boolean shouldClose = !isClosed();
		try {
			if (isRandomAccess() && shouldClose)
				try {
					synchronized (SubLThread.getInterruptLock()) {
						boolean needsInterruption = Threads.forciblyHandleInterrupts();
						try {
							if (isMapped && mappedBuffer != null && lastDirection == Direction.WRITE)
								mappedBuffer.force();
							if (fileChannel != null) {
								this.writeWritableDataToChannel(false);
								try {
									fileChannel.force(true);
								} catch (Exception ex) {
								}
								fileChannel.close();
								fileChannel = null;
							}
							if (raf != null) {
								raf.close();
								raf = null;
							}
							readByteBuffer0 = null;
							writeByteBuffer0 = null;
							setFilePosition(0L);
						} finally {
							if (needsInterruption)
								SubLProcess.currentProcess().interrupt();
						}
					}
				} catch (IOException e) {
					Errors.error("Error while closing stream: " + this, e);
				}
		} finally {
			super.close();
		}
	}

	public synchronized void flush() {
		this.flush(false);
	}

	public synchronized void flush(boolean writeMeta) {
		this.ensureOpen("flush");
		if (lastDirection == Direction.UNINIT)
			return;
		long pos = 0L;
		if (isMapped) {
			if (lastDirection == Direction.WRITE) {
				++flushCount;
				pos = getUnderlyingFilePos();
				mappedBuffer.force();
			}
			return;
		}
		if (fileChannel == null) {
			lastDirection = Direction.UNINIT;
			return;
		}
		try {
			this.invalidateReadData(true);
			if (lastDirection == Direction.READ) {
				lastDirection = Direction.UNINIT;
				return;
			}
			++flushCount;
			pos = getUnderlyingFilePos();
			this.writeWritableDataToChannel(true);
			try {
				synchronized (SubLThread.getInterruptLock()) {
					boolean needsInterruption = Threads.forciblyHandleInterrupts();
					lastDirection = Direction.UNINIT;
					try {
						if (!isNullFile)
							fileChannel.force(writeMeta);
						lastDirection = Direction.UNINIT;
					} finally {
						if (needsInterruption)
							SubLProcess.currentProcess().interrupt();
					}
				}
			} catch (ClosedByInterruptException cbie) {
				Threads.possiblyHandleInterrupts(false);
				reopenChannel(pos);
				this.flush();
			} catch (ClosedChannelException cbie2) {
				Threads.possiblyHandleInterrupts(false);
				reopenChannel(pos);
				this.flush();
			} catch (Exception e2) {
				try {
					synchronized (SubLThread.getInterruptLock()) {
						boolean needsInterruption2 = Threads.forciblyHandleInterrupts();
						try {
							if (!isNullFile)
								fileChannel.force(true);
						} finally {
							if (needsInterruption2)
								SubLProcess.currentProcess().interrupt();
						}
					}
				} catch (ClosedByInterruptException cbie3) {
					Threads.possiblyHandleInterrupts(false);
					reopenChannel(pos);
					this.flush();
				} catch (ClosedChannelException cbie4) {
					Threads.possiblyHandleInterrupts(false);
					reopenChannel(pos);
					this.flush();
				}
			}
		} catch (IOException e) {
			Errors.error("Error flushing stream: " + this, e);
		}
	}

	@Override
	public FileDescriptor getFD() {
		if (!isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		try {
			return raf.getFD();
		} catch (IOException e) {
			Errors.error("Unable to get file descriptor for stream: " + this, e);
			return null;
		}
	}

	@Override
	public File getFile() {
		if (!isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream.");
		return theFile;
	}

	@Override
	public long getFilePointer() {
		if (isClosed())
			return -1L;
		if (!isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		long result = getUnderlyingFilePos();
		if (isMapped)
			return result;
		if (lastDirection == Direction.READ) {
			final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
			result -= readByteBuffer.remaining();
		} else if (lastDirection == Direction.WRITE) {
			if (true || SubLMain.BOOTY_HACKZ) {
				if (writeByteBuffer0 == null) {
					final ByteBuffer someOddByteBuffer = getWritableByteBuffer(true);
					result += someOddByteBuffer.position();
				}
			} else {
				final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
				result += writeByteBuffer.position();
			}
		}
		return result;
	}

	@Override
	public long getFlushCount() {
		return flushCount;
	}

	@Override
	public boolean isMemoryMapped() {
		return isMapped;
	}

	@Override
	public boolean isRandomAccess() {
		return theFile != null;
	}

	@Override
	public long file_length() {
		if (!isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		return theFile.length();
	}

	public long numBytesAvailable() {
		final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
		return getFileSize() - getUnderlyingFilePos() + (readByteBuffer.limit() - readByteBuffer.position());
	}

	public int read() {
		lastDirection = Direction.READ;
		return readInternalARASS();
	}

	public int read(byte[] b) {
		lastDirection = Direction.READ;
		Errors.unimplementedMethod("AstractSubLTextStream.read(byte[])");
		return -1;
	}

	public int read(byte[] b, int off, int len) {
		lastDirection = Direction.READ;
		Errors.unimplementedMethod("AstractSubLTextStream.read(byte[], int, int)");
		return -1;
	}

	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		lastDirection = Direction.READ;
		if (bytesInInteger > 8 || bytesInInteger <= 0)
			Errors.error("Bytes in integer is bad: " + bytesInInteger);
		long result = 0L;
		byte[] tmpBuffer = SubLProcess.currentSubLThread().byteBuffer;
		boolean expectedUnderFlow = false;
		try {
			final ByteBuffer readByteBuffer = getReadableByteBuffer(true);

			int remaining = readByteBuffer.remaining();
			if (remaining < bytesInInteger) {
				expectedUnderFlow = true;
			}
			readByteBuffer.get(tmpBuffer, 0, bytesInInteger);
			incrementFilePosition(bytesInInteger);
			if (useNetworkByteOrder)
				for (int i = bytesInInteger - 1, offset = 0; i >= 0; result |= (tmpBuffer[i--] & 0xFF) << offset, offset += 8) {
				}
			else
				for (int i = 0, offset = 0; i < bytesInInteger; result |= (tmpBuffer[i++] & 0xFF) << offset, offset += 8) {
				}
			return result;
		} catch (BufferUnderflowException bue) {
			if (!expectedUnderFlow)
				BeanShellCntrl.bp();
			long curChar = -1L;
			if (useNetworkByteOrder)
				for (int j = (bytesInInteger - 1) * 8; j >= 0; j -= 8) {
					curChar = readInternalARASS();
					if (curChar == -1L)
						throw new RuntimeException("EOF");
					result |= curChar << j;
				}
			else
				for (int j = 0, size = bytesInInteger * 8; j < size; j += 8) {
					curChar = readInternalARASS();
					if (curChar == -1L)
						throw new RuntimeException("EOF");
					result |= curChar << j;
				}
			return result;
		}
	}

	public int readByteSequenceToString(SubLString str) {
		try {
			lastDirection = Direction.READ;
			byte[] tmpBuffer = SubLProcess.currentSubLThread().byteBufferLarge;
			int size = str.size();
			if (size < tmpBuffer.length)
				try {
					final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
					readByteBuffer.get(tmpBuffer, 0, size);
					incrementFilePosition(size);
					byte curByte = 0;
					for (int i = 0; i < size; ++i) {
						curByte = tmpBuffer[i];
						if (curByte == -1)
							Errors.error("Got unexpected end of file on stream: " + this);
						str.setInternal(i, (char) (curByte & 0xFF));
					}
					return curByte;
				} catch (BufferUnderflowException ex) {
				}
			int curChar = 1;
			for (int i = 0; i < size; ++i) {
				curChar = readInternalARASS();
				if (curChar == -1)
					Errors.error("Got unexpected end of file on stream: " + this);
				str.setInternal(i, (char) curChar);
			}
			return curChar;
		} finally {
			str.setMutated();
		}
	}

	//	public int readCharWithTimeout() {
	//		return readChar();
	//	}
	//
	public int readChar() {
		lastDirection = Direction.READ;
		try {
			incrementFilePosition(1L);
			final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
			return readByteBuffer.get();
		} catch (BufferUnderflowException bue) {
			incrementFilePosition(-1L);
			return this.readMoreData() <= 0 ? -1 : this.readChar();
		} catch (Exception e) {
			incrementFilePosition(-1L);
			Errors.error("Unable to read character from stream: " + this, e);
			return -1;
		}
	}

	public int readChar(char[] b) {
		lastDirection = Direction.READ;
		Errors.unimplementedMethod("AstractSubLTextStream.read(char[])");
		return -1;
	}

	public int readChar(char[] b, int off, int len) {
		lastDirection = Direction.READ;
		Errors.unimplementedMethod("AstractSubLTextStream.read(char[], int, int)");
		return -1;
	}

	public boolean ready() {
		final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
		return readByteBuffer.hasRemaining() || fileChannel != null && getUnderlyingFilePos() != getFileSize();
	}

	@Override
	public void seek(long pos) {
		if (!isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		if (pos == getFilePointer())
			return;
		if (!isMapped) {
			ByteBuffer theBuf = null;
			if (lastDirection == Direction.WRITE) {
				final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
				theBuf = writeByteBuffer;
			} else if (lastDirection == Direction.READ) {
				final ByteBuffer readByteBuffer = getReadableByteBuffer(true);

				theBuf = readByteBuffer;
			}
			if (theBuf != null) {
				long thePos = getUnderlyingFilePos();
				long maxBytePos = thePos + theBuf.limit();
				long minBytePos = thePos;
				if (lastDirection == Direction.READ) {
					maxBytePos = thePos;
					minBytePos = thePos - theBuf.limit();
				}
				if (pos >= minBytePos && pos < maxBytePos) {
					int destPos = (int) (pos - minBytePos);
					theBuf.position(destPos);
					setFilePosition(pos);
					return;
				}
				switch (lastDirection) {
				case WRITE:
					this.flush();
					break;
				case READ:
					this.invalidateReadData(false);
					lastDirection = Direction.UNINIT;
					break;
				}
			}
			setUnderlyingFilePos(pos);
			setFilePosition(pos);
		}
		if (isMapped) {
			final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
			readByteBuffer.position((int) pos);
			setFilePosition(pos);
		}
	}

	@Override
	public void setLength(long newLength) {
		this.ensureOpen("setLength");
		if (!isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		long pos = 0L;
		try {
			pos = getUnderlyingFilePos();
			try {
				this.flush();
			} catch (Exception ex) {
			}
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					fileChannel.truncate(newLength);
					this.invalidateReadData();
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(pos);
			setLength(newLength);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(pos);
			setLength(newLength);
		} catch (IOException e) {
			Errors.error("Error setting length of file: " + this, e);
		}
	}

	final public boolean shouldParentDoWork() {
		return getReadableByteBuffer(false) != null || getWritableByteBuffer(false) != null;
	}

	public long skip(long n) {
		final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
		long charsToEOF = getFileSize() - getUnderlyingFilePos() + readByteBuffer.remaining();
		seek(charsToEOF + n);
		return n;
	}

	// @Override
	// public String printObjectImpl() {
	// return toString();
	// }

	@Override
	public String printObjectImpl() {
		if (isPrintReadable(null)) {
			Symbol s = Lisp.standardSymbolValue(this);
			if (s != null)
				return s.cl_symbol_name();
		}
		String sb;
		SubLObject eletype = typeOf();
		if (eletype != null && eletype != Symbol.SYSTEM_STREAM) {
			sb = "#<" + eletype.toSymbol().getName();
		} else {
			sb = "#<STREAM";
		}

		eletype = getStreamElementType();
		if (eletype == null) {
			sb += " e";
		} else if (eletype instanceof Symbol) {
			sb += " " + ((Symbol) eletype).getName();
		} else {
			sb += " e=" + eletype;
		}

		eletype = getElementType();
		if (eletype == null) {
			sb += " s";
		} else if (eletype instanceof Symbol) {
			sb += " " + ((Symbol) eletype).getName();
		} else {
			sb += " s=" + eletype;
		}

		eletype = getDirection();
		if (eletype != null) {
			sb += " " + eletype;
		}
		if (lastDirection != Direction.UNINIT) {
			sb += " last-op=" + lastDirection;
		}

		if (fileMode != null && !fileMode.equals("")) {
			sb += " mode:" + fileMode;
		}
		sb += (isClosed() ? " CLOSED" : " OPEN");

		sb += (interactive ? " TTY" : " non-TTY");

		if (isRandomAccess())
			sb += " loc=" + getFilePointer();
		if (theFile != null) {
			sb += " bufSize=" + bufSize + " isMapped=" + isMapped + " file=" + theFile;
		}
		sb += " {" + superHash() + "}";
		return sb + ">";
	}

	public void unread(int c) {
		lastDirection = Direction.READ;
		final ByteBuffer readByteBuffer = getReadableByteBuffer(true);
		int bytePos = readByteBuffer.position();
		if (bytePos > 0) {
			readByteBuffer.position(bytePos - 1);
			incrementFilePosition(-1L);
			return;
		}
		long charsToEOF = getFileSize() - getUnderlyingFilePos() + readByteBuffer.remaining();
		seek(charsToEOF - 1L);
	}

	public void write(byte[] b) {
		this.write(b, 0, b.length);
	}

	public void write(byte[] b, int off, int len) {
		lastDirection = Direction.WRITE;

		try {
			final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
			if (len <= writeByteBuffer.remaining())
				writeByteBuffer.put(b, off, len);
			else
				while (len > 0) {
					int curWriteAmount = Math.min(len, writeByteBuffer.remaining());
					writeByteBuffer.put(b, off, curWriteAmount);
					len -= curWriteAmount;
					off += curWriteAmount;
					if (len > 0) {
						this.flush();
						lastDirection = Direction.WRITE;
					}
				}
		} catch (BufferOverflowException boe) {
			this.flush();
			this.write(b, off, len);
		}
	}

	public void write(int c) {
		lastDirection = Direction.WRITE;
		try {
			if (c < 0 || c > 255)
				Errors.error("Non-ascii characters not currently supported!");
			final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
			writeByteBuffer.put((byte) c);
		} catch (BufferOverflowException boe) {
			this.flush();
			this.write(c);
		}
	}

	public void write(String str) {
		lastDirection = Direction.WRITE;
		if (str == null)
			return;
		for (int i = 0, size = str.length(); i < size; ++i)
			this.writeChar(str.charAt(i));
	}

	public void write(String str, int off, int len) {
		lastDirection = Direction.WRITE;
		if (str == null)
			return;
		for (int i = off, size = len + off; i < size; ++i)
			this.writeChar(str.charAt(i));
	}

	public void writeChar(char c) {

		lastDirection = Direction.WRITE;
		try {
			final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
			if (c > '\u00ff' || c < '\0')
				Errors.error("Non-ascii characters not currently supported: " + c + ".");
			if (writeByteBuffer == null) {
				print(c);
				return;
			}
			writeByteBuffer.put((byte) c);
		} catch (BufferOverflowException boe) {
			this.flush();
			this.writeChar(c);
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @param c
	 */
	abstract public void print(char c);

	public void writeChar(char[] cbuf) {
		lastDirection = Direction.WRITE;
		for (char c : cbuf)
			this.writeChar(c);
	}

	public void writeChar(char[] cbuf, int off, int len) {
		lastDirection = Direction.WRITE;
		for (int i = off, size = len + off; i < size; ++i)
			this.writeChar(cbuf[i]);
	}

	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		lastDirection = Direction.WRITE;
		assert !isText(getElementType()) : "!isText:" + this;

		if (bytesInInteger > 8 || bytesInInteger <= 0)
			Errors.error("Bytes in integer is bad: " + bytesInInteger);

		if (useNetworkByteOrder)
			for (int i = bytesInInteger - 1; i >= 0; --i) {
				byte val = (byte) ((integer >>> i * 8) & 0xFF);
				this.write1Byte(val);
			}
		else
			for (int i = 0; i < bytesInInteger; ++i) {
				byte val = (byte) (integer & 0xFF);
				this.write1Byte(val);
				integer >>>= 8;
			}
	}

	private void write1Byte(byte val) {
		write(new byte[] { val });
	}

	protected void invalidateReadData() {
		this.invalidateReadData(false);
	}

	protected synchronized void invalidateReadData(boolean shouldSetFilePos) {
		if (isMapped)
			return;
		final ByteBuffer readByteBuffer = getReadableByteBuffer(false);

		if (readByteBuffer != null) {
			int remaining = readByteBuffer.remaining();
			if (remaining > 0) {
				readByteBuffer.clear();
				readByteBuffer.limit(0);
				if (shouldSetFilePos) {
					long pos = getUnderlyingFilePos() - remaining;
					setUnderlyingFilePos(pos);
					setInputIndex(pos);
				}
			}
		}
	}

	protected void invalidateWriteData() {
		final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);

		if (writeByteBuffer != null)
			writeByteBuffer.clear();
	}

	protected synchronized int readMoreData() {
		if (isMapped)
			return -1;
		if (fileChannel == null)
			return -1;
		return this.readMoreData(getUnderlyingFilePos());
	}

	protected synchronized int readMoreData(long startingPos) {
		if (isMapped)
			return -1;
		if (fileChannel == null)
			return -1;
		this.ensureOpen("readMoreData");
		try {
			final ByteBuffer readByteBuffer = getReadableByteBuffer(true);

			if (startingPos != getUnderlyingFilePos())
				seek(startingPos);
			readByteBuffer.clear();
			int result = 0;
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					result = fileChannel.read(readByteBuffer);
					underlyingFilePos += result;
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
			readByteBuffer.rewind();
			readByteBuffer.limit(result >= 0 ? result : 0);
			return result;
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(startingPos);
			return this.readMoreData(startingPos);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(startingPos);
			return this.readMoreData(startingPos);
		} catch (IOException e) {
			Errors.error("Error reading file: " + theFile, e);
			return -1;
		}
	}

	protected synchronized void writeWritableDataToChannel(boolean checkOpen) throws IOException {
		final ByteBuffer writeByteBuffer = getWritableByteBuffer(checkOpen);
		if (fileChannel == null || writeByteBuffer == null)
			return;
		this.writeWritableDataToChannel(getUnderlyingFilePos(), writeByteBuffer.position(), checkOpen);
	}

	protected synchronized void writeWritableDataToChannel(long filePos, int bufferPos, boolean checkOpen) throws IOException {
		final ByteBuffer writeByteBuffer = getWritableByteBuffer(true);
		if (fileChannel == null || writeByteBuffer == null)
			return;
		if (checkOpen)
			this.ensureOpen("writeWritableDataToChannel");
		if (filePos != getUnderlyingFilePos())
			seek(filePos);
		if (bufferPos != writeByteBuffer.position())
			writeByteBuffer.position(bufferPos);
		writeByteBuffer.limit(writeByteBuffer.position());
		writeByteBuffer.rewind();
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					if (canWrite()) {
						int result = fileChannel.write(writeByteBuffer);
						underlyingFilePos += result;
					}
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
			writeByteBuffer.clear();
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(filePos);
			this.writeWritableDataToChannel(filePos, bufferPos, checkOpen);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			reopenChannel(filePos);
			this.writeWritableDataToChannel(filePos, bufferPos, checkOpen);
		}
	}

	public boolean canWrite() {
		if (theFile != null) {
			try {
				return theFile.canWrite();
			} catch (SecurityException e) {
				if (fileMode.contains("w")) {
					return true;
				}
				return false;
			}
		}
		return true;
	}

	public ByteBuffer getWritableByteBuffer(boolean requireNonNull) {
		if (requireNonNull && writeByteBuffer0 == null) {
			if (readByteBuffer0 != null) {
				bothDirections = true;
				writeByteBuffer0 = readByteBuffer0;
				return readByteBuffer0;
			}
			Startup.bp();
		}
		return writeByteBuffer0;
	}

	public ByteBuffer getReadableByteBuffer(boolean requireNonNull) {
		if (requireNonNull && readByteBuffer0 == null) {
			Startup.bp();
		}
		return readByteBuffer0;
	}

}
