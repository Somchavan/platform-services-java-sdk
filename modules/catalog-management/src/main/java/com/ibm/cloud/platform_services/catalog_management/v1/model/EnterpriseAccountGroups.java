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
 * Map of account group ids to AccountGroup objects.
 */
public class EnterpriseAccountGroups extends GenericModel {

  protected AccountGroup keys;

  /**
   * Builder.
   */
  public static class Builder {
    private AccountGroup keys;

    private Builder(EnterpriseAccountGroups enterpriseAccountGroups) {
      this.keys = enterpriseAccountGroups.keys;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EnterpriseAccountGroups.
     *
     * @return the new EnterpriseAccountGroups instance
     */
    public EnterpriseAccountGroups build() {
      return new EnterpriseAccountGroups(this);
    }

    /**
     * Set the keys.
     *
     * @param keys the keys
     * @return the EnterpriseAccountGroups builder
     */
    public Builder keys(AccountGroup keys) {
      this.keys = keys;
      return this;
    }
  }

  protected EnterpriseAccountGroups(Builder builder) {
    keys = builder.keys;
  }

  /**
   * New builder.
   *
   * @return a EnterpriseAccountGroups builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the keys.
   *
   * Filters for an Account Group.
   *
   * @return the keys
   */
  public AccountGroup keys() {
    return keys;
  }
}

