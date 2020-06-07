package com.rnx;

public class Main {

    public static void main(String[] args) {



        int principal = (int) Console.readNumber("Principal:", 10_000, 5_000_000);
        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        byte years = (byte) Console.readNumber("Period in Years: ", 1, 40);

        var calculator = new MortgageCalculator(principal, annualInterest,years);

        var report = new MortgageReport(calculator);
        report.printMortgage();
        report.printPaymentSchedule();
    }


}
