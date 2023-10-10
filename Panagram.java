// 3.Check if the input is pangram or not. (A pangram is a sentence that contains all the alphabets from A to Z)

public class Panagram {
    public static boolean isPangram(String s) {
        boolean[] alphabetPresent = new boolean[26];
        
        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }
        
        for (boolean isPresent : alphabetPresent) {
            if (!isPresent) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String input = "abcdefghijklmnopqrstuvwxyz";
        boolean isPangram = isPangram(input);
        System.out.println("Is Pangram? " + isPangram); 
    }
}