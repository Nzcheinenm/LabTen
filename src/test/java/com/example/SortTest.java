package com.example;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
        private final int[] a = {1, 2, 3, 4, 10, 5, 9, 8, 7}; // Массив
        private final int[] sortToA = {1, 2, 3, 4, 5, 7, 8, 9, 10}; // Отсортированный
        private final int[] aNull = {}; // Пустой массив

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
}
