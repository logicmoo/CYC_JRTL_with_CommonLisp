package jasko.tim.lisp.cusp;

import jasko.tim.lisp.LispPlugin;
import jasko.tim.lisp.preferences.PreferenceConstants;

import java.io.BufferedInputStream;
import java.io.IOException;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


/**
 * This class connects to a lisp implementation via SSH.
 *  
 * @author Marc Halbruegge
 */
public class RemoteImplementation extends LispImplementation {
	
	/**
	 * @return Lisp implementation found in the preferences, or null if none is found
	 */
	static public RemoteImplementation findImplementation() {
		return new RemoteImplementation();
	}

	
	/**
	 * Constructs an instance of an Lisp implementation.  Does NOT start an Lisp process,
	 * or find an Lisp implementation on the host machine.
	 * 
	 * @see start()
	 * @param executable full path read from the preferences
	 */
	public RemoteImplementation() {
	}

	public boolean isValid() { 
		return true;
	}
	
	class SshConnectDialog extends org.eclipse.jface.dialogs.Dialog {
	
		Process sshProcess;
		String newline;
		String sshString;
		SshStreamConnector connector;
		
		Text sshOutput = null;
		Text userInput = null;
		Button dismiss = null;

		public SshConnectDialog(Process p, String newlineChars, String sshString) {
			super((Shell)null);
			this.sshProcess = p;
			this.newline = newlineChars;
			this.sshString = sshString; 
		}
		
		protected Control createDialogArea(Composite parent) {
	        Composite composite = (Composite) super.createDialogArea(parent);
	        
	        composite.getShell().setText("Cusp SSH establishment for " + sshString);
	        
	        Label label = new Label(composite, SWT.WRAP);
	        label.setText("Output of ssh is shown. Please enter your password if asked.");
	        GridData data = new GridData(GridData.GRAB_HORIZONTAL
	        			| GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
	        			| GridData.VERTICAL_ALIGN_CENTER);
	        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
	        label.setLayoutData(data);
	        label.setFont(parent.getFont());
	        
	        sshOutput = new org.eclipse.swt.widgets.Text(composite, SWT.MULTI | SWT.BORDER
	        			| SWT.READ_ONLY | SWT.WRAP | SWT.V_SCROLL);
	        GridData gd = new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL);
	        gd.grabExcessVerticalSpace = true;
	        gd.minimumHeight = 200; // XXX: um...
	        sshOutput.setLayoutData(gd);
	    
