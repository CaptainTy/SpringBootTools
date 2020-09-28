/**
 * 
 * Copyright (c) 2018 All Rights Reserved.
 */
package sample.simple.rest.dto;

/**
 * 
 * @author TY
 * @version $Id: RetObject.java, v 0.1 Sep 1, 2018 11:13:24 AM TY Exp $
 */
public class RetObject {
  
  private String message;
  
  private String content;
  
  private String status;

  /**
   * Getter method for property <tt>message</tt>.
   * 
   * @return property value of message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Setter method for property <tt>message</tt>.
   * 
   * @param message value to be assigned to property message
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * Getter method for property <tt>content</tt>.
   * 
   * @return property value of content
   */
  public String getContent() {
    return content;
  }

  /**
   * Setter method for property <tt>content</tt>.
   * 
   * @param content value to be assigned to property content
   */
  public void setContent(String content) {
    this.content = content;
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
