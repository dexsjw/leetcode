import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // Map<String, Integer> ransomNoteMap = new HashMap<>();
        Map<String, Integer> magazineMap = new HashMap<>();

        // Arrays.stream(ransomNote.split(""))
        //     .forEach(str -> ransomNoteMap.put(str, ransomNoteMap.containsKey(str) ? ransomNoteMap.get(str) + 1 : 1));
        Arrays.stream(magazine.split(""))
            .forEach(str -> magazineMap.put(str, magazineMap.containsKey(str) ? magazineMap.get(str) + 1 : 1));

        // for (Map.Entry<String, Integer> entry : ransomNoteMap.entrySet()) {
        //     System.out.println("ransomNoteMap key-value:");
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }
        for (Map.Entry<String, Integer> entry : magazineMap.entrySet()) {
            System.out.println("magazineMap key-value:");
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // for (Map.Entry<String, Integer> ransomNoteEntry : ransomNoteMap.entrySet()) {
        //     if (magazineMap.containsKey(ransomNoteEntry.getKey())) {
        //         if (magazineMap.get(ransomNoteEntry.getKey()) < ransomNoteEntry.getValue()) {
        //             return false;
        //         }
        //     } else {
        //         return magazineMap.containsKey(ransomNoteEntry.getKey()); // i.e. false
        //     }
        // }

        for (String letter : ransomNote.split("")) {
            if (magazineMap.containsKey(letter)) {
                if (magazineMap.get(letter) > 0) {
                    magazineMap.replace(letter, magazineMap.get(letter) - 1);
                } else {
                    return false;
                }
            } else {
                return magazineMap.containsKey(letter); // i.e. false
            }
        }

        return true;

        /* Model Solution */
        // Map<Character, Integer> magazineLetters = new HashMap<>();

        // for (int i = 0; i < magazine.length(); i++) {
        //     char m = magazine.charAt(i);

        //     int currentCount = magazineLetters.getOrDefault(m, 0);
        //     magazineLetters.put(m, currentCount + 1);
        // }

        // // bounded by m
        // for (int i = 0; i < ransomNote.length(); i++) {
        //     char r = ransomNote.charAt(i);

        //     int currentCount = magazineLetters.getOrDefault(r, 0);

        //     if (currentCount == 0) {
        //         return false;
        //     }

        //     magazineLetters.put(r, currentCount - 1);
        // }

        // return true;

    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println("\n");
        System.out.println(canConstruct("aa", "ab"));
        System.out.println("\n");
        System.out.println(canConstruct("aa", "aab"));
    }
}
