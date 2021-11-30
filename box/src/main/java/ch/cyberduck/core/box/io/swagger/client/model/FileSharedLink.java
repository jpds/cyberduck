/*
 * Box Platform API
 * [Box Platform](https://box.dev) provides functionality to provide access to content stored within [Box](https://box.com). It provides endpoints for basic manipulation of files and folders, management of users within an enterprise, as well as more complex topics such as legal holds and retention policies.
 *
 * OpenAPI spec version: 2.0.0
 * Contact: devrel@box.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ch.cyberduck.core.box.io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import ch.cyberduck.core.box.io.swagger.client.model.FileSharedLinkPermissions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.joda.time.DateTime;
/**
 * FileSharedLink
 */


public class FileSharedLink {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("download_url")
  private String downloadUrl = null;

  @JsonProperty("vanity_url")
  private String vanityUrl = null;

  @JsonProperty("vanity_name")
  private String vanityName = null;

  /**
   * The access level for this shared link.  * &#x60;open&#x60; - provides access to this item to anyone with this link * &#x60;company&#x60; - only provides access to this item to people the same company * &#x60;collaborators&#x60; - only provides access to this item to people who are    collaborators on this item  If this field is omitted when creating the shared link, the access level will be set to the default access level specified by the enterprise admin.
   */
  public enum AccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static AccessEnum fromValue(String text) {
      for (AccessEnum b : AccessEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("access")
  private AccessEnum access = null;

  /**
   * The effective access level for the shared link. This can be a more restrictive access level than the value in the &#x60;access&#x60; field when the enterprise settings restrict the allowed access levels.
   */
  public enum EffectiveAccessEnum {
    OPEN("open"),
    COMPANY("company"),
    COLLABORATORS("collaborators");

    private String value;

    EffectiveAccessEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EffectiveAccessEnum fromValue(String text) {
      for (EffectiveAccessEnum b : EffectiveAccessEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("effective_access")
  private EffectiveAccessEnum effectiveAccess = null;

  /**
   * The effective permissions for this shared link.
   */
  public enum EffectivePermissionEnum {
    DOWNLOAD("can_download"),
    PREVIEW("can_preview");

    private String value;

    EffectivePermissionEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static EffectivePermissionEnum fromValue(String text) {
      for (EffectivePermissionEnum b : EffectivePermissionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("effective_permission")
  private EffectivePermissionEnum effectivePermission = null;

  @JsonProperty("unshared_at")
  private DateTime unsharedAt = null;

  @JsonProperty("is_password_enabled")
  private Boolean isPasswordEnabled = null;

  @JsonProperty("permissions")
  private FileSharedLinkPermissions permissions = null;

  @JsonProperty("download_count")
  private Integer downloadCount = null;

  @JsonProperty("preview_count")
  private Integer previewCount = null;

  public FileSharedLink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL that can be used to access the item on Box.  This URL will display the item in Box&#x27;s preview UI where the file can be downloaded if allowed.  This URL will continue to work even when a custom &#x60;vanity_url&#x60; has been set for this shared link.
   * @return url
  **/
  @Schema(example = "https://www.box.com/s/vspke7y05sb214wjokpk", description = "The URL that can be used to access the item on Box.  This URL will display the item in Box's preview UI where the file can be downloaded if allowed.  This URL will continue to work even when a custom `vanity_url` has been set for this shared link.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public FileSharedLink downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * A URL that can be used to download the file. This URL can be used in a browser to download the file. This URL includes the file extension so that the file will be saved with the right file type.  This property will be &#x60;null&#x60; for folders.
   * @return downloadUrl
  **/
  @Schema(example = "https://www.box.com/shared/static/rh935iit6ewrmw0unyul.jpeg", description = "A URL that can be used to download the file. This URL can be used in a browser to download the file. This URL includes the file extension so that the file will be saved with the right file type.  This property will be `null` for folders.")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public FileSharedLink vanityUrl(String vanityUrl) {
    this.vanityUrl = vanityUrl;
    return this;
  }

   /**
   * The \&quot;Custom URL\&quot; that can also be used to preview the item on Box.  Custom URLs can only be created or modified in the Box Web application.
   * @return vanityUrl
  **/
  @Schema(example = "https://acme.app.box.com/v/my_url/", description = "The \"Custom URL\" that can also be used to preview the item on Box.  Custom URLs can only be created or modified in the Box Web application.")
  public String getVanityUrl() {
    return vanityUrl;
  }

  public void setVanityUrl(String vanityUrl) {
    this.vanityUrl = vanityUrl;
  }

  public FileSharedLink vanityName(String vanityName) {
    this.vanityName = vanityName;
    return this;
  }

   /**
   * The custom name of a shared link, as used in the &#x60;vanity_url&#x60; field.
   * @return vanityName
  **/
  @Schema(example = "my_url", description = "The custom name of a shared link, as used in the `vanity_url` field.")
  public String getVanityName() {
    return vanityName;
  }

  public void setVanityName(String vanityName) {
    this.vanityName = vanityName;
  }

  public FileSharedLink access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * The access level for this shared link.  * &#x60;open&#x60; - provides access to this item to anyone with this link * &#x60;company&#x60; - only provides access to this item to people the same company * &#x60;collaborators&#x60; - only provides access to this item to people who are    collaborators on this item  If this field is omitted when creating the shared link, the access level will be set to the default access level specified by the enterprise admin.
   * @return access
  **/
  @Schema(example = "open", description = "The access level for this shared link.  * `open` - provides access to this item to anyone with this link * `company` - only provides access to this item to people the same company * `collaborators` - only provides access to this item to people who are    collaborators on this item  If this field is omitted when creating the shared link, the access level will be set to the default access level specified by the enterprise admin.")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public FileSharedLink effectiveAccess(EffectiveAccessEnum effectiveAccess) {
    this.effectiveAccess = effectiveAccess;
    return this;
  }

   /**
   * The effective access level for the shared link. This can be a more restrictive access level than the value in the &#x60;access&#x60; field when the enterprise settings restrict the allowed access levels.
   * @return effectiveAccess
  **/
  @Schema(example = "company", description = "The effective access level for the shared link. This can be a more restrictive access level than the value in the `access` field when the enterprise settings restrict the allowed access levels.")
  public EffectiveAccessEnum getEffectiveAccess() {
    return effectiveAccess;
  }

  public void setEffectiveAccess(EffectiveAccessEnum effectiveAccess) {
    this.effectiveAccess = effectiveAccess;
  }

  public FileSharedLink effectivePermission(EffectivePermissionEnum effectivePermission) {
    this.effectivePermission = effectivePermission;
    return this;
  }

   /**
   * The effective permissions for this shared link.
   * @return effectivePermission
  **/
  @Schema(example = "can_download", description = "The effective permissions for this shared link.")
  public EffectivePermissionEnum getEffectivePermission() {
    return effectivePermission;
  }

  public void setEffectivePermission(EffectivePermissionEnum effectivePermission) {
    this.effectivePermission = effectivePermission;
  }

  public FileSharedLink unsharedAt(DateTime unsharedAt) {
    this.unsharedAt = unsharedAt;
    return this;
  }

   /**
   * The date and time when this link will be unshared. This field can only be set by users with paid accounts.
   * @return unsharedAt
  **/
  @Schema(example = "2018-04-13T13:53:23-07:00", description = "The date and time when this link will be unshared. This field can only be set by users with paid accounts.")
  public DateTime getUnsharedAt() {
    return unsharedAt;
  }

  public void setUnsharedAt(DateTime unsharedAt) {
    this.unsharedAt = unsharedAt;
  }

  public FileSharedLink isPasswordEnabled(Boolean isPasswordEnabled) {
    this.isPasswordEnabled = isPasswordEnabled;
    return this;
  }

   /**
   * Defines if the shared link requires a password to access the item.
   * @return isPasswordEnabled
  **/
  @Schema(example = "true", description = "Defines if the shared link requires a password to access the item.")
  public Boolean isIsPasswordEnabled() {
    return isPasswordEnabled;
  }

  public void setIsPasswordEnabled(Boolean isPasswordEnabled) {
    this.isPasswordEnabled = isPasswordEnabled;
  }

  public FileSharedLink permissions(FileSharedLinkPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @Schema(description = "")
  public FileSharedLinkPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(FileSharedLinkPermissions permissions) {
    this.permissions = permissions;
  }

  public FileSharedLink downloadCount(Integer downloadCount) {
    this.downloadCount = downloadCount;
    return this;
  }

   /**
   * The number of times this item has been downloaded.
   * @return downloadCount
  **/
  @Schema(example = "3", description = "The number of times this item has been downloaded.")
  public Integer getDownloadCount() {
    return downloadCount;
  }

  public void setDownloadCount(Integer downloadCount) {
    this.downloadCount = downloadCount;
  }

  public FileSharedLink previewCount(Integer previewCount) {
    this.previewCount = previewCount;
    return this;
  }

   /**
   * The number of times this item has been previewed.
   * @return previewCount
  **/
  @Schema(example = "3", description = "The number of times this item has been previewed.")
  public Integer getPreviewCount() {
    return previewCount;
  }

  public void setPreviewCount(Integer previewCount) {
    this.previewCount = previewCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileSharedLink fileSharedLink = (FileSharedLink) o;
    return Objects.equals(this.url, fileSharedLink.url) &&
        Objects.equals(this.downloadUrl, fileSharedLink.downloadUrl) &&
        Objects.equals(this.vanityUrl, fileSharedLink.vanityUrl) &&
        Objects.equals(this.vanityName, fileSharedLink.vanityName) &&
        Objects.equals(this.access, fileSharedLink.access) &&
        Objects.equals(this.effectiveAccess, fileSharedLink.effectiveAccess) &&
        Objects.equals(this.effectivePermission, fileSharedLink.effectivePermission) &&
        Objects.equals(this.unsharedAt, fileSharedLink.unsharedAt) &&
        Objects.equals(this.isPasswordEnabled, fileSharedLink.isPasswordEnabled) &&
        Objects.equals(this.permissions, fileSharedLink.permissions) &&
        Objects.equals(this.downloadCount, fileSharedLink.downloadCount) &&
        Objects.equals(this.previewCount, fileSharedLink.previewCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, downloadUrl, vanityUrl, vanityName, access, effectiveAccess, effectivePermission, unsharedAt, isPasswordEnabled, permissions, downloadCount, previewCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileSharedLink {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    vanityUrl: ").append(toIndentedString(vanityUrl)).append("\n");
    sb.append("    vanityName: ").append(toIndentedString(vanityName)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    effectiveAccess: ").append(toIndentedString(effectiveAccess)).append("\n");
    sb.append("    effectivePermission: ").append(toIndentedString(effectivePermission)).append("\n");
    sb.append("    unsharedAt: ").append(toIndentedString(unsharedAt)).append("\n");
    sb.append("    isPasswordEnabled: ").append(toIndentedString(isPasswordEnabled)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    downloadCount: ").append(toIndentedString(downloadCount)).append("\n");
    sb.append("    previewCount: ").append(toIndentedString(previewCount)).append("\n");
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