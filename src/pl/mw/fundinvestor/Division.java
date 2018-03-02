package pl.mw.fundinvestor;

public class Division {
    private Fund fund;
    private double amount;
    private double percent;

    public Division(Fund fund, double amount, double percent) {
        this.fund = fund;
        this.amount = amount;
        this.percent = percent;
    }

    public Fund getFund() {
        return fund;
    }

    public void setFund(Fund fund) {
        this.fund = fund;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
