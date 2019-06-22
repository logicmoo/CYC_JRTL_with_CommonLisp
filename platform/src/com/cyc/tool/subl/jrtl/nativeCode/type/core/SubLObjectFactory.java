//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.JavaObject;
import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.SimpleString;
import org.armedbear.lisp.Symbol;
import org.logicmoo.system.JVMImpl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThreadPool;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ExceptionFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLInterpretedFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperatorFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLBroadcastStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSocketStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStreamFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSynonymStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackageIterator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.util.SafeRunnable;

public class SubLObjectFactory
{
  public static SubLCons makeArrayList()
  {
    Errors.error( "Array lists are disabled." );
    return null;
  }

  public static SubLNumber makeBasedIntegralNumber(String str)
  {
    char secondChar = str.charAt( 1 );
    char thirdChar = str.charAt( 2 );
    if( Character.isDigit( secondChar ) )
    {
      if( Character.isDigit( thirdChar ) )
        return makeIntegralNumber( str.substring( 4 ), Integer.parseInt( "" + secondChar + "" + thirdChar ) );
      return makeIntegralNumber( str.substring( 3 ), Integer.parseInt( "" + secondChar ) );
    }
    else
    {
      if( secondChar == 'b' || secondChar == 'B' )
        return makeIntegralNumber( str.substring( 2 ), 2 );
      if( secondChar == 'o' || secondChar == 'O' )
        return makeIntegralNumber( str.substring( 2 ), 8 );
      if( secondChar == 'x' || secondChar == 'X' )
        return makeIntegralNumber( str.substring( 2 ), 16 );
      throw new InvalidSubLExpressionException( "Got invalid number: " + str );
    }
  }

  public static SubLBoolean makeBoolean(boolean theBoolean)
  {
    if( theBoolean )
      return SubLT.T;
    return SubLNil.NIL;
  }

  public static SubLBoolean makeBoolean(Boolean theBoolean)
  {
    return theBoolean ? SubLT.T : SubLNil.NIL;
  }

  public static SubLBroadcastStream makeBroadcastStream()
  {
    return SubLStreamFactory.makeBroadcastStream();
  }

  public static SubLBroadcastStream makeBroadcastStream(SubLList streamList)
  {
    return SubLStreamFactory.makeBroadcastStream( streamList );
  }

  public static SubLCharacter makeChar(char theChar)
  {
    return SubLCharacter.makeChar( theChar );
  }

  public static SubLCharacter makeChar(Character theChar)
  {
    return makeChar( (char) theChar );
  }

  public static SubLCharacter makeChar(int theChar)
  {
    return SubLCharacter.makeChar( theChar );
  }

  public static SubLCharacter makeChar(String theCharStr)
  {
    SubLCharacter result = SubLObjectFactory.charParsingCache.get( theCharStr );
    if( result != null )
      return result;
    String curCharStr = theCharStr.substring( 1 );
    if( !curCharStr.startsWith( "\\" ) )
      throw new InvalidSubLExpressionException( "Got invalid character format: " + theCharStr );
    curCharStr = curCharStr.substring( 1 );
    if( curCharStr.length() == 0 )
      throw new InvalidSubLExpressionException( "Got bad character: " + theCharStr );
    if( curCharStr.length() == 1 )
    {
      result = makeChar( curCharStr.charAt( 0 ) );
      SubLObjectFactory.charParsingCache.put( theCharStr, result );
      return result;
    }
    SubLCharacter theChar = SubLCharacter.getCharFromName( makeString( curCharStr ) );
    if( theChar != null )
    {
      SubLObjectFactory.charParsingCache.put( theCharStr, theChar );
      return theChar;
    }
    return Errors.error( "Invalid character: " + theCharStr ).toChar();
  }

  public static SubLCompiledFunction makeCompiledFunction(Method method, SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount, boolean allowsRest)
  {
    return SubLOperatorFactory.makeCompiledFunction( method, functionSymbol, requiredArgCount, optionalArgCount, allowsRest );
  }

  public static SubLCompiledFunction makeCompiledFunction(String methodClassStr, String methodName, Class[] methodParameters, Class returnType, SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount,
      boolean allowsRest)
  {
    return SubLOperatorFactory.makeCompiledFunction( methodClassStr, methodName, methodParameters, returnType, functionSymbol, requiredArgCount, optionalArgCount, allowsRest );
  }

