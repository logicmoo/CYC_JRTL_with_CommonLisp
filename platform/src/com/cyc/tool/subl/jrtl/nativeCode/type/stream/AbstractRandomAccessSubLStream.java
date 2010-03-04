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

package  com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
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
import javax.swing.filechooser.FileNameExtensionFilter;

//// Internal Imports

//// External Imports

public  abstract class AbstractRandomAccessSubLStream extends AbstractSubLStream {
  
  //// Constructors
  
  AbstractRandomAccessSubLStream(SubLSymbol elementType, SubLSymbol direction,
      SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(elementType, direction, ifExists, ifNotExists);
  }
  
  AbstractRandomAccessSubLStream(String fileName, SubLSymbol elementType, 
      SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
    super(elementType, direction, ifExists, ifNotExists);
    initFile(fileName);
  }
  
  //// Public Area
  
  public String toString() {
    if (theFile != null) {
      return "#<STREAM " + elementType + " " + direction + " FILE: " 
        + theFile.getAbsolutePath() + (isClosed() ? " CLOSED" : " OPEN") + " @ " + superHash() + ">";
    } else {
      return super.toString();
    }
  }
  
  public boolean ready() {
    try {
      if (byteBuffer.hasRemaining()) { return true; }
      if (fileChannel == null) { return false; } // handle string streams appropriately
      return (getUnderlyingFilePos() != getFileSize());
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to get available bytes for stream: " + this, e);
      return false;
    }
  }
  
  public int readByteSequenceToString(SubLString str) {
    lastDirection = Direction.READ;
    byte[] tmpBuffer = SubLProcess.currentSubLThread().byteBuffer;
    int size = str.size();
    if (size < tmpBuffer.length) {
      try {
        byteBuffer.get(tmpBuffer, 0, size);
        incrementInputIndex(size);
        byte curByte = 0;
        for (int i = 0; i < size; i++) {
          curByte = tmpBuffer[i];
          if (curByte == -1) { // EOF
            Errors.error("Got unexpected end of file on stream: " + this);
          }
          str.set(i, (char)(curByte & 0x00FF));
        }
        return curByte;
      } catch (BufferUnderflowException bue) {
        ;  // continue on and read the slow way instead
      }
    }
    int curChar = 1;
    for (int i = 0; i < size; i++) { //@todo this is pretty inefficient
      curChar = readInternalARASS();
      if (curChar == -1) { // EOF
        Errors.error("Got unexpected end of file on stream: " + this);
      }
      str.set(i, (char)curChar);
    }
    return curChar;
  }
  
  public long readByteSequenceToPositiveInteger(final int bytesInInteger) {
    lastDirection = Direction.READ;
    if ((bytesInInteger > 8) || (bytesInInteger < 0)) {
      Errors.error("Bytes in integer is bad: " + bytesInInteger);
    }
    long result = 0;
    byte[] tmpBuffer = SubLProcess.currentSubLThread().byteBuffer;
    try {
      byteBuffer.get(tmpBuffer, 0, bytesInInteger);
      incrementInputIndex(bytesInInteger);
      for (int i = 0, offset=0; i < bytesInInteger; offset+=8) {
        result += ((tmpBuffer[i++] & 0x00FF) << offset);
      }
      return result;
    } catch (BufferUnderflowException bue) {
      ; // continue on and read the slow way instead
    } catch (Exception e) {
      Errors.error("Unable to read integer from stream: " + this, e);
      return -1;
    }
    int curChar = -1;
    for (int i = 0, size = bytesInInteger * 8; i < size; i += 8) {
      curChar = readInternalARASS();
      if (curChar == -1) { // EOF
        return -1;
      }
      result += curChar << i;
    }
    return result;
  }
  
  private final int readInternalARASS() {
    try {
      incrementInputIndex(1);
      return 0x000000FF & (int)byteBuffer.get();
    } catch (BufferUnderflowException bue) {
      incrementInputIndex(-1);
      return (readMoreData() <= 0) ? -1 : read();
    } catch (Exception e) {
      e.printStackTrace();
      incrementInputIndex(-1);
      Errors.error("Unable to read character from stream: " + this, e);
      return -1;
    }
  }
  
  public int read() {
    lastDirection = Direction.READ;
    return readInternalARASS();
  }
  
