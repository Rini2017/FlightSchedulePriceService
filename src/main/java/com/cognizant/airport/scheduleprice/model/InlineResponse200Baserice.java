package com.cognizant.airport.scheduleprice.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * InlineResponse200Baserice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T12:25:34.476Z")

public class InlineResponse200Baserice   {
  @JsonProperty("COS")
  private String cos = null;
@JsonProperty("Price")
  private String price = null;
  public InlineResponse200Baserice cos(String cos) {
    this.cos = cos;
    return this;
  }
  
   public InlineResponse200Baserice price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Get COS
   * @return COS
  **/
  @ApiModelProperty(value = "")
  public String getCos() {
    return cos;
  }

  public void setCos(String cos) {
    this.cos = cos;
  }


 /**
   * Get Price
   * @return price
  **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Baserice inlineResponse200Baserice = (InlineResponse200Baserice) o;
    return Objects.equals(this.cos, inlineResponse200Baserice.cos) && Objects.equals(this.price, inlineResponse200Baserice.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cos,price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Baserice {\n");
    
    sb.append("    cos: ").append(toIndentedString(cos)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