  public static SubLCons makeCons()
  {
    return new Cons( SubLNil.NIL, SubLNil.NIL );
  }

  public static SubLCons makeCons(SubLObject first, SubLObject rest)
  {
    Threads.possiblyHandleInterrupts( true );
    return new Cons( first, rest );
  }

  public static SubLSymbol makeCycSymbol(String symbolName)
  {
    return makeSymbol( symbolName, SubLPackage.CYC_PACKAGE );
  }

  public static SubLDoubleFloat makeDouble(double theDouble)
  {
    Threads.possiblyHandleInterrupts( true );
    return SubLNumberFactory.makeDouble( theDouble );
  }

  public static SubLDoubleFloat makeDouble(String theDouble)
  {
    Threads.possiblyHandleInterrupts( true );
    return SubLNumberFactory.makeDouble( theDouble );
  }

  public static SubLException makeException()
  {
    return ExceptionFactory.makeException();
  }

  public static SubLException makeException(String str)
  {
    return ExceptionFactory.makeException( str );
  }

  public static SubLException makeException(String str, Throwable t)
  {
    return ExceptionFactory.makeException( str, t );
  }

  public static SubLException makeException(SubLString str)
  {
    return ExceptionFactory.makeException( str );
  }

  public static SubLException makeException(SubLString str, Throwable t)
  {
    return ExceptionFactory.makeException( str, t );
  }

  public static SubLStream makeFileStream(String fileName, SubLSymbol direction, SubLSymbol elementType, SubLSymbol ifExists, SubLSymbol ifNotExists, SubLObject externalFormat)
  {
    return SubLStreamFactory.makeFileStream( fileName, direction, elementType, ifExists, ifNotExists, externalFormat );
  }

  public static SubLGuid makeGuid()
  {
    return new SubLGuid();
  }

  public static SubLGuid makeGuid(String guidString)
  {
    return new SubLGuid( guidString );
  }

  public static SubLGuid makeGuid(SubLVector data)
  {
    return new SubLGuid( data );
  }

  public static SubLHashtable makeHashtable()
  {
    Threads.possiblyHandleInterrupts( true );
    return new SubLHashtable();
  }

  public static SubLHashtable makeHashtable(int size)
  {
    Threads.possiblyHandleInterrupts( true );
    return new SubLHashtable( size );
  }

  public static SubLHashtable makeHashtable(int size, BinaryFunction test)
  {
    Threads.possiblyHandleInterrupts( true );
    return new SubLHashtable( size, test );
  }

  public static SubLHashtableIterator makeHashtableIterator(SubLHashtable hashTable)
  {
    return new SubLHashtableIterator( hashTable );
  }

  public static SubLInOutBinaryStream makeInOutBinaryStream(String fileName, SubLSymbol ifExists, SubLSymbol ifNotExists)
  {
    return SubLStreamFactory.makeInOutBinaryStream( fileName, ifExists, ifNotExists );
  }

  public static SubLInOutBinaryStream makeInOutBinaryStream(SubLInputBinaryStream inStream, SubLOutputBinaryStream outStream)
  {
    return SubLStreamFactory.makeInOutBinaryStream( inStream, outStream );
  }

  public static SubLInOutTextStream makeInOutTextStream(String fileName, SubLSymbol ifExists, SubLSymbol ifNotExists)
  {
    return SubLStreamFactory.makeInOutTextStream( fileName, ifExists, ifNotExists );
  }

  public static SubLInOutTextStream makeInOutTextStream(SubLInputTextStream inStream, SubLOutputTextStream outStream)
  {
    return SubLStreamFactory.makeInOutTextStream( inStream, outStream );
  }

  public static SubLInputBinaryStream makeInputBinaryStream(InputStream stream)
  {
    return SubLStreamFactory.makeInputBinaryStream( stream );
  }

  public static SubLInputBinaryStream makeInputBinaryStream(String fileName, SubLSymbol ifExists, SubLSymbol ifNotExists)
  {
    return SubLStreamFactory.makeInputBinaryStream( fileName, ifExists, ifNotExists );
  }

  public static SubLInputTextStream makeInputTextStream(InputStream stream)
  {
    return SubLStreamFactory.makeInputTextStream( stream );
  }

