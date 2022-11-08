package Easy;

import java.util.HashMap;
import java.util.Map;


public class DecodeTheMessage {

    public String decodeMessage(String key, String message) {

        Map<Character, Character> map = new HashMap<>();
        int index = 0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);

            if (c == ' ' || map.containsKey(c)) {
                continue;
            }
            if (index >= 26) {
                break;
            }


            char letter = (char) (index + 'a');
            map.put(c, letter);
            index++;
        }

        map.put(' ', ' ');
        String result = "";

        for (int i = 0; i < message.length(); i++) {
            result += map.get(message.charAt(i));
        }

        return result;
    }

    public static void main(String[] args) {
        DecodeTheMessage de = new DecodeTheMessage();
        System.out.println(de.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

}
