//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.Socket;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.StructureObject;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtable;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLHashtableIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLKeyhashIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLRegexPattern;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLStream extends StructureObject implements SubLStream {
	public AbstractSubLStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		this();
		init(elementType, direction, ifExists, ifNotExists);
		setStreamProps(elementType,direction);
		//AbstractSubLObject op;
	}

	//protected LispObject elementType;
    protected boolean isInputStream;
    protected boolean isOutputStream;
    protected boolean isCharacterStream;
    protected boolean isBinaryStream;


	protected void setStreamProps(SubLSymbol elementType, SubLSymbol direction) {
		setStreamDirection(direction);
		setElementType(elementType);
		isCharacterStream = elementType!= Keyword.BINARY_KEYWORD;
		isBinaryStream = !isCharacterStream;
	}

	protected void setStreamDirection(SubLSymbol direction) {
		this.direction = direction;
		isOutputStream = direction!= Keyword.INPUT;
		isInputStream = direction!= Keyword.OUTPUT;
	}


	protected LispObject elementType;
	private SubLSymbol subLElementType;
	protected SubLSymbol direction;
	protected SubLSymbol ifExists;
	protected SubLSymbol ifNotExists;
	protected boolean interactive;
	protected String newline;
	public volatile boolean isClosed;
	private long offset;

	protected Socket socket;

	protected InputStream in;
	//protected BufferedInputStream javaBufferedInStream;
	protected PushbackInputStream pushbackStream;
	// Character input.
	protected java.io.PushbackReader reader;



	//protected OutputStream javaBufferedOutStream;
	protected OutputStream out;
	//protected OutputStreamWriter writer;
	protected Writer writer;
	protected boolean freshLine;

	protected Writer asBuffredWriter(Writer writer) {
		return writer;
	}

	protected int onRead(int result) throws IOException
	{
		if (result >= 0)
			incrementInputIndex(1L);
		return result;
	}
	protected int onUnread(int result) 
	{
		if (result >= 0)
			incrementInputIndex(-1L);
		return result;
	}

	public AbstractSubLStream() {
		this(Symbol.SYSTEM_STREAM);
	}

	public AbstractSubLStream(Symbol structureClass) {
		super(structureClass);
		interactive = false;
		newline = SubLStream.DEFAULT_NEWLINE;
		isClosed = false;
		offset = 0L;
	}


	//private Stream lispStream;

	protected void init(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		this.setElementType(elementType);
		this.direction = direction;
		this.ifExists = ifExists;
		this.ifNotExists = ifNotExists;
		if (!Lisp.isText(elementType) && elementType != Keyword.BINARY_KEYWORD)
			Errors.error("Invalid stream element type: " + elementType);
		if ((this.direction = direction) != Keyword.INPUT_KEYWORD && direction != Keyword.OUTPUT_KEYWORD
				&& direction != Keyword.IO_KEYWORD && direction != Keyword.PROBE_KEYWORD)
			Errors.error("Invalid stream direction: " + direction);
		if ((this.ifExists = ifExists) != Keyword.ERROR_KEYWORD && ifExists != CommonSymbols.NEW_VERSION_KEYWORD
				&& ifExists != Keyword.RENAME_AND_DELETE_KEYWORD && ifExists != CommonSymbols.OVERWRITE_KEYWORD
				&& ifExists != Keyword.APPEND_KEYWORD && ifExists != CommonSymbols.SUPERSEDE_KEYWORD
				&& ifExists != SubLNil.NIL)
			Errors.error("Invalid stream if-exists parameter: " + ifExists);
		if ((this.ifNotExists = ifNotExists) != Keyword.ERROR_KEYWORD
				&& ifNotExists != Keyword.CREATE_KEYWORD && ifNotExists != SubLNil.NIL)
			Errors.error("Invalid stream if-not-exists parameter: " + ifNotExists);
		if (ifExists == Keyword.RENAME_AND_DELETE_KEYWORD)
			Errors.error("Streams implementation does not currently support :rename-and-delete.");
		if (direction == Keyword.PROBE_KEYWORD)
			Errors.error("Streams implementation does not currently support :probe.");
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public void close() {
		isClosed = true;
	}

	public void ensureOpen() {
		if (isClosed())
			Errors.error("Can't perform operation on closed stream: " + this);
	}

	public void ensureOpen(String operation) {
		if (isClosed())
			Errors.error("Can't perform " + operation + " on closed stream: " + this);
	}

	@Override
	public SubLSymbol getDirection() {
		return direction;
	}

	@Override
	public SubLSymbol getElementType() {
		return subLElementType;
	}


	public LispObject getStreamElementType() {
		return elementType.toLispObject();
	}

	@Override
	public String getFileDesignator() {
		if (!isRandomAccess())
			Errors.error("Invalid pathname designator: " + this + ".");
		File file = getFile();
		if (file == null)
			Errors.error("Invalid pathname designator: " + this + ".");
		return file.getAbsolutePath();
	}

	@Override
	public long getFlushCount() {
		Errors.unimplementedMethod("getFlushCount");
		return -1L;
	}

	public long getInputIndex() {
		return offset;
	}

	@Override
	public String getNewline() {
		return newline;
	}

	@Override
	public SubLList getStreams() {
		return SubLNil.NIL;
	}

	@Override
	public SubLSymbol getStreamSymbol() {
		org.armedbear.lisp.Lisp.lisp_type_error(this, "SYNONYM-STREAM");
		return null;
	}

	public String getStringOutput() {
		return Errors.error("Can't get the stream string output for non-string streams.").getStringValue();
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_stream$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_HUNDRED_FORTY_FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8)
			return 0;
		return 0;
	}

	@Override
	public SubLSymbol ifExists() {
		return ifExists;
	}

	@Override
	public SubLSymbol ifNotExists() {
		return ifNotExists;
	}

	@Override
	public boolean isClosed() {
		return isClosed;
	}


	@Override
	public boolean isInteractive() {
		return interactive;
	}

	@Override
	public void setIsInteractive(boolean newValue) {
		interactive = newValue;
	}

	@Override
	public void setNewline(String newline) {
		this.newline = newline;
	}

	@Override
	public String toTypeName() {
		return "STREAM";
	}

	protected void incrementInputIndex(long incAmount) {
		offset += incAmount;
	}

	protected void setInputIndex(long newIndex) {
		offset = newIndex;
	}

	@Override
	final public Stream toLispObject() {
		return (Stream) this;
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		if(this instanceof SubLOutputTextStream) return (SubLOutputTextStream) this;
		type_error_str(this, "OUTPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		if(this instanceof SubLOutputBinaryStream) return (SubLOutputBinaryStream) this;
		type_error_str(this, "OUTPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLOutputStream toOutputStream() {
		if(this instanceof SubLOutputStream) return (SubLOutputStream) this;
		type_error_str(this, "OUTPUT-STREAM");
		return null;
	}



	@Override
	public SubLInputTextStream toInputTextStream() {
		if(this instanceof SubLInputTextStream) return (SubLInputTextStream) this;
		type_error_str(this, "OUTPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		if(this instanceof SubLInputBinaryStream) return (SubLInputBinaryStream) this;
		type_error_str(this, "OUTPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLInputStream toInputStream() {
		if(this instanceof SubLInputStream) return (SubLInputStream) this;
		type_error_str(this, "OUTPUT-STREAM");
		return null;
	}


	@Override
	public void checkType(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public void checkTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	  @Override
	public Object clone()
	  {
		  Object result = null;
	      try {
		  result = super.clone();
	      } catch (Exception e) {
	    	  e.printStackTrace();
	    	  return this;
	      }
	      return result;
	  }



	@Override
	public void enforceType(SubLSymbol predicate) throws SubLException {
		UnaryFunction Function = UnaryFunction.makeInstance(predicate);
		if (SubLNil.NIL == Function.processItem(this))
			Errors.error(SubLObjectFactory.makeString("Got invalid type for object: " + this + "." + " Wanted type: "
					+ predicate + " Actual type: " + toTypeName()));
	}

	@Override
	public void enforceTypeInternal(SubLSymbol predicate) throws SubLException {
	}

	@Override
	public boolean eql(SubLObject obj) {
		return obj == this;
	}

	@Override
	public boolean equal(SubLObject obj) {
		return eql(obj);
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return equal(obj);
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this;
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	@Override
	public SubLObject getField(int fieldNum) {
		lisp_type_error(this, "STRUCT");
		return SubLNil.NIL;
	}


	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		lisp_type_error(this, "STREAM");
		return null;
	}

	//@Override
	@Override
	public String getStringValue() {
		lisp_type_error(this, "STRING");
		return "";
	}
	@Override
	public String getString() {
		return getStringValue();
	}

	@Override
	public SubLObject makeCopy() {
		Errors.unimplementedMethod("makeCopy()");
		return null;
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("makeDeepCopy()");
		return null;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		return Errors.error("Not a number: " + this + "");
	}

	@Override
	public SubLStruct toStruct() {
		lisp_type_error(this, "STRUCTURE");
		return null;
	}



	@Override
	public boolean isMemoryMapped() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}



	@Override
	public boolean isStream() {
		return true;
	}

	public boolean isStringOutputStream() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}


	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	protected void setStreamElementType(LispObject streamElementType) {
		this.elementType = streamElementType.toLispObject();
	}

	protected void setElementType(SubLSymbol elementType) {
		this.subLElementType = elementType;
		if(this.elementType==null) {
			this.elementType = elementType.toLispObject();
		}
	}
}
