//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.armedbear.lisp.Keyword;
import org.armedbear.lisp.Lisp;
import org.h2.command.ddl.CreateFunctionAlias;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.ResumeException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLCompiledFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLFiles
{
  public abstract static class VariableAccessMode
  {
    public static final VariableAccessMode CONSTANT = new VariableAccessMode( "CONSTANT" )
    {
      @Override
      public SubLSymbol toSymbol()
      {
        return CommonSymbols.CONSTANT;
      }
    };
    public static final VariableAccessMode LEXICAL = new VariableAccessMode( "LEXICAL" )
    {
      @Override
      public SubLSymbol toSymbol()
      {
        return CommonSymbols.LEXICAL;
      }
    };
    public static final VariableAccessMode DYNAMIC = new VariableAccessMode( "DYNAMIC" )
    {
      @Override
      public SubLSymbol toSymbol()
      {
        return CommonSymbols.DYNAMIC;
      }
    };
    public static final VariableAccessMode UNDECLARED = new VariableAccessMode( "UNDECLARED" )
    {
      @Override
      public SubLSymbol toSymbol()
      {
        return CommonSymbols.UNDECLARED;
      }
    };
    /* Process Local */
    public static final VariableAccessMode GLOBAL_TOP_LEVEL = new VariableAccessMode( "GLOBAL-TOP-LEVEL" )
    {
      @Override
      public SubLSymbol toSymbol()
      {
        return Keyword.TOP_LEVEL;
      }
    };
    /* Process Local/Iherited from parent */
    public static final VariableAccessMode INHERITED_ENV = new VariableAccessMode( "INHERITED-ENV" )
    {
      @Override
      public SubLSymbol toSymbol()
      {
        return Keyword.INHERITED;
      }
    };
    private final String toStr;

    public VariableAccessMode( String string )
    {
      toStr = string;
    }

    @Override
    public String toString()
    {
      if( toStr != null )
        return toStr;
      return toSymbol().princToString();
    }

    public abstract SubLSymbol toSymbol();
  }
  //// Public Area
  public static List<String> skippedClasses = new ArrayList<String>();

  public static void declareFunction(String className, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest)
  {
    try
    {
      List<Class> parameterTypes = new ArrayList<Class>();
      for( int i = 0; i < requiredArgCount + optionalArgCount; i++ )
        parameterTypes.add( SubLObject.class );
      if( allowsRest )
        parameterTypes.add( SubLObject[].class );
      Class[] parameterArray = parameterTypes.toArray( new Class[ parameterTypes.size() ] );
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol( functionName );
      SubLOperator prev = null;
      if( functionSymbol.fboundp() )
      {
        prev = functionSymbol.getFunction();
      }
      try
      {
        SubLCompiledFunction func = SubLObjectFactory.makeCompiledFunction( className, methodName, parameterArray, SubLObject.class, functionSymbol, requiredArgCount, optionalArgCount, allowsRest );
        if( prev != null && !func.equalp( prev ) )
        {
          Errors.warn( "Attempt to redefine: " + functionSymbol );
          return;
        }
      }
      finally
      {
        if( prev != null )
          functionSymbol.setFunction( prev );
      }
    }
    catch( Exception e )
    {
      Errors.cerror( "Continue.", "Error while declaring function: " + functionName, e );
    }
  }

  /**
   * implicitly dependent on the current package, @todo extend to support
   * non-sublisp functions. We need this helper function to be non-static so
   * that we can access this.getClass() without having to pass it as an argument
   */
  public static void declareFunction(SubLFile file, String methodName, String functionName, int requiredArgCount, int optionalArgCount, boolean allowsRest)
  {
    try
    {
      List<Class> parameterTypes = new ArrayList<Class>();
      for( int i = 0; i < requiredArgCount + optionalArgCount; i++ )
        parameterTypes.add( SubLObject.class );
      if( allowsRest )
        parameterTypes.add( SubLObject[].class );
      Class[] parameterArray = parameterTypes.toArray( new Class[ parameterTypes.size() ] );
      Method meth = file.getClass().getMethod( methodName, parameterArray );
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol( functionName );
      SubLFunction previous = null;
      if( functionSymbol.fboundp() )
      {
        if( false )
          return;
        previous = functionSymbol.getFunc();
        if( parameterArray.length <= previous.applyArity() + ( previous.allowsRest() ? 1 : 0 ) )
        {
          Errors.warn( "Attempt to redefine: " + functionSymbol );
          return;
        }
        Errors.warn( "Redefining " + functionSymbol );
      }
      SubLFunction func = SubLObjectFactory.makeCompiledFunction( meth, functionSymbol, requiredArgCount, optionalArgCount, allowsRest );
    }
    catch( Exception e )
    {
      Errors.cerror( "Continue.", "Error while declaring function: " + functionName, e );
    }
  }

  private static SubLSymbol declareSymbol(Object variableName, SubLObject initialValue, VariableAccessMode accessMode, boolean isReinitialized)
  {
    return declareSymbol( variableName, initialValue, accessMode, isReinitialized, (SubLPackage) Packages.$package$.getDynamicValue() );
  }

  private static SubLSymbol declareSymbol(Object variableName, SubLObject initialValue, VariableAccessMode accessMode, boolean isReinitialized, SubLPackage thePackage)
  {
    try
    {
      SubLSymbol symbol = asSymbol( variableName, thePackage.toPackage() );
      symbol.setAccessMode( accessMode );
      if( !symbol.boundp() )
        symbol.forceGlobalValue( initialValue );
      else
      {
        if( isReinitialized )
        { // make a discesion about some things
          symbol.forceGlobalValue( initialValue );
        }
      }
      // perform symbol annotation -- for initialization type
      SubLSymbol initializationType = isReinitialized ? CommonSymbols.INITIALIZER : CommonSymbols.WORLD;
      symbol.setProperty( CommonSymbols.INITIALIZATION_TYPE, initializationType );
      // symbol annotation -- for binding type
      symbol.setProperty( CommonSymbols.BINDING_TYPE, accessMode.toSymbol() );
      synchronized( SubLFiles.symbolInitializationOrder )
      {
        SubLFiles.symbolInitializationOrder.add( symbol );
      }
      return symbol;
    }
    catch( Exception e )
    {
      Errors.cerror( "Continue.", "Error while declaring global: " + variableName, e );
    }
    return null;
  }

  private static SubLSymbol asSymbol(Object variableName, SubLPackage package1)
  {
    if( variableName instanceof SubLSymbol )
      return (SubLSymbol) variableName;
    if( variableName instanceof SubLObject )
    {
      variableName = ( (SubLObject) variableName ).princToString();
    }
    return SubLObjectFactory.makeSymbol( variableName.toString(), package1 );
  }

  public static void declareMacro(String className, String methodName, String functionName)
  {
    try
    {
      Class[] parameterArray = { SubLObject.class, SubLObject.class
      };
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol( functionName );
      SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction( className, methodName, parameterArray, SubLObject.class, functionSymbol, 2, 0, false );
      SubLMacro macro = SubLObjectFactory.makeMacro( macroExpander );
      functionSymbol.setFunction( macro );
    }
    catch( Exception e )
    {
      Errors.cerror( "Continue.", "Error while declaring macro: " + functionName, e );
    }
  }

  public static void declareMacro(SubLFile file, String methodName, String functionName)
  {
    try
    {
      Class[] parameterArray = { SubLObject.class, SubLObject.class
      };
      Method meth = file.getClass().getMethod( methodName, parameterArray );
      SubLSymbol functionSymbol = SubLObjectFactory.makeSymbol( functionName );
      SubLCompiledFunction macroExpander = SubLObjectFactory.makeCompiledFunction( meth, functionSymbol, 2, 0, false );
      SubLMacro macro = SubLObjectFactory.makeMacro( macroExpander );
      functionSymbol.setFunction( macro );
    }
    catch( Exception e )
    {
      Errors.cerror( "Continue.", "Error while declaring macro: " + functionName, e );
    }
  }

  public static SubLSymbol defconstant(String variableName, SubLObject initialValue)
  {
    /* SubL defconstant : constant lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.CONSTANT, true );
  }

  public static SubLSymbol defconstant(Object variableName, SubLObject initialValue)
  {
    /* SubL defconstant : constant lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.CONSTANT, true );
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defconstant(SubLFile file, Object variableName, SubLObject initialValue)
  {
    /* SubL defconstant : constant lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.CONSTANT, true );
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defconstant(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage)
  {
    /* SubL defconstant : constant lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.CONSTANT, true, thePackage );
  }

  public static SubLSymbol defglobal(Object variableName, SubLObject initialValue)
  {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on
     * re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, false );
  }

  public static SubLSymbol defglobal(String variableName, SubLObject initialValue)
  {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on
     * re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, false );
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defglobal(SubLFile file, Object variableName, SubLObject initialValue)
  {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on
     * re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, false );
  }

  public static SubLSymbol defglobal(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage)
  {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on
     * re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, false, thePackage );
  }

  public static SubLSymbol deflexical(Object variableName, SubLObject initialValue)
  {
    /* SubL deflexical : mutable lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, false );
  }

  public static SubLSymbol deflexical(String variableName, SubLObject initialValue)
  {
    /*
     * SubL defglobal : mutable lexical global, not re-initialized on
     * re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, false );
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol deflexical(SubLFile file, Object variableName, SubLObject initialValue)
  {
    /* SubL deflexical : mutable lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, true );
  }

  public static SubLSymbol deflexical(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage)
  {
    /* SubL deflexical : mutable lexical global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.LEXICAL, true, thePackage );
  }

  public static SubLSymbol defparameter(String variableName, SubLObject initialValue)
  {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, true );
  }

  public static SubLSymbol defparameter(Object variableName, SubLObject initialValue)
  {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, true );
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defparameter(SubLFile file, Object variableName, SubLObject initialValue)
  {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, true );
  }

  public static SubLSymbol defparameter(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage)
  {
    /* SubL defparameter : mutable dynamic global */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, true, thePackage );
  }

  public static SubLSymbol defvar(String variableName, SubLObject initialValue)
  {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, false );
  }

  public static SubLSymbol defvar(Object variableName, SubLObject initialValue)
  {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, false );
  }

  // @todo get rid of references to file -APB
  public static SubLSymbol defvar(SubLFile file, Object variableName, SubLObject initialValue)
  {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, false );
  }

  public static SubLSymbol defvar(SubLFile file, Object variableName, SubLObject initialValue, SubLPackage thePackage)
  {
    /*
     * SubL defvar : mutable dynamic global, not re-initialized on re-evaluation
     */
    return declareSymbol( variableName, initialValue, VariableAccessMode.DYNAMIC, false, thePackage );
  }

  public static void handleThrowable()
  {}

  public static void initialize(String className)
  {
    if( skippedClasses.contains( className ) )
    {
    }
    org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
    try
    {
      if( p != Lisp.PACKAGE_SUBLISP && p != Lisp.PACKAGE_CYC )
        SubLPackage.setCurrentPackage( "CYC" );
      try
      {
        Class clazz = PatchFileLoader.PATCH_FILE_LOADER.loadClass( className );
        ClassLoader loader = clazz.getClassLoader();
        Field meField = clazz.getDeclaredField( "me" );
        if( meField == null )
          throw new RuntimeException( "Bad SubLFile: " + className );
        meField.setAccessible( true );
        SubLFile file = (SubLFile) meField.get( null );
        initialize( file );
      }
      catch( Throwable e )
      {
        e.printStackTrace();
        Errors.cerror( "Continue.", "Error initializing SubL file: " + className, e );
      }
    }
    finally
    {
      SubLPackage.setCurrentPackage( p );
    }
  }

  public static void initialize(Class clazz)
  {
    org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
    final String className = clazz.getName();
    try
    {
      if( p != Lisp.PACKAGE_SUBLISP && p != Lisp.PACKAGE_CYC )
        SubLPackage.setCurrentPackage( "CYC" );
      try
      {
        ClassLoader loader = clazz.getClassLoader();
        Field meField = clazz.getDeclaredField( "me" );
        if( meField == null )
          throw new RuntimeException( "Bad SubLFile: " + className );
        SubLFile file = (SubLFile) meField.get( null );
        initialize( file );
      }
      catch( Throwable e )
      {
        e.printStackTrace();
        Errors.cerror( "Continue.", "Error initializing SubL file: " + className, e );
      }
    }
    finally
    {
      SubLPackage.setCurrentPackage( p );
    }
  }

  public static void initialize(SubLFile file)
  {
    org.armedbear.lisp.Package p = SubLPackage.getCurrentPackage();
    try
    {
      file.declareFunctions();
      file.initializeVariables();
      initializeFns();
      file.runTopLevelForms();
    }
    catch( Throwable e )
    {
      e.printStackTrace();
      try
      {
        Errors.cerror( "Continue.", "Error initializing SubL file: " + file.getClass().getName(), e );
      }
      catch( ResumeException re )
      {
      }
    }
    finally
    {
      SubLPackage.setCurrentPackage( p );
    }
  }

  /**
   * 
   */
  private static void initializeFns()
  {
    for( Iterator iterator = functionMap.keySet().iterator(); iterator.hasNext(); )
    {
      String string = (String) iterator.next();
      createFunction( string, functionMap.get( string ) );
    }
  }

  /**
   * @param string
   * @param integer
   */
  public static void createFunction(String string, Integer integer)
  {
    com.cyc.cycjava.cycl.module0004.$f106$UnaryFunction.class.toString();
    String classname = string;
    switch( integer )
    {
      case 1:
        classname += "$UnaryFunction";
        break;
      case 0:
        classname += "$ZeroArityFunction";
        break;
      case 2:
        classname += "$BinaryFunction";
        break;
      default:
        // TODO Auto-generated method stub
        if( true )
          throw new AbstractMethodError( "SubLFiles.createFunction" );
        break;
    }
    try
    {
      Class c = Class.forName( classname );
    }
    catch( ClassNotFoundException e )
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
      if( true )
        throw new AbstractMethodError( "SubLFiles.createFunction throw ClassNotFoundException" );
    }
  }

  public static List<SubLSymbol> symbolInitializationOrder()
  {
    List<SubLSymbol> symbols = new ArrayList<SubLSymbol>();
    synchronized( symbolInitializationOrder )
    {
      symbols.addAll( symbolInitializationOrder );
    }
    return symbols;
  }
  private static LinkedHashSet<SubLSymbol> symbolInitializationOrder;
  public static HashMap<String, Integer> functionMap = new HashMap();
  static
  {
    symbolInitializationOrder = new LinkedHashSet<SubLSymbol>();
  }
}
