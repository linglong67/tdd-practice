package calculator;

import java.util.Arrays;
import java.util.List;

public class Delimiter {
    public List<String> split(String str) {
        String delimiters = ",:";

        if(str.matches("//.?\n.*")) {
            delimiters += str.substring(2, 3);
            str = str.substring(4);
        }

        delimiters = "[" + delimiters + "]";

        return Arrays.asList(str.split(delimiters));
    }
}
