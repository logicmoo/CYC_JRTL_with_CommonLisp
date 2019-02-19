package SxxMachine.pterm;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mutex {

    private static final ConcurrentMap<String, Lock> LOCKS = new ConcurrentHashMap<String, Lock>();

    public static Lock getInstance() {
        return new ReentrantLock();
    }

    public static Lock getInstance(String name) {
        Lock lock = LOCKS.get(name);
        if (lock != null) {
            return lock;
        }
        Lock newLock = getInstance();
        lock = LOCKS.putIfAbsent(name, newLock);
        if (lock == null) {
            lock = newLock;
        }
        return lock;
    }
}
