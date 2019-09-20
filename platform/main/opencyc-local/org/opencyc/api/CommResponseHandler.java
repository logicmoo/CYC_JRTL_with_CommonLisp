package org.opencyc.api;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.RejectedExecutionException;
import java.util.Date;
import org.opencyc.util.StringUtils;
import java.util.logging.Level;
import org.opencyc.util.Log;
import org.opencyc.cycobject.CycSymbol;
import java.util.concurrent.Semaphore;

import org.opencyc.api.CycConnection.WaitingWorkerInfo;
import org.opencyc.cycobject.CycList;
import java.net.Socket;
import java.net.ServerSocket;

class CommResponseHandler extends Thread {
	public static final int MAX_LOCAL_CLIENT_CLIENTS = 50;
	protected ServerSocket listenerSocket;
	protected Socket inboundSocket;
	public CfaslInputStream inboundStream;
	protected CfaslOutputStream inboundOutputStream;
	protected Thread parentThread;
	protected CycList ignoreMessage;
	protected CycConnection cycConnection;
	private volatile boolean isClosed;
	volatile boolean isClosing;
	private Semaphore initializedSemaphore;
	private volatile boolean initialized;
	private volatile Exception initializationError;
	static final int TASK_PROCESSOR_RESPONSE_ID = 2;
	static final int TASK_PROCESSOR_RESPONSE_RESPONSE = 5;
	static final int TASK_PROCESSOR_RESPONSE_STATUS = 6;
	static final int TASK_PROCESSOR_RESPONSE_FINISHED_FLAG = 7;
	private final CycConnection cycComm;

	public CommResponseHandler(final Thread parentThread, final CycConnection cycConnection, final CycConnection cycComm) {
		this.listenerSocket = null;
		this.inboundSocket = null;
		this.isClosed = false;
		this.isClosing = false;
		this.initializationError = null;
		this.cycComm = cycComm;
		this.parentThread = parentThread;
		this.cycConnection = cycConnection;
		(this.ignoreMessage = new CycList()).add((Object) new CycSymbol("IGNORE"));
	}

	@Override
	public void start() {
		this.initializeSynchronization();
		super.start();
		this.waitOnSetupToComplete();
	}

