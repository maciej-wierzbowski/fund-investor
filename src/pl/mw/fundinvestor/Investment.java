package pl.mw.fundinvestor;

public class Investment {

    public static DivisionPlan calculate(FundCollection funds, double amount, InvestStyle investStyle) {

        double percent1 = investStyle.getValue1() / funds.getCount(FundKind.POLISH) * 100;
        double percent2 = investStyle.getValue2() / funds.getCount(FundKind.FOREIGN) * 100;
        double percent3 = investStyle.getValue3() / funds.getCount(FundKind.CASH) * 100;

        double amount1 = Math.floor(amount * percent1 / 100);
        double amount2 = Math.floor(amount * percent2 / 100);
        double amount3 = Math.floor(amount * percent3 / 100);

        double sum = 0;

        DivisionPlan plan = new DivisionPlan();

        for(Fund fund : funds) {
            if(fund.getKind() == FundKind.POLISH) {
                plan.addDivision(fund, amount1, percent1);
                sum += amount1;
            } else
            if(fund.getKind() == FundKind.FOREIGN) {
                plan.addDivision(fund, amount2, percent2);
                sum += amount2;
            } else
            if(fund.getKind() == FundKind.CASH) {
                plan.addDivision(fund, amount3, percent3);
                sum += amount3;
            }
        }

        plan.setRest(amount - sum);

        return plan;
    }

}
