package pl.edu.pjatk.jazs21242nbp.model;

import com.mysql.cj.xdevapi.Table;

import java.time.LocalDate;

public class Welcome9 {
    private Table table;
    private String no;
    private LocalDate effectiveDate;
    private Rate[] rates;

    public Welcome9(Table table, String no, LocalDate effectiveDate, Rate[] rates) {
        this.table = table;
        this.no = no;
        this.effectiveDate = effectiveDate;
        this.rates = rates;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Rate[] getRates() {
        return rates;
    }

    public void setRates(Rate[] rates) {
        this.rates = rates;
    }
}
