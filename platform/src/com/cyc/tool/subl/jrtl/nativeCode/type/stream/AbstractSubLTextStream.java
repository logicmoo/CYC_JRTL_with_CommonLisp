/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLTextStream extends Stream {
	AbstractSubLTextStream(String fileName, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		super(fileName, elementType, direction, ifExists, ifNotExists);
		if (!Lisp.isText(elementType))
			Errors.error("Got bad stream element type: " + elementType);
	}

	AbstractSubLTextStream(SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists) {
		//super(Symbol.SYSTEM_STREAM,(InputStream) null, Symbol.CHARACTER, true);
		super(elementType, direction, ifExists, ifNotExists);
		if (!Lisp.isText(elementType))
			Errors.error("Got bad stream element type: " + elementType);
	}

	public AbstractSubLTextStream(Symbol twoWayStream) {
		super(twoWayStream);
		setElementType(Keyword.TEXT_KEYWORD_CHARACTER);
	}
//
//	@Override
//	public SubLSymbol getName() {
//		return getType();
//	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		if(this instanceof SubLOutputTextStream) return (SubLOutputTextStream) this;
		type_error_str(this, "OUTPUT-TEXT-STREAM");
		return null;
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		//if(this instanceof SubLOutputBinaryStream) return (SubLOutputBinaryStream) this;
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
		//if(this instanceof SubLInputBinaryStream) return (SubLInputBinaryStream) this;
		type_error_str(this, "OUTPUT-BINARY-STREAM");
		return null;
	}

	@Override
	public SubLInputStream toInputStream() {
		if(this instanceof SubLInputStream) return (SubLInputStream) this;
		type_error_str(this, "OUTPUT-STREAM");
		return null;
	}

//
//	public AbstractSubLTextStream(SubLSymbol binaryKeyword, SubLSymbol inputKeyword, SubLSymbol inputKeyword2,
//			SubLSymbol errorKeyword, SubLSymbol errorKeyword2) {
//		super( binaryKeyword, inputKeyword, inputKeyword2, errorKeyword, errorKeyword2);
//
//	}
}
