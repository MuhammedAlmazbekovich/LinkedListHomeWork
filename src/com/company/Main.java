package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* 0 жана 1 деген сандар менен рандомно Массивди, ArrayList ти жана LinkedList ти толтурунуз.
        Overload методдорду тузунуз, алар сортировка болгон элементтерди кайтарсын.
        Башында 0дор жана аягында 1лер.*/

        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.SortingAnArray();
        randomNumbers.SortingAnArrayList();
        randomNumbers.SortingAnLinkedList();
    }
}
