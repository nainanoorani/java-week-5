package org.part3;

import java.util.LinkedList;

public class LinkedListClass{
    public static void main(String[] args) {
        LinkedList<Integer> listOne = new LinkedList<Integer>();
        LinkedList<Integer> listTwo = new LinkedList<Integer>();

        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        System.out.println(listOne);
        listTwo.add(4);
        listTwo.add(5);
        listTwo.add(6);
        System.out.println(listTwo);
        System.out.println(reverseAdd(listOne, listTwo));
    }

    public static LinkedList<Integer> reverseAdd(LinkedList<Integer> L1, LinkedList<Integer> L2){
        LinkedList<Integer> answer = new LinkedList<>();
        //doesn't account for if they are different sizes
        for(int i=L1.size()-1; i>=0; i--){
            int sum= L1.get(i)+L2.get(i);
            if(sum<10){
                answer.push(sum);
            }
            else{
                L2.set(i-1, 1+L2.get(i-1));
            }
        }
        return answer;
    }
}
