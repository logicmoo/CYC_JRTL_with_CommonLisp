//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.Symbol;
import org.armedbear.lisp.TwoWayStream;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLStreamNilException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLStreamFactory {
	public static void main(String[] args) {
	}

	public static SubLBroadcastStream makeBroadcastStream() {
		return makeBroadcastStream(SubLNil.NIL);
	}

	public static SubLBroadcastStream makeBroadcastStream(SubLList streamList) {
		SubLOutputStream[] streams = new SubLOutputStream[streamList.size()];
		int i = 0;
		for (SubLObject cur = streamList; cur != SubLNil.NIL; cur = cur.rest())
			streams[i++] = cur.first().toOutputStream();
		SubLBroadcastStream result = new SubLBroadcastStream(streams);
		return result;
	}

	public static SubLStream makeFileStream(String fileName, SubLSymbol direction, SubLSymbol elementType,
			SubLSymbol ifExists, SubLSymbol ifNotExists, SubLObject externalFormat) {
		try {
			if (direction == Keyword.INPUT_KEYWORD) {
				if (elementType == Keyword.BINARY_KEYWORD)
					return new SubLInputBinaryStreamImpl(fileName, ifExists, ifNotExists);
				if (Lisp.isText(elementType))
					return new SubLInputTextStreamImpl(fileName, ifExists, ifNotExists);
			} else if (direction == Keyword.OUTPUT_KEYWORD) {
				if (elementType == Keyword.BINARY_KEYWORD)
					return new SubLOutputBinaryStreamImpl(fileName, ifExists, ifNotExists);
				if (Lisp.isText(elementType))
					return new SubLOutputTextStreamImpl(fileName, ifExists, ifNotExists);
			} else if (direction == Keyword.IO_KEYWORD) {
				if (elementType == Keyword.BINARY_KEYWORD)
					return new SubLInOutBinaryStreamImpl(fileName, ifExists, ifNotExists);
				if (Lisp.isText(elementType))
					return new SubLInOutTextStreamImpl(fileName, ifExists, ifNotExists);
			}
		} catch (SubLStreamNilException ssne) {
			return null;
		}
		return Errors.error("Can't open stream " + fileName + ".").getStream(false);
	}

	public static SubLInOutBinaryStream makeInOutBinaryStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInOutBinaryStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLInOutBinaryStream makeInOutBinaryStream(SubLInputBinaryStream inStream,
			SubLOutputBinaryStream outStream) {
		return new SubLInOutBinaryStreamImpl(inStream, outStream);
	}

	public static SubLInOutTextStream makeInOutTextStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInOutTextStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLInOutTextStream makeInOutTextStream(SubLInputTextStream inStream,
			SubLOutputTextStream outStream) {
		return TwoWayStream.createTwoWayStream((Stream)inStream, (Stream)outStream,inStream.isInteractive());
	}

	public static SubLInputBinaryStream makeInputBinaryStream(InputStream stream) {
		return new SubLInputBinaryStreamImpl(stream);
	}

	public static SubLInputBinaryStream makeInputBinaryStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInputBinaryStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLInputTextStream makeInputTextStream(InputStream stream) {
		return new SubLInputTextStreamImpl(stream);
	}

	public static SubLInputTextStream makeInputTextStream(Socket socket) {
		return new SubLInputTextStreamImpl(socket);
	}

	public static SubLInputTextStream makeInputTextStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLInputTextStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLOutputBinaryStream makeOutputBinaryStream(OutputStream stream) {
		return new SubLOutputBinaryStreamImpl(stream);
	}

	public static SubLOutputBinaryStream makeOutputBinaryStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLOutputBinaryStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLOutputTextStream makeOutputTextStream(OutputStream stream) {
		return new SubLOutputTextStreamImpl(stream);
	}

	public static SubLOutputTextStream makeOutputTextStream(String fileName, SubLSymbol ifExists,
			SubLSymbol ifNotExists) {
		try {
			return new SubLOutputTextStreamImpl(fileName, ifExists, ifNotExists);
		} catch (SubLStreamNilException ssne) {
			return null;
		}
	}

	public static SubLSocketStream makeSocketStream(Socket socket) {
//		try {
//	        Stream in =
//	          		 Stream.createStream(Symbol.SYSTEM_STREAM, socket.getInputStream());
//	           Stream out;
//			out = Stream.createStream(Symbol.SYSTEM_STREAM, socket.getOutputStream(),in.getStreamElementType());
//	        return new SubLSocketStream(socket, in, out);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return new SubLSocketStream(socket);

	}

	public static SubLSocketStream makeSocketStream(String host, int port, int timeout) {
		return new SubLSocketStream(host, port, timeout);
	}

	public static SubLInputTextStream makeStringInputStream(String str) {
		return makeStringInputStream(str, 0, str.length());
	}

	public static SubLInputTextStream makeStringInputStream(String str, int start, int end) {
		try {
			ByteBuffer byteBuffer = ByteBuffer.wrap(str.substring(start, end).getBytes("ISO-8859-1"));
			SubLInputTextStream result = new SubLInputTextStreamImpl(byteBuffer, start);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return Errors.error("Unable to create string input stream.", e).toInputTextStream();
		}
	}

	public static SubLOutputTextStream makeStringOutputStream() {
		return makeStringOutputStream(256);
	}

	public static SubLOutputTextStream makeStringOutputStream(int initialSize) {
		SubLOutputTextStream result = new SubLOutputTextStreamImpl(initialSize);
		return result;
	}

	public static SubLSynonymStream makeSynonymStream(SubLSymbol streamSymbol) {
		return new SubLSynonymStream((Symbol) streamSymbol);
	}

	public static SubLSynonymStream makeUnclosableSynonymStream(SubLSymbol streamSymbol) {
		return new SubLSynonymStream(streamSymbol) {
			@Override
			public void close() {
				Errors.error("Illegal attempt to close a system stream: " + this);
			}
		};
	}

	public static int INITIAL_STRING_STREAM_SIZE = 256;
	public static SubLInputTextStream NULL_IN_STREAM;
	public static SubLBroadcastStream NULL_OUT_STREAM;
	static {
		NULL_IN_STREAM = makeStringInputStream("");
		NULL_OUT_STREAM = makeBroadcastStream();
	}
}
