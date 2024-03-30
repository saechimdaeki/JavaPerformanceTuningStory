package chap05;

import java.util.Random;
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
public class ConditionIf {
    int LOOP_COUNT = 1000;
    String current;

    @Benchmark
    public void randomOnly() {
        Random random = new Random();
        int data = 1000 + random.nextInt();
        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            resultProcess("dummy");
        }
    }

    @Benchmark
    public void if10() {
        Random random = new Random();
        String result = null;
        int data = 1000 + random.nextInt();
        for (int loop = 0; loop < LOOP_COUNT; loop++) {
            if (data < 50) {
                result = "50";
            } else if (data < 150) {
                result = "150";
            } else if (data < 250) {
                result = "250";
            } else if (data < 350) {
                result = "350";
            } else if (data < 450) {
                result = "450";
            } else if (data < 550) {
                result = "550";
            } else if (data < 650) {
                result = "650";
            } else if (data < 750) {
                result = "750";
            } else if (data < 850) {
                result = "850";
            } else if (data < 950) {
                result = "950";
            } else {
                result = "over";
            }
            resultProcess(result);
        }
    }

    public void resultProcess(String result) {
        current = result;
    }

    @Benchmark
    public int getMonthNumber(String str) {
        int month = -1;
        switch (str) {
            case "January":
                month = 1;
                break;
            case "February":
                month = 2;
                break;
            case "March":
                month = 3;
                break;
            case "April":
                month = 4;
                break;
            case "May":
                month = 5;
                break;
            case "June":
                month = 6;
                break;
            case "July":
                month = 7;
                break;
            case "August":
                month = 8;
                break;
            case "September":
                month = 9;
                break;
            case "October":
                month = 10;
                break;
            case "November":
                month = 11;
                break;
            case "December":
                month = 12;
                break;
        }
        return month;
    }
}
