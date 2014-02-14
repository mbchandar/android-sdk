package com.wordnik.client.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import com.wordnik.client.model.App;
import com.wordnik.client.model.Integer;
public class AppGroupRequest {
  /* Identifier of this application group. */
  @JsonProperty("id")
  private Integer id = null;
  /* Displayable name of this application group. */
  @JsonProperty("name")
  private String name = null;
  /* Description of this application group. */
  @JsonProperty("description")
  private String description = null;
  /* Related apps by app to group assignment. */
  @JsonProperty("apps")
  private List<App> apps = new ArrayList<App>();
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  public List<App> getApps() {
    return apps;
  }
  public void setApps(List<App> apps) {
    this.apps = apps;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppGroupRequest {\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  apps: ").append(apps).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
