package SxxMachine;

import java.io.IOException;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * import org.openjdk.jmh.annotations.Benchmark;

import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.*;
*/
// import com.eclipsesource.json.performancetest.caliper.CaliperRunner;
import com.google.caliper.Param;
//import com.google.caliper.Param;
//import com.google.caliper.BeforeExperiment
import com.google.caliper.SimpleBenchmark;

public class ArrayVsFieldsBenchmark extends SimpleBenchmark {

    @Param({ "19" })
    int size = 19;

    @Param({ "Fields", "Array", "FieldList" }) // Array list
    String type;

    private Bench list;

    //@Setup(org.openjdk.jmh.annotations.Level.Trial)
    //@BeforeExperiment
    @Override
    protected void setUp() throws IOException {
        if ("ArrayList".equals(type)) {
            list = new ArrayListBench(size);
        } else if ("Array".equals(type)) {
            list = new ArrayBench(size);
        } else if ("FieldList".equals(type)) {
            list = new FieldListBench(size);
        } else if ("Fields".equals(type)) {
            list = new FieldsBench(size);
        }
        list.toString();
    }

    public static void main(String[] args) throws IOException, Throwable {

        //        Options opt = new OptionsBuilder().include(ArrayVsFieldsBenchmark.class.getSimpleName()).build();
        //        if (true) {
        //            final Runner runner = new Runner(opt);
        //            runner.run();
        //
        //        } else
        args = new String[] { //"--debug",
                "--measureMemory", };
        {
            //            new CaliperRunner(ArrayVsFieldsBenchmark.class) //
            //                    .addParameterDefault("type", "Fields", "Array", "FieldList") // "ArrayList",
            //                    .addParameterDefault("size", "19") // , "100"
            //                    .exec(args);
        }
    }

    public interface Bench {

        void t_new(int size);

        void t_copy();

        void t_clone();

        void t_get();

        void t_set();

        void t_compare();

        void t_compare_by_int();

    }

    // @org.openjdk.jmh.annotations.Benchmark
    // @Group("g")
    // @GroupThreads(1)
    public void time_new(int reps) {
        for (int i = 0; i < reps * 1000; i++) {
            list.t_new(size);
        }
    }

    public void time_clone(int reps) {
        for (int i = 0; i < reps * 1000; i++) {
            list.t_clone();
        }
    }

    public void time_copy(int reps) {
        for (int i = 0; i < reps * 1000; i++) {
            list.t_copy();
        }
    }

    public void time_get(int reps) {
        for (int i = 0; i < reps * 1000; i++) {
            list.t_get();
        }
    }

    public void time_set(int reps) {

        for (int i = 0; i < reps * 1000; i++) {
            list.t_set();
        }
    }

    public void time_compare(int reps) {
        for (int i = 0; i < reps * 1000; i++) {
            list.t_compare();
        }
    }

    public void time_compare_index(int reps) {
        for (int i = 0; i < reps * 1000; i++) {
            list.t_compare_by_int();
        }
    }

    int c;

    /* prevent compiler from inlining */
    protected void dummy(String string) {
        c++;
        assert string != null;
    }

    protected void dummy(Object[] array) {
        c++;
        assert array != null;
    }

    public class FieldListBench implements Bench {
        final FieldList<String> a;
        FieldList<String> t;

        public FieldListBench(int size) {
            a = new FieldList<String>(size);
            t = a;
        }

        boolean wtrue;

        @Override
        public void t_new(int size) {
            t = new FieldList<String>(size);
            if (wtrue) {
                t.toString();
            }
        }

        @Override
        public void t_clone() {
            t = a.clone();
        }

        @Override
        public void t_compare_by_int() {
            for (int i = 0; i < size; i++) {
                compare(a, t, i);
            }
        }

        private boolean compare(FieldList<String> a, FieldList<String> b, int i) {
            return (a.get(i) != b.get(i));
        }

        @Override
        public void t_compare() {
            compare(a, t);
        }