  public int read(byte[] b) {
    lastDirection = Direction.READ;
    try {
      Errors.unimplementedMethod("AstractSubLTextStream.read(byte[])");
      return -1;
    } catch (Exception e) {
      Errors.error("Unable to read character from stream: " + this, e);
      return -1;
    }
  }
  
  public int read(byte[] b, int off, int len) {
    lastDirection = Direction.READ;
    try {
      Errors.unimplementedMethod("AstractSubLTextStream.read(byte[], int, int)");
      return -1;
    } catch (Exception e) {
      Errors.error("Unable to read character from stream: " + this, e);
      return -1;
    }
  }
  
  public int readChar() {
    lastDirection = Direction.READ;
    try {
      incrementInputIndex(1);
      return byteBuffer.get();
    } catch (BufferUnderflowException bue) {
      incrementInputIndex(-1);
      return (readMoreData() <= 0) ? -1 : readChar();
    } catch (Exception e) {
      incrementInputIndex(-1);
      e.printStackTrace();
      Errors.error("Unable to read character from stream: " + this, e);
      return -1;
    }
  }
   
  public int readChar(char[] b) {
    lastDirection = Direction.READ;
    try {
      Errors.unimplementedMethod("AstractSubLTextStream.read(char[])");
      return -1;
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to read character from stream: " + this, e);
      return -1;
    }
  }
   
  public int readChar(char[] b, int off, int len) {
    lastDirection = Direction.READ;
    try {
      Errors.unimplementedMethod("AstractSubLTextStream.read(char[], int, int)");
      return -1;
    } catch (Exception e) {
      Errors.error("Unable to read character from stream: " + this, e);
      return -1;
    }
  }
  
  public long skip(long n) {
    try {
      long charsToEOF = (getFileSize() - getUnderlyingFilePos()) + byteBuffer.remaining(); //@todo this wont work of write only files
      seek(charsToEOF + n);
      return n;
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to skip " + n + " characters in stream: " + this, e);
      return -1;
    }
  }
  
  public void unread(int c) {
    lastDirection = Direction.READ;
    try {
      int bytePos = byteBuffer.position();
      if (bytePos > 0) {
        byteBuffer.position(bytePos - 1);
        incrementInputIndex(-1);
        return;
      }
      long charsToEOF = (getFileSize() - getUnderlyingFilePos()) + byteBuffer.remaining();
      seek(charsToEOF - 1);
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to unread character from stream: " + this, e);
    }
  }
  
  public synchronized void close() {
    boolean shouldClose = !isClosed();
    try {
      if ((isRandomAccess()) && shouldClose) {
        try {
          synchronized (SubLThread.getInterruptLock()) {
            boolean needsInterruption = Threads.forciblyHandleInterrupts();
            try {
              if (fileChannel != null) {
                writeWritableDataToChannel(false);
                try {
                  fileChannel.force(true);
                } catch (Exception e) {
                } //ignore errors
                fileChannel.close();
                fileChannel = null;
              }
              if (raFile != null) {
                raFile.close();
                raFile = null;
              }
              byteBuffer = null;
              writeByteBuffer = null;
              setInputIndex(0);
            } finally {
              if (needsInterruption) {
                SubLProcess.currentProcess().interrupt();
              }
            }
          }
        } catch (Exception e) {
          e.printStackTrace();
          Errors.error("Error while closing stream: " + this, e);
        }
      }
    } finally {
      super.close();
    }
  }
  
  public final boolean isRandomAccess() {
    return (theFile != null);
  }
  
  public final boolean shouldParentDoWork() {
    return ((byteBuffer != null) || (writeByteBuffer != null));
  }
  
  private final long getUnderlyingFilePos() {
    return underlyingFilePos;
  }
  
  private final long getUnderlyingFilePosInt() {
    if (isClosed()) { return -1; }
    try {
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          return underlyingFilePos = fileChannel.position();
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
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
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error while getting file position of stream: " + this, e);
      return -1;
    }
  }
  
