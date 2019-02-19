package SxxMachine;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class CachedMemoizer<T, U> {

    private final Map<T, U> cache = new ConcurrentHashMap<>();

    private CachedMemoizer() {
    }

    private Function<T, U> doMemoize(final Function<T, U> function) {
        return input -> cache.computeIfAbsent(input, function::apply);
    }

    public static <T, U> Function<T, U> memoize(final Function<T, U> function) {
        return new CachedMemoizer<T, U>().doMemoize(function);
    }

    public static class Examples {
        // example use
        Integer longCalculation(Integer x) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException ignored) {
            }
            return x * 2;
        }

        Function<Integer, Integer> f = this::longCalculation;
        Function<Integer, Integer> g = CachedMemoizer.memoize(f);

        public void automaticMemoizationExample() {
            long startTime = System.currentTimeMillis();
            Integer result1 = g.apply(1);
            long time1 = System.currentTimeMillis() - startTime;
            startTime = System.currentTimeMillis();
            Integer result2 = g.apply(1);
            long time2 = System.currentTimeMillis() - startTime;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(time1);
            System.out.println(time2);
        }

        Function<Integer, Function<Integer, Function<Integer, Integer>>> f3 = x -> y -> z -> longCalculation(x)
                + longCalculation(y) - longCalculation(z);
        Function<Integer, Function<Integer, Function<Integer, Integer>>> f3m = memoize(x -> memoize(y -> memoize(z -> longCalculation(x)
                + longCalculation(y) - longCalculation(z))));

        public void automaticMemoizationExample2() {
            long startTime = System.currentTimeMillis();
            Integer result1 = f3m.apply(2).apply(3).apply(4);
            long time1 = System.currentTimeMillis() - startTime;
            startTime = System.currentTimeMillis();
            Integer result2 = f3m.apply(2).apply(3).apply(4);
            long time2 = System.currentTimeMillis() - startTime;
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(time1);
            System.out.println(time2);
        }
    }
}
