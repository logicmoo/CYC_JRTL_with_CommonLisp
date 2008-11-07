import org.armedbear.lisp.*;

public class Main
{
    /**
     * This example creates an Interpreter instance, loads our
     * lisp code from a file and then evaluates a function defined
     * in the loaded lisp file.
     */
    public static void main(String[] argv)
    {
	try
	    {
		Interpreter interpreter = Interpreter.createInstance();
		interpreter.eval("(load \"lispfunction.lisp\")"); 
		LispObject myInterface = interpreter.eval("(lispfunction)");
	    }
	catch (Throwable t)
	    {
		System.out.println("abcl exception!");
		t.printStackTrace();
	    }
    }
}