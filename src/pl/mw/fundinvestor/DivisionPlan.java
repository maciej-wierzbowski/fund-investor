package pl.mw.fundinvestor;

import java.util.ArrayList;
import java.util.List;

public class DivisionPlan {
    private List<Division> list;
    private double rest;

    public DivisionPlan() {
        this.list = new ArrayList<>();
        this.rest = 0;
    }

    public List<Division> getList() {
        return list;
    }

    public double getRest() {
        return rest;
    }

    public void setRest(double rest) {
        this.rest = rest;
    }

    public void addDivision(Division division) {
        this.list.add(division);
    }

    public void addDivision(Fund fund, double amount, double percent) {
        this.list.add(new Division(fund, amount, percent));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Division division : list)
            sb.append(String.format("%d | %s | %s | %s | %.2f\r\n", division.getFund().getId(), division.getFund().getKind(), division.getFund().getName(), division.getAmount(), division.getPercent()));
        sb.append(String.format("Nieprzydzielona kwota: %s\r\n", getRest()));
        return sb.toString();
    }
}
