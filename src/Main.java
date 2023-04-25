import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static final String line = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
            "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
            "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
            + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

    public static void main(String[] args) {

        Map<Character, Integer> text = new HashMap<>();
        for (char i : line.toLowerCase().toCharArray()) {
            if (Character.isLetter(i)) {
                if (!text.containsKey(i))
                    text.put(i, 1);
                else
                    text.put(i, text.get(i) + 1);
            }
        }
        int max = (Collections.max(text.values()));
        for (Map.Entry<Character, Integer> entry : text.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Чаще всего встречается буква: " + entry.getKey() + "-" + entry.getValue() + " раза");
                break;
            }
        }
        int min = (Collections.min(text.values()));
        for (Map.Entry<Character, Integer> entry : text.entrySet()) {
            if (entry.getValue() == min) {
                System.out.println("Реже всего встречается буква: " + entry.getKey() + "-" + entry.getValue() + " раза");
                break;
            }
        }
        System.out.println(text);
    }
}