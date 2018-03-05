package pl.mw.fundinvestor;

public class Fund {
    private int id;
    private String name;
    private FundKind kind;

    public Fund(int id, String name, FundKind kind) {
        this.id = id;
        this.name = name;
        this.kind = kind;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FundKind getKind() {
        return kind;
    }

    public void setKind(FundKind kind) {
        this.kind = kind;
    }
}
