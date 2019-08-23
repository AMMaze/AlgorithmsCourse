package Lesson_3;

import Lesson_3.stack.Stack;
import Lesson_3.stack.StackImpl;

public class ReverseString {
    public static String reverse(String str) {
        Stack<Character> stack = new StackImpl<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder stringBuilder = new StringBuilder(str.length());
        Character c = stack.pop();
        while(c != null) {
            stringBuilder.append(c);
            c = stack.pop();
        }
        return stringBuilder.toString();
    }
}
