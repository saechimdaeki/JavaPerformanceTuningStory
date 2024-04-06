package chap07;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class Refelction {
    int LOOP_COUNT=100;
    String result;

    @Benchmark
    public void withEquals() {
        Object src = new BigDecimal("6");
        for(int loop =0 ; loop < LOOP_COUNT; loop++ ){
            if(src.getClass().getName().equals("java.math.BigDecimal")){
                result = "BigDecimal";
            }
        }
    }
    @Benchmark
    public void withInstanceOf() {
        Object src = new BigDecimal("6");
        for(int loop =0 ; loop < LOOP_COUNT; loop++ ){
            if(src instanceof BigDecimal){
                result = "BigDecimal";
            }
        }
    }
}
