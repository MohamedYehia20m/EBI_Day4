package EBI;

import java.util.function.Predicate;

public class Lab3 {

    public static void main(String[] args) {
        String str1 = "hello world";

        Predicate<String> p1 = str -> {
            for (Character c : str.toCharArray()) {
                if (!Character.isLetter(c)) {
                    if (c == ' ') //white space
                        continue;
                    return false;
                }
            }
            return true;
        };

        if(p1.test(str1)) {
            System.out.println("string is alphabetic");
        }
        else {
            System.out.println("string is not alphabetic");
        }

    }

}

