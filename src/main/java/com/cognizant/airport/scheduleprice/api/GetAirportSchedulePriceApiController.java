package com.cognizant.airport.scheduleprice.api;

import io.swagger.annotations.ApiParam;

import javax.validation.constraints.NotNull;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cognizant.airport.scheduleprice.model.InlineResponse200;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:25:34.476Z")
@Controller
public class GetAirportSchedulePriceApiController implements GetAirportSchedulePriceApi {


    public ResponseEntity<InlineResponse200> airportSchedulePrice(@NotNull @ApiParam(value = "Source Airport code", required = true) @RequestParam(
                                                                                                                                                   value = "sourceAirport",
                                                                                                                                                   required = true) String sourceAirport,
                                                                  @NotNull @ApiParam(value = "Destination Airport code", required = true) @RequestParam(
                                                                                                                                                        value = "destinationAirport",
                                                                                                                                                        required = true) String destinationAirport) {
        // do some magic!
        final String uri = "https://api.mlab.com/api/1/databases/CloudFoundry_7ik8lbbn_9v82nfds/collections/PriceByRoute";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        UriComponentsBuilder builder =
                                       UriComponentsBuilder.fromHttpUrl(uri)
                                                           .queryParam("q",
                                                                       "{'SchedulePrice.SourceAirport' : '" + sourceAirport
                                                                           + "','SchedulePrice.DestinationAirport' : '"
                                                                           + destinationAirport + "'}").queryParam("f", "{'_id': 0 }")
                                                           .queryParam("fo", "true")
                                                           .queryParam("apiKey", "L8xAbCxQBE1r-6Mt8sAFHwKi734Vpc7i");

        System.out.println("URI to mlab : "+ builder.build().encode().toUri());

        InlineResponse200 response200;

        response200 = restTemplate.getForObject(builder.build().encode().toUri(), InlineResponse200.class);

        if (null == response200) {
            return new ResponseEntity<InlineResponse200>(response200, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<InlineResponse200>(response200, HttpStatus.OK);
    }

}
