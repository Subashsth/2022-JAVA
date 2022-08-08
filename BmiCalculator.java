public class BmiCalculator {
    public static void main(String[] args) {

        int weight = 51;
        int heightCm = 100;
        float heightM = 100 / heightCm;
        float BMI = weight / (heightM * heightM);
        if (BMI < 0) {
            System.out.println("You are not A Human HEHEHEEHE");
        } else if (BMI < 18.5 && BMI >= 0) {
            System.out.println("Underweight");
        } else if (BMI < 25 && BMI >= 18.5) {
            System.out.println("Normal");
        } else if (BMI < 30 && BMI >= 25) {
            System.out.println("Overweight");
        } else {
            System.out.println("You are Obese");
        }
    }
}
