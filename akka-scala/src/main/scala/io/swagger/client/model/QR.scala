/**
 * Vantaa DC01-NWP HOST to DISPLAY HOST API 
 * API for Vantaa DC01 between NETWORK HOST [NWP] and DISPLAY HOST [DHP].  You can find out more about Smartlabs DC01 at [https://smartlabsinc.com](h://smartlabsinc.com).   For this sample, you can use the api key `special-key` to test the authorization     filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@smartlabsinc.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class QR (
  insteonID: Option[String] = None,
  prodRev: Option[String] = None,
  model: Option[String] = None,
  serial: Option[Long] = None,
  datecode: Option[String] = None,
  username: Option[String] = None,
  password: Option[String] = None
) extends ApiModel


