public class FindDuplicateItems {

    public static void main(String[] args) {


//        how to find duplicates



        int[] numbers = {4, 5, 6, 3, 4, 5, 6};
        boolean[] counted = new boolean[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            if (counted[i]) {
                continue;
            }
            int count = 1;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(numbers[i] + "repeats " + count + "times");

            }

        }


        int[] numbersOfDogs = {10, 20, 30, 40, 50, 20, 20, 30, 40, 40, 10, 10, 10};

        boolean[] countedNumbers = new boolean[numbersOfDogs.length];

        for (int x = 0; x < numbersOfDogs.length; x++) {

            if (countedNumbers[x]) {
                continue;
            }
            int countNum = 1;
            for (int z = x + 1; z < numbersOfDogs.length; z++) {
                if (numbersOfDogs[x] == numbersOfDogs[z]) {
                    countNum++;
                    countedNumbers[z] = true;
                }
            }
            if (countNum > 1) {
                System.out.println(numbersOfDogs[x] + "repeats " + countNum + "times");

            }
        }







    }



}
