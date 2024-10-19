public class StringBufferLab {
    public static void main(String[] args) 
    {
        StringBuffer kb = new StringBuffer("Multithreading Lab");
        
        kb.append(" - Learning Java");
        System.out.println("After append: " + kb);
        
        kb.insert(kb.indexOf("Lab") + 3, " is fun");
        System.out.println("After insert: " + kb);
        
        int start = kb.indexOf("Learning");
        int end = start + "Learning".length();
        kb.delete(start, end);
        System.out.println("After delete: " + kb);
        
        kb.reverse();
        System.out.println("After reverse: " + kb);
    }
}
