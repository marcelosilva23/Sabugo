package io.codeforall.kernelfc;

public class Person {

    private String name;
    private PigBank pigBank;

    public Person(String name, int initialBalance) {
        this.name = name;
        this.pigBank = null;
    }


    public void setPigBank(PigBank pigBank) {
        this.pigBank = pigBank;
    }

    public void spendMoney(double amount) {
        if (pigBank != null) {
            pigBank.subMoney(amount);
        } else {
            System.out.println("Error: piggy bank not defined.");
        }
    }

    public double getMoney() {
        if (pigBank != null) {
            return pigBank.getTotalMoney();
        } else {
            System.out.println("Error: piggy bank not defined.");
            return 0;
        }
    }

    public void saveMoney(double amount) {
        if (pigBank != null) {
            pigBank.addMoney(amount);
        } else {
            System.out.println("Error: piggy bank not defined.");
        }
    }
}