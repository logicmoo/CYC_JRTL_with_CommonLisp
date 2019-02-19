package SxxMachine;

/*******************************************************************************
 * Copyright (c) 2014 EclipseSource.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Ralf Sternberg - initial implementation and API
 ******************************************************************************/

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.google.caliper.Param;
import com.google.caliper.SimpleBenchmark;

public class ArrayVsListBenchmark extends SimpleBenchmark {

    @Param
    int size;
    @Param
    String type;

    private String[] array;
    private List<String> list;

    int c;

    @Override
    protected void setUp() throws IOException {
        array = new String[size];
        new_type();

        for (int i = 0; i < size; i++) {
            array[i] = "item" + i;
            list.add(array[i]);
        }
    }

    private void new_type() {
        if ("ArrayList".equals(type)) {
            list = new ArrayList<>(size);
        } else if ("LinkedList".equals(type)) {
            list = new LinkedList<>();
        } else if ("Vector".equals(type)) {
            list = new Vector<>(size);
        } else if ("ObjectList".equals(type)) {
            list = new ObjectList(size);
        } else if ("FieldList".equals(type)) {
            list = new FieldList(0);
        }
    }

    public void time_new_type(int reps) {
        for (int i = 0; i < reps; i++) {
            new_type();
        }
    }

    public void time_array_load(int reps) {
        String[] a = fooA();
        for (int i = 0; i < reps; i++) {
            loadObj(a);
        }
    }

    public void time_array_load2(int reps) {
        for (int i = 0; i < reps; i++) {
            loadObj2(new FieldList<String>(20));
        }
    }

    private void loadObj2(FieldList<String> fl) {
        fl.a0 = "foo0";
        fl.a1 = "foo1";
        fl.a2 = "foo2";
        fl.a3 = "foo3";
        fl.a4 = "foo4";
        fl.a5 = "foo5";
        fl.a6 = "foo6";
        fl.a7 = "foo7";
        fl.a8 = "foo8";
        fl.a9 = "foo9";
        fl.a10 = "foo10";
        fl.a11 = "foo11";
        fl.a12 = "foo12";
        fl.a13 = "foo13";
        fl.a14 = "foo14";
        fl.a15 = "foo15";
        fl.a16 = "foo16";
        fl.a17 = "foo17";
        fl.a18 = "foo18";
        fl.a19 = "foo19";
        fl.a20 = "foo20";
    }

    private void loadObj(Object[] a) {
        a[0] = "foo0";
        a[1] = "foo1";
        a[2] = "foo2";
        a[3] = "foo3";
        a[4] = "foo4";
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

    String foo() {
        return "foo";
    }

    private String[] fooA() {
        return new String[21];
    }

    public void time_get_elements(int reps) {
        for (int i = 0; i < reps; i++) {
            for (int j = 0; j < size; i++) {
                dummy(list.get(j));
            }
        }
    }

    public void time_set_elements(int reps) {
        final String v = "foo";
        for (int i = 0; i < reps; i++) {
            for (int j = 0; j < size; i++) {
                dummy(list.set(j, v));
            }
        }
    }

    public void time_toArray(int reps) {
        for (int i = 0; i < reps; i++) {
            dummy(list.toArray());
        }
    }

    public void time_toArray_with_size(int reps) {
        for (int i = 0; i < reps; i++) {
            dummy(list.toArray(new String[list.size()]));
        }
    }

    public void time_toArray_empty_array(int reps) {
        for (int i = 0; i < reps; i++) {
            dummy(list.toArray(new String[0]));
        }
    }

    public void time_new_ArrayList(int reps) {
        for (int i = 0; i < reps; i++) {
            dummy(new ArrayList<>(list));
        }
    }

    public void time_unmodifiable_Wrapper(int reps) {
        for (int i = 0; i < reps; i++) {
            dummy(Collections.unmodifiableList(list));
        }
    }

    /* prevent compiler from inlining */
    protected void dummy(String string) {
        c++;
        assert string != null;
    }

    protected void dummy(Object[] array) {
        c++;
        assert array != null;
    }

    protected void dummy(List<?> list) {
        c++;
        assert list != null;
    }

    public static void main(String[] args) throws IOException {
        //        new CaliperRunner(ArrayVsListBenchmark.class) //
        //                .addParameterDefault("type", "ArrayList", "ObjectList", "FieldList", "Vector", "LinkedList") //
        //                .addParameterDefault("size", "5", "20") // , "100"
        //                .exec(args);
    }

}

class ObjectList<T> extends ArrayList<T> {

    /**
     *
     */
    private static final long serialVersionUID = 2792925993642564894L;
    T[] data;

    public ObjectList(int size) {
        super(size);
        getData();
    }

    private void getData() {
        try {
            Field declaredField = getClass().getSuperclass().getDeclaredField("elementData");
            declaredField.setAccessible(true);
            data = (T[]) declaredField.get(this);
        } catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public boolean add(T e) {
        // TODO Auto-generated method stub
        final boolean add = super.add(e);
        getData();
        return add;

    }

    @Override
    public T set(int index, T element) {
        data[index] = element;
        return element;
    }

    @Override
    public T get(int index) {
        // TODO Auto-generated method stub
        return data[index];
    }

    @Override
    public int size() {
        return data.length;
    }

}