import java.util.List;

public class Calculator {

    public int sum(String str) {
        Delimiter delimiter = new Delimiter();
        Operand operand = new Operand();
        List<String> strList = delimiter.split(str);

        List<Integer> list = strList.stream()
                                    .map(s -> operand.getValue(s))
                                    .toList();

        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
