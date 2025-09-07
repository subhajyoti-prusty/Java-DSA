package String;

public class Valid_Anagram {
    public boolean anagramStrings(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        if (sLength != tLength)
            return false;

        int hashS[] = new int[26];
        int hashT[] = new int[26];

        for (int i = 0; i < sLength; i++) {
            char charAtS = s.charAt(i);
            hashS[charAtS - 'a']++;

            char charAtT = t.charAt(i);
            hashT[charAtT - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (hashS[i] != hashT[i]) {
                return false;
            }
        }

        return true;
    }
}
