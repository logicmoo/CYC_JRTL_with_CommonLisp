package jasko.tim.lisp.cusp;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;


/**
 * Commands sent to Cusp are associated with an instance of some descendant of this class.
 * The result of that command will be stuck in to the result member of the class,
 *  and then CuspInterface will <i>attempt</i> to clone the CuspRunnable via the
 *  clone method. It should be noted that this tends to fail with anonymous classes,
 *  so don't use those where certain threading issues are a concern.
 * The CuspRunnable will then be run in the main GUI thread, thus avoiding
 *  the many multithreading issues we would otherwise face.
 * 
 * @see CuspInterface
 * @author Tim Jasko
 *
 */
public abstract class CuspRunnable implements Runnable, IRunnableWithProgress {
	public LispNode result;
	public int messageNum;
	
	protected LispNode getReturn() {
		return result.getf(":return").getf(":ok");
	}

	public void run(IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		run();
	}
	
	public CuspRunnable clone() {
		CuspRunnable ret;
		try {
			ret = this.getClass().newInstance();
			ret.result = result;
			
			return ret;
		} catch (InstantiationException e) {
		} catch (IllegalAccessException e) {
		}
		
		return this;
	}
}
