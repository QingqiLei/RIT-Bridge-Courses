package C13Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WithoutStreams {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("one", "two", "three");
        List<String> result = getFilterOutput(lines);

        result = lines.stream()
                .filter(line -> !"three".equals(line))
                .collect(Collectors.toList());
        result.forEach(System.out::println);


        List<Id> persons = Arrays.asList(
                new Id("Joe", 1234),
                new Id("Jane", 123),
                new Id("You", 12)
        );

        System.out.println("You: " +
                persons.stream()
                        .filter(x -> "You".equals(x.name))
                        .findAny()
                        .orElse(null)
        );
        System.out.println("x: " +
                persons.stream()
                        .filter(x -> "x".equals(x.name))
                        .findAny()
                        .orElse(null)
        );

        List<String> collect = persons.stream().map(x -> x.name).collect(Collectors.toList());
        System.out.println(collect);

        Arrays.asList("a", "b", "c", "d", "e")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s] \n", s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s] \n", s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sorted: %s <> %s [%s] \n", s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s ->
                        System.out.format("forEach: %s [%s] \n", s, Thread.currentThread().getName())
                );
    }

    private static List<String> getFilterOutput(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            if (!"three".equals(line)) result.add(line);
        }
        return result;
    }
}

class Id {
    String name;
    int id;

    public Id(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