        private boolean compare(FieldList<String> a, FieldList<String> b) {
            if (a.get(0) != b.get(0))
                return false;
            if (a.get(1) != b.get(1))
                return false;
            if (a.get(2) != b.get(2))
                return false;
            if (a.get(3) != b.get(3))
                return false;
            if (a.get(4) != b.get(4))
                return false;
            if (size < 6)
                return true;
            if (a.get(5) != b.get(5))
                return false;
            if (a.get(6) != b.get(6))
                return false;
            if (a.get(7) != b.get(7))
                return false;
            if (a.get(8) != b.get(8))
                return false;
            if (a.get(9) != b.get(9))
                return false;
            if (a.get(10) != b.get(10))
                return false;
            if (a.get(11) != b.get(11))
                return false;
            if (a.get(12) != b.get(12))
                return false;
            if (a.get(13) != b.get(13))
                return false;
            if (a.get(14) != b.get(14))
                return false;
            if (a.get(15) != b.get(15))
                return false;
            if (a.get(16) != b.get(16))
                return false;
            if (a.get(17) != b.get(17))
                return false;
            if (a.get(18) != b.get(18))
                return false;
            if (a.get(19) != b.get(19))
                return false;
            if (a.get(20) != b.get(20))
                return false;
            return true;
        }

        @Override
        public void t_copy() {
            t = a.copy();
        }

        @Override
        public void t_set() {
            dummy(a.set(0, "foo0"));
            dummy(a.set(1, "foo1"));
            dummy(a.set(2, "foo2"));
            dummy(a.set(3, "foo3"));
            dummy(a.set(4, "foo4"));
            if (size < 6)
                return;
            dummy(a.set(5, "foo5"));
            dummy(a.set(6, "foo6"));
            dummy(a.set(7, "foo7"));
            dummy(a.set(8, "foo8"));
            dummy(a.set(9, "foo9"));
            dummy(a.set(10, "foo10"));
            dummy(a.set(11, "foo11"));
            dummy(a.set(12, "foo12"));
            dummy(a.set(13, "foo13"));
            dummy(a.set(14, "foo14"));
            dummy(a.set(15, "foo15"));
            dummy(a.set(16, "foo16"));
            dummy(a.set(17, "foo17"));
            dummy(a.set(18, "foo18"));
            dummy(a.set(19, "foo19"));
            dummy(a.set(20, "foo20"));
        }

        @Override
        public void t_get() {
            dummy(a.get(0));
            dummy(a.get(1));
            dummy(a.get(2));
            dummy(a.get(3));
            dummy(a.get(4));
            if (size < 6)
                return;
            dummy(a.get(5));
            dummy(a.get(6));
            dummy(a.get(7));
            dummy(a.get(8));
            dummy(a.get(9));
            dummy(a.get(10));
            dummy(a.get(11));
            dummy(a.get(12));
            dummy(a.get(13));
            dummy(a.get(14));
            dummy(a.get(15));
            dummy(a.get(16));
            dummy(a.get(17));
            dummy(a.get(18));
            dummy(a.get(19));
            dummy(a.get(20));
        }

    }

    public class FieldsBench implements Bench {
        final FieldList<String> a;
        FieldList<String> t;

        public FieldsBench(int size) {
            a = new FieldList<String>(size);
            t = a;
        }

        boolean wtrue;

        @Override
        public void t_new(int size) {
            t = new FieldList<String>(size);
            if (wtrue) {
                t.toString();
            }
        }

        @Override
        public void t_clone() {
            t = a.clone();
        }

        @Override
        public void t_compare_by_int() {
            for (int i = 0; i < size; i++) {
                compare(a, t, i);
            }
        }

        private boolean compare(FieldList<String> a, FieldList<String> b, int i) {
            return (a.get(i) != b.get(i));
        }

        @Override
        public void t_compare() {
            compare(a, t);
        }

        private boolean compare(FieldList<String> a, FieldList<String> b) {
            if (a.a0 != b.a0)
                return false;
            if (a.a1 != b.a1)
                return false;
            if (a.a2 != b.a2)
                return false;
            if (a.a3 != b.a3)
                return false;
            if (a.a4 != b.a4)
                return false;
            if (size < 6)
                return true;
            if (a.a5 != b.a5)
                return false;
            if (a.a6 != b.a6)
                return false;
            if (a.a7 != b.a7)
                return false;
            if (a.a8 != b.a8)
                return false;
            if (a.a9 != b.a9)
                return false;
            if (a.a10 != b.a10)
                return false;
            if (a.a11 != b.a11)
                return false;
            if (a.a12 != b.a12)
                return false;
            if (a.a13 != b.a13)
                return false;
            if (a.a14 != b.a14)
                return false;
            if (a.a15 != b.a15)
                return false;
            if (a.a16 != b.a16)
                return false;
            if (a.a17 != b.a17)
                return false;
            if (a.a18 != b.a18)
                return false;
            if (a.a19 != b.a19)
                return false;
            if (a.a20 != b.a20)
                return false;
            return true;
        }

