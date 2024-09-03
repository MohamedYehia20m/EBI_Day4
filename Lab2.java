package EBI;

import java.util.function.BiPredicate;

//import static EBI.Lab2.Numbers.findNumbers;

public class Lab2 {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = "hello java";

        betterString(str1,
                str2,
                (string1 , string2) -> (string1.length() > string2.length())
                );
        }
    public static void betterString(String str1 ,String str2 , BiPredicate<String, String> predicate) {
        if (predicate.test(str1, str2)) {
            System.out.println(str1);
        }
        else {
            System.out.println(str2);
        }
    }

}