  public static SubLInputTextStream makeInputTextStream(String fileName, SubLSymbol ifExists, SubLSymbol ifNotExists)
  {
    return SubLStreamFactory.makeInputTextStream( fileName, ifExists, ifNotExists );
  }

  public static SubLInteger makeInteger(BigInteger theNum)
  {
    return SubLNumberFactory.makeInteger( theNum );
  }

  public static SubLInteger makeInteger(int theInt)
  {
    return SubLNumberFactory.makeInteger( theInt );
  }

  public static SubLInteger makeInteger(long theLong)
  {
    return SubLNumberFactory.makeInteger( theLong );
  }

  public static SubLInteger makeInteger(String theNum)
  {
    return SubLNumberFactory.makeInteger( theNum );
  }

  public static SubLInteger makeInteger(String theNum, int radix)
  {
    return SubLNumberFactory.makeInteger( theNum, radix );
  }

  public static SubLNumber makeIntegralNumber(String str, int base)
  {
    if( str.endsWith( "." ) )
      str = str.substring( 0, str.length() - 1 );
    if( str.startsWith( "+" ) )
      str = str.substring( 1 );
    String id = str + "-" + base;
    SubLInteger num = SubLObjectFactory.integerParsingCache.get( id );
    if( num != null )
      return num;
    BigInteger bigInt = null;
    try
    {
      bigInt = new BigInteger( str, base );
    }
    catch( Exception e )
    {
      throw new InvalidSubLExpressionException( e.getMessage() );
    }
    num = makeInteger( bigInt );
    SubLObjectFactory.integerParsingCache.put( id, num );
    return num;
  }

  public static SubLInterpretedFunction makeInterpretedFunction(SubLCons form, SubLEnvironment env)
  {
    return SubLOperatorFactory.makeInterpretedFunction( form, env );
  }

  public static SubLInterpretedFunction makeInterpretedFunction(SubLSymbol functionSymbol, SubLCons form, SubLEnvironment env)
  {
    return SubLOperatorFactory.makeInterpretedFunction( functionSymbol, form, env );
  }

  public static SubLKeyhash makeKeyhash()
  {
    return new SubLKeyhash();
  }

  public static SubLKeyhash makeKeyhash(int size)
  {
    return new SubLKeyhash( size );
  }

  public static SubLKeyhash makeKeyhash(int size, BinaryFunction test)
  {
    return new SubLKeyhash( size, test );
  }

  public static SubLSymbol makeKeyword(String symbolName)
  {
    return SubLSymbolFactory.makeKeyword( symbolName );
  }

  public static SubLSymbol makeKeyword(SubLString symbolName)
  {
    return SubLSymbolFactory.makeKeyword( symbolName );
  }

  public static SubLList makeList(ArrayList< ? extends SubLObject> theList)
  {
    Threads.possiblyHandleInterrupts( true );
    if( theList.size() <= 0 )
      return SubLNil.NIL;
    SubLList result = SubLNil.NIL;
    for( int i = theList.size() - 1; i >= 0; --i )
      result = new Cons( theList.get( i ), result );
    return result;
  }

  public static SubLList makeCons(List theList)
  {
    Threads.possiblyHandleInterrupts( true );
    if( theList.size() <= 0 )
      return SubLNil.NIL;
    SubLList result = SubLNil.NIL;
    for( int i = theList.size() - 1; i >= 0; --i )
      result = new Cons( asSubLisp( theList.get( i ) ), result );
    return result;
  }

  private static SubLObject asSubLisp(Object object)
  {
    if( object instanceof SubLObject )
      return (SubLObject) object;
    if( object == null )
      return Lisp.NULL_VALUE;
    return JavaObject.getInstance( object, true, null );
  }

  public static SubLList makeList(boolean isEmpty)
  {
    if( isEmpty )
      return SubLNil.NIL;
    return makeCons();
  }

  public static SubLList makeList(int size, SubLObject defaultValue)
  {
    Threads.possiblyHandleInterrupts( true );
    if( size <= 0 )
      return SubLNil.NIL;
    SubLList result = SubLNil.NIL;
    for( int i = size - 1; i >= 0; --i )
      result = new Cons( defaultValue, result );
    return result;
  }

