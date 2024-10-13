package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);


//        Map map = new HashMap<>();
//        map.put(null, 10);
//        map.put(0, 11);
//        System.out.println("map.put(null, 10)");
//        System.out.println(map.get(null));
//        HateDto dto = new HateDto("q","w","d");
//        HateDto dto4 = new HateDto("q","w","d");
//        HateDto dto2 = null;
//        HateDto dto3 = null;
//        System.out.println(dto);
//        System.out.println(dto2);
//        System.out.println(dto3);
//        System.out.println(dto4);
//        Integer two = 120+7;
//        Integer one = 127;
//        System.out.println(one == two);


//        val groupByWho = getHateDtos().stream().collect(groupingBy(HateDto::getWho));
//        show(groupByWho);
//        val groupByWhoWhat = getHateDtos().stream().collect(groupingBy(s -> new TupleWhoWhat(s.getWho(), s.getWhat())));
//        show(groupByWhoWhat);
//        val groupByWhoWhatSet = getHateDtos().stream().collect(groupingBy(s -> new TupleWhoWhat(s.getWho(), s.getWhat()), toSet()));
//        show(groupByWhoWhatSet);
//        val groupByWhoGroupWhatSet = getHateDtos().stream().collect(groupingBy(HateDto::getWho, groupingBy(HateDto::getWhat)));
//        show(groupByWhoGroupWhatSet);
//        val foloversWithMaxLikes = getFolovers().stream().collect(groupingBy(Folovers::getGroup,
//                        maxBy(Comparator.comparingInt(Folovers::getLikes))));
//        show(foloversWithMaxLikes);
//System.out.println(getFolovers().stream().map(Folovers::getLikes).collect(counting()));
//val summ = getFolovers().stream().collect(summarizingInt(Folovers::getLikes));
//System.out.println(summ.getSum());
//String test = "money";
//        test.chars().forEach(c -> {
//            System.out.println(c);
//        });
//   Stream.of(test.toCharArray()).forEach(s->System.out.println(s));


//        String c = new String("123");
//        String a = "123";
//        String b = "123";
//        System.out.println(a==b);
//        System.out.println(c==b);
//        System.out.println(a.equals(b));
//        System.out.println(c.equals(b));

//        List<String> animals = List.of("dog", "cat", "parrot");
//        animals.stream()
//                .sorted()
//                .peek(item -> System.out.println(item))
//                .map(String::length);
//        System.out.println(animals);

//        stream();
//        zulu2iso8601();
    }


//
//    private static void stream() {
//        val hateDto = new HateDto();
//        hateDto.setWhat("nothing");
//        System.out.println(hateDto);
//        List<HateDto> hateDto2 = new ArrayList<>();
//        val streamHateDto = Optional.ofNullable(hateDto)
//                .map(h -> {
//                    hateDto.setWho("anybody");
//                    hateDto2.add(hateDto);
//                    hateDto2.add(new HateDto("newMe","born","for happy"));
//                    return h;
//                });
//        System.out.println(streamHateDto);
//        System.out.println(hateDto2);
//    }

//    private static void zulu2iso8601() {
//        var row = Set.of(1, 2, 3, 4, 5, 6, 7, 8);
//        var row2 = Set.of(22, 23, 34, 45, 56, 66, 77, 88);
//        var column = List.of(row, row2, row2, row);
//        var list = column.stream().flatMap(Collection::stream).filter(a -> a == 2 || a == 22).collect(Collectors.toList());
//        System.out.println(list);


//        String zulud = "2024-03-12T14:05:13.656565Z";
//        String zulu = "2024-03-12T14:05:13.656+03:00";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//
//        OffsetDateTime offsetDateTimeZulu = OffsetDateTime.parse(zulu);
//        System.out.println(offsetDateTimeZulu);
//        OffsetDateTime offsetDateTimeZuleu = OffsetDateTime.parse(offsetDateTimeZulu.format(dateTimeFormatter));
//        System.out.println(offsetDateTimeZuleu);


//        ZonedDateTime zonedDateTimeIso = ZonedDateTime.parse(iso8601);
//        ZonedDateTime zonedDateTime = ZonedDateTime.parse(zulu);
//        System.out.println(zonedDateTime);
//        DateTimeFormatter dateTimeFormatterZ = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:SSSZ");
//         DateTimeFormatter dateTimeFormatterZq = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
//        DateTimeFormatter dateTimeFormatterZZ = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:SSSZZZZ");
//        DateTimeFormatter dateTimeFormatterX = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:SSSX");
//        DateTimeFormatter dateTimeFormatterXXX = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
//        DateTimeFormatter dateTimeFormatterx = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss:SSSSSx");
//
//        System.out.println(zonedDateTime.format(dateTimeFormatterZ));
//        System.out.println(zonedDateTime.format(dateTimeFormatterXXX));
//        System.out.println(zonedDateTime.format(dateTimeFormatterx));
//        System.out.println();
//
//        System.out.println(zonedDateTimeIso);
//        System.out.println(zonedDateTimeIso.format(dateTimeFormatterZ));
//        System.out.println(zonedDateTimeIso.format(dateTimeFormatterZq));
//        System.out.println(zonedDateTimeIso.format(dateTimeFormatterZZ));
//        System.out.println(zonedDateTimeIso.format(dateTimeFormatterX));
//        System.out.println(zonedDateTimeIso.format(dateTimeFormatterXXX));
//        System.out.println(zonedDateTimeIso.format(dateTimeFormatterx));
//
//        System.out.println();
//
//        System.out.println(zonedDateTime);
//        System.out.println(DateTimeFormatter.ISO_DATE_TIME.format(zonedDateTime));


//    }

}
