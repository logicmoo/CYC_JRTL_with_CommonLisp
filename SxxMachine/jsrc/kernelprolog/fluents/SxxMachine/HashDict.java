package SxxMachine;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * General purpose dictionary
 */
public class HashDict {
    public HashDict(Map map2) {
        map = map2;
    }

    public HashDict() {
        this(new HashMap());
    }

    public String name() {
        return getClass().getName() + hashCode();
    }

    public String stat() {
        return "BlackBoard: " + size();
    }

    // @Override
    public HashDict toClone() {
        // soopsy();
        // HashDict other = (HashDict) super.toClone();
        HashMap map2 = new HashMap();
        HashDict other = new HashDict(map2);
        map.putAll(map2);
        return other;
    }

    public int size() {
        // if (super.size() != map.size()) {
        // oopsy();
        // }
        return map.size();
    }

    public Object get(Object k) {
        Object o1 = map.get(k);
        // Object o2 = super.get(k);
        // if (o1 != o2) {
        // oopsy();
        // }
        return o1;
    }

    public Object put(Object k, Object v) {
        Object o1 = map.put(k, v);
        // Object o2 = super.put(k, v);
        // if (o1 != o2) {
        // oopsy();
        // }
        return o1;
    }

    public void remove(String k) {
        // super.remove(k);
        map.remove(k);
    }

    public Set keySet() {
        // if (map.keySet().size() != super.keySet().size()) {
        // oopsy();
        // }
        return map.keySet();
    }

    final Map map;

    public boolean isEmpty() {
        // if (super.isEmpty() != map.isEmpty()) {
        // oopsy();
        // }
        return map.isEmpty();
    }

    //    private void oopsy() {
    //        new Exception().printStackTrace();
    //    }

}
