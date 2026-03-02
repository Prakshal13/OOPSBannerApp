import java.util.HashMap;

public class UC8 {

    /**
     * Creates a HashMap storing ASCII patterns for characters
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        charMap.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*",
            "*",
            "*"
        });

        charMap.put('S', new String[] {
            " ***** ",
            "*",
            "*",
            " ***** ",
            "            *",
            "            *",
            "       ***** "
        });

        return charMap;
    }

    /**
     * Displays a banner message using the character map
     */
    public static void displayBanner(
            String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int row = 0; row < patternHeight; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = charMap.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";

        displayBanner(message, charMap);
    }
}