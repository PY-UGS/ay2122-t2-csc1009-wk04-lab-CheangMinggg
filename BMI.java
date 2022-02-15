import java.util.Scanner;

public class BMI {

    private static double pound;
    private static double inches;
    final static double weightX = 0.4535923;
    final static double heightX = 0.0254;

    // Getter
    private double getPound() {
        return pound;
    }

    private double getInches() {
        return inches;
    }

    // Setter
    protected void setPound(double weight) {
        BMI.pound = weight;
    }
    
    protected void setinches(double height) {
        BMI.inches = height;
    }

    // Methods
    protected double getbmi() {
        double weightinKG = getPound() * weightX;
        double heightinKG = getInches() * heightX;
        return weightinKG/Math.pow(heightinKG, 2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        BMI userbmi = new BMI();

        System.out.println("Enter weight in pounds:");
        double weight = input.nextDouble();
        userbmi.setPound(weight);

        System.out.println("Enter height in inches:");
        double height = input.nextDouble();
        userbmi.setinches(height);

        input.close();

        System.out.println(String.format("BMI is %.2f", +userbmi.getbmi()));

        if (userbmi.getbmi() < 18.5) {
            System.out.println("Underweight");
        } else if (userbmi.getbmi() >= 18.5 && userbmi.getbmi() < 25.0) {
            System.out.println("Normal");
        } else if (userbmi.getbmi() >= 25.0 && userbmi.getbmi() < 30.0) {
            System.out.println("Overweight");
        } else if (userbmi.getbmi() >= 30.0) {
            System.out.println("Obese");
        }

    }

}