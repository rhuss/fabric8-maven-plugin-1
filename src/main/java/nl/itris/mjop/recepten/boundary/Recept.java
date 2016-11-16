/*
 * Elementen catalogus
 * Dit is de API voor de Elementen catalogus, deze API bevat alle calls om elementen uit de catalogus op te halen, weg te schrijven en te manipuleren. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package nl.itris.mjop.recepten.boundary;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * Recept
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-11-16T10:57:20.256Z")
public class Recept   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("omschrijving")
  private String omschrijving = null;

  @JsonProperty("eenheid")
  private String eenheid = null;

  @JsonProperty("receptbedrag")
  private String receptbedrag = null;

  public Recept id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Recept omschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
    return this;
  }

   /**
   * Get omschrijving
   * @return omschrijving
  **/
  @ApiModelProperty(value = "")
  public String getOmschrijving() {
    return omschrijving;
  }

  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  public Recept eenheid(String eenheid) {
    this.eenheid = eenheid;
    return this;
  }

   /**
   * Get eenheid
   * @return eenheid
  **/
  @ApiModelProperty(value = "")
  public String getEenheid() {
    return eenheid;
  }

  public void setEenheid(String eenheid) {
    this.eenheid = eenheid;
  }

  public Recept receptbedrag(String receptbedrag) {
    this.receptbedrag = receptbedrag;
    return this;
  }

   /**
   * Get receptbedrag
   * @return receptbedrag
  **/
  @ApiModelProperty(value = "")
  public String getReceptbedrag() {
    return receptbedrag;
  }

  public void setReceptbedrag(String receptbedrag) {
    this.receptbedrag = receptbedrag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recept recept = (Recept) o;
    return Objects.equals(this.id, recept.id) &&
        Objects.equals(this.omschrijving, recept.omschrijving) &&
        Objects.equals(this.eenheid, recept.eenheid) &&
        Objects.equals(this.receptbedrag, recept.receptbedrag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, omschrijving, eenheid, receptbedrag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recept {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    eenheid: ").append(toIndentedString(eenheid)).append("\n");
    sb.append("    receptbedrag: ").append(toIndentedString(receptbedrag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

