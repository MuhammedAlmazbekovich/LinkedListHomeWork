package com.company;

import java.util.*;

public class RandomNumbers {

    static Random random = new Random();
    int[] array = new int[10];
    List<Integer> linkedList = new LinkedList<>();
    List<Integer> arrayList = new ArrayList<>();

    public RandomNumbers() {
    }
    public void SortingAnArray() {
        Arrays.fill(array, 0);
        for (int i = 0; i < array.length / 2 + 1; i++) {
            int z = 0;
            while (array[z] == 1) {
                z = random.nextInt(array.length);
            }
            array[z] = 1;
        }
        Arrays.sort(array);
        System.out.println("Arrays: " + Arrays.toString(array));
    }

    public void SortingAnLinkedList() {
        int s = 10;
        for (int i = 0; i < s ;i++){
            linkedList.add(random.nextInt(0,2));
        }
        Collections.sort(linkedList);
        System.out.println("linkedList :" + linkedList);
    }

    public void SortingAnArrayList(){
        int s = 10;
        for (int i = 0; i < s ;i++){
            arrayList.add(random.nextInt(0,2));
        }
        Collections.sort(arrayList);
        System.out.println("arrayList :" + arrayList);
    }
}


