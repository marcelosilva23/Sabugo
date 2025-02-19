package io.codeforall.kernelfc;

public class Playground {
    public static void main(String[] args) {

        // we are creating an object type PigBank
        PigBank totalMoney = new PigBank();
        Person myLittlePerson = new Person("Josef", 0);

        myLittlePerson.setPigBank(totalMoney);

        myLittlePerson.saveMoney(500);
        System.out.println("Current balance: " + myLittlePerson.getMoney());

        myLittlePerson.spendMoney(200);
        System.out.println("Balace after spending: " + myLittlePerson.getMoney());

        myLittlePerson.spendMoney(400);
        System.out.println("Balance after invalid withdrawal attempt: " + myLittlePerson.getMoney());

        myLittlePerson.saveMoney(-100);
        System.out.println("Balance after invalid withdrawal attempt: " + myLittlePerson.getMoney());
            }
        }

        // Person is not born with a bank
        // the bank will be set later on in their lifetime (not at the moment that the person is created)
        // when opening an account(a bank) the balance is always zero
        // the person can then deposit or withdraw money to or from the bank
        // pay attention to negative values i.e cant deposit negative numbers, etc
