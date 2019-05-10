package org.logicmoo.system;

public interface JNIEnvInterface {

	public boolean[] CallBooleanArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public boolean CallBooleanMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public byte[] CallByteArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public byte CallByteMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public char[] CallCharArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public char CallCharMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public Class CallClassMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public double[] CallDoubleArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public double CallDoubleMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public float CallFloatMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public int[] CallIntArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public int CallIntMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public long[] CallLongArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public long CallLongMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public Object[] CallObjectArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public Object CallObjectMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public short[] CallShortArrayMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public short CallShortMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public boolean[] CallStaticBooleanArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public boolean CallStaticBooleanMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public byte[] CallStaticByteArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public byte CallStaticByteMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public char[] CallStaticCharArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public char CallStaticCharMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public Class CallStaticClassMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public double[] CallStaticDoubleArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public double CallStaticDoubleMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public float CallStaticFloatMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public int[] CallStaticIntArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public int CallStaticIntMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public long[] CallStaticLongArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public long CallStaticLongMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public Object[] CallStaticObjectArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public Object CallStaticObjectMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public short[] CallStaticShortArrayMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public short CallStaticShortMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public String CallStaticStringMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public void CallStaticVoidMethod(Class clazz, int methodint, Object[] args) throws Throwable;

	public String CallStringMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public void CallVoidMethod(Object thiz, int methodint, Object[] args) throws Throwable;

	public abstract String[] getFieldNames();

	public abstract String[] getMethodsNames();

	public abstract int getStaticSubLMethodInt(String me, String javaMethodName, String lispSymbolName, int minArgs, int optionalArgs, boolean usesRest);

	public abstract int getSubLMethodInt(String me, String javaMethodName, String lispSymbolName, int minArgs, int optionalArgs, boolean usesRest);

	public abstract boolean isInstance(Object object);

}
