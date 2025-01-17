/*
 * DRACOON API
 * REST Web Services for DRACOON<br><br>This page provides an overview of all available and documented DRACOON APIs, which are grouped by tags.<br>Each tag provides a collection of APIs that are intended for a specific area of the DRACOON.<br><br><a title='Developer Information' href='https://developer.dracoon.com'>Developer Information</a>&emsp;&emsp;<a title='Get SDKs on GitHub' href='https://github.com/dracoon'>Get SDKs on GitHub</a><br><br><a title='Terms of service' href='https://www.dracoon.com/terms/general-terms-and-conditions/'>Terms of service</a>
 *
 * OpenAPI spec version: 4.30.0-beta.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.sds.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Eventlog settings
 */
@Schema(description = "Eventlog settings")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-16T11:28:10.116221+02:00[Europe/Zurich]")
public class EventlogConfig {
  @JsonProperty("enabled")
  private Boolean enabled = null;

  @JsonProperty("retentionPeriod")
  private Integer retentionPeriod = null;

  @JsonProperty("logIpEnabled")
  private Boolean logIpEnabled = null;

  public EventlogConfig enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Is eventlog enabled?
   * @return enabled
  **/
  @Schema(description = "Is eventlog enabled?")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public EventlogConfig retentionPeriod(Integer retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
    return this;
  }

   /**
   * Retention period (in days) of event log entries.  After that period, all entries are deleted.  Recommended value: 7
   * @return retentionPeriod
  **/
  @Schema(description = "Retention period (in days) of event log entries.  After that period, all entries are deleted.  Recommended value: 7")
  public Integer getRetentionPeriod() {
    return retentionPeriod;
  }

  public void setRetentionPeriod(Integer retentionPeriod) {
    this.retentionPeriod = retentionPeriod;
  }

  public EventlogConfig logIpEnabled(Boolean logIpEnabled) {
    this.logIpEnabled = logIpEnabled;
    return this;
  }

   /**
   * Determines whether user’s IP address is logged.
   * @return logIpEnabled
  **/
  @Schema(description = "Determines whether user’s IP address is logged.")
  public Boolean isLogIpEnabled() {
    return logIpEnabled;
  }

  public void setLogIpEnabled(Boolean logIpEnabled) {
    this.logIpEnabled = logIpEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventlogConfig eventlogConfig = (EventlogConfig) o;
    return Objects.equals(this.enabled, eventlogConfig.enabled) &&
        Objects.equals(this.retentionPeriod, eventlogConfig.retentionPeriod) &&
        Objects.equals(this.logIpEnabled, eventlogConfig.logIpEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, retentionPeriod, logIpEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventlogConfig {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    retentionPeriod: ").append(toIndentedString(retentionPeriod)).append("\n");
    sb.append("    logIpEnabled: ").append(toIndentedString(logIpEnabled)).append("\n");
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
