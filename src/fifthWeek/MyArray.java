package fifthWeek;

public class MyArray {

    String size;

    public int length;
    public int[] array = new int[length];

    public void add(int element) {
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < length; i++) {
            array2[i] = array[i];
        }
        array2[length] = element;
        array = array2;
        length++;
    }

    public void delete() {
        int[] array2 = new int[length - 1];
        for (int i = 0; i < length - 1; i++) {
            array2[i] = array[i];
        }
        array = array2;
        length--;
    }

    public int get(int index) {
        return array[index];
    }

    public int size() {
        return length;
    }
}
