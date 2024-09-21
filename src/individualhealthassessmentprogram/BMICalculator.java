/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package individualhealthassessmentprogram;

/**
 *
 * @author errol
 */

public class BMICalculator {

    // Weight in kg, height in meters
    private double weight;
    private double height;
    private double bodyMassIndex;
    private final String[] bmiReports= {
        "Seriously underweight",
        "Underweight",
        "Normal weight",
        "Overweight",
        "Obese",
        "Error calculating BMI"
    };

    public BMICalculator() {
        this.weight = 0;
        this.height = 0;
    }
    
    public BMICalculator(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calcBMI() {
        bodyMassIndex = weight / (height * height);
        return bodyMassIndex;
    }

    public String printReport() {
    
        if (bodyMassIndex != 0) {
            if (bodyMassIndex < 18.0) {
                return bmiReports[0];
            } else if (bodyMassIndex >= 18 && bodyMassIndex < 18.5) {
                return bmiReports[1];
            } else if (bodyMassIndex >= 18.5 && bodyMassIndex < 24.9) {
                return bmiReports[2];
            } else if (bodyMassIndex >= 25 && bodyMassIndex < 29.9) {
                return bmiReports[3];
            } else if (bodyMassIndex >= 30 && bodyMassIndex < 39.9) {
                return bmiReports[4];
            } else {
                return bmiReports[5];
            }
        } else {
            return "Please enter values greater than 0";
        }
    }

    public static void main(String[] args) {
        BMICalculator calc = new BMICalculator();

        System.out.println("Weight: " + calc.getWeight());
        System.out.println("Height: " + calc.getHeight());

        System.out.println("Weight: " + calc.getWeight());
        System.out.println("Height: " + calc.getHeight());
        System.out.println("Report: " + calc.printReport());

    }
}
