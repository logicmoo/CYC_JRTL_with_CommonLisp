package org.appdapter.core.convert;

import java.lang.reflect.InvocationTargetException;

public class NoSuchConversionException extends InvocationTargetException {
	public Object objectWas;
	public Class objectNeededToBe;

	public NoSuchConversionException(Object obj, Class objNeedsToBe, Throwable e) {
		this("Cant convert " + obj + " to " + objNeedsToBe, e);
		objectWas = obj;
		objectNeededToBe = objNeedsToBe;
	}

	public NoSuchConversionException(Object obj, Class objNeedsToBe) {
		this("Cant convert " + obj + " to " + objNeedsToBe);
		objectWas = obj;
		objectNeededToBe = objNeedsToBe;
	}

	public NoSuchConversionException(String msg) {
		this(msg, new ClassCastException(msg));
	}

	public NoSuchConversionException(String msg, Throwable why) {
		super(why, msg);
	}
}