        @Override
        public void t_copy() {
            t = a.copy();
        }

        @Override
        public void t_set() {
            a.a0 = "foo0";
            a.a1 = "foo1";
            a.a2 = "foo2";
            a.a3 = "foo3";
            a.a4 = "foo4";
            if (size < 6)
                return;
            a.a5 = "foo5";
            a.a6 = "foo6";
            a.a7 = "foo7";
            a.a8 = "foo8";
            a.a9 = "foo9";
            a.a10 = "foo10";
            a.a11 = "foo11";
            a.a12 = "foo12";
            a.a13 = "foo13";
            a.a14 = "foo14";
            a.a15 = "foo15";
            a.a16 = "foo16";
            a.a17 = "foo17";
            a.a18 = "foo18";
            a.a19 = "foo19";
            a.a20 = "foo20";
        }

        @Override
        public void t_get() {
            dummy(a.a0);
            dummy(a.a1);
            dummy(a.a2);
            dummy(a.a3);
            dummy(a.a4);
            if (size < 6)
                return;
            dummy(a.a5);
            dummy(a.a6);
            dummy(a.a7);
            dummy(a.a8);
            dummy(a.a9);
            dummy(a.a10);
            dummy(a.a11);
            dummy(a.a12);
            dummy(a.a13);
            dummy(a.a14);
            dummy(a.a15);
            dummy(a.a16);
            dummy(a.a17);
            dummy(a.a18);
            dummy(a.a19);
            dummy(a.a20);
        }

    }

    public class ArrayBench implements Bench {
        final String[] a;
        String[] t;

        public ArrayBench(int size) {
            a = new String[21];
            t = a;
        }

        boolean wtrue;

        @Override
        public void t_new(int size) {
            t = new String[size];
            if (wtrue) {
                t.toString();
            }
        }

        @Override
        public void t_clone() {
            t = t.clone();
        }

        @Override
        public void t_compare_by_int() {
            for (int i = 0; i < size; i++) {
                compare(a, t, i);
            }
        }

        private boolean compare(String[] a, String[] b, int i) {
            return (a[i] != b[i]);
        }

        @Override
        public void t_compare() {
            compare(a, t);
        }

        private boolean compare(String[] a, String[] b) {
            return (Arrays.equals(a, b));
        }

        @Override
        public void t_copy() {
            t = new String[size];
            System.arraycopy(t, 0, a, 0, size);
        }

        @Override
        public void t_set() {
            a[0] = "foo0";
            a[1] = "foo1";
            a[2] = "foo2";
            a[3] = "foo3";
            a[4] = "foo4";
            if (size < 6)
                return;
            a[5] = "foo5";
            a[6] = "foo6";
            a[7] = "foo7";
            a[8] = "foo8";
            a[9] = "foo9";
            a[10] = "foo10";
            a[11] = "foo11";
            a[12] = "foo12";
            a[13] = "foo13";
            a[14] = "foo14";
            a[15] = "foo15";
            a[16] = "foo16";
            a[17] = "foo17";
            a[18] = "foo18";
            a[19] = "foo19";
            a[20] = "foo20";
        }

        @Override
        public void t_get() {
            dummy(a[0]);
            dummy(a[1]);
            dummy(a[2]);
            dummy(a[3]);
            dummy(a[4]);
            if (size < 6)
                return;
            dummy(a[5]);
            dummy(a[6]);
            dummy(a[7]);
            dummy(a[8]);
            dummy(a[9]);
            dummy(a[10]);
            dummy(a[11]);
            dummy(a[12]);
            dummy(a[13]);
            dummy(a[14]);
            dummy(a[15]);
            dummy(a[16]);
            dummy(a[17]);
            dummy(a[18]);
            dummy(a[19]);
            dummy(a[20]);
        }

    }

    public class ArrayListBench implements Bench {
        final ArrayList<String> a;
        ArrayList<String> t;

        public ArrayListBench(int size) {
            a = new ArrayList<String>(size + 20);
            t = a;
        }

