package com.example;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {

        private final int[] a = {5, 2, 3, 4, 10, 1, 9, 8, 7}; // Массив
        private final int[] sortToA = {1, 2, 3, 4, 5, 7, 8, 9, 10}; // Отсортированный
        private final int[] aNull = {}; // Пустой массив
        private final int[] aDouble = {1, 1, 1, 1, 1}; // Массив одного элемента
        private final int[] aSize = {1, 1, 1, 1, 2, 1, 3, 4, 5 , 9, 11}; // Массив одного элемента

        @Test
        public void testingInSort() {
                Sorting.combineSort(a);
                Assert.assertArrayEquals("Массив не отсортирован", a, sortToA);
        }

        @Test
        public void testingInNull() {
                Assert.assertEquals("Не обработана возможность "
                    + "пустого массива/или с 1 элементом", Sorting.combineSort(aNull), Sorting.MESSAGE);
        }

        @Test
        public void testingInTime() {
                long t1 = System.nanoTime();
                Sorting.combineSort(a);
                long t2 = System.nanoTime();

                long t3 = t2 - t1;
                Assert.assertFalse("Время выполнения больше чем ожидается",
                    (t3 <= a.length * Math.log(a.length)));
        }

        @Test
        public void testingInDouble() {
                Assert.assertEquals("Не обработана возможность "
                    + "массива одинаковых чисел", Sorting.combineSort(aDouble), Sorting.MESSAGE_DOUBLE);
        }

        @Test
        public void testingInSize() {
                Assert.assertEquals("Не обработан массив "
                    + "превышающий 10 элементов", Sorting.combineSort(aSize), Sorting.MESSAGE_EXIT);
        }
}
