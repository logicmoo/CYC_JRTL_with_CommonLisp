import org.armedbear.lisp.*;

public class Main
{
    /**
     * This example creates an Interpreter instance, loads our
     * lisp code from a file and then looks up two functions defined
     * in the loaded lisp file and executes the functions. 
     *
     * The first function takes a single parameter and prints its value, 
     * so we can provide any Object, so we use a String.
     *
     * The second function takes two numbers, adds them together, prints
     * the parameters and the result, and returns the result. 
     * We use two integers as parameters and just print the result
     * from java side.
     */
    public static void main(String[] argv)
    {
	try
	    {
		Interpreter interpreter = Interpreter.createInstance();
		interpreter.eval("(load \"lispfunctions.lisp\")");
		// the function is not in a separate package, thus the
		// correct package is CL-USER. Symbol names are
		// upper case. Package needs the prefix, because java
		// also has a class named Package.
		org.armedbear.lisp.Package defaultPackage = 
		    Packages.findPackage("CL-USER");

		Symbol voidsym = 
		    defaultPackage.findAccessibleSymbol("VOID-FUNCTION");
		Function voidFunction = (Function) voidsym.getSymbolFunction();
		voidFunction.execute(new JavaObject("String given from java"));

		Symbol intsym = 
		    defaultPackage.findAccessibleSymbol("INT-FUNCTION");
		Function intFunction = (Function) intsym.getSymbolFunction();
		LispObject result = 
		    intFunction.execute(new JavaObject(1), 
					new JavaObject(6));
		System.out.print("The result on the java side: ");
		System.out.println(result.intValue());
	    }
	catch (Throwable t)
	    {
		System.out.println("abcl exception!");
		t.printStackTrace();
	    }
    }
}