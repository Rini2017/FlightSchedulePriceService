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
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:25:34.476Z")

public class InlineResponse200   {
    @JsonProperty("SchedulePrice")
  private SchedulePrice schedulePrice = null;
  
 
  public SchedulePrice getSchedulePrice() {
    return schedulePrice;
  }

  public void setSchedulePrice(SchedulePrice schedulePrice) {
    this.schedulePrice = schedulePrice;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.schedulePrice, inlineResponse200.schedulePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    schedulePrice: ").append(toIndentedString(schedulePrice)).append("\n");
   
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

