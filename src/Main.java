public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        int[] arr1 = generateRandomArray();//Задача 2
        int maxWaste = arr1[0];
        for (int number : arr1) {
            if (number > maxWaste) {
                maxWaste = number;
            }
        }
        int minWaste = arr1[0];
        for (int i : arr1) {
            if (i < minWaste) {
                minWaste = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей.");
        int[] arr2 = generateRandomArray(); // Задача 3
        float sum1 = 0;
        for (float i : arr2) {
            sum1 += i;
        }
        float middle = sum1 / arr2.length;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей.");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        int b = 5 + 9;
        System.out.println(b);
    }
}
