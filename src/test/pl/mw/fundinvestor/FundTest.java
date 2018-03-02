package pl.mw.fundinvestor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTest {

    static final String FUND_NAME_1 = "Test 1";
    static final String FUND_NAME_2 = "Test 2";
    static final String FUND_NAME_3 = "Test 3";

    static final FundKind FUND_KIND_1 = FundKind.POLISH;
    static final FundKind FUND_KIND_2 = FundKind.FOREIGN;
    static final FundKind FUND_KIND_3 = FundKind.CASH;

    Fund fund1;
    Fund fund2;
    Fund fund3;

    @BeforeEach
    void setUp() {
        fund1 = new Fund(1, FUND_NAME_1, FUND_KIND_1);
        fund2 = new Fund(2, FUND_NAME_2, FUND_KIND_2);
        fund3 = new Fund(3, FUND_NAME_3, FUND_KIND_3);
    }

    @Test
    void getId() {
        assertEquals(1, fund1.getId());
        assertEquals(2, fund2.getId());
        assertEquals(3, fund3.getId());
    }

    @Test
    void setId() {
        fund1.setId(2);
        assertEquals(2, fund1.getId());

        fund2.setId(3);
        assertEquals(3, fund2.getId());

        fund3.setId(1);
        assertEquals(1, fund3.getId());
    }

    @Test
    void getName() {
        assertEquals(FUND_NAME_1, fund1.getName());
        assertEquals(FUND_NAME_2, fund2.getName());
        assertEquals(FUND_NAME_3, fund3.getName());
    }

    @Test
    void setName() {
        fund1.setName(FUND_NAME_2);
        assertEquals(FUND_NAME_2, fund1.getName());

        fund2.setName(FUND_NAME_3);
        assertEquals(FUND_NAME_3, fund2.getName());

        fund3.setName(FUND_NAME_1);
        assertEquals(FUND_NAME_1, fund3.getName());
    }

    @Test
    void getKind() {
        assertEquals(FUND_KIND_1, fund1.getKind());
        assertEquals(FUND_KIND_2, fund2.getKind());
        assertEquals(FUND_KIND_3, fund3.getKind());
    }

    @Test
    void setKind() {
        fund1.setKind(FUND_KIND_2);
        assertEquals(FUND_KIND_2, fund1.getKind());

        fund2.setKind(FUND_KIND_3);
        assertEquals(FUND_KIND_3, fund2.getKind());

        fund3.setKind(FUND_KIND_1);
        assertEquals(FUND_KIND_1, fund3.getKind());
    }
}