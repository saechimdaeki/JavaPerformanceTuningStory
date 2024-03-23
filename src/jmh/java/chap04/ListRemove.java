package chap04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class ListRemove {
    int LOOP_COUNT = 10;
    List<Integer> arrayList;
    List<Integer> vector;
    LinkedList<Integer> linkedList;
    int result = 0;

    @Setup(Level.Trial)
    public void setUp() {
        arrayList = new ArrayList<>();
        vector = new Vector<>();
        linkedList = new LinkedList<>();

        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            arrayList.add(loop);
            vector.add(loop);
            linkedList.add(loop);
        }
    }

    @Benchmark
    public void removeArrayListFromFirst() {
        List<Integer> tempList = new ArrayList<>(arrayList);
        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            tempList.remove(0);
        }
    }

    @Benchmark
    public void removeVectorFromFirst() {
        List<Integer> tempList = new Vector<>(vector);
        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            tempList.remove(0);
        }
    }

    @Benchmark
    public void removeLinkedListFromFirst() {
        LinkedList<Integer> tempList = new LinkedList<>(linkedList);
        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            tempList.remove(0);
        }
    }

    @Benchmark
    public void removeArrayListFromLast() {
        List<Integer> tempList = new ArrayList<>(arrayList);
        for (int loop = LOOP_COUNT - 1; loop >= 0; loop--) {
            tempList.remove(loop);
        }
    }

    @Benchmark
    public void removeVectorFromLast() {
        List<Integer> tempList = new Vector<>(vector);
        for (int loop = LOOP_COUNT - 1; loop >= 0; loop--) {
            tempList.remove(loop);
        }
    }

    @Benchmark
    public void removeLinkedListFromLast() {
        LinkedList<Integer> tempList = new LinkedList<>(linkedList);
        for (int loop = LOOP_COUNT - 1; loop >= 0; loop--) {
            tempList.remove(loop);
        }
    }
}
