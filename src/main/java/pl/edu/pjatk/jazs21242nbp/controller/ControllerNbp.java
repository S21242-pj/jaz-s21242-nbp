package pl.edu.pjatk.jazs21242nbp.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.edu.pjatk.jazs21242nbp.model.DatabaseEntrace;
import pl.edu.pjatk.jazs21242nbp.model.Root;
import pl.edu.pjatk.jazs21242nbp.service.ServiceNbp;

@RestController
@RequestMapping("/bank")
public class ControllerNbp {

    private final ServiceNbp serviceNbp;

    public ControllerNbp(ServiceNbp serviceNbp) {
        this.serviceNbp = serviceNbp;
    }

    @ApiOperation(value = "get currency price form NBP API",
            response = Root.class,
            notes = "This method get average price from any start and end date, and insert data to database. If not found give 404. ")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "ok"),
            @ApiResponse(code = 404, message = "404 NotFound"),
            @ApiResponse(code = 400, message = "400 Bad Request")
    })
    @GetMapping("/table")
    public ResponseEntity<DatabaseEntrace> getPriceFromDays(
            @ApiParam(name = "firstDate",
                    value = "date (2000-01-01",
                    required = true,
                    type = "String")
            @RequestParam String firstDate,
            @ApiParam(name = "lastDate",
                    value = "date (2000-01-01",
                    required = true,
                    type = "String")
            @RequestParam String lastDate
    ){
        return ResponseEntity.ok(serviceNbp.getPricesFromDateRange(firstDate,lastDate));
    }



}
