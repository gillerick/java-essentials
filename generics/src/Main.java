import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello ");
        words.add("World!");
        String s = words.get(0) + words.get(1);
        assert s.equals("Hello World");
    }
}