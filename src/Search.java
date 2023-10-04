import java.util.ArrayList;
public class Search {
    public static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) return i;
        }
        return -1;
    }

    public static int linearSearch(ArrayList<String> list, String string) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(string)) return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        while(end >= start) {
            int middle = start + (end - start) / 2;
            if(array[middle] == value) return middle;
            if(array[middle] > value) {
                end = middle-1;
                continue;
            }
            start = middle+1;
        }
        return -1;
    }

    public static int binarySearch(String[] array, String string) {
        int start = 0;
        int end = array.length - 1;
        while(end >= start) {
            int middle = start + (end - start) / 2;
            if(array[middle].equals(string)) return middle;
            if(array[middle].compareToIgnoreCase(string) > 0) {
                end = middle-1;
                continue;
            }
            start = middle+1;
        }
        return -1;
    }
}