	@Override
	public void run() {
		Thread.currentThread().setName("TaskProcessorBinaryResponseHandler");
		Exception closingException = null;
		try {
			if (!this.isClosed && !this.isClosing) {
				try {
					this.inboundStream = this.cycComm.cfaslInputStream;
					this.inboundStream.trace = this.cycComm.trace;
				} catch (Exception e) {
					if (!this.isClosed && !this.isClosing) {
						closingException = e;
						Log.current.printStackTrace(e);
						Log.current.errorPrintln("Communication with Cyc cannot be started: host-" + this.cycComm.hostName + " port-" + this.cycComm.cfaslPort);
						this.notifySetupCompleted(e);
					}
					return;
				}
			}
			this.notifySetupCompleted(null);
			while (!this.isClosed && !this.isClosing) {
				Object status = null;
				CycList taskProcessorResponse = null;
				boolean isInvalidObject = false;
				if (this.isClosed) {
					break;
				}
				if (this.isClosing) {
					break;
				}
				try {
					this.inboundStream.resetIsInvalidObject();
					status = this.inboundStream.readObject();
					this.inboundStream.resetIsInvalidObject();
					final Object currentResponse = this.inboundStream.readObject();
					if (!(currentResponse instanceof CycList)) {
						throw new Exception("Invalid task processor response: " + currentResponse);
					}
					taskProcessorResponse = (CycList) currentResponse;
					if (this.cycComm.logger.isLoggable(Level.FINE)) {
						this.cycComm.logger.fine("API response: " + taskProcessorResponse.stringApiValue());
					}
					isInvalidObject = this.inboundStream.isInvalidObject();
				} catch (Exception e2) {
					if (this.cycComm.taskProcessingEnded && this.cycComm.trace > 0) {
						Log.current.println("Ending binary mode task processor handler.");
					}
					if (!this.isClosed && !this.isClosing) {
						this.cycComm.logger.fine("Exception: " + e2.getMessage());
						if (e2 instanceof CfaslInputStreamClosedException) {
							if (this.cycComm.trace > 0) {
								Log.current.errorPrintln(e2.getMessage());
								Log.current.printStackTrace(e2);
							}
						} else if (e2 instanceof RuntimeException) {
							Log.current.errorPrintln(e2.getMessage());
							Log.current.printStackTrace(e2);
							continue;
						}
						closingException = e2;
						Log.current.println("Cyc Server ended binary mode task processor handler.\n" + StringUtils.getStringForException((Throwable) e2));
					}
					return;
				}
				final boolean objectIsInvalid = isInvalidObject;
				this.cycComm.logger.finest("API status: " + status);
				if (this.cycComm.trace >= 2) {
					Log.current.println("cyc --> (" + status + ") " + taskProcessorResponse.toString());
				}
				if (taskProcessorResponse.equals((Object) this.ignoreMessage)) {
					continue;
				}
				try {
					if (this.cycComm.trace >= 1) {
						Log.current.println(CycConnection.df.format(new Date()) + "\n    Got response: (" + taskProcessorResponse + ")");
					}
					if (!(taskProcessorResponse.get(2) instanceof Integer)) {
						Log.current.println(CycConnection.df.format(new Date()) + "\n    Got invalid response id: (" + taskProcessorResponse + ")");
					}
					final Integer id = (Integer) taskProcessorResponse.get(2);
					final Object taskStatus = taskProcessorResponse.get(6);
					final Object finishedFlag = (taskProcessorResponse.size() > 7) ? taskProcessorResponse.get(7) : CycObjectFactory.t;
					final boolean finished = finishedFlag != CycObjectFactory.nil;
					final CycConnection.WaitingWorkerInfo waitingWorkerInfo = (WaitingWorkerInfo) this.cycComm.getWaitingReplyThreads().get(id);
					if (waitingWorkerInfo == null) {
						if (this.cycComm.trace < 1) {
							continue;
						}
						Log.current.println(CycConnection.df.format(new Date()) + "\n    Got response with no waiting working: (" + taskProcessorResponse + ")");
					} else {
						final SubLWorker worker = waitingWorkerInfo.getWorker();
						final Object response = waitingWorkerInfo.isReturnWholeTaskProcessorResponse ? taskProcessorResponse : taskProcessorResponse.get(5);
						final Runnable notificationTask = (Runnable) new NotificationTask(taskStatus, objectIsInvalid, worker, response, finished, id, this.cycComm);
						try {
							this.cycComm.apiPool.execute(notificationTask);
						} catch (RejectedExecutionException e3) {
							e3.printStackTrace();
							System.err.println("Rejected notification from " + worker);
						}
					}
				} catch (Exception xcpt) {
					if (this.isClosed || this.isClosing) {
						continue;
					}
					Log.current.errorPrintln(xcpt.getMessage());
					Log.current.printStackTrace(xcpt);
				}
			}
		} catch (Exception e) {
			closingException = e;
		} finally {
			if (closingException != null) {
				this.cycComm.logger.log(Level.SEVERE, "TaskProcessor terminated because of exception.", closingException);
			}
			this.cycComm.taskProcessingThreadDead = true;
			this.cycComm.logger.finer("TaskProcessor is closing now.");
			this.notifySetupCompleted(closingException);
			this.cycComm.forciblyUnblockAllWaitingWorkers(closingException);
			this.close();
		}
	}

	public synchronized void close() {
		if (this.isClosed) {
			return;
		}
		this.isClosed = true;
		if (this.cycComm.apiPool != null) {
			try {
				this.cycComm.apiPool.shutdownNow();
			} catch (Exception ex) {
			}
			try {
				this.cycComm.apiPool.setMaximumPoolSize(0);
			} catch (Exception ex2) {
			}
			try {
				this.cycComm.apiPool.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
			} catch (Exception ex3) {
			}
		}
		if (this.inboundOutputStream != null) {
			try {
				this.inboundOutputStream.close();
			} catch (Exception e) {
			} finally {
				this.inboundOutputStream = null;
			}
		}
		if (this.inboundStream != null) {
			try {
				this.inboundStream.close();
			} catch (Exception e) {
			} finally {
				this.inboundStream = null;
			}
		}
		if (this.cycComm.trace > 0) {
			Log.current.println("closed inbound socket associated with " + this.cycComm.uuid);
		}
	}

	private void waitOnSetupToComplete() {
		try {
			this.initializedSemaphore.acquire();
		} catch (InterruptedException xcpt) {
			this.initializationError = new IllegalStateException("Unable to initialize Cyc communication.");
			System.err.println("Interrupted during wait(): " + xcpt);
		}
		if (this.initializationError != null) {
			throw new CycApiException("Cannot start communications to Cyc.", (Throwable) this.initializationError);
		}
	}

	private void initializeSynchronization() {
		synchronized (this) {
			this.initialized = false;
			this.initializedSemaphore = new Semaphore(0);
		}
	}

	private void notifySetupCompleted(final Exception e) {
		synchronized (this) {
			this.initializationError = e;
			this.initialized = true;
		}
		this.initializedSemaphore.release();
	}
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\client-lib\opencyc-0.0.1-SNAPSHOT.jar
	Total time: 208 ms
	
	Decompiled with Procyon 0.5.32.
*/