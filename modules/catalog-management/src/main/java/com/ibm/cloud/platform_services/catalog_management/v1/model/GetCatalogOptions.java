/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.platform_services.catalog_management.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getCatalog options.
 */
public class GetCatalogOptions extends GenericModel {

  protected String catalogIdentifier;

  /**
   * Builder.
   */
  public static class Builder {
    private String catalogIdentifier;

    private Builder(GetCatalogOptions getCatalogOptions) {
      this.catalogIdentifier = getCatalogOptions.catalogIdentifier;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param catalogIdentifier the catalogIdentifier
     */
    public Builder(String catalogIdentifier) {
      this.catalogIdentifier = catalogIdentifier;
    }

    /**
     * Builds a GetCatalogOptions.
     *
     * @return the new GetCatalogOptions instance
     */
    public GetCatalogOptions build() {
      return new GetCatalogOptions(this);
    }

    /**
     * Set the catalogIdentifier.
     *
     * @param catalogIdentifier the catalogIdentifier
     * @return the GetCatalogOptions builder
     */
    public Builder catalogIdentifier(String catalogIdentifier) {
      this.catalogIdentifier = catalogIdentifier;
      return this;
    }
  }

  protected GetCatalogOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.catalogIdentifier,
      "catalogIdentifier cannot be empty");
    catalogIdentifier = builder.catalogIdentifier;
  }

  /**
   * New builder.
   *
   * @return a GetCatalogOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the catalogIdentifier.
   *
   * Catalog identifier.
   *
   * @return the catalogIdentifier
   */
  public String catalogIdentifier() {
    return catalogIdentifier;
  }
}

