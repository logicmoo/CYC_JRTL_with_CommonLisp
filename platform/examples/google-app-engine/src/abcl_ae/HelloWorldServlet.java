package abcl_ae;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.SpecialBindingsMark;
import org.armedbear.lisp.Stream;
import org.armedbear.lisp.Symbol;

public class HelloWorldServlet extends HttpServlet {

	static private Symbol doGet = null;

	public void init() throws ServletException {
		AbclInit.init();
		doGet = Lisp.internInPackage("DO-GET", "FIRST-SERVLET");
	}


	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {

		LispThread currentThread = LispThread.currentThread();

		SpecialBindingsMark mark = currentThread.markSpecialBindings();
		currentThread.bindSpecial(
			Symbol.STANDARD_OUTPUT, 
			new Stream(Symbol.SYSTEM_STREAM, resp.getOutputStream(), 
                                   Symbol.CHARACTER, false));

		try {
			currentThread.execute(doGet);
		} finally {
			currentThread.resetSpecialBindings(mark);
		}
	}
}