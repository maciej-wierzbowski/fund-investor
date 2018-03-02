package pl.mw.fundinvestor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FundCollection implements Iterable<Fund> {
    private List<Fund> list;

    public FundCollection() {
        this.list = new ArrayList<>();
    }

    public void addFund(String name, FundKind kind) {
        list.add(new Fund(list.size()+1, name, kind));
    }

    public int count() {
        return list.size();
    }

    public int getCount(FundKind fundKind) {
        int i = 0;
        for(Fund fund : list) {
            if(fund.getKind() == fundKind)
                i++;
        }
        return i;
    }

    @Override
    public Iterator<Fund> iterator() {
        Iterator<Fund> fund = list.iterator();
        return fund;
    }
}
