package jasko.tim.lisp.views;

import jasko.tim.lisp.cusp.LispNode;
import jasko.tim.lisp.cusp.CuspRunnable;

public class TestsRunnable extends CuspRunnable {

	public void run() {
		LispNode contents = result.getf(":return").getf(":ok");
		TestsView.showTestsView(contents);
	}

}
