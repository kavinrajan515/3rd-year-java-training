public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(" anagrams.");
        } else {
            System.out.println(" not anagrams.");
        }
    }
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        java.util.Arrays.sort(charArray1);
        java.util.Arrays.sort(charArray2);

        return java.util.Arrays.equals(charArray1, charArray2);
    }    
}