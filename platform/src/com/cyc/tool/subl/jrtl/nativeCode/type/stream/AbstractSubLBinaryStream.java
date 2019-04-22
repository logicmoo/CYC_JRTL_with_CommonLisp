//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.stream;

import static org.armedbear.lisp.Keyword.BINARY_KEYWORD;

import org.armedbear.lisp.Stream;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLBinaryStream extends Stream
{
    AbstractSubLBinaryStream( String fileName, SubLSymbol elementType,
            SubLSymbol direction, SubLSymbol ifExists, SubLSymbol ifNotExists )
    {
        super( fileName, elementType, direction, ifExists, ifNotExists );
        if( elementType != BINARY_KEYWORD )
            Errors.error( "Got bad stream element type: " + elementType );
    }

    AbstractSubLBinaryStream( SubLSymbol elementType, SubLSymbol direction,
            SubLSymbol ifExists, SubLSymbol ifNotExists )
    {
        super( elementType, direction, ifExists, ifNotExists );
        if( elementType != BINARY_KEYWORD )
            Errors.error( "Got bad stream element type: " + elementType );
    }

    public AbstractSubLBinaryStream( Symbol twoWayStream )
    {
        super( twoWayStream );
    }

    public AbstractSubLBinaryStream( Symbol twoWayStream, SubLSymbol direction )
    {
        super( twoWayStream, direction );
    }

    // public AbstractSubLBinaryStream(SubLSymbol binaryKeyword, SubLSymbol
    // inputKeyword, SubLSymbol direction,
    // SubLSymbol errorKeyword, SubLSymbol errorKeyword2) {
    // super( binaryKeyword, inputKeyword, direction, errorKeyword,
    // errorKeyword2);
    //
    // }
}
