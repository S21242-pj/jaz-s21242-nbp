package pl.edu.pjatk.jazs21242nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Entity
public class DatabaseEntrace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Currency ID")
    private Long id;

    @ApiModelProperty(notes = "First day from range", required = true, dataType = "String")
    private String firstDate;

    @ApiModelProperty(notes = "Last day from range", required = true, dataType = "String")
    private String lastDate;

    @ApiModelProperty(notes = "Average prise from number of days", required = true, dataType = "Double")
    private Double avgPrices;

    @ApiModelProperty(notes = "Date and hour when average price was taken", required = true, dataType = "String")
    private final String getTdDay = getTdDay();

    private String getTdDay() {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        return dateFormat.format(date);
    }

    public DatabaseEntrace(String firstDate, String lastDate, Double avgPrices) {
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.avgPrices = avgPrices;
    }

    public DatabaseEntrace() {
    }

}
