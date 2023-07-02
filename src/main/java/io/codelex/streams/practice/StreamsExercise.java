package io.codelex.streams.practice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamsExercise {
    public static List<Integer> returnSquareRoot(List<Integer> numbers) {
        return numbers.stream().map(Math::sqrt).map(Double::intValue).toList();
    }

    public static List<Integer> getAgeFromUsers(List<User> user) {
        return user.stream().map(User::getAge).toList();
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        Set<Integer> uniqueAges = new HashSet<>();
        users.forEach((User user) -> uniqueAges.add(user.getAge()));
        return new ArrayList<>(uniqueAges);
    }

    public static List<User> getLimitedUserList(List<User> users, int limit) {
        return users.stream()
                .limit((long) limit)
                .toList();
    }

    public static Integer countUsersOlderThen25(List<User> users) {
        List<User> filteredUsers = users.stream()
                .filter((user) -> user.getAge() > 25)
                .toList();
        return filteredUsers.size();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).toList();
    }

    public static Integer sum(List<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum);
    }

    public static List<Integer> skip(List<Integer> integers, Integer toSkip) {
        return integers.stream()
                .skip(toSkip)
                .toList();
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream()
                .map(fullNameString -> fullNameString.split(" "))
                .map(fullName -> fullName[0])
                .toList();
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names.stream()
                .flatMap(name -> name.chars().mapToObj(ch -> (char) ch))
                .map(String::valueOf)
                .distinct()
                .collect(Collectors.toList());
    }

    public static String separateNamesByComma(List<User> users) {
        return users.stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream()
                .mapToDouble(User::getAge)
                .average()
                .orElse(0.0);
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .max()
                .orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream()
                .mapToInt(User::getAge)
                .min()
                .orElse(0);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(User::isMale, Collectors.counting()));
    }

    public static boolean anyMatch(List<User> users, int age) {
        return users.stream().anyMatch(user -> user.getAge() == age);
    }

    public static boolean noneMatch(List<User> users, int age) {
        return users.stream().noneMatch(user -> user.getAge() == age);
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Integer> generateFirst10PrimeNumbers() {
        return Stream.iterate(2, n -> n + 1)
                .filter(number -> {
                    if (number < 2) {
                        return false;
                    }
                    for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                            return false;
                        }
                    }
                    return true;
                })
                .limit(10)
                .toList();

    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    public static List<Integer> generate10RandomNumbers() {
        return new Random().ints(10).boxed().toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(User::getAge))
                .orElse(null);
    }

    public static int sumAge(List<User> users) {
        return users.stream()
                .map(User::getAge)
                .reduce(0, Integer::sum);
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
    }
}
