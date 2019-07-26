/**
 * iEngage 2.0 API
 * This API enables Intelligent Engagement for your Business. iEngage is a platform that combines process, augmented intelligence and rewards to help you intelligently engage customers.
 *
 * OpenAPI spec version: 2.0
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


package com.iengage.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CommandInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-18T06:00:03.235Z")
public class CommandInfo   {
  @SerializedName("commandClass")
  private String commandClass = null;

  @SerializedName("commandName")
  private String commandName = null;

  public CommandInfo commandClass(String commandClass) {
    this.commandClass = commandClass;
    return this;
  }

   /**
   * Get commandClass
   * @return commandClass
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommandClass() {
    return commandClass;
  }

  public void setCommandClass(String commandClass) {
    this.commandClass = commandClass;
  }

  public CommandInfo commandName(String commandName) {
    this.commandName = commandName;
    return this;
  }

   /**
   * Get commandName
   * @return commandName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCommandName() {
    return commandName;
  }

  public void setCommandName(String commandName) {
    this.commandName = commandName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandInfo commandInfo = (CommandInfo) o;
    return Objects.equals(this.commandClass, commandInfo.commandClass) &&
        Objects.equals(this.commandName, commandInfo.commandName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commandClass, commandName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandInfo {\n");
    
    sb.append("    commandClass: ").append(toIndentedString(commandClass)).append("\n");
    sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
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

