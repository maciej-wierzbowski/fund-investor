package pl.mw.fundinvestor;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("DivisionPlan Tests")
public class DivisionPlanTest{

    private static Fund fund1;
    private static Fund fund2;
    private static Fund fund3;

    @BeforeEach
    void setUp() {

    }

    @BeforeAll
    static void init() {
        fund1 = new Fund(1,"Test Fund1", FundKind.POLISH);
        fund2 = new Fund(2,"Test Fund2", FundKind.FOREIGN);
        fund3 = new Fund(3,"Test Fund3", FundKind.CASH);
    }

    @Test
    void setRest() {
        DivisionPlan divisionPlan = new DivisionPlan();
        divisionPlan.setRest(100);
        assertEquals(100, divisionPlan.getRest());
    }

    @DisplayName("Add one fund to division plan")
    @Test
    void addOneFundToDivisionPlan() {
        DivisionPlan divisionPlan = new DivisionPlan();
        Division division = new Division(fund1, 100, 10);

        divisionPlan.addDivision(division);
        assertEquals(1, divisionPlan.getList().size());
    }

    @DisplayName("Add two funds to division plan")
    @Test
    void addTwoFundsToDivisionPlan() {
        DivisionPlan divisionPlan = new DivisionPlan();
        Division division = new Division(fund1, 100, 10);

        divisionPlan.addDivision(division);
        divisionPlan.addDivision(fund2, 100, 10);
        assertEquals(2, divisionPlan.getList().size());
    }
}