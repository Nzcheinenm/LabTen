package com.example;

import java.util.Arrays;

final class Sorting {

        /**
         * Сообщение для защиты от пустоты.
         */
        static final String MESSAGE = "Массив пуст "
            + "или из одного элемента";
        /**
         * Сообщение для защиты
         * одинаковых элементов.
         */
        static final String MESSAGE_DOUBLE = "Массив одинаковых "
            + "элементов";
        /**
         * Сообщение для защиты размера.
         */
        static final String MESSAGE_EXIT = "Массив превышает "
            + "10 элементов";

        private Sorting() {
        }

        static String combineSort(final int[] arr) {
                int lenArr = arr.length;

                if (lenArr > 10) {
                        return MESSAGE_EXIT;
                }

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

                        int countI = 0;
                        for (int i = 0; i <= arr.length - 1; i++) {
                                if (arr[0] == arr[i]) {
                                        countI = countI + 1;
                                }
                        }

                        if (countI == arr.length) {
                                return MESSAGE_DOUBLE;
                        }

                        return Arrays.toString(arr);
                }
        }

}
