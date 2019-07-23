/* For LarKC */
package com.cyc.tool.subl.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

public class DefaultEmbeddedCycServer implements EmbeddedCycServer {
	public DefaultEmbeddedCycServer() {
		isInitialized = false;
		isShutdown = false;
	}

	public static void evalInApi(String clientUUIDStr, InputStream requestStream, OutputStream response)
			throws SubLException {
		SubLInputStream inStream = SubLObjectFactory.makeInputTextStream(requestStream);
		SubLOutputStream outStream = SubLObjectFactory.makeOutputTextStream(response);
		SubLString sublUUID = SubLObjectFactory.makeString(clientUUIDStr);
		SubLObject register_java_api_passive_socket = SubLSymbolFactory.makeSymbol("REGISTER-JAVA-API-PASSIVE-SOCKET");
		Functions.funcall(register_java_api_passive_socket, sublUUID, inStream, outStream);
		SubLObject cfasl_fake_server_loop_one_step = SubLSymbolFactory.makeSymbol("CFASL-FAKE-SERVER-LOOP-ONE-STEP");
		Functions.funcall(cfasl_fake_server_loop_one_step, inStream, outStream);
	}

	public static void evalInApiInSubLThread(final String clientUUIDStr, final InputStream request,
			final OutputStream response) throws SubLException {
		if (SubLThread.currentThreadIsSubL()) {
			final ArrayList<SubLObject> result = new ArrayList<SubLObject>(1);
			final ArrayList<SubLException> resultException = new ArrayList<SubLException>(1);
			final CountDownLatch cdl = new CountDownLatch(1);
			SubLObjectFactory.makeProcess(SubLObjectFactory.makeString("Eval Process"), new Runnable() {
				@Override
				public void run() {
					Throwable ex = null;
					boolean isEmpty = true;
					try {
						synchronized (result) {
							DefaultEmbeddedCycServer.evalInApi(clientUUIDStr, request, response);
							result.add(SubLT.T);
							isEmpty = false;
						}
					} catch (Throwable t) {
						ex = t;
					} finally {
						if (isEmpty)
							synchronized (resultException) {
								if (ex != null) {
									if (ex instanceof SubLException)
										resultException.add((SubLException) ex);
									else
										resultException.add(SubLObjectFactory.makeException(ex.getMessage(), ex));
								} else
									resultException.add(SubLObjectFactory
											.makeException("Internal error: unable to find expected exception."));
							}
						cdl.countDown();
					}
				}
			});
			try {
				cdl.await();
			} catch (InterruptedException ie) {
				SubLThread.currentThread().interrupt();
				return;
			}
			synchronized (resultException) {
				if (!resultException.isEmpty()) {
					SubLException e = resultException.get(0);
					e.fillInStackTrace();
					throw e;
				}
			}
			synchronized (result) {
				if (result.isEmpty())
					throw new RuntimeException("Internal error: no result found from worker thread.");
			}
		} else
			evalInApi(clientUUIDStr, request, response);
	}

	private volatile boolean isInitialized;
	private volatile boolean isShutdown;

	@Override
	public synchronized void initialize(String cycBaseDir, String[] args) {
		if (isInitialized || isShutdown)
			return;
		SubLMain.embeddedMain(args);
		while (!SubLMain.isFullyInitialized())
			Thread.yield();
		Eval.eval("(csetq *avoid-api-quit?* t)");
		Eval.eval("(csetq *cyc-home-directory* \"" + cycBaseDir + "\")");
		isInitialized = true;
	}

	@Override
	public void processRequest(String clientUUIDStr, InputStream request, OutputStream response) throws SubLException {
		if (!isInitialized || isShutdown)
			throw new IllegalStateException(
					"Attempt to call processRequest() on and unitialitized or closed embedded Cyc server.");
		evalInApiInSubLThread(clientUUIDStr, request, response);
	}

	@Override
	public synchronized void shutdown() {
		if (!isInitialized || isShutdown)
			return;
		try {
			SubLMain.me.doSystemCleanupAndExit(0);
		} catch (Exception e) {
		} finally {
			isShutdown = true;
		}
	}
}
