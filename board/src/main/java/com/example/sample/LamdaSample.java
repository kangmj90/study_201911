package com.example.sample;

import lombok.Data;

import java.util.function.BiFunction;

/**
 * @author kangminjeong
 * @since 2019. 11. 12.
 */
@Data
public class LamdaSample {
    private Long i;
    private Long j;

    public Long add1 (Long i,  Long j) {
        return i + j;
    }

    public void print() {

//        ver 1
        System.out.println("add(1, 2) = " + add1(1L, 2L));

//        ver 2
        Calc calc1 = (i, j) -> {
            return i + j;
        };

        Calc calc2 = (i,  j) -> i + j;

        Calc calc3 = (i, j) -> {
            return sum(i, j);
        };

        Calc calc4 = (i, j) -> sum(i, j);

        System.out.println("calc1.add(3, 4) = " + calc1.add(3L, 4L));
        System.out.println("calc2.add(3, 4) = " + calc2.add(3L, 4L));
        System.out.println("calc3.add(5, 6) = " + calc3.add(5L, 6L));
        System.out.println("calc4.add(5, 6) = " + calc4.add(5L, 6L));

        BiFunction<Long, Long, Long> bf = (i, j) -> {
            return i + j;
        };

        System.out.println("bf.apply(7L, 8L) = " + bf.apply(7L, 8L));
    }

    public static Long sum (Long i, Long j) {
        return i + j;
    }

    @FunctionalInterface
    public interface Calc {
        public Long add (Long i,  Long j);

//        public Long minus (Long i, Long j);
    }

    public static void main(String[] args) {
        LamdaSample sample = new LamdaSample();
        sample.print();
    }
}
