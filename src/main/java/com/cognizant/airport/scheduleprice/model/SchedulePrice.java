package com.cognizant.airport.scheduleprice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cognizant.airport.scheduleprice.model.InlineResponse200RoutePrice;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * SchedulePrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:25:34.476Z")

public class SchedulePrice   {
  @JsonProperty("Dest")
  private String dest = null;

  @JsonProperty("DestinationAirport")
  private String destinationAirport = null;

  @JsonProperty("RoutePrice")
  private List<InlineResponse200RoutePrice> routePrice = new ArrayList<InlineResponse200RoutePrice>();

  @JsonProperty("Source")
  private String source = null;

  @JsonProperty("SourceAirport")
  private String sourceAirport = null;

  public SchedulePrice dest(String dest) {
    this.dest = dest;
    return this;
  }

   /**
   * Get dest
   * @return dest
  **/
  @ApiModelProperty(value = "")
  public String getDest() {
    return dest;
  }

  public void setDest(String dest) {
    this.dest = dest;
  }

  public SchedulePrice destinationAirport(String destinationAirport) {
    this.destinationAirport = destinationAirport;
    return this;
  }

   /**
   * Get destinationAirport
   * @return destinationAirport
  **/
  @ApiModelProperty(value = "")
  public String getDestinationAirport() {
    return destinationAirport;
  }

  public void setDestinationAirport(String destinationAirport) {
    this.destinationAirport = destinationAirport;
  }

  public SchedulePrice routePrice(List<InlineResponse200RoutePrice> routePrice) {
    this.routePrice = routePrice;
    return this;
  }

  public SchedulePrice addRoutePriceItem(InlineResponse200RoutePrice routePriceItem) {
    this.routePrice.add(routePriceItem);
    return this;
  }

   /**
   * Get routePrice
   * @return routePrice
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200RoutePrice> getRoutePrice() {
    return routePrice;
  }

  public void setRoutePrice(List<InlineResponse200RoutePrice> routePrice) {
    this.routePrice = routePrice;
  }

  public SchedulePrice source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public SchedulePrice sourceAirport(String sourceAirport) {
    this.sourceAirport = sourceAirport;
    return this;
  }

   /**
   * Get sourceAirport
   * @return sourceAirport
  **/
  @ApiModelProperty(value = "")
  public String getSourceAirport() {
    return sourceAirport;
  }

  public void setSourceAirport(String sourceAirport) {
    this.sourceAirport = sourceAirport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchedulePrice schedulePrice = (SchedulePrice) o;
    return Objects.equals(this.dest, schedulePrice.dest) &&
        Objects.equals(this.destinationAirport, schedulePrice.destinationAirport) &&
        Objects.equals(this.routePrice, schedulePrice.routePrice) &&
        Objects.equals(this.source, schedulePrice.source) &&
        Objects.equals(this.sourceAirport, schedulePrice.sourceAirport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dest, destinationAirport, routePrice, source, sourceAirport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePrice {\n");
    
    sb.append("    dest: ").append(toIndentedString(dest)).append("\n");
    sb.append("    destinationAirport: ").append(toIndentedString(destinationAirport)).append("\n");
    sb.append("    routePrice: ").append(toIndentedString(routePrice)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    sourceAirport: ").append(toIndentedString(sourceAirport)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

