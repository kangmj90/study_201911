package com.example.sample;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kangminjeong
 * @since 2019. 11. 12.
 */
public class StreamSample {
    public static void main(String[] args) {
        List<Data> datas = new ArrayList<>();
        datas.add(new Data(1L, "data1", 1, 100L));
        datas.add(new Data(2L, "data2", 2, 200L));
        datas.add(new Data(3L, "data3", 3, 300L));
        datas.add(new Data(4L, "data4", 2, 400L));
        datas.add(new Data(5L, "data5", 1, 500L));
        datas.add(new Data(6L, "data6", 4, 400L));
        datas.add(new Data(7L, "data7", 5, 300L));
        datas.add(new Data(8L, "data8", 5, 200L));
        datas.add(new Data(9L, "data9", 4, 100L));
        datas.add(new Data(10L, "data10", 6, 600L));

//        sum numbers
        System.out.println("sum = " + datas.stream().mapToLong(e -> e.numbers).sum());

//        average numbers
        System.out.println("avg = " + datas.stream().mapToLong(e -> e.numbers).average());

//        sum by type
        System.out.println("sum type = " + datas.stream().collect(Collectors.groupingBy(e -> e.type, Collectors.summingLong(e -> e.numbers))));

//        avg by type
        System.out.println("avg type = " + datas.stream().collect(Collectors.groupingBy(e -> e.type, Collectors.averagingLong(e -> e.numbers))));

//        gt 300 name join ,
        System.out.println("name = " + datas.stream().filter(e -> e.numbers >= 300).map(e -> e.name).collect(Collectors.joining(",")));

//        format [stream]
        System.out.println("format = " + datas.stream().map(e -> String.format("[stream]" + e.name)));
        datas.stream().map(e -> String.format("[stream]" + e.name)).forEach(System.out::println);

//        id === 2 ?
        System.out.println("any = " + datas.stream().anyMatch(e -> e.id == 2));

//        numbers >= 300 ?
        System.out.println("all = " + datas.stream().allMatch(e -> e.numbers >= 300));
    }

    @lombok.Data
    @AllArgsConstructor
    @EqualsAndHashCode
    @ToString
    public static class Data {
        private Long id;
        private String name;
        private int type;
        private Long numbers;
    }
}
