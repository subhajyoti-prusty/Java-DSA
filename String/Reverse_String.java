package String;

import java.util.List;
import java.util.Stack;

public class Reverse_String {
    public void reverseString(List<Character> s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s){
            stack.push(c);
        }

        for (int i = 0; i < s.size(); ++i) {
            s.set(i, stack.pop());
        }
        
        return;
    }
}