        boolean wtrue;

        @Override
        public void t_new(int size) {
            t = new ArrayList<String>(size);
            if (wtrue) {
                t.toString();
            }
        }

        @Override
        public void t_clone() {
            t = (ArrayList<String>) a.clone();
        }

        @Override
        public void t_compare_by_int() {
            final int size = a.size();
            for (int i = 0; i < size; i++) {
                compare(a, t, i);
            }
        }

        private boolean compare(ArrayList<String> a, ArrayList<String> b, int i) {
            return (a.get(i) != b.get(i));
        }

        @Override
        public void t_compare() {
            compare(a, t);
        }

        private boolean compare(ArrayList<String> a, ArrayList<String> b) {
            final int size = a.size();
            if (size < 1) {
                new Exception("" + this).printStackTrace();
                return false;
            }
            if (a.get(0) != b.get(0))
                return false;
            if (a.get(1) != b.get(1))
                return false;
            if (a.get(2) != b.get(2))
                return false;
            if (a.get(3) != b.get(3))
                return false;
            if (a.get(4) != b.get(4))
                return false;
            if (size < 6)
                return true;
            if (a.get(5) != b.get(5))
                return false;
            if (a.get(6) != b.get(6))
                return false;
            if (a.get(7) != b.get(7))
                return false;
            if (a.get(8) != b.get(8))
                return false;
            if (a.get(9) != b.get(9))
                return false;
            if (a.get(10) != b.get(10))
                return false;
            if (a.get(11) != b.get(11))
                return false;
            if (a.get(12) != b.get(12))
                return false;
            if (a.get(13) != b.get(13))
                return false;
            if (a.get(14) != b.get(14))
                return false;
            if (a.get(15) != b.get(15))
                return false;
            if (a.get(16) != b.get(16))
                return false;
            if (a.get(17) != b.get(17))
                return false;
            if (a.get(18) != b.get(18))
                return false;
            if (a.get(19) != b.get(19))
                return false;
            if (a.get(20) != b.get(20))
                return false;
            return true;
        }

        @Override
        public void t_copy() {
            t = new ArrayList(a);
        }

        @Override
        public void t_set() {
            final int size = a.size();
            if (size < 1) {
                new Exception("" + this).printStackTrace();
                return;
            }
            dummy(a.set(0, "foo0"));
            dummy(a.set(1, "foo1"));
            dummy(a.set(2, "foo2"));
            dummy(a.set(3, "foo3"));
            dummy(a.set(4, "foo4"));
            if (size < 6)
                return;
            dummy(a.set(5, "foo5"));
            dummy(a.set(6, "foo6"));
            dummy(a.set(7, "foo7"));
            dummy(a.set(8, "foo8"));
            dummy(a.set(9, "foo9"));
            dummy(a.set(10, "foo10"));
            dummy(a.set(11, "foo11"));
            dummy(a.set(12, "foo12"));
            dummy(a.set(13, "foo13"));
            dummy(a.set(14, "foo14"));
            dummy(a.set(15, "foo15"));
            dummy(a.set(16, "foo16"));
            dummy(a.set(17, "foo17"));
            dummy(a.set(18, "foo18"));
            dummy(a.set(19, "foo19"));
            dummy(a.set(20, "foo20"));
        }

        @Override
        public void t_get() {
            final int size = a.size();
            if (size < 1) {
                new Exception("" + this).printStackTrace();
                return;
            }
            dummy(a.get(0));
            dummy(a.get(1));
            dummy(a.get(2));
            dummy(a.get(3));
            dummy(a.get(4));
            if (size < 6)
                return;
            dummy(a.get(5));
            dummy(a.get(6));
            dummy(a.get(7));
            dummy(a.get(8));
            dummy(a.get(9));
            dummy(a.get(10));
            dummy(a.get(11));
            dummy(a.get(12));
            dummy(a.get(13));
            dummy(a.get(14));
            dummy(a.get(15));
            dummy(a.get(16));
            dummy(a.get(17));
            dummy(a.get(18));
            dummy(a.get(19));
            dummy(a.get(20));
        }

    }

}

class FieldList<T> extends AbstractList<T> implements Cloneable, Serializable {

    private int size;
    final int arsize;

    T a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20;

