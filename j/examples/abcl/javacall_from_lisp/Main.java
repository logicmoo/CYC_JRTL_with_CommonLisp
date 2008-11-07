import org.armedbear.lisp.*;

public class Main
{
    /**
     * This example creates an Interpreter instance, loads our
     * lisp code from a file and then looks up a function defined
     * in the loaded lisp file and executes the function. 
     *
     * The function takes a single parameter and invokes a java method
     * on the object provided. We provide our Main object as the parameter.
     *
     */
    public static void main(String[] argv)
    {
	try
	    {
		Main thisObject = new Main();
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
		voidFunction.execute(new JavaObject(thisObject));
	    }
	catch (Throwable t)
	    {
		System.out.println("abcl exception!");
		t.printStackTrace();
	    }
    }
    public int addTwoNumbers(int a, int b)
    {
	return a + b;
    }
}