/*
 * (C) Copyright IBM Corp. 2025.
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

package com.ibm.cloud.platform_services.iam_identity.v1.model;

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createProfileTemplate options.
 */
public class CreateProfileTemplateOptions extends GenericModel {

  protected String accountId;
  protected String name;
  protected String description;
  protected TemplateProfileComponentRequest profile;
  protected List<PolicyTemplateReference> policyTemplateReferences;
  protected ActionControls actionControls;

  /**
   * Builder.
   */
  public static class Builder {
    private String accountId;
    private String name;
    private String description;
    private TemplateProfileComponentRequest profile;
    private List<PolicyTemplateReference> policyTemplateReferences;
    private ActionControls actionControls;

    /**
     * Instantiates a new Builder from an existing CreateProfileTemplateOptions instance.
     *
     * @param createProfileTemplateOptions the instance to initialize the Builder with
     */
    private Builder(CreateProfileTemplateOptions createProfileTemplateOptions) {
      this.accountId = createProfileTemplateOptions.accountId;
      this.name = createProfileTemplateOptions.name;
      this.description = createProfileTemplateOptions.description;
      this.profile = createProfileTemplateOptions.profile;
      this.policyTemplateReferences = createProfileTemplateOptions.policyTemplateReferences;
      this.actionControls = createProfileTemplateOptions.actionControls;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CreateProfileTemplateOptions.
     *
     * @return the new CreateProfileTemplateOptions instance
     */
    public CreateProfileTemplateOptions build() {
      return new CreateProfileTemplateOptions(this);
    }

    /**
     * Adds a new element to policyTemplateReferences.
     *
     * @param policyTemplateReferences the new element to be added
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder addPolicyTemplateReferences(PolicyTemplateReference policyTemplateReferences) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(policyTemplateReferences,
        "policyTemplateReferences cannot be null");
      if (this.policyTemplateReferences == null) {
        this.policyTemplateReferences = new ArrayList<PolicyTemplateReference>();
      }
      this.policyTemplateReferences.add(policyTemplateReferences);
      return this;
    }

    /**
     * Set the accountId.
     *
     * @param accountId the accountId
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the profile.
     *
     * @param profile the profile
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder profile(TemplateProfileComponentRequest profile) {
      this.profile = profile;
      return this;
    }

    /**
     * Set the policyTemplateReferences.
     * Existing policyTemplateReferences will be replaced.
     *
     * @param policyTemplateReferences the policyTemplateReferences
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder policyTemplateReferences(List<PolicyTemplateReference> policyTemplateReferences) {
      this.policyTemplateReferences = policyTemplateReferences;
      return this;
    }

    /**
     * Set the actionControls.
     *
     * @param actionControls the actionControls
     * @return the CreateProfileTemplateOptions builder
     */
    public Builder actionControls(ActionControls actionControls) {
      this.actionControls = actionControls;
      return this;
    }
  }

  protected CreateProfileTemplateOptions() { }

  protected CreateProfileTemplateOptions(Builder builder) {
    accountId = builder.accountId;
    name = builder.name;
    description = builder.description;
    profile = builder.profile;
    policyTemplateReferences = builder.policyTemplateReferences;
    actionControls = builder.actionControls;
  }

  /**
   * New builder.
   *
   * @return a CreateProfileTemplateOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accountId.
   *
   * ID of the account where the template resides.
   *
   * @return the accountId
   */
  public String accountId() {
    return accountId;
  }

  /**
   * Gets the name.
   *
   * The name of the trusted profile template. This is visible only in the enterprise account. Required field when
   * creating a new template. Otherwise this field is optional. If the field is included it will change the name value
   * for all existing versions of the template.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the description.
   *
   * The description of the trusted profile template. Describe the template for enterprise account users.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the profile.
   *
   * Input body parameters for the TemplateProfileComponent.
   *
   * @return the profile
   */
  public TemplateProfileComponentRequest profile() {
    return profile;
  }

  /**
   * Gets the policyTemplateReferences.
   *
   * Existing policy templates that you can reference to assign access in the trusted profile component.
   *
   * @return the policyTemplateReferences
   */
  public List<PolicyTemplateReference> policyTemplateReferences() {
    return policyTemplateReferences;
  }

  /**
   * Gets the actionControls.
   *
   * @return the actionControls
   */
  public ActionControls actionControls() {
    return actionControls;
  }
}