    @Override
    public Object[] toArray() {
        switch (arsize) {
            case 0:
                return new Object[] {};
            case 1:
                return new Object[] { a0, };
            case 2:
                return new Object[] { a0, a1, };
            case 3:
                return new Object[] { a0, a1, a2, };
            case 4:
                return new Object[] { a0, a1, a2, a3, };
            case 5:
                return new Object[] { a0, a1, a2, a3, a4, };
            case 6:
                return new Object[] { a0, a1, a2, a3, a4, a5, };
            case 7:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, };
            case 8:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, };
            case 9:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, };
            case 10:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, };
            case 11:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, };
            case 12:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, };
            case 13:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, };
            case 14:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, };
            case 15:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, };
            case 16:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, };
            case 17:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, };
            case 18:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, };
            case 19:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17,
                        a18, };
            case 20:
                return new Object[] { a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17,
                        a18, a19, };

        }
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <U extends Object> U[] toArray(U[] a) {
        if (arsize == 0)
            return a;
        a[0] = (U) a0;
        if (arsize == 1)
            return a;
        a[1] = (U) a1;
        if (arsize == 2)
            return a;
        a[2] = (U) a2;
        if (arsize == 3)
            return a;
        a[3] = (U) a3;
        if (arsize == 4)
            return a;
        a[4] = (U) a4;
        if (arsize == 5)
            return a;
        a[5] = (U) a5;
        if (arsize == 6)
            return a;
        a[6] = (U) a6;
        if (arsize == 7)
            return a;
        a[7] = (U) a7;
        if (arsize == 8)
            return a;
        a[8] = (U) a8;
        if (arsize == 9)
            return a;
        a[9] = (U) a9;
        if (arsize == 10)
            return a;
        a[10] = (U) a10;
        if (arsize == 11)
            return a;
        a[11] = (U) a11;
        if (arsize == 12)
            return a;
        a[12] = (U) a12;
        if (arsize == 13)
            return a;
        a[13] = (U) a13;
        if (arsize == 14)
            return a;
        a[14] = (U) a14;
        if (arsize == 15)
            return a;
        a[15] = (U) a15;
        if (arsize == 16)
            return a;
        a[16] = (U) a16;
        if (arsize == 17)
            return a;
        a[17] = (U) a17;
        if (arsize == 18)
            return a;
        a[18] = (U) a18;
        if (arsize == 19)
            return a;
        a[19] = (U) a19;
        if (arsize == 20)
            return a;
        a[20] = (U) a20;

        return a;
    }

    public FieldList(int size) {
        this.arsize = size;
        this.size = 0;
    }

    @Override
    public boolean add(T e) {
        set(size, e);
        size++;
        return (size <= arsize);
    }

    @Override
    public T set(int index, T v) {
        switch (index) {

            case 0:
                return a0 = v;
            case 1:
                return a1 = v;
            case 2:
                return a2 = v;
            case 3:
                return a3 = v;
            case 4:
                return a4 = v;
            case 5:
                return a5 = v;
            case 6:
                return a6 = v;
            case 7:
                return a7 = v;
            case 8:
                return a8 = v;
            case 9:
                return a9 = v;
            case 10:
                return a10 = v;
            case 11:
                return a11 = v;
            case 12:
                return a12 = v;
            case 13:
                return a13 = v;
            case 14:
                return a14 = v;
            case 15:
                return a15 = v;
            case 16:
                return a16 = v;
            case 17:
                return a17 = v;
            case 18:
                return a18 = v;
            case 19:
                return a19 = v;
            case 20:
                return a20 = v;
        }
        return v;
    }

    @Override
    public T get(int index) {
        switch (index) {
            case 0:
                return a0;
            case 1:
                return a1;
            case 2:
                return a2;
            case 3:
                return a3;
            case 4:
                return a4;
            case 5:
                return a5;
            case 6:
                return a6;
            case 7:
                return a7;
            case 8:
                return a8;
            case 9:
                return a9;
            case 10:
                return a10;
            case 11:
                return a11;
            case 12:
                return a12;
            case 13:
                return a13;
            case 14:
                return a14;
            case 15:
                return a15;
            case 16:
                return a16;
            case 17:
                return a17;
            case 18:
                return a18;
            case 19:
                return a19;
            case 20:
                return a20;

        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public FieldList<T> clone() {
        try {
            return (FieldList<T>) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return this;
    }

    public FieldList<T> copy() {
        return clone();
    }
}