package pl.edu.pjatk.jazs21242nbp.model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DatabaseEntrace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(notes = "Currenct ID")
    private Long id;

    public DatabaseEntrace(){
    }

}
