package pl.mw.fundinvestor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    static final double AMOUNT_1 = 0;
    static final double AMOUNT_2 = 100;
    static final double AMOUNT_3 = 1000;

    static final double PERCENT_1 = 0;
    static final double PERCENT_2 = 10;
    static final double PERCENT_3 = 100;

    static final Fund FUND_1 = new Fund(1, "Test 1", FundKind.POLISH);
    static final Fund FUND_2 = new Fund(2, "Test 2", FundKind.FOREIGN);
    static final Fund FUND_3 = new Fund(3, "Test 3", FundKind.CASH);

    Division division1;
    Division division2;
    Division division3;

    @BeforeEach
    void setUp() {
        division1 = new Division(FUND_1, AMOUNT_1, PERCENT_1);
        division2 = new Division(FUND_2, AMOUNT_2, PERCENT_2);
        division3 = new Division(FUND_3, AMOUNT_3, PERCENT_3);
    }

    @Test
    void getFund() {
        assertEquals(FUND_1, division1.getFund());
        assertEquals(FUND_2, division2.getFund());
        assertEquals(FUND_3, division3.getFund());
    }

    @Test
    void setFund() {
        division1.setFund(FUND_2);
        assertEquals(FUND_2, division1.getFund());

        division2.setFund(FUND_3);
        assertEquals(FUND_3, division2.getFund());

        division3.setFund(FUND_1);
        assertEquals(FUND_1, division3.getFund());
    }

    @Test
    void getAmount() {
        assertEquals(AMOUNT_1, division1.getAmount());
        assertEquals(AMOUNT_2, division2.getAmount());
        assertEquals(AMOUNT_3, division3.getAmount());
    }

    @Test
    void setAmount() {
        division1.setAmount(AMOUNT_2);
        assertEquals(AMOUNT_2, division1.getAmount());

        division2.setAmount(AMOUNT_3);
        assertEquals(AMOUNT_3, division2.getAmount());

        division3.setAmount(AMOUNT_1);
        assertEquals(AMOUNT_1, division3.getAmount());
    }

    @Test
    void getPercent() {
        assertEquals(PERCENT_1, division1.getPercent());
        assertEquals(PERCENT_2, division2.getPercent());
        assertEquals(PERCENT_3, division3.getPercent());
    }

    @Test
    void setPercent() {
        division1.setPercent(PERCENT_2);
        assertEquals(PERCENT_2, division1.getPercent());

        division2.setPercent(PERCENT_3);
        assertEquals(PERCENT_3, division2.getPercent());

        division3.setPercent(PERCENT_1);
        assertEquals(PERCENT_1, division3.getPercent());
    }
}