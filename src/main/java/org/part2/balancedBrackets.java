package org.part2;

import java.util.HashMap;
import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args) {
        String balancedString ="a{aeg}d";
        System.out.println(balancedBrackets(balancedString));
        String unbalancedString = "a[aegd";
        System.out.println(balancedBrackets(unbalancedString));
    }

    public static boolean balancedBrackets(String s) {
        Stack<Character> stack = new Stack<Character>();
        HashMap<Character, Character> bracketPairs = new HashMap<Character, Character>();
        bracketPairs.put(')', '(');
        bracketPairs.put(']', '[');
        bracketPairs.put('}', '{');
        bracketPairs.put('>', '<');

        for (int i = 0; i < s.length(); i++) {
            //contains open bracket (value)
            if (bracketPairs.containsValue(s.charAt(i))) {
                stack.push(s.charAt((i)));
            }
            //contains closing bracket (key)
            else if (bracketPairs.containsKey(s.charAt(i))) {
                //no matching open bracket
                if (stack.isEmpty()) {
                    return false;
                }
                //different type of bracket
                Character mostRecentBracket=stack.pop();
                if(!mostRecentBracket.equals(bracketPairs.get(s.charAt((i))))){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}

