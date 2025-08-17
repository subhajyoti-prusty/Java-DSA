package String;

public class $_Strings_Basic {

    public static void main(String[] args) {
        String s = "subhajyoti";
        System.out.println("String length " + s.length());

        char ch = s.charAt(0);
        System.out.println("First character " + ch);

        for (int i = 0; i < s.length(); i++) {
            System.out.println("Character at index " + i + " is " + s.charAt(i));
        }

        int val = 'c';
        System.out.println("Character code of 'c' is " + val);

        System.out.println("Substring from index 2 to 5 is " + s.substring(2));

        char[] charArray = s.toCharArray();
        charArray[0] = 'S';
        s = new String(charArray);
        System.out.println("Modified string is " + s);

        s = s.replace('j', 'K');
        System.out.println("String after replacing 'j' with 'K' is " + s);

        s = s + 'j';
        System.out.println("Final string is " + s);
        s.equals(s);
    }

}
