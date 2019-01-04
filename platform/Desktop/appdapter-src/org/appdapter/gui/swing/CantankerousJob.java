package org.appdapter.gui.swing;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.browse.Utility;
import org.armedbear.lisp.Main;

abstract public class CantankerousJob implements Runnable {

	public static boolean contankerousSubLisp = false;
	int skipped = 0;
	private Thread slow;
	private String jobname;
	private Object toStr;
	final Object lock = new Object();
	boolean isUIThreadTask = false;
	final String createdWhy;

	public Object getLock() {
		return lock;
	}

	public CantankerousJob(String jobnam, Object name, boolean inUIThread) {
		createdWhy = Utility.createStackTraceSTring(null);
		jobname = jobnam;
		this.toStr = name;
		isUIThreadTask = inUIThread;
	}

	@Override
	public String toString() {
		return "CantankerousJob " + jobname + " for " + toStr + " " + createdWhy;
	}

	public void attempt() {
		synchronized (lock) {
			// lock just long enough to create the thread and start it
			attemptImpl();
		}
	}

	protected void attemptImpl() {

		if (slow != null) {
			skipped++;
			return;
		}

		skipped++;
		slow = new Thread("CantankerousJob " + jobname) {
			@Override
			public void run() {
				boolean wasNoDebug = Main.isNoDebug();
				try {
					Main.setNoDebug(true);
					Main.setSubLisp(contankerousSubLisp);
					while (skipped > 0) {
						skipped = 0;
						try {
							if (isUIThreadTask) {
								Utility.invokeAndWait(CantankerousJob.this);
							} else {
								CantankerousJob.this.run();
							}
						} catch (Throwable t) {
							Debuggable.printStackTrace(t);
							try {
								Thread.sleep(10000);
							} catch (InterruptedException e) {
							}
						}
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
						}
					}
				}

				finally {
					if(!wasNoDebug) Main.setNoDebug(false);
					synchronized (lock) {
						//if (slow == Thread.currentThread())
							slow = null;
					}
				}

			}

			@Override
			public String toString() {
				return CantankerousJob.this.toString();
			}
		};
		slow.start();

	}
}