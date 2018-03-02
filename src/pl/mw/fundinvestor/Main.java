package pl.mw.fundinvestor;

public class Main {

    public static void main(String[] args) {
        plan1();
        plan2();
        plan3();
    }

    private static void plan1() {
        double amount = 10000;
        InvestStyle style = InvestStyle.SAFE;

        FundCollection funds = new FundCollection();
        funds.addFund("Fundusz Polski 1", FundKind.POLISH);
        funds.addFund("Fundusz Polski 2", FundKind.POLISH);
        funds.addFund("Fundusz Zagraniczny 1", FundKind.FOREIGN);
        funds.addFund("Fundusz Zagraniczny 2", FundKind.FOREIGN);
        funds.addFund("Fundusz Zagraniczny 3", FundKind.FOREIGN);
        funds.addFund("Fundusz Pieniężny 1", FundKind.CASH);

        DivisionPlan plan = Investment.calculate(funds, amount, style);
        System.out.println(plan);
    }

    private static void plan2() {
        double amount = 10001;
        InvestStyle style = InvestStyle.SAFE;

        FundCollection funds = new FundCollection();
        funds.addFund("Fundusz Polski 1", FundKind.POLISH);
        funds.addFund("Fundusz Polski 2", FundKind.POLISH);
        funds.addFund("Fundusz Zagraniczny 1", FundKind.FOREIGN);
        funds.addFund("Fundusz Zagraniczny 2", FundKind.FOREIGN);
        funds.addFund("Fundusz Zagraniczny 3", FundKind.FOREIGN);
        funds.addFund("Fundusz Pieniężny 1", FundKind.CASH);

        DivisionPlan plan = Investment.calculate(funds, amount, style);
        System.out.println(plan);
    }

    private static void plan3() {
        double amount = 10000;
        InvestStyle style = InvestStyle.SAFE;

        FundCollection funds = new FundCollection();
        funds.addFund("Fundusz Polski 1", FundKind.POLISH);
        funds.addFund("Fundusz Polski 2", FundKind.POLISH);
        funds.addFund("Fundusz Polski 3", FundKind.POLISH);
        funds.addFund("Fundusz Zagraniczny 1", FundKind.FOREIGN);
        funds.addFund("Fundusz Zagraniczny 2", FundKind.FOREIGN);
        funds.addFund("Fundusz Pieniężny 1", FundKind.CASH);

        DivisionPlan plan = Investment.calculate(funds, amount, style);
        System.out.println(plan);
    }
}
