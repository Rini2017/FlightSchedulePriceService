package com.cognizant.airport.scheduleprice.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.airport.scheduleprice.model.InlineResponse200;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:25:34.476Z")

@Api(value = "getFlightSchedulePrice", description = "The FlightSchedulePrice API")
public interface GetAirportSchedulePriceApi {

    @ApiOperation(value = "gets the price for route code provided for all the classes", notes = "By passing the route code the prices for route will be displayed ", response = InlineResponse200.class, tags={"FindFlightSchedulePrice"  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "Invalid input")})
    @RequestMapping(value = "/getFlightSchedulePrice",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> airportSchedulePrice( @NotNull @ApiParam(value = "Source Airport code", required = true) @RequestParam(value = "sourceAirport", required = true) String sourceAirport,
         @NotNull @ApiParam(value = "Destination Airport code", required = true) @RequestParam(value = "destinationAirport", required = true) String destinationAirport);

}
