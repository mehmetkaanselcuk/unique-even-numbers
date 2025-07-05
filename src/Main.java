public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 6, 7, 8, 2, 6, 9, 10, 12, 2, 8};
        int[] evenNumbers = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 2 == 0) { // çift sayı mı?
                if (!isFind(evenNumbers, list[i])) { // daha önce eklendi mi?
                    evenNumbers[index++] = list[i];
                }
            }
        }

        for (int value : evenNumbers) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
