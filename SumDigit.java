public class SumDigit {
    public static void main(String[] args) {
        int Remainder, sum = 0, Num = 123;

        while (Num != 0) {
            Remainder = Num % 10;
            sum = sum + Remainder;
            Num = Num / 10;
        }
        System.out.println(sum);
    }
}