  public static SubLList makeList(Object[] theList)
  {
    Threads.possiblyHandleInterrupts( true );
    int size = theList.length;
    if( size <= 0 )
      return SubLNil.NIL;
    SubLList result = SubLNil.NIL;
    for( int i = size - 1; i >= 0; result = new Cons( asSubLisp( theList[ i-- ] ), result ) )
    {
    }
    return result;
  }

  public static SubLList makeConsList(Object... theList)
  {
    Threads.possiblyHandleInterrupts( true );
    int size = theList.length;
    if( size <= 0 )
      return SubLNil.NIL;
    SubLList result = SubLNil.NIL;
    for( int i = size - 1; i >= 0; result = new Cons( asSubLisp( theList[ i-- ] ), result ) )
    {
    }
    return result;
  }

  public static SubLList makeList_Dangerous(ArrayList theList)
  {
    Threads.possiblyHandleInterrupts( true );
    if( theList.size() <= 0 )
      return SubLNil.NIL;
    SubLList result = SubLNil.NIL;
    for( int i = theList.size() - 1; i >= 0; --i )
      result = new Cons( (SubLObject) theList.get( i ), result );
    return result;
  }

  public static SubLObject makeListS(SubLObject finalCdr)
  {
    return makeListS( finalCdr, Resourcer.EMPTY_SUBL_OBJECT_ARRAY );
  }

  public static SubLCons makeListS(SubLObject arg1, SubLObject finalCdr)
  {
    SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize1;
    args[ 0 ] = finalCdr;
    return makeListS( arg1, args ).toCons();
  }

  public static SubLCons makeListS(SubLObject arg, SubLObject arg1, SubLListListIterator finalCdr)
  {
    int objectCount = 2 + finalCdr.itemsRemaining();
    ArrayList<SubLObject> listInternals = new ArrayList<SubLObject>( objectCount + 1 );
    listInternals.add( arg );
    listInternals.add( arg1 );
    while ( finalCdr.hasNext() && !finalCdr.isNextImproperElement())
      listInternals.add( (SubLObject) finalCdr.next() );
    SubLList result = makeList_Dangerous( listInternals );
    if( finalCdr.isNextImproperElement() )
      result.setDottedElement( finalCdr.getDottedElement() );
    return result.toCons();
  }

