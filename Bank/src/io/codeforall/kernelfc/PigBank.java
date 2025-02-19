package io.codeforall.kernelfc;

public class PigBank {

    private double totalMoney;

    public PigBank() {
        this.totalMoney = 0;
        }
        public void addMoney(double amount) {
            if (amount > 0) {
                totalMoney += amount;
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Error: invalid deposit amount.");
            }
        }

        public void subMoney(double amount) {
            if (amount > 0 && totalMoney >= amount) {
                totalMoney -= amount;
                System.out.println("Withdraw: " + amount);
            } else {
                System.out.println("Error: Invalid withdrawal amount or insufficient balance.");
            }
        }

        public double getTotalMoney() {
            return totalMoney;
        }
    }
