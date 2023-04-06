package Lecture003;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(2809);
        list.add("String");


        for (Object i : list) {System.out.println(i);}
    }
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>(10);
    ArrayList<Integer> list4 = new ArrayList<>(list3);
}
