package com.example;

import java.util.Arrays;

final class Sorting {
        private Sorting() { }

        /**
         * Сообщение для защиты.
         */
        static final String MESSAGE = "Массив пуст "
            + "или из одного элемента";

        static String combineSort(final int[] arr) {
                int lenArr = arr.length;
                if (lenArr <= 1) {
                        return MESSAGE;
                } else {
                        while (lenArr > 1) {
                                lenArr = (int) (lenArr / 1.2473309);
                                for (int i = 0,
                                     j = lenArr;
                                     j < arr.length;
                                     i++, j++) {
                                        if (arr[i] >= arr[j]) {
                                                int swap = arr[i];
                                                arr[i] = arr[j];
                                                arr[j] = swap;
                                        }
                                }
                        }
                        return Arrays.toString(arr);
                }
        }

}