  public static SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject finalCdr)
  {
    SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
    args[ 0 ] = arg2;
    args[ 1 ] = finalCdr;
    return makeListS( arg1, args ).toCons();
  }

  public static SubLCons makeListS(SubLObject arg, SubLObject arg1, SubLObject arg2, SubLListListIterator finalCdr)
  {
    int objectCount = 3 + finalCdr.itemsRemaining();
    ArrayList<SubLObject> listInternals = new ArrayList<SubLObject>( objectCount + 1 );
    listInternals.add( arg );
    listInternals.add( arg1 );
    listInternals.add( arg2 );
    while ( finalCdr.hasNext() && !finalCdr.isNextImproperElement())
      listInternals.add( (SubLObject) finalCdr.next() );
    SubLList result = makeList_Dangerous( listInternals );
    if( finalCdr.isNextImproperElement() )
      result.setDottedElement( finalCdr.getDottedElement() );
    return result.toCons();
  }

  public static SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject finalCdr)
  {
    SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
    args[ 0 ] = arg2;
    args[ 1 ] = arg3;
    args[ 2 ] = finalCdr;
    return makeListS( arg1, args ).toCons();
  }

  public static SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject finalCdr)
  {
    SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize4;
    args[ 0 ] = arg2;
    args[ 1 ] = arg3;
    args[ 2 ] = arg4;
    args[ 3 ] = finalCdr;
    return makeListS( arg1, args ).toCons();
  }

  public static SubLCons makeListS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject finalCdr)
  {
    SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize5;
    args[ 0 ] = arg2;
    args[ 1 ] = arg3;
    args[ 2 ] = arg4;
    args[ 3 ] = arg5;
    args[ 4 ] = finalCdr;
    return makeListS( arg1, args ).toCons();
  }

  public static SubLList makeListS(SubLObject arg, SubLObject[] objects)
  {
    int objectCount = objects.length;
    if( objectCount == 0 )
      return (SubLList) arg;
    if( objectCount == 1 )
      return makeCons( arg, objects[ 0 ] );
    SubLObject result = objects[ objectCount - 1 ];
    for( int i = objectCount - 2; i >= 0; --i )
      result = makeCons( objects[ i ], result );
    result = makeCons( arg, result );
    return (SubLList) result;
  }

  public static SubLList makeListStar(Object[] theList)
  {
    Threads.possiblyHandleInterrupts( true );
    int size = theList.length;
    if( size <= 0 )
      return SubLNil.NIL;
    --size;
    SubLObject result = (SubLObject) theList[ size ];
    for( int i = size - 1; i >= 0; result = new Cons( (SubLObject) theList[ i-- ], result ) )
    {
    }
    return result.toList();
  }

  public static SubLLock makeLock(SubLString name)
  {
    return new SubLLock( name );
  }

  public static SubLMacro makeMacro(SubLFunction macroExpander)
  {
    return SubLOperatorFactory.makeMacro( macroExpander );
  }

  public static SubLOutputBinaryStream makeOutputBinaryStream(OutputStream stream)
  {
    return SubLStreamFactory.makeOutputBinaryStream( stream );
  }

  public static SubLOutputBinaryStream makeOutputBinaryStream(String fileName, SubLSymbol ifExists, SubLSymbol ifNotExists)
  {
    return SubLStreamFactory.makeOutputBinaryStream( fileName, ifExists, ifNotExists );
  }

  public static SubLOutputTextStream makeOutputTextStream(OutputStream stream)
  {
    return SubLStreamFactory.makeOutputTextStream( stream );
  }

  public static SubLOutputTextStream makeOutputTextStream(String fileName, SubLSymbol ifExists, SubLSymbol ifNotExists)
  {
    return SubLStreamFactory.makeOutputTextStream( fileName, ifExists, ifNotExists );
  }

  public static SubLPackage makePackage(SubLString name, SubLList usedPackagesList, SubLList nickNames)
  {
    return SubLSymbolFactory.makePackage( name, usedPackagesList, nickNames );
  }

  public static SubLPackageIterator makePackageIterator(SubLPackage thePackage)
  {
    return SubLSymbolFactory.makePackageIterator( thePackage );
  }

  public static SubLProcess makeProcess(SubLString symbolName, final Runnable runnable)
  {
    SafeRunnable safeRunnable = new SafeRunnable()
    {
      @Override
      public void safeRun()
      {
        runnable.run();
      }
    };
    return makeProcess( symbolName, safeRunnable );
  }

  public static SubLProcess makeProcess(SubLString symbolName, final SafeRunnable runnable)
  {
    SubLProcess process = new SubLProcess( symbolName )
    {
      @Override
      public void safeRun()
      {
        runnable.safeRun();
      }
    };
    try
    {
      SubLThreadPool.getDefaultPool().execute( process );
    }
    catch( Throwable e )
    {
      SubLThread.currentThread().interrupt();
    }
    return process;
  }

  public static SubLProcess makeProcess(SubLString symbolName, final SubLFunction func)
  {
    final SubLPackage outerPackage = Lisp.getCurrentPackage();
    SafeRunnable safeRunnable = new SafeRunSubLFunction( func );
    return makeProcess( symbolName, safeRunnable );
  }


