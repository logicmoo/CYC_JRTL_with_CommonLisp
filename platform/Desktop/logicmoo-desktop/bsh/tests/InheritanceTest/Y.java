package bsh.tests. InheritanceTest;

public class Y extends X implements C {
	@Override
	public void c() {
		System.out.println("Y.c()");
	}
	public void y() {
		System.out.println("Y.y()");
	}
	void y_() {
		System.out.println("Y.y_()");
	}
}
