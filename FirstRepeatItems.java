public class FirstRepeatItems {
    public static void main(String[] args) {

//         finding first repeating element


        int[] numbers = {2, 5, 6, 3, 4, 7, 6};
        int firstRepeat = -1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    firstRepeat = numbers[i];
                    break;
                }
            }
            if (firstRepeat != -1) {
                break;
            }
        }
        if (firstRepeat != -1) {
            System.out.println("first repeating number is : " + firstRepeat);
        }else {
            System.out.println("No repeating found");
        }


        int[] numbersOfPayment = {2, 3, 4, 5, 6, 5, 7, 9};

        int firstRepeatNumber = -1;

        for (int x = 0; x < numbersOfPayment.length; x++) {

            for (int z = x + 1; z < numbersOfPayment.length; z++) {

                if (numbersOfPayment[x] == numbersOfPayment[z]) {
                    firstRepeatNumber = numbersOfPayment[x];
                    break;
                }
            }
            if (firstRepeatNumber != -1) {
                break;
            }
        }

        if (firstRepeatNumber != -1) {
            System.out.println("first repeating number is : " + firstRepeatNumber);

        } else {
            System.out.println("Not found repeating number");

        }












    }
}
