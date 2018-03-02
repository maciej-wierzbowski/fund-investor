package pl.mw.fundinvestor;

public enum InvestStyle {
    SAFE(.2, .75, .05),
    BALANCED(.3, .6, .1),
    AGGRESSIVE(.4, .2, .4);

    private final double value1;
    private final double value2;
    private final double value3;

    InvestStyle(double value1, double value2, double value3) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }

    public double getValue1() {
        return value1;
    }

    public double getValue2() {
        return value2;
    }

    public double getValue3() {
        return value3;
    }

}
