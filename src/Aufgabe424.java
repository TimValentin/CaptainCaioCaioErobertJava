public class Aufgabe424 {

    public static void reverse(double[] numbers){
       double a;
       double b;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s, ",String.valueOf(numbers[i]));
        }

        System.out.println();
        for (int i = 0, arrayLenght = numbers.length - 1; i < arrayLenght; i++, arrayLenght--) {
            a = numbers[i];
            b = numbers[arrayLenght];
            numbers[i] = b;
            numbers[arrayLenght] = a;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%s, ",String.valueOf(numbers[i]));
        }
    }


    public static void main(String[] args) {
        reverse(new double[] {1,2,3,4,5,6,7,8,9});
    }
}