	        userInput = new Text(composite, SWT.SINGLE | SWT.BORDER | SWT.PASSWORD);
	        userInput.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL | GridData.HORIZONTAL_ALIGN_FILL));
	        userInput.addSelectionListener(new org.eclipse.swt.events.SelectionListener() {
	        	public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
	        	}
	        	public void widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent e) {
	        		// XXX: This only happens when the user hits ENTER?
	        		String i = ((Text)e.widget).getText();
	        		((Text)e.widget).setText("");
	        	
	        		try {
	        			// Need to insert a newline in the shell
	        			sshOutput.getDisplay().asyncExec(new Runnable() {
	        				public void run() {
	        					sshOutput.append("\n");
	        				}
	        			});
	        			synchronized (sshProcess) {
			        		sshProcess.getOutputStream().write(i.getBytes());
			        		sshProcess.getOutputStream().write(newline.getBytes());
			        		sshProcess.getOutputStream().flush();
	        			}
	        		} catch (IOException e2) {
	        			final String errorString = e2.toString();
	        			sshOutput.getDisplay().asyncExec(new Runnable() {
	        				public void run() {
	        					sshOutput.append("ERROR: got exception " + errorString.toString());
	        				}
	        			});
	        		}
	        	}
	        });
	        userInput.setFocus();
	        
	        connector = new SshStreamConnector(sshProcess, sshOutput, this);
	        connector.start();
	        
	        applyDialogFont(composite);
	        
	        return composite;
		}
		
	    protected void createButtonsForButtonBar(Composite parent) {
	    	// Create a dismiss button
	    	dismiss = createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);	    	
	    }
	    
		public int open() {
			int result = super.open();
			// Make sure to stop the thread
			try {
				connector.isRunning = false;
				connector.interrupt();
			} catch (Exception e) {
				// ignore
			}
			return result;
		}
		
		class SshStreamConnector extends Thread {
			Process proccess;
			Text sshText;
			Dialog parentWindow;

			boolean isRunning = true;
			
			public SshStreamConnector(Process process, Text sshText, Dialog parentWindow) {
				super();
				this.proccess = process;
				this.sshText = sshText;
				this.parentWindow = parentWindow;
			}
			
			private String processInput(BufferedInputStream in, int size)
				throws IOException {
				final byte[] tmp = new byte[size];
				in.read(tmp);
				sshOutput.getDisplay().asyncExec(new Runnable() {
					public void run() {
						if (sshOutput != null) {
							sshOutput.append(new String(tmp));
						}
					}
				});
				return new String(tmp);
			}
			
			public void run() {
				// Unfortunately, SBCL shell character doesn't come up once --load
				// processing finishes. As a (hopefuly portable!) hack:
				// We wait for "cusp-backend" string to appear.
				// FIXME: looking for "This is SBCL" instead, to avoid modifying cusp.
				// FIXME: non-sbcl implementation will need to print this on load :)
				// Then send a (format t "Cusp ~A" "loaded") command
				// And wait for the result to show up. Once it does, everything's ready
				java.io.BufferedInputStream in1 = new BufferedInputStream(proccess.getInputStream());
				java.io.BufferedInputStream in2 = new BufferedInputStream(proccess.getErrorStream());
				String allInput = "";
				boolean sentControl = false;
				while (isRunning) {
					try{
						int a = in1.available();
						if (a > 0) {
							String result = processInput(in1, a);
							allInput += result;
						}
						a = in2.available();
						if (a > 0) {
							String result = processInput(in2, a);
							allInput += result;
						}
						
						if ((!sentControl) && allInput.indexOf("This is SBCL") > -1) {
							synchronized (sshProcess) {
								sshProcess.getOutputStream().write("(format t \"Cusp ~A\" \"loaded\")\n".getBytes());
								sshProcess.getOutputStream().flush();
							}
							sentControl = true;
						}
						if (allInput.indexOf("Cusp loaded") > -1) {
							// Wahey, done!
							parentWindow.getShell().getDisplay().asyncExec(new Runnable() {
								public void run() {
									parentWindow.close();
								}
							});
						}
						
						Thread.sleep(100);
					} catch (IOException e) {
						sshOutput.append("ERROR: Got exception " + e.toString());
						return;
					} catch (InterruptedException e) {
						// ignore
					}
				}
			}
		};

	};


	public Process startLisp(String loadPath, int port) throws IOException {
		if (isValid()) {
			IPreferenceStore prefStore = LispPlugin.getDefault().getPreferenceStore();
			
			final String sshCommand = prefStore.getString(PreferenceConstants.SSH_COMMAND);
			final String sshUserHost = prefStore.getString(PreferenceConstants.REMOTE_USER) + "@" +
						prefStore.getString(PreferenceConstants.REMOTE_HOST);
			final String sshTunnelOpt = (String.valueOf(port)) + ":localhost:" + (String.valueOf(port));
			final String sshRemoteCommand = prefStore.getString(PreferenceConstants.REMOTE_LISP_EXE) + " --load " +
						prefStore.getString(PreferenceConstants.REMOTE_INI);
			String[] commandLine = new String[] {
					sshCommand,
					"-L", sshTunnelOpt,
					sshUserHost,
					sshRemoteCommand
			};
			
			// plink.exe requires "\r\n" as line endings, "\n" everywhere else
			String newline = "\n";
			if (sshCommand.toLowerCase().indexOf("plink") > -1) {
				newline = "\r\n";
			}
			
			// Unfortunately, ssh tends to ask for passwords and other such silly things.
			// We show a dialog with SSH's output and let users interact with it that way.
			// This dialog will go away once the user clicks a cancel button, or when
			// an SBCL shell is detected.
			ProcessBuilder pb;
			pb = new ProcessBuilder(commandLine);
			final Process p = pb.start();
			final SshConnectDialog d = new SshConnectDialog(p, newline, sshUserHost);

			if (d.open() == IDialogConstants.OK_ID) {
				return p;
			} else {
				// Cancel pressed, or window closed
				throw new IOException();
			}
		}
		return null;
	}
	
	public String getLoadCuspCommand() {
		return null;
	}
	
	public String translateLocalFilePath(String filePath) {
		IPreferenceStore prefStore = LispPlugin.getDefault().getPreferenceStore();
		String local = prefStore.getString(PreferenceConstants.REMOTE_LOCAL_PATH_PREFIX);
		if (local != null) {
			// We always use forward slashes everywhere
			local = local.replace('\\', '/');
			// Make sure local ends in a slash
			if (!local.endsWith("/")) {
				local = local + "/";
			}
			String newFilePath = filePath;
			
			if (System.getProperty("os.name").toLowerCase().contains("windows")) {
				newFilePath = newFilePath.toLowerCase();
				local = local.toLowerCase();
			}
			
			if (newFilePath.startsWith(local)) {
				String remote = prefStore.getString(PreferenceConstants.REMOTE_REMOTE_PATH_PREFIX);
				// We alsways use forward slashes everywhere
				remote = remote.replace('\\', '/');
				// Make sure remote ends in a slash
				if (!remote.endsWith("/")) {
					remote = remote + "/";
				}
				newFilePath = remote + filePath.substring(local.length());
				return newFilePath;
			} else {
				return newFilePath;
			}
		} else {
			return filePath;
		}
	}
	
	public String translateRemoteFilePath(String filePath) {
		IPreferenceStore prefStore = LispPlugin.getDefault().getPreferenceStore();
		String remote = prefStore.getString(PreferenceConstants.REMOTE_REMOTE_PATH_PREFIX);
		if (remote != null) {
			// We always use forward slashes everywhere
			remote = remote.replace('\\', '/');
			// Make sure remote ends in a slash
			if (!remote.endsWith("/")) {
				remote = remote + "/";
			}
			String newFilePath = filePath;
			
			if (newFilePath.startsWith(remote)) {
				String local = prefStore.getString(PreferenceConstants.REMOTE_LOCAL_PATH_PREFIX);
				// We always use forward slashes everywhere
				local = local.replace('\\', '/');
				// Make sure local ends in a slash
				if (!local.endsWith("/")) {
					local = local + "/";
				}
				newFilePath = local + filePath.substring(remote.length());
				return newFilePath;
			} else {
				return newFilePath;
			}
		} else {
			return filePath;
		}
	}


	@Override
	public ProcessBuilder start(String loadPath, int cuspPort)
			throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

}
