public class Calculator {

    public int sum(String str) {
        if (str == null || str.isBlank()) {
            return 0;
        }

        int num = Integer.parseInt(str);

        if (num < 0) {
            throw new IllegalArgumentException();
        }

        return num;
    }
}
