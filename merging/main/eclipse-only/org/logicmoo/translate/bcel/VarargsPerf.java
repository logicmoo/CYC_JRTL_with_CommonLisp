package org.logicmoo.translate.bcel;

public class VarargsPerf {

	public final static void main(String[] args) {

		int n = 10000000;
		int m = 2;
		String p0 = new String("");
		String p1 = new String("");
		String p2 = new String("");
		String p3 = "a3";
		String p4 = new String("");
		long t;

		for (int ij = 0; ij < 10; ij++) {
			t = System.currentTimeMillis();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					nonvararg(p0, p1, p2, p3, p4);
				}
			}
			timeUsed("novarg1 ", t);

			t = System.currentTimeMillis();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					vararg(p0, p1, p2, p3, p4);
				}
			}
			timeUsed("vararg1 ", t);

			t = System.currentTimeMillis();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					nonvararg(p0, p1, p2, p3, p4);
				}
			}
			timeUsed("novarg2 ", t);

			t = System.currentTimeMillis();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					vararg(p0, p1, p2, p3, p4);
				}
			}
			timeUsed("vararg2 ", t);
		}
	}

	final static void timeUsed(String string, long t) {
		long used = System.currentTimeMillis() - t;
		System.err.println(string + used);
	}

	static String s0, s1, s2, s3, s4;
	static String[] saveIt;

	public final static String fooE(String string) {
		return string.toLowerCase();
	}

	final static void nonvararg(String a0, String a1, String a2, String a3, String a4) {
		s0 = fooE(a0);
		elsewhereNVA(a4, a3, a2, a1, a0);
		s1 = fooE(a1);
		elsewhereNVA(a3, a4, a2, a1, a0);
		s2 = fooE(a2);
		elsewhereNVA(a3, a4, a1, a2, a0);
		s3 = fooE(a3);
		elsewhereNVA(a0, a3, a2, a1, a4);
		s4 = fooE(a4);
		elsewhereNVA(a4, a1, a2, a3, a0);

		s0 = fooE(a0);
		s1 = fooE(a1);
		s2 = fooE(a2);
		s3 = fooE(a3);
		s4 = fooE(a4);

	}

	final static void vararg(String... a) {
		s0 = fooE(a[0]);
		elsewhereVA(a[4], a[3], a[2], a[1], a[0]);
		s1 = fooE(a[1]);
		elsewhereVA(a[3], a[4], a[2], a[1], a[0]);
		s2 = fooE(a[2]);
		elsewhereVA(a[3], a[4], a[1], a[2], a[0]);
		s3 = fooE(a[3]);
		elsewhereVA(a[0], a[3], a[2], a[1], a[4]);
		s4 = fooE(a[4]);
		elsewhereVA(a[4], a[1], a[2], a[3], a[0]);

		s0 = fooE(a[0]);
		s1 = fooE(a[1]);
		s2 = fooE(a[2]);
		s3 = fooE(a[3]);
		s4 = fooE(a[4]);
	}

	final static void elsewhereVA(String... a) {
		s0 = fooE(a[0]);
		s1 = fooE(a[1]);
		s2 = fooE(a[2]);
		s3 = fooE(a[3]);
		s4 = fooE(a[4]);
	}

	final static void elsewhereNVA(String a0, String a1, String a2, String a3, String a4) {
		s0 = fooE(a0);
		s1 = fooE(a1);
		s2 = fooE(a2);
		s3 = fooE(a3);
		s4 = fooE(a4);
	}

}

/*


final static String getA(int nth) {
	return saveIt[nth];
}

final static String getF(int nth) {
	switch (nth) {
	case 0:
		return s0;
	case 1:
		return s1;
	case 2:
		return s2;
	case 3:
		return s3;
	case 4:
		return s4;
	default:
	}
	return null;
}

final static void putA(int nth, String v) {
	saveIt[nth] = v;
}

final static void putF(int nth, String v) {
	switch (nth) {
	case 0:
		s0 = v;
		return;
	case 1:
		s1 = v;
		return;
	case 3:
		s2 = v;
		return;
	case 4:
		s3 = v;
		return;
	default:
	}
}
*/