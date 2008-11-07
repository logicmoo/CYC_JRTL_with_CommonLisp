import org.armedbear.lisp.*;

public class Main
{
    /**
     * This example loads a lisp file and gets two function symbols
     * from it. The functions return implementations of MyInterface.
     * The example gets two separate implementations and invokes
     * the functions in the interface for both implementations.
     */
    public static void main(String[] argv)
    {
	try
	    {
		Interpreter interpreter = Interpreter.createInstance();
		interpreter.eval("(load \"interface_implementation.lisp\")");
		// the function is not in a separate package, thus the
		// correct package is CL-USER. Symbol names are
		// upper case. Package needs the prefix, because java
		// also has a class named Package.
		org.armedbear.lisp.Package defaultPackage = 
		    Packages.findPackage("CL-USER");
		Symbol interfacesym = 
		    defaultPackage.findAccessibleSymbol("GET-INTERFACE");
		Function interfaceFunction = 
		    (Function) interfacesym.getSymbolFunction();
		LispObject myinterface = interfaceFunction.execute();
		MyInterface x = 
		    (MyInterface) JavaObject.getObject(myinterface);
		x.firstFunction();
		x.secondFunction();
		Symbol interfacesym2 = 
		    defaultPackage.
		    findAccessibleSymbol("GET-ANOTHER-INTERFACE");
		Function interfaceFunction2 = 
		    (Function) interfacesym2.getSymbolFunction();
		LispObject myInterface2 = interfaceFunction2.execute();
		MyInterface y = 
		    (MyInterface) JavaObject.getObject(myInterface2);
		y.firstFunction();
		y.secondFunction();
	    }
	catch (Throwable t)
	    {
		System.out.println("abcl exception!");
		t.printStackTrace();
	    }
    }
}