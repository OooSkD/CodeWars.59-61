package main;

/*
DESCRIPTION:
    My friend John and I are members of the "Fat to Fit Club (FFC)".
    John is worried because each month a list with the weights of members is published and each month he is
    the last on the list which means he is the heaviest.

    I am the one who establishes the list so I told him: "Don't worry any more, I will modify the order of the list".
    It was decided to attribute a "weight" to numbers. The weight of a number will be from now on the sum
    of its digits.

    For example 99 will have "weight" 18, 100 will have "weight" 1 so in the list 100 will come before 99.

    Given a string with the weights of FFC members in normal order can you give this string ordered by
    "weights" of these numbers?
 */
import java.util.*;
import java.util.stream.Collectors;

public class WeightSort {
    public static String orderWeight(String strng) {

        return Arrays.stream(strng.split(" ")).sorted((o1, o2) -> {
            int r =o1.chars().map(Character::getNumericValue).sum()
                    - o2.chars().map(Character::getNumericValue).sum();
            if (r == 0) return o1.compareTo(o2);
            return r;
        }).collect(Collectors.joining(" "));
    }
}
