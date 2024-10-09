package com.example.demo.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Data
@Accessors(fluent = true, chain = true)
@NoArgsConstructor
public class StreamGroupingData {
//    public static List<HateDto> getHateDtoList() {
//        return Instancio.ofList(HateDto.class).size(15).create();
//    }

//    public static List<HateDto> getHateDtos() {
//        return Arrays.asList(
//                new HateDto("i", "look", "simple"),
//                new HateDto("i", "say", "simple"),
//                new HateDto("i", "say", "simple2"),
//                new HateDto("dim", "say", "pity"),
//                new HateDto("vik", "eat", "rice"),
//                new HateDto("vik", "seat", "wants"),
//                new HateDto("vik", "song", "wants"),
//                new HateDto("vik", "play", "wants"),
//                new HateDto("vik", "look", "wants"),
//                new HateDto("i", "think", "upset"),
//                new HateDto("i", "think", "upset"),
//                new HateDto("i", "think", "upset2"));
//    }

    public static List<Folovers> getFolovers() {
        return Arrays.asList(
                new Folovers("Inna", "a", 17),
                new Folovers("Sonya", "b", 4),
                new Folovers("Tina", "a", 6),
                new Folovers("Olga", "b", 8),
                new Folovers("Oksana", "b", 12),
                new Folovers("Oksana", "a", 14)
        );
    }

//    public static <T> void show(List<T> elements) {
//        elements.stream().forEach(s -> System.out.println(s));
//    }

    //    public static <K, T> void show(Map<TupleWhoWhat, List<HateDto>> elements) {
//
//        elements.entrySet()
//                .stream()
//                .forEach(s -> System.out.println(s.getKey() + " - " + s.getValue()));
//    }
    public static void show(Map<String, Optional<Folovers>> foloversWithMaxLikes) {
        foloversWithMaxLikes.entrySet().stream().forEach(s -> {
            System.out.println(s.getKey());
            s.getValue().ifPresent(k -> System.out.println(k));
        });
    }

//    public static void show(Map<String, Map<String, List<HateDto>>> groupByWhoGroupWhatSet) {
//        groupByWhoGroupWhatSet
//                .entrySet()
//                .stream()
//                .forEach(s -> {
//                    System.out.print(s.getKey() + "- > \n");
//                    s.getValue()
//                            .entrySet()
//                            .forEach(t -> {
//                                System.out.println("inKey " + t.getKey());
//                                System.out.println(t.getValue());
//                            });
//                });
//
//    }
}
