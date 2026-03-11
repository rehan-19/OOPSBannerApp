import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(word, patternMap);
    }

    // Build and return the character pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    // Render banner using map lookup
    public static void renderBanner(String word, Map<Character, String[]> map) {
        CharacterPatternMap oPattern = new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPatternMap pPattern = new CharacterPatternMap('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPatternMap sPattern = new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*     ",
                "*     ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        CharacterPatternMap[] patterns = {oPattern, pPattern, sPattern};

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

                for (CharacterPatternMap pattern : patterns) {
                    if (pattern.getCharacter() == c) {
                        line.append(pattern.getPattern()[row]).append("   ");
                    }
                }
            }

            System.out.println(line);
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
    // Method for letter S
    public static String[] getS() {
        return new String[]{
            " ***** ",
            "*     ",
            "*     ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
        String[] banner = {
            String.join("   ", 
                " ***** ", 
                " ***** ", 
                " ******", 
                " ******"),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*     *", 
                "*     "),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*     *", 
                "*     "),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "****** ", 
                " ***** "),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*      ", 
                "      *"),

            String.join("   ", 
                "*     *", 
                "*     *", 
                "*      ", 
                "      *"),

            String.join("   ", 
                " ***** ", 
                " ***** ", 
                "*      ", 
                " ***** ")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}