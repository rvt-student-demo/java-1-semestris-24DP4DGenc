package rvt;

public class payments_card {
    private double balance;

    public payments_card(double openingBalance) {
        balance = openingBalance;
    }

    public void syoEdullisesti() {
        if (balance >= 2.60) {
            balance = balance - 2.60;
        }
    }

    public void syoMaukkaasti() {
        if (balance >= 4.60) {
            balance = balance - 4.60;
        }
    }

    public void lataaRahaa(double amount) {
        if (amount < 0) {
            return;
        }

        balance = balance + amount;

        if (balance > 150) {
            balance = 150;
        }
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
}

