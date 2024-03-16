package chap02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import me.saechimdaeki.javaperformance.chap02.DummyData;

@BenchmarkMode({ Mode.AverageTime })
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class CompareTimerJMH {

    @Benchmark
    public DummyData makeObject(){
        Map<String, String> map = new HashMap<>(1000000);
        List<String> list = new ArrayList<>(1000000);
        return new DummyData(map, list);
    }
}