  private final void setUnderlyingFilePos(long pos) {
    ensureOpen("setUnderlyingFilePos");
    try {
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          underlyingFilePos = pos;
          fileChannel.position(pos);
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
        }
      }
    } catch (ClosedByInterruptException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(pos);
    } catch (ClosedChannelException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(pos);
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error while setting file position of stream: " + this + " to: " + pos, e);
    }
  }
  
  private final long getFileSize() {
    ensureOpen("getFileSize");
    try {
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          if (writeByteBuffer != null) {
            flush();
          }
          return fileChannel.size();
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
        }
      }
    } catch (ClosedByInterruptException cbie) {
      Threads.possiblyHandleInterrupts(false);
      return getFileSize();
    }  catch (ClosedChannelException cbie) {
      Threads.possiblyHandleInterrupts(false);
      return getFileSize();
    }catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error while getting file position of stream: " + this, e);
      return -1;
    }
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final long getFilePointer() {
    if (!isRandomAccess()) {
      Errors.error("Illegal operation on a non-random access stream: " + this);
    }
    try {
      long result = getUnderlyingFilePos();
      if (lastDirection == Direction.READ) {
        result -= byteBuffer.remaining();
      } else if (lastDirection == Direction.WRITE) {
        result += writeByteBuffer.position();
      }
      return result;
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to get file pointer for stream: " + this, e);
      return -1;
    }
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final void seek(long pos) {
    if (!isRandomAccess()) {
      Errors.error("Illegal operation on a non-random access stream: " + this);
    }
    try {
      ByteBuffer theBuf = null;
      if (lastDirection == Direction.WRITE) {
        theBuf = writeByteBuffer;
      } else if (lastDirection == Direction.READ) {
        theBuf = byteBuffer;
      }
      if (theBuf != null) {
        long thePos = getUnderlyingFilePos();
        long maxBytePos = thePos + theBuf.limit();
        long minBytePos = thePos;
        if (lastDirection == Direction.READ) {
          maxBytePos = thePos;
          minBytePos = thePos - theBuf.limit();
        }
        if ((pos >= minBytePos) && (pos < maxBytePos)) {
          int destPos = (int)(pos - minBytePos);
          theBuf.position(destPos);
          setInputIndex(pos);
          return;
        }
        switch (lastDirection) {
          case WRITE:
            flush();
            break;
          case READ:
            invalidateReadData(false);
            lastDirection = Direction.UNINIT;
            break;
        }
      }
      if (isMapped) {
        theBuf.position((int)pos);
        setInputIndex(pos);
        return;
      }
      setUnderlyingFilePos(pos);
      setInputIndex(pos);
    } catch (Exception e) {
      new Exception("Unable to set file position to " + pos + " for stream: " + this, e).printStackTrace();
      Errors.error("Unable to set file position to " + pos + " for stream: " + this, e);
    }
  }
  
  /** throws exception if isRandomAccess() returns false */ 
  public final long length() {
    if (!isRandomAccess()) {
      Errors.error("Illegal operation on a non-random access stream: " + this);
    }
    return theFile.length();
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final FileDescriptor getFD() {
    if (!isRandomAccess()) {
      Errors.error("Illegal operation on a non-random access stream: " + this);
    }
    try {
      return raFile.getFD();
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to get file descriptor for stream: " + this, e);
      return null;
    }
  }
  
  /** throws exception if isRandomAccess() returns false */
  public final void setLength(long newLength) {
    ensureOpen("setLength");
    if (!isRandomAccess()) {
      Errors.error("Illegal operation on a non-random access stream: " + this);
    }
    long pos = 0;
    try {
      pos = getUnderlyingFilePos();
      try { flush(); } catch (Exception e) {} //ignore errors 
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          fileChannel.truncate(newLength);
          invalidateReadData();
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
        }
      }
    } catch (ClosedByInterruptException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(pos);
      setLength(newLength);
    }  catch (ClosedChannelException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(pos);
      setLength(newLength);
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error setting length of file: " + this, e);
    }
  }

  public final long getFlushCount() {
    return flushCount;
  }

  public synchronized void flush() {
    flush(false);
  }
  
  public synchronized void flush(boolean writeMeta) {
    ensureOpen("flush");
    if (lastDirection == Direction.UNINIT) {
     return;
    }
    if (fileChannel == null) {
      lastDirection = Direction.UNINIT;
      return;
    }
    long pos = 0;
    try {
      invalidateReadData(true);
      if (lastDirection == Direction.READ) {
        lastDirection = Direction.UNINIT;
        return;
      }
      flushCount++;
      pos = getUnderlyingFilePos();
      writeWritableDataToChannel(true);
      try {
        synchronized (SubLThread.getInterruptLock()) {
          boolean needsInterruption = Threads.forciblyHandleInterrupts();
          lastDirection = Direction.UNINIT;
          try {
            if (!isNullFile) {
              fileChannel.force(writeMeta);
            }
            lastDirection = Direction.UNINIT;
          } finally {
            if (needsInterruption) {
              SubLProcess.currentProcess().interrupt();
            }
          }
        }
      } catch (ClosedByInterruptException cbie) {
        Threads.possiblyHandleInterrupts(false);
        reopenChannel(pos);
        flush(); // @note we are actually probably hosed at this point
      } catch (ClosedChannelException cbie) {
        Threads.possiblyHandleInterrupts(false);
        reopenChannel(pos);
        flush(); // @note we are actually probably hosed at this point
      } catch (Exception e) {
        try {
          synchronized (SubLThread.getInterruptLock()) {
            boolean needsInterruption = Threads.forciblyHandleInterrupts();
            try {
              if (!isNullFile) {
                fileChannel.force(true);
              }
            } finally {
              if (needsInterruption) {
                SubLProcess.currentProcess().interrupt();
              }
            }
          }
        } catch (ClosedByInterruptException cbie) {
          Threads.possiblyHandleInterrupts(false);
          reopenChannel(pos);
          flush();
        } catch (ClosedChannelException cbie) {
          Threads.possiblyHandleInterrupts(false);
          reopenChannel(pos);
          flush();
        }
      }
    } catch (Exception e) {
      Errors.error("Error flushing stream: " + this, e);
    }
  }
  
  public void write(int c) {
    lastDirection = Direction.WRITE;
    try {
      if ((c < 0) || (c > 255)) {
        Errors.error("Non-ascii characters not currently supported!");
      }
      writeByteBuffer.put((byte)c);
    } catch (BufferOverflowException boe) {
      flush();
      write(c);
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error writing stream.", e);
    }
  }
  
  public void write(byte[] b) {
    lastDirection = Direction.WRITE;
    try {
      Errors.unimplementedMethod("AbstractSubLTetStream.write(byte[])");
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
  }
  
  public void write(byte[] b, int off, int len) {
    lastDirection = Direction.WRITE;
    try {
      Errors.unimplementedMethod("AbstractSubLTetStream.write(char[],int,int)");
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
  }
  
  public void writeChar(char c) {
    lastDirection = Direction.WRITE;
    try {
      if ((c > 255) || (c < 0)) { // @hack 
        Errors.error("Non-ascii characters not currently supported: " + c + ".");
      }
      writeByteBuffer.put((byte)c);
    } catch (BufferOverflowException boe) {
      flush();
      writeChar(c);
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
  }
  
  public void writeChar(char[] cbuf) {
    lastDirection = Direction.WRITE;
    try {
      Errors.unimplementedMethod("AbstractSubLTetStream.write(char[])");
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
  }
  
  public void writeChar(char[] cbuf, int off, int len) {
    lastDirection = Direction.WRITE;
    try {
      Errors.unimplementedMethod("AbstractSubLTetStream.write(char[],int,int)");
    } catch (Exception e) {
      Errors.error("Error writing stream.", e);
    }
  }
  
  public void write(String str) {
    lastDirection = Direction.WRITE;
    if (str == null) { return; }
    for (int i = 0, size = str.length(); i < size; i++) {
      writeChar(str.charAt(i));
    }
  }
  
  public void write(String str, int off, int len) {
    lastDirection = Direction.WRITE;
    if (str == null) { return; }
    for (int i = off, size = len + off; i < size; i++) {
      writeChar(str.charAt(i));
    }
  }
  
  public final File getFile() {
    if (!isRandomAccess()) {
      Errors.error("Illegal operation on a non-random access stream.");
    }
    return theFile;
  }
  
  public long numBytesAvailable() {
    try {
      return (getFileSize() - getUnderlyingFilePos()) + (byteBuffer.limit() - byteBuffer.position());
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Unable to get available bytes for stream.", e);
      return -1;
    }
  }
  
  //// Protected Area
  
  //// Private Area
  private boolean isNullFile(String fileName) {
    return "/dev/null".equals(fileName.toLowerCase());
  }
  
  private void initFile(String fileName) {
    isNullFile = isNullFile(fileName);
    try {
      theFile = new File(fileName).getCanonicalFile(); // don't let changes to links cause files to be changed
      if (theFile.isDirectory()) {
        Errors.error("Can't open a directory as a stream: " + theFile);
      }
      boolean doesExist = theFile.exists();
      boolean shouldMoveToEnd = false;
      boolean shouldTruncateToZeroLength = false;
      // DEAL WITH OUTPUT
      if ((direction == OUTPUT_KEYWORD) || (direction == IO_KEYWORD)) {
        fileMode = fileMode + "w";
        if (doesExist) {
          if (direction != INPUT_KEYWORD) { //ignore ifExists if direction is INPUT
            if (!theFile.canWrite()) {
              Errors.error("Don't have permissions to write file: " + theFile);
            }
            if (ifExists == ERROR_KEYWORD) {
              Errors.error("File already exists: " + theFile);
            }
            if (ifExists == NEW_VERSION_KEYWORD) {
              shouldTruncateToZeroLength = true;
            }
            if (ifExists == APPEND_KEYWORD) {
              shouldMoveToEnd = true;
            }
            if (ifExists == NIL) {
              throw new SubLStreamNilException();
            }
          }
        } else {
          if (ifNotExists == NIL) {
            throw new SubLStreamNilException();
          } else if (ifNotExists == ERROR_KEYWORD) {
            Errors.error("File does not already exist: " + theFile);
          } else {
            try {
              File parentFile = theFile.getParentFile();
              if ((parentFile != null) && (!parentFile.exists())) {
                try {
                  parentFile.mkdir();
                } catch (Exception e) {} //ignore
              }
              theFile.createNewFile();
            } catch (IOException ioe) {
              Errors.error("Could not create file: " + theFile, ioe);
            }
          }
        }
      }
      // DEAL WITH INTPUT
      if ((direction == INPUT_KEYWORD) || (direction == IO_KEYWORD)) {
        fileMode = "r" + fileMode;
        if (doesExist) {
          if (direction != INPUT_KEYWORD) { //ignore ifExists if direction is INPUT
            if (!theFile.canRead()) {
              Errors.error("Don't have permissions to read file: " + theFile);
            }
            if (ifExists == ERROR_KEYWORD) {
              Errors.error("File already exists: " + theFile);
            }
            if (ifExists == APPEND_KEYWORD) {
              shouldMoveToEnd = true;
            }
            if (ifExists == NIL) {
              throw new SubLStreamNilException();
            }
          }
        } else {
          if (ifNotExists == NIL) {
            throw new SubLStreamNilException();
          } else if (ifNotExists == ERROR_KEYWORD) {
            Errors.error("File does not already exist: " + theFile);
          } else {
            theFile.createNewFile();
          }
        }
      }
      if  ("w".equals(fileMode)) { fileMode = "rw"; }
      raFile = new RandomAccessFile(theFile, fileMode);
      if (shouldTruncateToZeroLength) {
        if (raFile.length() > 0) {
          raFile.setLength(0);
        }
      }
      fileChannel = raFile.getChannel();
      if ((direction == INPUT_KEYWORD) || (direction == IO_KEYWORD)) {
        if ((direction == INPUT_KEYWORD) && (theFile.length() > 100000) && false) {
          MappedByteBuffer mappedBuffer = fileChannel.map(MapMode.READ_ONLY, 0, theFile.length());
          byteBuffer = mappedBuffer;
          isMapped = true;
          //charBuffer = DEFAULT_CHARSET_DECODER.decode(mappedBuffer);
          if (theFile.length() <= 150000000) {
            mappedBuffer.load();
          }
        } else {
          byteBuffer = ByteBuffer.allocate(BUF_SIZE);
        }
      }
      if ((direction == OUTPUT_KEYWORD) || (direction == IO_KEYWORD)) {
        writeByteBuffer = ByteBuffer.allocate(BUF_SIZE);
      }
      invalidateReadData();
      if (shouldMoveToEnd) {
        seek(getFileSize());
      }
    } catch (SubLException se) {
      throw se;
    } catch (Exception e) {
      Errors.error("Error opening stream: " + this, e);
    }
  }
  
  protected final void invalidateReadData() {
    invalidateReadData(false);
  }
  
  protected synchronized final void invalidateReadData(boolean shouldSetFilePos) {
    if (isMapped) {
      return;
    }
    if (byteBuffer != null) {
      int remaining = byteBuffer.remaining();
      if (remaining > 0) {
        byteBuffer.clear();
        byteBuffer.limit(0);
        if (shouldSetFilePos) {
          long pos = getUnderlyingFilePos() - remaining;
          setUnderlyingFilePos(pos);
          this.setInputIndex(pos);
        }
      }
    }
  }
  
  protected final void invalidateWriteData() {
    if (writeByteBuffer != null) {
      writeByteBuffer.clear();
    }
  }
   
  protected synchronized final void writeWritableDataToChannel(boolean checkOpen) throws IOException {
   if ((fileChannel == null) || (writeByteBuffer == null)) {
     return;
   }
   writeWritableDataToChannel(getUnderlyingFilePos(), writeByteBuffer.position(), checkOpen);
  }
 
  protected synchronized final void writeWritableDataToChannel(long filePos, int bufferPos, boolean checkOpen) throws IOException {
    if ((fileChannel == null) || (writeByteBuffer == null)) {
      return;
    }
    if (checkOpen) {
      ensureOpen("writeWritableDataToChannel");
    }
    if (filePos != getUnderlyingFilePos()) {
      seek(filePos);
    }
    if (bufferPos != writeByteBuffer.position()) {
      writeByteBuffer.position(bufferPos);
    }
    writeByteBuffer.limit(writeByteBuffer.position());
    writeByteBuffer.rewind();
    try {
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          int result = fileChannel.write(writeByteBuffer);
          underlyingFilePos += result;
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
        }
      }
      writeByteBuffer.clear();
    } catch (ClosedByInterruptException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(filePos);
      writeWritableDataToChannel(filePos, bufferPos, checkOpen);
    } catch (ClosedChannelException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(filePos);
      writeWritableDataToChannel(filePos, bufferPos, checkOpen);
    }
  }
  
  protected synchronized final int readMoreData() {
    if (isMapped) { return -1; }
    if (fileChannel == null) { return -1; }
    return readMoreData(getUnderlyingFilePos());
  }
  
  protected synchronized final int readMoreData(long startingPos) {
    if (isMapped) { return -1; }
    if (fileChannel == null) { return -1; }
    ensureOpen("readMoreData");
    try {
      if (startingPos != getUnderlyingFilePos()) {
        seek(startingPos);
      }
      byteBuffer.clear();
      int result = 0;
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          result = fileChannel.read(byteBuffer);
          underlyingFilePos += result;
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
        }
      }
      byteBuffer.rewind();
      byteBuffer.limit((result >= 0) ? result : 0);
      return result;
    } catch (ClosedByInterruptException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(startingPos);
      return readMoreData(startingPos);
    }  catch (ClosedChannelException cbie) {
      Threads.possiblyHandleInterrupts(false);
      reopenChannel(startingPos);
      return readMoreData(startingPos);
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error reading file: " + theFile, e);
      return -1;
    }
  }
  
  private synchronized void reopenChannel(long pos) {
    if (isClosed()) {
      throw new RuntimeException("Illegal attempt to quietly reopen a closed channel: " + this);
    }
    try {
      synchronized (SubLThread.getInterruptLock()) {
        boolean needsInterruption = Threads.forciblyHandleInterrupts();
        try {
          if ((fileChannel != null) && (fileChannel.isOpen())) {
            try {
              fileChannel.close();
            } catch (Exception e) {} // ignore exceptions
          }
          if (raFile != null) {
            try {
              raFile.close();
            } catch (Exception e) {} // ignore exceptions
          }
          raFile = new RandomAccessFile(theFile, fileMode);
          fileChannel = raFile.getChannel();
          fileChannel.position(pos);
          underlyingFilePos = pos;
          // @todo deal with mapped files if we ever decide to support them again
        } finally {
          if (needsInterruption) {
            SubLProcess.currentProcess().interrupt();
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      Errors.error("Error reopening file: " + theFile, e);
    }
  }
  
  //// Internal Rep
  
  private File theFile;
  private RandomAccessFile raFile;
  private FileChannel fileChannel;
  private boolean isMapped = false;
  protected ByteBuffer byteBuffer = null;
  protected ByteBuffer writeByteBuffer = null;
  private String fileMode = "";
  private long underlyingFilePos = 0;
  private long flushCount = 0;
  private Direction lastDirection = Direction.UNINIT;
  private boolean isNullFile = false;

  private static enum Direction { UNINIT, READ, WRITE };

  private static final int BUF_SIZE = 8192 * 2;//1024*1024*4;
  
  //// Main
  
}
