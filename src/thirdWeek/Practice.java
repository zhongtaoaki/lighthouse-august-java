package thirdWeek;

public class Practice {
    public static void main(String[] args) {

        int[] array = { 1, 2, 4 };
        array = addLength(array, 4);
        for (int i : array) {
            System.out.println(i);
        }

    }

    static int[] addLength(int[] array, int i) {

        int[] newArray = new int[array.length + 1];

        for (int j = 0; j < array.length; j++) {
            newArray[j] = array[j];
        }

        newArray[newArray.length-1] = i;

        return newArray;
    }
}
