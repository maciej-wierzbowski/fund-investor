package pl.mw.fundinvestor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundCollectionTest {

    static final String FUND_NAME_1 = "Test 1";
    static final String FUND_NAME_2 = "Test 2";
    static final String FUND_NAME_3 = "Test 3";

    static final FundKind FUND_KIND_1 = FundKind.POLISH;
    static final FundKind FUND_KIND_2 = FundKind.FOREIGN;
    static final FundKind FUND_KIND_3 = FundKind.CASH;

    FundCollection fundCollection;

    @BeforeEach
    void setUp() {
        fundCollection = new FundCollection();
    }

    @Test
    void addFund() {
        fundCollection.addFund(FUND_NAME_1, FUND_KIND_1);
        assertEquals(1, fundCollection.count());

        fundCollection.addFund(FUND_NAME_2, FUND_KIND_2);
        assertEquals(2, fundCollection.count());

        fundCollection.addFund(FUND_NAME_3, FUND_KIND_3);
        assertEquals(3, fundCollection.count());
    }

    @Test
    void count() {
        assertEquals(0, fundCollection.count());
        addFunds();
        assertEquals(3, fundCollection.count());
    }

    @Test
    void getCount() {
        addFunds();
        assertEquals(1, fundCollection.getCount(FUND_KIND_1));
        assertEquals(1, fundCollection.getCount(FUND_KIND_2));
        assertEquals(1, fundCollection.getCount(FUND_KIND_3));

        addMoreFunds();
        assertEquals(2, fundCollection.getCount(FUND_KIND_1));
        assertEquals(2, fundCollection.getCount(FUND_KIND_2));
        assertEquals(2, fundCollection.getCount(FUND_KIND_3));
    }

    @Test
    void iterator() {
        addFunds();
        int i = 0;
        for(Fund fund : fundCollection)
            i++;
        assertEquals(3, i);
    }

    private void addFunds() {
        fundCollection.addFund(FUND_NAME_1, FUND_KIND_1);
        fundCollection.addFund(FUND_NAME_2, FUND_KIND_2);
        fundCollection.addFund(FUND_NAME_3, FUND_KIND_3);
    }

    private void addMoreFunds() {
        fundCollection.addFund(FUND_NAME_1, FUND_KIND_1);
        fundCollection.addFund(FUND_NAME_2, FUND_KIND_2);
        fundCollection.addFund(FUND_NAME_3, FUND_KIND_3);
    }
}
