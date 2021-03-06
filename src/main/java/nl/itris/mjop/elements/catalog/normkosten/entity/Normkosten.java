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


package nl.itris.mjop.elements.catalog.normkosten.entity;

import java.util.Objects;

/**
 * Normkosten
 */
public class Normkosten {
  private Long id = null;

  private String normtype = null;

  private String omschrijving = null;

  private String kostprijs = null;

  private String eenheid = null;

  private String merk = null;

  private String model = null;

  private String artikel = null;

  public Normkosten id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Normkosten normtype(String normtype) {
    this.normtype = normtype;
    return this;
  }

   /**
   * Get normtype
   * @return normtype
  **/
  public String getNormtype() {
    return normtype;
  }

  public void setNormtype(String normtype) {
    this.normtype = normtype;
  }

  public Normkosten omschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
    return this;
  }

   /**
   * Get omschrijving
   * @return omschrijving
  **/
  public String getOmschrijving() {
    return omschrijving;
  }

  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  public Normkosten kostprijs(String kostprijs) {
    this.kostprijs = kostprijs;
    return this;
  }

   /**
   * Get kostprijs
   * @return kostprijs
  **/
  public String getKostprijs() {
    return kostprijs;
  }

  public void setKostprijs(String kostprijs) {
    this.kostprijs = kostprijs;
  }

  public Normkosten eenheid(String eenheid) {
    this.eenheid = eenheid;
    return this;
  }

   /**
   * Get eenheid
   * @return eenheid
  **/
  public String getEenheid() {
    return eenheid;
  }

  public void setEenheid(String eenheid) {
    this.eenheid = eenheid;
  }

  public Normkosten merk(String merk) {
    this.merk = merk;
    return this;
  }

   /**
   * Get merk
   * @return merk
  **/
  public String getMerk() {
    return merk;
  }

  public void setMerk(String merk) {
    this.merk = merk;
  }

  public Normkosten model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Normkosten artikel(String artikel) {
    this.artikel = artikel;
    return this;
  }

   /**
   * Get artikel
   * @return artikel
  **/
  public String getArtikel() {
    return artikel;
  }

  public void setArtikel(String artikel) {
    this.artikel = artikel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Normkosten normkosten = (Normkosten) o;
    return Objects.equals(this.id, normkosten.id) &&
        Objects.equals(this.normtype, normkosten.normtype) &&
        Objects.equals(this.omschrijving, normkosten.omschrijving) &&
        Objects.equals(this.kostprijs, normkosten.kostprijs) &&
        Objects.equals(this.eenheid, normkosten.eenheid) &&
        Objects.equals(this.merk, normkosten.merk) &&
        Objects.equals(this.model, normkosten.model) &&
        Objects.equals(this.artikel, normkosten.artikel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, normtype, omschrijving, kostprijs, eenheid, merk, model, artikel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Normkosten {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    normtype: ").append(toIndentedString(normtype)).append("\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    kostprijs: ").append(toIndentedString(kostprijs)).append("\n");
    sb.append("    eenheid: ").append(toIndentedString(eenheid)).append("\n");
    sb.append("    merk: ").append(toIndentedString(merk)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    artikel: ").append(toIndentedString(artikel)).append("\n");
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

