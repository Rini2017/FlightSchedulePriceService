package com.cognizant.airport.scheduleprice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.cognizant.airport.scheduleprice.model.InlineResponse200Baserice;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * InlineResponse200RoutePrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:25:34.476Z")

public class InlineResponse200RoutePrice   {
  @JsonProperty("RouteId")
  private String routeId = null;

  @JsonProperty("baserice")
  private List<InlineResponse200Baserice> baserice = new ArrayList<InlineResponse200Baserice>();

  public InlineResponse200RoutePrice routeId(String routeId) {
    this.routeId = routeId;
    return this;
  }

   /**
   * Get routeId
   * @return routeId
  **/
  @ApiModelProperty(value = "")
  public String getRouteId() {
    return routeId;
  }

  public void setRouteId(String routeId) {
    this.routeId = routeId;
  }

  public InlineResponse200RoutePrice baserice(List<InlineResponse200Baserice> baserice) {
    this.baserice = baserice;
    return this;
  }

  public InlineResponse200RoutePrice addBasericeItem(InlineResponse200Baserice basericeItem) {
    this.baserice.add(basericeItem);
    return this;
  }

   /**
   * Get baserice
   * @return baserice
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse200Baserice> getBaserice() {
    return baserice;
  }

  public void setBaserice(List<InlineResponse200Baserice> baserice) {
    this.baserice = baserice;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200RoutePrice inlineResponse200RoutePrice = (InlineResponse200RoutePrice) o;
    return Objects.equals(this.routeId, inlineResponse200RoutePrice.routeId) &&
        Objects.equals(this.baserice, inlineResponse200RoutePrice.baserice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(routeId, baserice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200RoutePrice {\n");
    
    sb.append("    routeId: ").append(toIndentedString(routeId)).append("\n");
    sb.append("    baserice: ").append(toIndentedString(baserice)).append("\n");
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

