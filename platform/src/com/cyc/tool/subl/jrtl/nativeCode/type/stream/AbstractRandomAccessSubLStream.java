/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

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
import java.nio.channels.FileChannel.MapMode;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractRandomAccessSubLStream extends AbstractSubLStream {
	private enum Direction {
		UNINIT, READ, WRITE;
	}

	private File theFile;

	private RandomAccessFile raFile;

	private FileChannel fileChannel;
	private boolean isMapped;
	protected ByteBuffer byteBuffer;
	protected ByteBuffer writeByteBuffer;
	private String fileMode;
	private long underlyingFilePos;
	private long flushCount;
	private Direction lastDirection;
	private boolean isNullFile;
	private int bufSize;
	private MappedByteBuffer mappedBuffer;

	AbstractRandomAccessSubLStream(String fileName, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		this.isMapped = false;
		this.byteBuffer = null;
		this.writeByteBuffer = null;
		this.fileMode = "";
		this.underlyingFilePos = 0L;
		this.flushCount = 0L;
		this.lastDirection = Direction.UNINIT;
		this.isNullFile = false;
		this.bufSize = 16384;
		this.mappedBuffer = null;
		this.initFile(fileName);
	}

	AbstractRandomAccessSubLStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		super(elementType, direction, ifExists, ifNotExists);
		this.isMapped = false;
		this.byteBuffer = null;
		this.writeByteBuffer = null;
		this.fileMode = "";
		this.underlyingFilePos = 0L;
		this.flushCount = 0L;
		this.lastDirection = Direction.UNINIT;
		this.isNullFile = false;
		this.bufSize = 16384;
		this.mappedBuffer = null;
	}

	public synchronized void close() {
		boolean shouldClose = !this.isClosed();
		try {
			if (this.isRandomAccess() && shouldClose)
				try {
					synchronized (SubLThread.getInterruptLock()) {
						boolean needsInterruption = Threads.forciblyHandleInterrupts();
						try {
							if (this.isMapped && this.mappedBuffer != null && this.lastDirection == Direction.WRITE)
								this.mappedBuffer.force();
							if (this.fileChannel != null) {
								this.writeWritableDataToChannel(false);
								try {
									this.fileChannel.force(true);
								} catch (Exception ex) {
								}
								this.fileChannel.close();
								this.fileChannel = null;
							}
							if (this.raFile != null) {
								this.raFile.close();
								this.raFile = null;
							}
							this.byteBuffer = null;
							this.writeByteBuffer = null;
							this.setFilePosition(0L);
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
		if (this.lastDirection == Direction.UNINIT)
			return;
		long pos = 0L;
		if (this.isMapped) {
			if (this.lastDirection == Direction.WRITE) {
				++this.flushCount;
				pos = this.getUnderlyingFilePos();
				this.mappedBuffer.force();
			}
			return;
		}
		if (this.fileChannel == null) {
			this.lastDirection = Direction.UNINIT;
			return;
		}
		try {
			this.invalidateReadData(true);
			if (this.lastDirection == Direction.READ) {
				this.lastDirection = Direction.UNINIT;
				return;
			}
			++this.flushCount;
			pos = this.getUnderlyingFilePos();
			this.writeWritableDataToChannel(true);
			try {
				synchronized (SubLThread.getInterruptLock()) {
					boolean needsInterruption = Threads.forciblyHandleInterrupts();
					this.lastDirection = Direction.UNINIT;
					try {
						if (!this.isNullFile)
							this.fileChannel.force(writeMeta);
						this.lastDirection = Direction.UNINIT;
					} finally {
						if (needsInterruption)
							SubLProcess.currentProcess().interrupt();
					}
				}
			} catch (ClosedByInterruptException cbie) {
				Threads.possiblyHandleInterrupts(false);
				this.reopenChannel(pos);
				this.flush();
			} catch (ClosedChannelException cbie2) {
				Threads.possiblyHandleInterrupts(false);
				this.reopenChannel(pos);
				this.flush();
			} catch (Exception e2) {
				try {
					synchronized (SubLThread.getInterruptLock()) {
						boolean needsInterruption2 = Threads.forciblyHandleInterrupts();
						try {
							if (!this.isNullFile)
								this.fileChannel.force(true);
						} finally {
							if (needsInterruption2)
								SubLProcess.currentProcess().interrupt();
						}
					}
				} catch (ClosedByInterruptException cbie3) {
					Threads.possiblyHandleInterrupts(false);
					this.reopenChannel(pos);
					this.flush();
				} catch (ClosedChannelException cbie4) {
					Threads.possiblyHandleInterrupts(false);
					this.reopenChannel(pos);
					this.flush();
				}
			}
		} catch (IOException e) {
			Errors.error("Error flushing stream: " + this, e);
		}
	}

	public FileDescriptor getFD() {
		if (!this.isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		try {
			return this.raFile.getFD();
		} catch (IOException e) {
			Errors.error("Unable to get file descriptor for stream: " + this, e);
			return null;
		}
	}

	public File getFile() {
		if (!this.isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream.");
		return this.theFile;
	}

	public long getFilePointer() {
		if (this.isClosed())
			return -1L;
		if (!this.isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
			long result = this.getUnderlyingFilePos();
		if (this.isMapped)
			return result;
			if (this.lastDirection == Direction.READ)
				result -= this.byteBuffer.remaining();
			else if (this.lastDirection == Direction.WRITE)
				result += this.writeByteBuffer.position();
			return result;
	}

	private long getFileSize() {
		this.ensureOpen("getFileSize");
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					if (this.writeByteBuffer != null)
						this.flush();
					return this.fileChannel.size();
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			return this.getFileSize();
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			return this.getFileSize();
		} catch (IOException e) {
			Errors.error("Error while getting file position of stream: " + this, e);
			return -1L;
		}
	}

	public long getFlushCount() {
		return this.flushCount;
	}

	private long getUnderlyingFilePos() {
		return this.underlyingFilePos;
	}

	private long getUnderlyingFilePosInt() {
		if (this.isClosed())
			return -1L;
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					return this.underlyingFilePos = this.fileChannel.position();
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(this.getUnderlyingFilePos());
			return this.getUnderlyingFilePosInt();
		} catch (ClosedChannelException cce) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(this.getUnderlyingFilePos());
			return this.getUnderlyingFilePosInt();
		} catch (IOException e) {
			Errors.error("Error while getting file position of stream: " + this, e);
			return -1L;
		}
	}

	private void incrementFilePosition(long amount) {
		this.incrementInputIndex(amount);
		if (this.isMapped)
			this.underlyingFilePos += amount;
	}

	private void initFile(String fileName) {
		boolean shouldMemoryMap = StreamsLow.$should_memory_map_files$.getDynamicValue() != CommonSymbols.NIL;
		this.bufSize = 16384;
		if (this.direction == CommonSymbols.INPUT_KEYWORD)
			this.bufSize = StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue().toInteger().intValue();
		else
			this.bufSize = StreamsLow.$stream_initial_output_buffer_size$.getDynamicValue().toInteger().intValue();
		this.isNullFile = this.isNullFile(fileName);
		try {
			this.theFile = new File(fileName).getCanonicalFile();
			if (this.theFile.isDirectory())
				Errors.error("Can't open a directory as a stream: " + this.theFile);
			boolean doesExist = this.theFile.exists();
			boolean shouldMoveToEnd = false;
			boolean shouldTruncateToZeroLength = false;
			if (this.direction == CommonSymbols.OUTPUT_KEYWORD || this.direction == CommonSymbols.IO_KEYWORD) {
				this.fileMode += "w";
				if (doesExist) {
					if (this.direction != CommonSymbols.INPUT_KEYWORD) {
						if (!this.theFile.canWrite())
							Errors.error("Don't have permissions to write file: " + this.theFile);
						if (this.ifExists == CommonSymbols.ERROR_KEYWORD)
							Errors.error("File already exists: " + this.theFile);
						if (this.ifExists == CommonSymbols.NEW_VERSION_KEYWORD)
							shouldTruncateToZeroLength = true;
						if (this.ifExists == CommonSymbols.APPEND_KEYWORD)
							shouldMoveToEnd = true;
						if (this.ifExists == CommonSymbols.NIL)
							throw new SubLStreamNilException();
					}
				} else {
					if (this.ifNotExists == CommonSymbols.NIL)
					throw new SubLStreamNilException();
					if (this.ifNotExists == CommonSymbols.ERROR_KEYWORD)
					Errors.error("File does not already exist: " + this.theFile);
				else
					try {
						File parentFile = this.theFile.getParentFile();
						if (parentFile != null && !parentFile.exists())
							try {
								parentFile.mkdir();
								} catch (Exception ex) {
								}
						this.theFile.createNewFile();
					} catch (IOException ioe) {
						Errors.error("Could not create file: " + this.theFile, ioe);
					}
			}
			}
			if (this.direction == CommonSymbols.INPUT_KEYWORD || this.direction == CommonSymbols.IO_KEYWORD) {
				this.fileMode = "r" + this.fileMode;
				if (doesExist) {
					if (this.direction != CommonSymbols.INPUT_KEYWORD) {
						if (!this.theFile.canRead())
							Errors.error("Don't have permissions to read file: " + this.theFile);
						if (this.ifExists == CommonSymbols.ERROR_KEYWORD)
							Errors.error("File already exists: " + this.theFile);
						if (this.ifExists == CommonSymbols.APPEND_KEYWORD)
							shouldMoveToEnd = true;
						if (this.ifExists == CommonSymbols.NIL)
							throw new SubLStreamNilException();
					}
				} else {
					if (this.ifNotExists == CommonSymbols.NIL)
					throw new SubLStreamNilException();
					if (this.ifNotExists == CommonSymbols.ERROR_KEYWORD)
					Errors.error("File does not already exist: " + this.theFile);
				else
					this.theFile.createNewFile();
			}
			}
			if ("w".equals(this.fileMode))
				this.fileMode = "rw";
			this.raFile = new RandomAccessFile(this.theFile, this.fileMode);
			if (shouldTruncateToZeroLength && this.raFile.length() > 0L)
				this.raFile.setLength(0L);
			this.fileChannel = this.raFile.getChannel();
			if (this.direction == CommonSymbols.INPUT_KEYWORD || this.direction == CommonSymbols.IO_KEYWORD)
				if (this.theFile.length() > 100000L && this.theFile.length() < 2147483647L && shouldMemoryMap) {
					this.mappedBuffer = this.direction == CommonSymbols.INPUT_KEYWORD
							? this.fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, this.theFile.length())
							: this.fileChannel.map(FileChannel.MapMode.READ_WRITE, 0L, this.theFile.length());
					this.byteBuffer = this.mappedBuffer;
					this.isMapped = true;
					if (this.theFile.length() <= 700000000L)
						this.mappedBuffer.load();
				} else
					this.byteBuffer = ByteBuffer.allocate(this.bufSize);
			if (this.direction == CommonSymbols.OUTPUT_KEYWORD || this.direction == CommonSymbols.IO_KEYWORD)
				this.writeByteBuffer = this.isMapped ? this.byteBuffer : ByteBuffer.allocate(this.bufSize);
			this.invalidateReadData();
			if (shouldMoveToEnd)
				this.seek(this.getFileSize());
		} catch (SubLException se) {
			throw se;
		} catch (IOException e) {
			Errors.error("Error opening stream: " + this, e);
		}
	}

	protected void invalidateReadData() {
		this.invalidateReadData(false);
	}

	protected synchronized void invalidateReadData(boolean shouldSetFilePos) {
		if (this.isMapped)
			return;
		if (this.byteBuffer != null) {
			int remaining = this.byteBuffer.remaining();
			if (remaining > 0) {
				this.byteBuffer.clear();
				this.byteBuffer.limit(0);
				if (shouldSetFilePos) {
					long pos = this.getUnderlyingFilePos() - remaining;
					this.setUnderlyingFilePos(pos);
					this.setInputIndex(pos);
				}
			}
		}
	}

	protected void invalidateWriteData() {
		if (this.writeByteBuffer != null)
			this.writeByteBuffer.clear();
	}

	public boolean isMemoryMapped() {
		return this.isMapped;
	}

	private boolean isNullFile(String fileName) {
		return "/dev/null".equals(fileName.toLowerCase());
	}

	public boolean isRandomAccess() {
		return this.theFile != null;
	}

	public long length() {
		if (!this.isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		return this.theFile.length();
	}

	public long numBytesAvailable() {
			return this.getFileSize() - this.getUnderlyingFilePos()
					+ (this.byteBuffer.limit() - this.byteBuffer.position());
	}

	public int read() {
		this.lastDirection = Direction.READ;
		return this.readInternalARASS();
	}

	public int read(byte[] b) {
		this.lastDirection = Direction.READ;
			Errors.unimplementedMethod("AstractSubLTextStream.read(byte[])");
			return -1;
	}

	public int read(byte[] b, int off, int len) {
		this.lastDirection = Direction.READ;
			Errors.unimplementedMethod("AstractSubLTextStream.read(byte[], int, int)");
			return -1;
	}

	public long readByteSequenceToPositiveInteger(int bytesInInteger) {
		return readByteSequenceToPositiveInteger(bytesInInteger, false);
	}
	public long readByteSequenceToPositiveInteger(int bytesInInteger, boolean useNetworkByteOrder) {
		this.lastDirection = Direction.READ;
		if (bytesInInteger > 8 || bytesInInteger <= 0)
			Errors.error("Bytes in integer is bad: " + bytesInInteger);
		long result = 0L;
		byte[] tmpBuffer = SubLProcess.currentSubLThread().byteBuffer;
		try {
			this.byteBuffer.get(tmpBuffer, 0, bytesInInteger);
			this.incrementFilePosition(bytesInInteger);
			if (useNetworkByteOrder)
				for (int i = bytesInInteger
						- 1, offset = 0; i >= 0; result |= (tmpBuffer[i--] & 0xFF) << offset, offset += 8) {
				}
			else
				for (int i = 0, offset = 0; i < bytesInInteger; result |= (tmpBuffer[i++]
						& 0xFF) << offset, offset += 8) {
				}
			return result;
		} catch (BufferUnderflowException bue) {
			long curChar = -1L;
			if (useNetworkByteOrder)
				for (int j = (bytesInInteger - 1) * 8; j >= 0; j -= 8) {
					curChar = this.readInternalARASS();
					if (curChar == -1L)
						throw new RuntimeException("EOF");
					result |= curChar << j;
		}
			else
				for (int j = 0, size = bytesInInteger * 8; j < size; j += 8) {
			curChar = this.readInternalARASS();
					if (curChar == -1L)
						throw new RuntimeException("EOF");
					result |= curChar << j;
		}
		return result;
	}
	}

	public int readByteSequenceToString(SubLString str) {
		try {
		this.lastDirection = Direction.READ;
			byte[] tmpBuffer = SubLProcess.currentSubLThread().byteBufferLarge;
		int size = str.size();
		if (size < tmpBuffer.length)
			try {
				this.byteBuffer.get(tmpBuffer, 0, size);
					this.incrementFilePosition(size);
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
			curChar = this.readInternalARASS();
			if (curChar == -1)
				Errors.error("Got unexpected end of file on stream: " + this);
				str.setInternal(i, (char) curChar);
		}
		return curChar;
		} finally {
			str.setMutated();
		}
	}

	public int readChar() {
		this.lastDirection = Direction.READ;
		try {
			this.incrementFilePosition(1L);
			return this.byteBuffer.get();
		} catch (BufferUnderflowException bue) {
			this.incrementFilePosition(-1L);
			return this.readMoreData() <= 0 ? -1 : this.readChar();
		} catch (Exception e) {
			this.incrementFilePosition(-1L);
			Errors.error("Unable to read character from stream: " + this, e);
			return -1;
		}
	}

	public int readChar(char[] b) {
		this.lastDirection = Direction.READ;
			Errors.unimplementedMethod("AstractSubLTextStream.read(char[])");
			return -1;
		}

	public int readChar(char[] b, int off, int len) {
		this.lastDirection = Direction.READ;
			Errors.unimplementedMethod("AstractSubLTextStream.read(char[], int, int)");
			return -1;
	}

	private int readInternalARASS() {
		try {
			this.incrementFilePosition(1L);
			return 0xFF & this.byteBuffer.get();
		} catch (BufferUnderflowException bue) {
			this.incrementFilePosition(-1L);
			return this.readMoreData() <= 0 ? -1 : this.read();
		} catch (Exception e) {
			this.incrementFilePosition(-1L);
			Errors.error("Unable to read character from stream: " + this, e);
			return -1;
		}
	}

	protected synchronized int readMoreData() {
		if (this.isMapped)
			return -1;
		if (this.fileChannel == null)
			return -1;
		return this.readMoreData(this.getUnderlyingFilePos());
	}

	protected synchronized int readMoreData(long startingPos) {
		if (this.isMapped)
			return -1;
		if (this.fileChannel == null)
			return -1;
		this.ensureOpen("readMoreData");
		try {
			if (startingPos != this.getUnderlyingFilePos())
				this.seek(startingPos);
			this.byteBuffer.clear();
			int result = 0;
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					result = this.fileChannel.read(this.byteBuffer);
					this.underlyingFilePos += result;
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
			this.byteBuffer.rewind();
			this.byteBuffer.limit(result >= 0 ? result : 0);
			return result;
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(startingPos);
			return this.readMoreData(startingPos);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(startingPos);
			return this.readMoreData(startingPos);
		} catch (IOException e) {
			Errors.error("Error reading file: " + this.theFile, e);
			return -1;
		}
	}

	public boolean ready() {
		return this.byteBuffer.hasRemaining()
				|| this.fileChannel != null && this.getUnderlyingFilePos() != this.getFileSize();
	}

	private synchronized void reopenChannel(long pos) {
		if (this.isClosed())
			throw new RuntimeException("Illegal attempt to quietly reopen a closed channel: " + this);
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					if (this.fileChannel != null && this.fileChannel.isOpen())
						try {
							this.fileChannel.close();
						} catch (Exception ex) {
						}
					if (this.raFile != null)
						try {
							this.raFile.close();
						} catch (Exception ex2) {
						}
					this.raFile = new RandomAccessFile(this.theFile, this.fileMode);
					(this.fileChannel = this.raFile.getChannel()).position(pos);
					this.underlyingFilePos = pos;
					if (this.isMapped)
						throw new RuntimeException("Implement reopening unexpectedly closed memory mapped files.");
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (IOException e) {
			Errors.error("Error reopening file: " + this.theFile, e);
		}
	}

	public void seek(long pos) {
		if (!this.isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		if (pos == this.getFilePointer())
			return;
		if (!this.isMapped) {
			ByteBuffer theBuf = null;
			if (this.lastDirection == Direction.WRITE)
				theBuf = this.writeByteBuffer;
			else if (this.lastDirection == Direction.READ)
				theBuf = this.byteBuffer;
			if (theBuf != null) {
				long thePos = this.getUnderlyingFilePos();
				long maxBytePos = thePos + theBuf.limit();
				long minBytePos = thePos;
				if (this.lastDirection == Direction.READ) {
					maxBytePos = thePos;
					minBytePos = thePos - theBuf.limit();
				}
				if (pos >= minBytePos && pos < maxBytePos) {
					int destPos = (int) (pos - minBytePos);
					theBuf.position(destPos);
					this.setFilePosition(pos);
					return;
				}
				switch (this.lastDirection) {
				case WRITE:
					this.flush();
					break;
				case READ:
					this.invalidateReadData(false);
					this.lastDirection = Direction.UNINIT;
					break;
				}
			}
			this.setUnderlyingFilePos(pos);
			this.setFilePosition(pos);
		}
			if (this.isMapped) {
			this.byteBuffer.position((int) pos);
			this.setFilePosition(pos);
		}
			}

	private void setFilePosition(long pos) {
			this.setInputIndex(pos);
		if (this.isMapped)
			this.underlyingFilePos = pos;
	}

	public void setLength(long newLength) {
		this.ensureOpen("setLength");
		if (!this.isRandomAccess())
			Errors.error("Illegal operation on a non-random access stream: " + this);
		long pos = 0L;
		try {
			pos = this.getUnderlyingFilePos();
			try {
				this.flush();
			} catch (Exception ex) {
			}
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					this.fileChannel.truncate(newLength);
					this.invalidateReadData();
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(pos);
			this.setLength(newLength);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(pos);
			this.setLength(newLength);
		} catch (IOException e) {
			Errors.error("Error setting length of file: " + this, e);
		}
	}

	private void setUnderlyingFilePos(long pos) {
		this.ensureOpen("setUnderlyingFilePos");
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					this.underlyingFilePos = pos;
					this.fileChannel.position(pos);
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(pos);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(pos);
		} catch (IOException e) {
			Errors.error("Error while setting file position of stream: " + this + " to: " + pos, e);
		} catch (RuntimeException e2) {
			Errors.error("Error while setting file position of stream: " + this + " to: " + pos, e2);
		}
	}

	public boolean shouldParentDoWork() {
		return this.byteBuffer != null || this.writeByteBuffer != null;
	}

	public long skip(long n) {
		try {
			long charsToEOF = this.getFileSize() - this.getUnderlyingFilePos() + this.byteBuffer.remaining(); // @todo
			// this
			// wont
			// work
			// of
			// write
			// only
			// files
			this.seek(charsToEOF + n);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			Errors.error("Unable to skip " + n + " characters in stream: " + this, e);
			return -1;
		}
	}

	public String toString() {
		if (this.theFile != null)
			return "#<STREAM " + this.elementType + " " + this.direction + " FILE: " + this.theFile.getAbsolutePath()
					+ (this.isClosed() ? " CLOSED" : " OPEN") + " @ " + this.superHash() + " bufSize=" + this.bufSize
					+ " loc=" + this.getFilePointer() + " isMapped=" + this.isMapped + ">";
		return super.toString();
	}

	public void unread(int c) {
		this.lastDirection = Direction.READ;
			int bytePos = this.byteBuffer.position();
			if (bytePos > 0) {
				this.byteBuffer.position(bytePos - 1);
			this.incrementFilePosition(-1L);
				return;
			}
			long charsToEOF = this.getFileSize() - this.getUnderlyingFilePos() + this.byteBuffer.remaining();
		this.seek(charsToEOF - 1L);
	}

	public void write(byte[] b) {
		this.lastDirection = Direction.WRITE;
		this.write(b, 0, b.length);
	}

	public void write(byte[] b, int off, int len) {
		this.lastDirection = Direction.WRITE;
		try {
			if (len <= this.writeByteBuffer.remaining())
				this.writeByteBuffer.put(b, off, len);
			else
				while (len > 0) {
					int curWriteAmount = Math.min(len, this.writeByteBuffer.remaining());
					this.writeByteBuffer.put(b, off, curWriteAmount);
					len -= curWriteAmount;
					off += curWriteAmount;
					if (len > 0) {
						this.flush();
						this.lastDirection = Direction.WRITE;
					}
				}
		} catch (BufferOverflowException boe) {
			this.flush();
			this.write(b, off, len);
		}
	}

	public void write(int c) {
		this.lastDirection = Direction.WRITE;
		try {
			if (c < 0 || c > 255)
				Errors.error("Non-ascii characters not currently supported!");
			this.writeByteBuffer.put((byte) c);
		} catch (BufferOverflowException boe) {
			this.flush();
			this.write(c);
		} catch (Exception e) {
			e.printStackTrace();
			Errors.error("Error writing stream.", e);
		}
	}

	public void write(String str) {
		this.lastDirection = Direction.WRITE;
		if (str == null)
			return;
		for (int i = 0, size = str.length(); i < size; ++i)
			this.writeChar(str.charAt(i));
	}

	public void write(String str, int off, int len) {
		this.lastDirection = Direction.WRITE;
		if (str == null)
			return;
		for (int i = off, size = len + off; i < size; ++i)
			this.writeChar(str.charAt(i));
	}

	public void writeChar(char c) {
		this.lastDirection = Direction.WRITE;
		try {
			if (c > '\u00ff' || c < '\0')
				Errors.error("Non-ascii characters not currently supported: " + c + ".");
			this.writeByteBuffer.put((byte) c);
		} catch (BufferOverflowException boe) {
			this.flush();
			this.writeChar(c);
		} catch (Exception e) {
			Errors.error("Error writing stream.", e);
		}
	}

	public void writeChar(char[] cbuf) {
		this.lastDirection = Direction.WRITE;
			Errors.unimplementedMethod("AbstractSubLTetStream.write(char[])");
	}

	public void writeChar(char[] cbuf, int off, int len) {
		this.lastDirection = Direction.WRITE;
			Errors.unimplementedMethod("AbstractSubLTetStream.write(char[],int,int)");
	}

	public void writePositiveIntegerAsByteSequence(long integer, int bytesInInteger, boolean useNetworkByteOrder) {
		this.lastDirection = Direction.WRITE;
		if (bytesInInteger > 8 || bytesInInteger <= 0)
			Errors.error("Bytes in integer is bad: " + bytesInInteger);
		if (useNetworkByteOrder)
			for (int i = bytesInInteger - 1; i >= 0; --i) {
				int val = (int) (integer >>> i * 8) & 0xFF;
				this.write(val);
			}
		else
			for (int i = 0; i < bytesInInteger; ++i) {
				int val = (int) integer & 0xFF;
				this.write(val);
				integer >>>= 8;
			}
	}

	protected synchronized void writeWritableDataToChannel(boolean checkOpen) throws IOException {
		if (this.fileChannel == null || this.writeByteBuffer == null)
			return;
		this.writeWritableDataToChannel(this.getUnderlyingFilePos(), this.writeByteBuffer.position(), checkOpen);
	};

	protected synchronized void writeWritableDataToChannel(long filePos, int bufferPos, boolean checkOpen)
			throws IOException {
		if (this.fileChannel == null || this.writeByteBuffer == null)
			return;
		if (checkOpen)
			this.ensureOpen("writeWritableDataToChannel");
		if (filePos != this.getUnderlyingFilePos())
			this.seek(filePos);
		if (bufferPos != this.writeByteBuffer.position())
			this.writeByteBuffer.position(bufferPos);
		this.writeByteBuffer.limit(this.writeByteBuffer.position());
		this.writeByteBuffer.rewind();
		try {
			synchronized (SubLThread.getInterruptLock()) {
				boolean needsInterruption = Threads.forciblyHandleInterrupts();
				try {
					int result = this.fileChannel.write(this.writeByteBuffer);
					this.underlyingFilePos += result;
				} finally {
					if (needsInterruption)
						SubLProcess.currentProcess().interrupt();
				}
			}
			this.writeByteBuffer.clear();
		} catch (ClosedByInterruptException cbie) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(filePos);
			this.writeWritableDataToChannel(filePos, bufferPos, checkOpen);
		} catch (ClosedChannelException cbie2) {
			Threads.possiblyHandleInterrupts(false);
			this.reopenChannel(filePos);
			this.writeWritableDataToChannel(filePos, bufferPos, checkOpen);
		}
	}
}
