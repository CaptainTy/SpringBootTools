/**
 * 
 * Copyright (c) 2018 All Rights Reserved.
 */
package sample.simple.rest.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author TY
 * @version $Id: ParamObject.java, v 0.1 Sep 1, 2018 11:14:49 AM TY Exp $
 */
public class ParamObject {

  @ApiModelProperty(name = "name", value = "名称", notes = "名称说明", required = false)
  private String name;
  
  @ApiModelProperty(name = "status", value = "状态", notes = "状态说明", required = false)
  private String status;

  /**
   * Getter method for property <tt>name</tt>.
   * 
   * @return property value of name
   */
  public String getName() {
    return name;
  }

  /**
   * Setter method for property <tt>name</tt>.
   * 
   * @param name value to be assigned to property name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Getter method for property <tt>status</tt>.
   * 
   * @return property value of status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Setter method for property <tt>status</tt>.
   * 
   * @param status value to be assigned to property status
   */
  public void setStatus(String status) {
    this.status = status;
  }
  
}
