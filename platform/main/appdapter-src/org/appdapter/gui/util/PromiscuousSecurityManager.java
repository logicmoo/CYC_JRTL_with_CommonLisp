package org.appdapter.gui.util;

import java.rmi.RMISecurityManager;
import java.security.AccessController;
import java.security.Permission;
import java.security.PrivilegedAction;
import java.util.logging.Logger;

import org.appdapter.core.debug.UIAnnotations.HRKRefinement;

public class PromiscuousSecurityManager extends RMISecurityManager implements HRKRefinement {
	@Override
	public void checkPermission(Permission perm) {
		// java.security.AccessController.checkPermission(perm);
	}

	static SecurityManager ourOneSecurityManager;

	private PromiscuousSecurityManager() {
		ourOneSecurityManager = this;
	}

	static void ensureInstalled0() {
		SecurityManager securityManager = System.getSecurityManager();

		if (securityManager != null) {
			if (securityManager instanceof PromiscuousSecurityManager)
				return;
		}

		try {
			System.setSecurityManager(getOurOneSecurityManager());
		} catch (Exception e) {
			e.printStackTrace();
			AccessController.doPrivileged(new PrivilegedAction<Object>() {
				@Override
				public Object run() {
					// privileged code goes here, for example:
					synchronized (SecurityManager.class) {
						System.setSecurityManager(getOurOneSecurityManager());
					}
					return null; // nothing to return
				}
			});
		}

		ourOneSecurityManager = getOurOneSecurityManager();
		AccessController.doPrivileged(new PrivilegedAction<Object>() {
			@Override
			public Object run() {
				// privileged code goes here, for example:
				synchronized (SecurityManager.class) {

					Logger.getLogger("JVoiceRMISecurityManager").info("security manager set to " + ourOneSecurityManager);
					java.lang.System.setSecurityManager(ourOneSecurityManager);
				}
				return null; // nothing to return
			}
		});
	}

	synchronized protected static SecurityManager getOurOneSecurityManager() {
		if (ourOneSecurityManager != null)
			return ourOneSecurityManager;
		AccessController.doPrivileged(new PrivilegedAction<Object>() {
			@Override
			public Object run() {
				// privileged code goes here, for example:
				synchronized (SecurityManager.class) {
					ourOneSecurityManager = new PromiscuousSecurityManager();
				}
				return null; // nothing to return
			}
		});
		return ourOneSecurityManager;
	}
}
