//Given an input string s, reverse the order of the words.
package homework.homework_java_1;
public class task1 {
    public static void main(String[] args) {
        String s = "  hello    world     bib";
        System.out.println(reverseWords(s));
    }
    public static String reverseWords(String s) {
        String[] res = s.trim().split("\\s+");
        for (int i = 0; i < res.length / 2; i++) {
            String temp = res[i];
            res[i] = res[res.length - 1 - i];
            res[res.length - 1 - i] = temp;
        }
        return String.join(" ", res);
    }
}
