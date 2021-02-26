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
package io.swagger.client.api

import io.swagger.client.model.Hkcode
import io.swagger.client.model.QR
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object HkprovisionApi {

  /**
   * 
   * Expected answers:
   *   code 405 :  (Invalid input)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param apiKey 
   * @param body homekit objects needed for homekit provisioning
   */
  def changehkcode(apiKey: String, body: Hkcode)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "https://virtserver.swaggerhub.com/cbeck-insteon/test/1.0.0", "/hk/code", "application/json")
      .withApiKey(apiKey, "api_key", HEADER)
      .withBody(body)
      .withHeaderParam("api_key", apiKey)
      .withErrorResponse[Unit](405)
        /**
   * 
   * Expected answers:
   *   code 400 :  (Invalid ID supplied)
   *   code 404 :  (homekit code not found)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param apiKey 
   */
  def deletehkcode(apiKey: String)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.DELETE, "https://virtserver.swaggerhub.com/cbeck-insteon/test/1.0.0", "/hk/code", "application/json")
      .withApiKey(apiKey, "api_key", HEADER)
      .withHeaderParam("api_key", apiKey)
      .withErrorResponse[Unit](400)
      .withErrorResponse[Unit](404)
        /**
   * 
   * Expected answers:
   *   code 405 :  (Invalid input)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param apiKey 
   * @param body QR objects needed for wifi provisioning
   */
  def gethkcode(apiKey: String, body: QR)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.GET, "https://virtserver.swaggerhub.com/cbeck-insteon/test/1.0.0", "/hk/code", "application/json")
      .withApiKey(apiKey, "api_key", HEADER)
      .withBody(body)
      .withHeaderParam("api_key", apiKey)
      .withErrorResponse[Unit](405)
        /**
   * 
   * Expected answers:
   *   code 405 :  (Invalid input)
   * 
   * Available security schemes:
   *   api_key (apiKey)
   * 
   * @param apiKey 
   * @param body homekit objects needed for homekit provisioning
   */
  def hkCodePost(apiKey: String, body: Hkcode)(implicit apiKey: ApiKeyValue): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.POST, "https://virtserver.swaggerhub.com/cbeck-insteon/test/1.0.0", "/hk/code", "application/json")
      .withApiKey(apiKey, "api_key", HEADER)
      .withBody(body)
      .withHeaderParam("api_key", apiKey)
      .withErrorResponse[Unit](405)
      

}
