public class Bonus {
    static <E extends Comparable<E>> void SelectionSort(E[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j].compareTo(list[min_idx]) < 0)
                    min_idx = j;
            }
            E temp = list[min_idx];
            list[min_idx] = list[i];
            list[i] = temp;
        }
    }

    static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
        int left = 0, right = list.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list[mid].compareTo(key) == 0) {
                return mid;
            } else if (list[mid].compareTo(key) > 0) {
                right = mid - 1;
            } else if (list[mid].compareTo(key) < 0) {
                left = mid + 1;
            }
        }
        return -1;
    }
}