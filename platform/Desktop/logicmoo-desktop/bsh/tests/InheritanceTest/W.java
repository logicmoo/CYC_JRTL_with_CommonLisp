package bsh.tests. InheritanceTest;

class W implements B {
	@Override
	public void a() {
		System.out.println("W.a()");
	}
	@Override
	public void b() {
		System.out.println("W.b()");
	}
	public void w() {
		System.out.println("W.w()");
	}
	void w_() {
		System.out.println("W.w_()");
	}
}
