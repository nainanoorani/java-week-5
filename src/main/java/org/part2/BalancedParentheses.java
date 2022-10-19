package org.part2;

public class BalancedParentheses {
    public static void main(String[] args) {
    String balancedString ="a(aeg)d";
        System.out.println(balancedParentheses(balancedString));
        String unbalancedString = "a(aegd";
        System.out.println(balancedParentheses(unbalancedString));
    }

    public static boolean balancedParentheses(String string){
        int numUnbalanced= 0;
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i)=='('){
                numUnbalanced++;
            }
            else if(string.charAt(i)==')'){
                numUnbalanced--;
            }
        }
        if(numUnbalanced!=0){
            return false;
        }else{
            return true;
        }
    }
}
