package nl.itris.mjop.elements.catalog.elementen.entity;

import nl.itris.mjop.elements.catalog.handelingen.boundary.Handeling;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Element {

  private Long id = null;
  private String omschrijving = null;
  private String code = null;
  private String elementgroep = null;
  private String levensduur = null;
  private nl.itris.mjop.elements.catalog.elementen.boundary.Kostensoort stdkostensoort = null;
  private Element hoofdelement = null;
  private List<Handeling> handelingen = new ArrayList<Handeling>();

  /**
   **/

  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/

  public String getOmschrijving() {
    return omschrijving;
  }
  public void setOmschrijving(String omschrijving) {
    this.omschrijving = omschrijving;
  }

  /**
   **/

  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Nieuwbouw
   **/

  public String getElementgroep() {
    return elementgroep;
  }
  public void setElementgroep(String elementgroep) {
    this.elementgroep = elementgroep;
  }

  /**
   **/

  public String getLevensduur() {
    return levensduur;
  }
  public void setLevensduur(String levensduur) {
    this.levensduur = levensduur;
  }

  /**
   **/

  public nl.itris.mjop.elements.catalog.elementen.boundary.Kostensoort getStdkostensoort() {
    return stdkostensoort;
  }
  public void setStdkostensoort(nl.itris.mjop.elements.catalog.elementen.boundary.Kostensoort stdkostensoort) {
    this.stdkostensoort = stdkostensoort;
  }

  /**
   **/

  public Element getHoofdelement() {
    return hoofdelement;
  }
  public void setHoofdelement(Element hoofdelement) {
    this.hoofdelement = hoofdelement;
  }

  /**
   **/

  public List<Handeling> getHandelingen() {
    return handelingen;
  }
  public void setHandelingen(List<Handeling> handelingen) {
    this.handelingen = handelingen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Element element = (Element) o;
    return Objects.equals(id, element.id) &&
        Objects.equals(omschrijving, element.omschrijving) &&
        Objects.equals(code, element.code) &&
        Objects.equals(elementgroep, element.elementgroep) &&
        Objects.equals(levensduur, element.levensduur) &&
        Objects.equals(stdkostensoort, element.stdkostensoort) &&
        Objects.equals(hoofdelement, element.hoofdelement) &&
        Objects.equals(handelingen, element.handelingen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, omschrijving, code, elementgroep, levensduur, stdkostensoort, hoofdelement, handelingen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Element {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    omschrijving: ").append(toIndentedString(omschrijving)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    elementgroep: ").append(toIndentedString(elementgroep)).append("\n");
    sb.append("    levensduur: ").append(toIndentedString(levensduur)).append("\n");
    sb.append("    stdkostensoort: ").append(toIndentedString(stdkostensoort)).append("\n");
    sb.append("    hoofdelement: ").append(toIndentedString(hoofdelement)).append("\n");
    sb.append("    handelingen: ").append(toIndentedString(handelingen)).append("\n");
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

