import org.armedbear.lisp.*;

public class MainAlternative
{
    /**
     * This example creates an Interpreter instance, loads our
     * lisp code from a file and then looks up a function defined
     * in the loaded lisp file and executes the function.
     */
    public static void main(String[] argv)
    {
	try
	    {
		Interpreter interpreter = Interpreter.createInstance();
		interpreter.eval("(load \"lispfunction.lisp\")");
		// the function is not in a separate package, thus the
		// correct package is CL-USER. Symbol names are
		// upper case. Package needs the prefix, because java
		// also has a class named Package.
		org.armedbear.lisp.Package defaultPackage = 
		    Packages.findPackage("CL-USER");
		Symbol sym = 
		    defaultPackage.findAccessibleSymbol("LISPFUNCTION");
		Function function = (Function) sym.getSymbolFunction();
		function.execute();
	    }
	catch (Throwable t)
	    {
		System.out.println("abcl exception!");
		t.printStackTrace();
	    }
    }
}