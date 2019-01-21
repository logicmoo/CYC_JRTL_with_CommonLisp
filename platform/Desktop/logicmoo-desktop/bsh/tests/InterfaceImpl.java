package bsh.tests;

public class InterfaceImpl implements Interface
{
	@Override
	public String getString() { return "foo"; }
	@Override
	public Integer getInteger() { return new Integer(5); }
	@Override
	public int getPrimitiveInt() { return 7; }
	@Override
	public boolean getPrimitiveBool() { return true; }
	@Override
	public Object getNull() { return null; }
}

