package lecture_3;

public class ArrayAddItemMethod {
    public static void main(String[] args) {
        int[] a = new int[] {0, 9};
        for (int i : a) {System.out.printf("%d ", i);}  // 0 9
        a = AddItem(a, 2);
        a = AddItem(a, 3);
        for (int j : a) {System.out.printf("%d ", j);}  // 0 9 2 3
    }
    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}
