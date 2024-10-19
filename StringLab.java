public class StringLab {
    public static void main(String[] args) {
        String str = " Welcome to the Java String Lab! ";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Character at index 7: " + str.charAt(7));
        String substring = str.substring(16, 20);
        System.out.println("Substring (Java): " + substring);
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        int indexOfJava = str.indexOf("Java");
        System.out.println("Index of 'Java': " + indexOfJava);
        boolean containsLab = str.contains("Lab");
        System.out.println("Contains 'Lab': " + containsLab);
        String replacedString = str.replace("Java", "Java Programming");
        System.out.println("Replaced String: " + replacedString);
        String[] words = str.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }
        String trimmedString = str.trim();
        System.out.println("Trimmed String: '" + trimmedString + "'");
        String comparisonString = "java string lab!";
        System.out.println("Equals: " + str.equals(comparisonString));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(comparisonString));
    }
}
