public class StringBuilderLab {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);
        sb.insert(sb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + sb);
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("After delete: " + sb);
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
