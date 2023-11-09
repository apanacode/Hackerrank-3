import java.util.*;

class Code {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Sentence : ");
        String sentence = l.nextLine();
        String word = "";
        String new_word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > new_word.length()) {
                    new_word = word;
                }
                word = "";

            }

        }
        l.close();
        System.out.print("Longest word is:");
        System.out.println(new_word + " " + "size=" + new_word.length());
    }
}
