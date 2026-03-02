import java.util.HashMap;

public class UC8 {

    // UC8: Create Map for Character Patterns
    public static HashMap<Character, String[]> createPatternMap() {

        HashMap<Character, String[]> map = new HashMap<>();

        map.put('O', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*",
            "*",
            "*"
        });

        map.put('S', new String[] {
            " ***** ",
            "*",
            "*",
            " ***** ",
            "            *",
            "            *",
            "       ***** "
        });

        return map;
    }

    // UC8: Render function to print banner
    public static void renderBanner(String text,
                                    HashMap<Character, String[]> map) {

        int height = map.get('O').length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : text.toCharArray()) {
                String[] pattern = map.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line.toString());
        }
    }

    // Main method
    public static void main(String[] args) {

        HashMap<Character, String[]> patternMap = createPatternMap();
        renderBanner("OOPS", patternMap);
    }
}