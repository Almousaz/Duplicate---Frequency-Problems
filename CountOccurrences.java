public class CountOccurrences {
    public static void main(String[] args) {

//        We want to know how many times each number appears.

        int[] numbers = {2, 5, 6, 5, 2, 3};
        int n = numbers.length;
        boolean[] counted = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (counted[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(numbers[i] + " occurs " + count + "times ");


        }

        int[] numbersOfCarsInStreet = {2, 3, 4, 2, 5, 3};

        int m = numbersOfCarsInStreet.length;
        boolean[] countedAlready = new boolean[m];

        for (int i = 0; i < m; i++) {
            if (countedAlready[i]) {
                continue;
            }
            int count = 1;
            for (int x = i + 1; x < m; x++) {
                if (numbersOfCarsInStreet[i] == numbersOfCarsInStreet[x]) {
                    count++;
                    countedAlready[x] = true;

                }
            }

            System.out.println(numbersOfCarsInStreet[i] + " repeats " + count + "times ");

        }









    }
}