static final class SafeRunSubLFunction
      extends
        SafeRunnable
  {
    private final SubLFunction func;

    private SafeRunSubLFunction( SubLFunction func )
    {
      this.func = func;
    }

    @Override
    public void safeRun()
    {
      try
      {
        SubLObject result = Functions.funcall( func );
      }
      catch( Throwable e )
      {
        e.printStackTrace();
        throw JVMImpl.doThrow( e );
      }
    }
  }

  public static SubLReadWriteLock makeReadWriteLock(String name)
  {
    return new SubLReadWriteLock( makeString( name ) );
  }

  public static SubLReadWriteLock makeReadWriteLock(SubLString name)
  {
    return new SubLReadWriteLock( name );
  }

  public static SubLRegexPattern makeRegexPattern(String patternStr, int options)
  {
    return new SubLRegexPattern( patternStr, options );
  }

  public static SubLSemaphore makeSemaphore(SubLString name)
  {
    return makeSemaphore( name, 0 );
  }

  public static SubLSemaphore makeSemaphore(SubLString name, int count)
  {
    return new SubLSemaphore( name, count );
  }

  public static SubLSocketStream makeSocketStream(Socket socket)
  {
    return SubLStreamFactory.makeSocketStream( socket );
  }

  public static SubLSocketStream makeSocketStream(String host, int port, int timeout)
  {
    return SubLStreamFactory.makeSocketStream( host, port, timeout );
  }

  public static SubLString makeString(char[] charArray, int trimCount, int size)
  {
    Threads.possiblyHandleInterrupts( true );
    return new SimpleString( charArray, trimCount, size );
  }

  public static SubLString makeString(char[] charArray)
  {
    Threads.possiblyHandleInterrupts( true );
    return new SimpleString( charArray );
  }

  public static SubLString makeString(int size, char defaultChar)
  {
    Threads.possiblyHandleInterrupts( true );
    return new SimpleString( size, defaultChar );
  }

  public static SubLString makeString(String str)
  {
    // Threads.possiblyHandleInterrupts(true);
    return new SimpleString( str );
  }

  public static SubLInputTextStream makeStringInputStream(String str)
  {
    return SubLStreamFactory.makeStringInputStream( str );
  }

  public static SubLInputTextStream makeStringInputStream(String str, int start, int end)
  {
    return SubLStreamFactory.makeStringInputStream( str, start, end );
  }

  public static SubLOutputTextStream makeStringOutputStream()
  {
    return SubLStreamFactory.makeStringOutputStream();
  }

  public static SubLOutputTextStream makeStringOutputStream(int initialSize)
  {
    return SubLStreamFactory.makeStringOutputStream( initialSize );
  }

  public static SubLStruct makeStructInterpreted(int size)
  {
    Threads.possiblyHandleInterrupts( true );
    return new SubLStructInterpreted.SubLStructInterpretedImpl( size );
  }

  public static SubLStruct makeStructNative(SubLStructDeclNative structDecl)
  {
    Errors.unimplementedMethod( "SubLObjectFactory.makeStructNative()" );
    return null;
  }

  public static SubLSymbol makeSublispSymbol(String symbolName)
  {
    return makeSymbol( symbolName, SubLPackage.SUBLISP_PACKAGE.toPackage() );
  }

  /**
 * TODO Describe the purpose of this method.
 */
	public static SubLObject maybeMake(String... name) {
		SubLPackage currentPackage = Packages.$package$.getDynamicValue().toPackage();		
		if (name.length > 1) {
			currentPackage = org.armedbear.lisp.Package.findPackageNamed(name[1]);
		}
		final String sname = name[0];
		Symbol findAccessibleSymbol = currentPackage.findAccessibleSymbol(sname);
		if (findAccessibleSymbol != null)
			return findAccessibleSymbol;
		findAccessibleSymbol = Lisp.PACKAGE_CL_USER.findAccessibleSymbol(sname);
		if (findAccessibleSymbol != null)
			return findAccessibleSymbol;
 		return makeSymbol(sname, currentPackage);
	}
  
  public static SubLSymbol makeSymbol(String symbolName)
  {
    SubLPackage currentPackage = Packages.$package$.getDynamicValue().toPackage();
    return SubLSymbolFactory.makeSymbol( symbolName, currentPackage );
  }

  public static SubLSymbol makeSymbol(String symbolName, String packageName)
  {
    return SubLSymbolFactory.makeSymbol( symbolName, packageName );
  }

  public static SubLSymbol makeSymbol(String symbolName, SubLPackage thePackage)
  {
    return SubLSymbolFactory.makeSymbol( symbolName, thePackage );
  }

  public static SubLSymbol makeSymbol(SubLString symbolName)
  {
    return SubLSymbolFactory.makeSymbol( symbolName, (SubLPackage) Packages.$package$.getDynamicValue() );
  }

  public static SubLSymbol makeSymbol(SubLString symbolName, SubLPackage thePackage)
  {
    return SubLSymbolFactory.makeSymbol( symbolName, thePackage );
  }

  public static SubLSynonymStream makeSynonymStream(SubLSymbol streamSymbol)
  {
    return SubLStreamFactory.makeSynonymStream( streamSymbol );
  }

  public static SubLSymbol makeUninternedSymbol(String symbolName)
  {
    return SubLSymbolFactory.makeUninternedSymbol( symbolName );
  }

  public static SubLSymbol makeUninternedSymbol(SubLString symbolName)
  {
    return SubLSymbolFactory.makeUninternedSymbol( symbolName );
  }

  public static SubLSymbol makeUniqueKeyword()
  {
    return makeKeyword( "&UNIQUE-KEYWORD-" + System.currentTimeMillis() + "-" + SubLObjectFactory.random.nextInt() + "-" + SubLObjectFactory.uniquifier++ + "&" );
  }

  public static SubLSymbol makeUniqueSymbol()
  {
    return makeSublispSymbol( "&UNIQUE-SYMBOL-" + System.currentTimeMillis() + "-" + SubLObjectFactory.random.nextInt() + "-" + SubLObjectFactory.uniquifier++ + "&" );
  }

  public static SubLVector makeVector(int length)
  {
    Threads.possiblyHandleInterrupts( true );
    if( length > 1000000 )
      try
      {
        return new SubLVector( length );
      }
      catch( OutOfMemoryError oome )
      {
        return Errors.error( "Not enough memory to allocate vector of size: " + length ).toVect();
      }
    return new SubLVector( length );
  }

  public static SubLVector makeVector(int length, SubLObject value)
  {
    Threads.possiblyHandleInterrupts( true );
    if( length > 1000000 )
      try
      {
        return new SubLVector( length, value );
      }
      catch( OutOfMemoryError oome )
      {
        return Errors.error( "Not enough memory to allocate vector of size: " + length ).toVect();
      }
    return new SubLVector( length, value );
  }

  public static SubLVector makeVector(List<SubLObject> list)
  {
    return new SubLVector( list );
  }

  public static SubLVector makeVector(Object[] items)
  {
    Threads.possiblyHandleInterrupts( true );
    SubLVector result = new SubLVector( items.length );
    for( int i = 0, size = items.length; i < size; ++i )
      result.set( i, (SubLObject) items[ i ] );
    return result;
  }

  public static SubLVector makeVector(SubLList list)
  {
    if( list == SubLNil.NIL )
      return SubLVector.EMPTY_VECTOR;
    SubLObject[] data = list.toSubLObjectArray();
    return new SubLVector( data );
  }

  public static SubLList wrapList(SubLList theList)
  {
    return theList;
  }

  public static SubLObject wrapList(SubLObject theList)
  {
    return theList;
  }
  public static SubLObjectFactory me;
  private static Random random;
  private static int MAX_FP_PARSING_CACHE_SIZE = 10000;
  private static Map<String, SubLDoubleFloat> fpParsingCache;
  private static int MAX_INTEGER_CACHE_SIZE = 4000;
  private static Map<String, SubLInteger> integerParsingCache;
  private static Map charCache;
  private static int MAX_CHAR_PARSING_CACHE_SIZE = 1000;
  private static Map<String, SubLCharacter> charParsingCache;
  private static long uniquifier;
  private static int MAX_POSITIVE_INTEGER_LENGTH;
  private static int MAX_NEGATIVE_INTEGER_LENGTH;
  private static int MAX_POSITIVE_LONG_LENGTH;
  private static int MAX_NEGATIVE_LONG_LENGTH;
  public static boolean USE_ARRAY_LISTS = false;
  static
  {
    me = new SubLObjectFactory();
    random = new Random();
    SubLObjectFactory.fpParsingCache = new LinkedHashMap<String, SubLDoubleFloat>( 10001, 0.75f, true )
    {
      @Override
      public boolean removeEldestEntry(Map.Entry eldest)
      {
        return size() > 10000;
      }
    };
    integerParsingCache = new LinkedHashMap<String, SubLInteger>( 4001, 0.75f, true )
    {
      @Override
      public boolean removeEldestEntry(Map.Entry eldest)
      {
        return size() > 4000;
      }
    };
    charCache = new HashMap();
    charParsingCache = new LinkedHashMap<String, SubLCharacter>( 10001, 0.75f, true )
    {
      @Override
      public boolean removeEldestEntry(Map.Entry eldest)
      {
        return size() > 1000;
      }
    };
    SubLObjectFactory.uniquifier = 0L;
    MAX_POSITIVE_INTEGER_LENGTH = "2147483647".toString().length();
    MAX_NEGATIVE_INTEGER_LENGTH = "-2147483648".toString().length();
    MAX_POSITIVE_LONG_LENGTH = "9223372036854775807".toString().length();
    MAX_NEGATIVE_LONG_LENGTH = "-9223372036854775808".toString().length();
  }
}
