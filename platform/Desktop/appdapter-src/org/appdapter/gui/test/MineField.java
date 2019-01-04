package org.appdapter.gui.test;

import java.io.PrintStream;
import java.io.PrintWriter;

public class MineField extends Error {
	String message;
	Throwable e;
	int throwLevel = 0;

	public MineField() {
		this("Defualt field", new Error("I caused this"));
	}

	private MineField(MineField mf) {
		this(mf.message, mf.e);
		throwLevel = mf.throwLevel;
	}

	public MineField(String m, Throwable t) {
		super(m, t);
		e = t;
	}

	@Override public boolean equals(Object obj) {
		rethrowThisMaybe();
		if (true)
			return false;
		return super.equals(obj);
	}

	@Override public Throwable getCause() {
		if (true)
			new MineField(e.getMessage(), e);
		rethrowThisMaybe();
		return super.getCause();
	}

	@Override public String getMessage() {
		rethrowThisMaybe();
		return super.getMessage();
	}

	@Override public String getLocalizedMessage() {
		rethrowThisMaybe();
		return super.getLocalizedMessage();
	}

	@Override public StackTraceElement[] getStackTrace() {
		rethrowThisMaybe();
		return super.getStackTrace();
	}

	@Override public synchronized Throwable initCause(Throwable cause) {
		rethrowAllways();
		return super.initCause(cause);
	}

	@Override public int hashCode() {
		rethrowThisMaybe();
		return super.hashCode();
	}

	@Override public void printStackTrace() {
		rethrowThisMaybe();
		super.printStackTrace();
	}

	@Override public void printStackTrace(PrintStream s) {
		rethrowThisMaybe();
		super.printStackTrace(s);
	}

	@Override public void printStackTrace(PrintWriter s) {
		rethrowThisMaybe();
		super.printStackTrace(s);
	}

	@Override public synchronized Throwable fillInStackTrace() {
		rethrowThisMaybe();
		return super.fillInStackTrace();
	}

	@Override public void setStackTrace(StackTraceElement[] stackTrace) {
		rethrowThisNever();
		super.setStackTrace(stackTrace);
	}

	@Override public String toString() {
		rethrowThisMaybe();
		return super.toString();
	}

	@Override protected Object clone() throws CloneNotSupportedException {
		rethrowThisMaybe();
		if (true)
			return make();
		return super.clone();
	}

	@Override protected void finalize() throws Throwable {
		rethrowAllways();
		super.finalize();
	}

	void rethrowThisMaybe() {
		if (throwLevel != 1)
			rethrowAllways();
		if (throwLevel == 2)
			throw make();
	}

	void rethrowThisNever() {

	}

	void rethrowAllways() {
		if (throwLevel == 1)
			throw make();
	}

	MineField make() {
		return new MineField(this);
	}

	public void setThrowLevel(int always2Maybe1) {
		throwLevel = always2Maybe1;
	}

	public int getThrowLevel() {
		return throwLevel;
	}
}