package pl.edu.pjatk.jazs21242nbp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pjatk.jazs21242nbp.service.ServiceNbp;

@RestController
@RequestMapping("/bank")
public class ControllerNbp {

    private final ServiceNbp serviceNbp;

    public ControllerNbp(ServiceNbp serviceNbp) {
        this.serviceNbp = serviceNbp;
    }



}
