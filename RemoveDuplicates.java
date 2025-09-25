public class RemoveDuplicates {
    public static void main(String[] args) {


//        Remove duplicate

//        int[] numbers = {2, 5, 6, 5, 2, 3};
//
////        {2,5,6,3}
//        int n = numbers.length;
//
//        int[] temp = new int[n];
//        int newLength = 0;
//
//        for (int i = 0; i < n; i++) {
//
//            boolean exists = false;
//
//            for (int j = 0; j < newLength; j++) {
//                if (numbers[i] == temp[j]) {
//                    exists = true;
//                    break;
//                }
//            }
//            if (!exists) {
//                temp[newLength] = numbers[i];
//                newLength++;
//            }
//        }
//
//        for (int i = 0; i < newLength; i++) {
//            System.out.print(temp[i] + " ");
//
//        }
//
//
//        int[] numbersOfPeopleInCity = {2, 3, 4, 5, 6, 2, 3, 7, 5, 3, 2, 5};
//        int x = numbersOfPeopleInCity.length;
//        int[] newTempArray = new int[x];
//        int newlength2 = 0;
//
//        for (int i = 0; i < x; i++) {
//
//            boolean alreadyExists = false;
//
//            for (int j = 0; j < newlength2; j++) {
//                if (numbersOfPeopleInCity[i] == newTempArray[j]) {
//                    alreadyExists =true;
//                    break;
//                }
//            }
//
//            if (!alreadyExists) {
//                newTempArray[newlength2] = numbersOfPeopleInCity[i] ;
//                newlength2++;
//            }
//        }
//
//        for (int z = 0; z < newlength2; z++) {
//            System.out.print(newTempArray[z] + " ");
//
//        }

        int[] values = {1, 2, 3, 4, 2, 3, 6, 8, 1, 2, 1, 5};

        int m = values.length;
        int[] tempUnique = new int[m];
        int newLength = 0;

        for (int i = 0; i < m; i++) {
            boolean exist = false;
            for (int j = 0; j < newLength; j++) {
                if (values[i] == tempUnique[j]) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                tempUnique[newLength] = values[i];
                newLength++;
            }
        }
        for (int x = 0; x < newLength; x++) {
            System.out.print( " " + tempUnique[x]);
        }
















    }
}
