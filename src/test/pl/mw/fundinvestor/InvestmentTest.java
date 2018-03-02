package pl.mw.fundinvestor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestmentTest {

    static final InvestStyle INVEST_STYLE_1 = InvestStyle.SAFE;
    static final InvestStyle INVEST_STYLE_2 = InvestStyle.BALANCED;
    static final InvestStyle INVEST_STYLE_3 = InvestStyle.AGGRESSIVE;

    static final double AMOUNT_1 = 10000;
    static final double AMOUNT_2 = 10001;
    static final double AMOUNT_3 = 10000;

    static final double[][] RESULTS_1 = new double[][]{
            {1000, 10},
            {1000, 10},
            {2500, 25},
            {2500, 25},
            {2500, 25},
            {500, 5}
    };

    static final double[][] RESULTS_2 = new double[][]{
            {1000, 10},
            {1000, 10},
            {2500, 25},
            {2500, 25},
            {2500, 25},
            {500, 5}
    };

    static final double[][] RESULTS_3 = new double[][]{
            {668, 6.68},
            {666, 6.66},
            {666, 6.66},
            {3750, 37.5},
            {3750, 37.5},
            {500, 5}
    };

    private FundCollection fundCollection;

    @BeforeEach
    void setUp() {
        fundCollection = new FundCollection();
    }

    @Test
    void calculate1() {
        addFunds1();
        DivisionPlan divisionPlan = Investment.calculate(fundCollection, AMOUNT_1, INVEST_STYLE_1);
        int i = 0;
        for (Division division:divisionPlan.getList()) {
            assertEquals(RESULTS_1[i][0], division.getAmount());
            assertEquals(RESULTS_1[i][1], division.getPercent());
            i++;
        }
    }

    @Test
    void calculate2() {
        addFunds1();
        DivisionPlan divisionPlan = Investment.calculate(fundCollection, AMOUNT_2, INVEST_STYLE_1);
        int i = 0;
        for (Division division:divisionPlan.getList()) {
            assertEquals(RESULTS_2[i][0], division.getAmount());
            assertEquals(RESULTS_2[i][0], division.getPercent());
            i++;
        }
    }

    @Test
    void calculate3() {
        addFunds2();
        DivisionPlan divisionPlan = Investment.calculate(fundCollection, AMOUNT_1, INVEST_STYLE_1);
        int i = 0;
        for (Division division:divisionPlan.getList()) {
            assertEquals(RESULTS_3[i][0], division.getAmount());
            assertEquals(RESULTS_3[i][0], division.getPercent());
            i++;
        }
    }

    private void addFunds1() {
        fundCollection.addFund("Fundusz Polski 1", FundKind.POLISH);
        fundCollection.addFund("Fundusz Polski 2", FundKind.POLISH);
        fundCollection.addFund("Fundusz Zagraniczny 1", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Zagraniczny 2", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Zagraniczny 3", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Pieniężny 1", FundKind.CASH);
    }

    private void addFunds2() {
        fundCollection.addFund("Fundusz Polski 1", FundKind.POLISH);
        fundCollection.addFund("Fundusz Polski 2", FundKind.POLISH);
        fundCollection.addFund("Fundusz Polski 3", FundKind.POLISH);
        fundCollection.addFund("Fundusz Zagraniczny 1", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Zagraniczny 2", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Pieniężny 1", FundKind.CASH);
    }

    private void addFunds3() {
        fundCollection.addFund("Fundusz Polski 1", FundKind.POLISH);
        fundCollection.addFund("Fundusz Polski 2", FundKind.POLISH);
        fundCollection.addFund("Fundusz Polski 3", FundKind.POLISH);
        fundCollection.addFund("Fundusz Zagraniczny 1", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Zagraniczny 2", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Zagraniczny 3", FundKind.FOREIGN);
        fundCollection.addFund("Fundusz Pieniężny 1", FundKind.CASH);
        fundCollection.addFund("Fundusz Pieniężny 2", FundKind.CASH);
        fundCollection.addFund("Fundusz Pieniężny 3", FundKind.CASH);
    }

}