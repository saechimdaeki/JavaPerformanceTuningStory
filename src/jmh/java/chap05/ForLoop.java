package chap05;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class ForLoop {
    int LOOP_COUNT = 100000;
    List<Integer> list;
    int current;

    @Setup
    public void setUp() {
        list = new ArrayList<>(LOOP_COUNT);
        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            list.add(loop);
        }
    }

    @Benchmark
    public void traditionalForLoop() {
        int listSize = list.size();
        for (int loop = 0; loop < listSize; loop++) {
            resultProcess(list.get(loop));
        }
    }

    @Benchmark
    public void traditionalSizeForLoop() {
        for (int loop = 0; loop < list.size(); loop++) {
            resultProcess(list.get(loop));
        }
    }

    @Benchmark
    public void timeForEachLoop() {
        for (int value : list) {
            resultProcess(value);
        }
    }

    public void resultProcess(int result) {
        current = result;
    }
}
