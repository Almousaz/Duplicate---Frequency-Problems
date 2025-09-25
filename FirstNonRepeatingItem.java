public class FirstNonRepeatingItem {
    public static void main(String[] args) {


        int[] numbers = {4, 5, 6, 3, 4, 1, 6};

        int firstNonRepeat = -1;

        for (int i = 0; i < numbers.length; i++) {

            boolean isRepeated = false;

            for (int j = 0; j < numbers.length; j++) {

                if ( i != j &&numbers[i] == numbers[j]) {
                    isRepeated = true;
                    break;

                }
            }
            if (!isRepeated) {
                System.out.println("First non-repeating element: " + numbers[i]);
                break;
            }

        }


        int[] numbersOfStudentYears = {15, 16, 17, 14, 13, 15, 16, 17};

        int firstNumRepeated = -1;

        for (int x = 0; x < numbersOfStudentYears.length; x++) {

            boolean numberRepeated = false;

            for (int z = 0; z < numbersOfStudentYears.length; z++) {
                if (z != x && numbersOfStudentYears[x] == numbersOfStudentYears[z]) {
                    numberRepeated = true;
                    break;
                }
            }
            if (!numberRepeated) {
                System.out.println("first repeated number is : " + numbersOfStudentYears[x]);
                break;
            }


        }

        int[] numbersOfDayForVacation = {20, 30, 40, 50, 20, 30, 40, 50, 80};
        int firstDayNonRepeat = -1;
        for (int i = 0; i < numbersOfDayForVacation.length; i++) {
            boolean isRepeated = false;
            for (int j = 0; j < numbersOfDayForVacation.length; j++) {
                if (j != i && numbersOfDayForVacation[i] == numbersOfDayForVacation[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                System.out.println("first non repeated Days is : " + numbersOfDayForVacation[i]);
                break;
            }
        }










    }
}
