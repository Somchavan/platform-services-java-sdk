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

import com.ibm.cloud.platform_services.catalog_management.v1.model.Configuration;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Deployment;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Feature;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Kind;
import com.ibm.cloud.platform_services.catalog_management.v1.model.License;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Plan;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Resource;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Script;
import com.ibm.cloud.platform_services.catalog_management.v1.model.State;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Validation;
import com.ibm.cloud.platform_services.catalog_management.v1.model.Version;
import com.ibm.cloud.platform_services.catalog_management.v1.model.VersionEntitlement;
import com.ibm.cloud.platform_services.catalog_management.v1.utils.TestUtilities;

import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Kind model.
 */
public class KindTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testKind() throws Throwable {
    Configuration configurationModel = new Configuration.Builder()
      .key("testString")
      .type("testString")
      .defaultValue("testString")
      .valueConstraint("testString")
      .description("testString")
      .required(true)
      .options(new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")))
      .hidden(true)
      .build();
    assertEquals(configurationModel.key(), "testString");
    assertEquals(configurationModel.type(), "testString");
    assertEquals(configurationModel.defaultValue(), "testString");
    assertEquals(configurationModel.valueConstraint(), "testString");
    assertEquals(configurationModel.description(), "testString");
    assertEquals(configurationModel.required(), Boolean.valueOf(true));
    assertEquals(configurationModel.options(), new java.util.ArrayList<Object>(java.util.Arrays.asList("testString")));
    assertEquals(configurationModel.hidden(), Boolean.valueOf(true));

    Deployment deploymentModel = new Deployment.Builder()
      .id("testString")
      .label("testString")
      .name("testString")
      .shortDescription("testString")
      .longDescription("testString")
      .metadata(new java.util.HashMap<String,Object>(){{put("foo", "testString"); }})
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .created(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .updated(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .build();
    assertEquals(deploymentModel.id(), "testString");
    assertEquals(deploymentModel.label(), "testString");
    assertEquals(deploymentModel.name(), "testString");
    assertEquals(deploymentModel.shortDescription(), "testString");
    assertEquals(deploymentModel.longDescription(), "testString");
    assertEquals(deploymentModel.metadata(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }});
    assertEquals(deploymentModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(deploymentModel.created(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(deploymentModel.updated(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));

    Feature featureModel = new Feature.Builder()
      .title("testString")
      .description("testString")
      .build();
    assertEquals(featureModel.title(), "testString");
    assertEquals(featureModel.description(), "testString");

    License licenseModel = new License.Builder()
      .id("testString")
      .name("testString")
      .type("testString")
      .url("testString")
      .description("testString")
      .build();
    assertEquals(licenseModel.id(), "testString");
    assertEquals(licenseModel.name(), "testString");
    assertEquals(licenseModel.type(), "testString");
    assertEquals(licenseModel.url(), "testString");
    assertEquals(licenseModel.description(), "testString");

    Resource resourceModel = new Resource.Builder()
      .type("mem")
      .value("testString")
      .build();
    assertEquals(resourceModel.type(), "mem");
    assertEquals(resourceModel.value(), "testString");

    Script scriptModel = new Script.Builder()
      .instructions("testString")
      .script("testString")
      .scriptPermission("testString")
      .deleteScript("testString")
      .scope("testString")
      .build();
    assertEquals(scriptModel.instructions(), "testString");
    assertEquals(scriptModel.script(), "testString");
    assertEquals(scriptModel.scriptPermission(), "testString");
    assertEquals(scriptModel.deleteScript(), "testString");
    assertEquals(scriptModel.scope(), "testString");

    State stateModel = new State.Builder()
      .current("testString")
      .currentEntered(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .pending("testString")
      .pendingRequested(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .previous("testString")
      .build();
    assertEquals(stateModel.current(), "testString");
    assertEquals(stateModel.currentEntered(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(stateModel.pending(), "testString");
    assertEquals(stateModel.pendingRequested(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(stateModel.previous(), "testString");

    Validation validationModel = new Validation.Builder()
      .validated(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .requested(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .state("testString")
      .lastOperation("testString")
      .target(new java.util.HashMap<String,Object>(){{put("foo", "testString"); }})
      .build();
    assertEquals(validationModel.validated(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(validationModel.requested(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(validationModel.state(), "testString");
    assertEquals(validationModel.lastOperation(), "testString");
    assertEquals(validationModel.target(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }});

    VersionEntitlement versionEntitlementModel = new VersionEntitlement.Builder()
      .providerName("testString")
      .providerId("testString")
      .productId("testString")
      .partNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .imageRepoName("testString")
      .build();
    assertEquals(versionEntitlementModel.providerName(), "testString");
    assertEquals(versionEntitlementModel.providerId(), "testString");
    assertEquals(versionEntitlementModel.productId(), "testString");
    assertEquals(versionEntitlementModel.partNumbers(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(versionEntitlementModel.imageRepoName(), "testString");

    Plan planModel = new Plan.Builder()
      .id("testString")
      .label("testString")
      .name("testString")
      .shortDescription("testString")
      .longDescription("testString")
      .metadata(new java.util.HashMap<String,Object>(){{put("foo", "testString"); }})
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .additionalFeatures(new java.util.ArrayList<Feature>(java.util.Arrays.asList(featureModel)))
      .created(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .updated(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .deployments(new java.util.ArrayList<Deployment>(java.util.Arrays.asList(deploymentModel)))
      .build();
    assertEquals(planModel.id(), "testString");
    assertEquals(planModel.label(), "testString");
    assertEquals(planModel.name(), "testString");
    assertEquals(planModel.shortDescription(), "testString");
    assertEquals(planModel.longDescription(), "testString");
    assertEquals(planModel.metadata(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }});
    assertEquals(planModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(planModel.additionalFeatures(), new java.util.ArrayList<Feature>(java.util.Arrays.asList(featureModel)));
    assertEquals(planModel.created(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(planModel.updated(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(planModel.deployments(), new java.util.ArrayList<Deployment>(java.util.Arrays.asList(deploymentModel)));

    Version versionModel = new Version.Builder()
      .id("testString")
      .rev("testString")
      .crn("testString")
      .version("testString")
      .sha("testString")
      .created(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .updated(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .offeringId("testString")
      .catalogId("testString")
      .kindId("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .repoUrl("testString")
      .sourceUrl("testString")
      .tgzUrl("testString")
      .configuration(new java.util.ArrayList<Configuration>(java.util.Arrays.asList(configurationModel)))
      .metadata(new java.util.HashMap<String,Object>(){{put("foo", "testString"); }})
      .validation(validationModel)
      .requiredResources(new java.util.ArrayList<Resource>(java.util.Arrays.asList(resourceModel)))
      .singleInstance(true)
      .install(scriptModel)
      .preInstall(new java.util.ArrayList<Script>(java.util.Arrays.asList(scriptModel)))
      .entitlement(versionEntitlementModel)
      .licenses(new java.util.ArrayList<License>(java.util.Arrays.asList(licenseModel)))
      .imageManifestUrl("testString")
      .deprecated(true)
      .packageVersion("testString")
      .state(stateModel)
      .versionLocator("testString")
      .consoleUrl("testString")
      .longDescription("testString")
      .whitelistedAccounts(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(versionModel.id(), "testString");
    assertEquals(versionModel.rev(), "testString");
    assertEquals(versionModel.crn(), "testString");
    assertEquals(versionModel.version(), "testString");
    assertEquals(versionModel.sha(), "testString");
    assertEquals(versionModel.created(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(versionModel.updated(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(versionModel.offeringId(), "testString");
    assertEquals(versionModel.catalogId(), "testString");
    assertEquals(versionModel.kindId(), "testString");
    assertEquals(versionModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(versionModel.repoUrl(), "testString");
    assertEquals(versionModel.sourceUrl(), "testString");
    assertEquals(versionModel.tgzUrl(), "testString");
    assertEquals(versionModel.configuration(), new java.util.ArrayList<Configuration>(java.util.Arrays.asList(configurationModel)));
    assertEquals(versionModel.metadata(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }});
    assertEquals(versionModel.validation(), validationModel);
    assertEquals(versionModel.requiredResources(), new java.util.ArrayList<Resource>(java.util.Arrays.asList(resourceModel)));
    assertEquals(versionModel.singleInstance(), Boolean.valueOf(true));
    assertEquals(versionModel.install(), scriptModel);
    assertEquals(versionModel.preInstall(), new java.util.ArrayList<Script>(java.util.Arrays.asList(scriptModel)));
    assertEquals(versionModel.entitlement(), versionEntitlementModel);
    assertEquals(versionModel.licenses(), new java.util.ArrayList<License>(java.util.Arrays.asList(licenseModel)));
    assertEquals(versionModel.imageManifestUrl(), "testString");
    assertEquals(versionModel.deprecated(), Boolean.valueOf(true));
    assertEquals(versionModel.packageVersion(), "testString");
    assertEquals(versionModel.state(), stateModel);
    assertEquals(versionModel.versionLocator(), "testString");
    assertEquals(versionModel.consoleUrl(), "testString");
    assertEquals(versionModel.longDescription(), "testString");
    assertEquals(versionModel.whitelistedAccounts(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Kind kindModel = new Kind.Builder()
      .id("testString")
      .formatKind("testString")
      .targetKind("testString")
      .metadata(new java.util.HashMap<String,Object>(){{put("foo", "testString"); }})
      .installDescription("testString")
      .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .additionalFeatures(new java.util.ArrayList<Feature>(java.util.Arrays.asList(featureModel)))
      .created(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .updated(TestUtilities.createMockDateTime("2019-01-01T12:00:00"))
      .versions(new java.util.ArrayList<Version>(java.util.Arrays.asList(versionModel)))
      .plans(new java.util.ArrayList<Plan>(java.util.Arrays.asList(planModel)))
      .build();
    assertEquals(kindModel.id(), "testString");
    assertEquals(kindModel.formatKind(), "testString");
    assertEquals(kindModel.targetKind(), "testString");
    assertEquals(kindModel.metadata(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }});
    assertEquals(kindModel.installDescription(), "testString");
    assertEquals(kindModel.tags(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(kindModel.additionalFeatures(), new java.util.ArrayList<Feature>(java.util.Arrays.asList(featureModel)));
    assertEquals(kindModel.created(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(kindModel.updated(), TestUtilities.createMockDateTime("2019-01-01T12:00:00"));
    assertEquals(kindModel.versions(), new java.util.ArrayList<Version>(java.util.Arrays.asList(versionModel)));
    assertEquals(kindModel.plans(), new java.util.ArrayList<Plan>(java.util.Arrays.asList(planModel)));

    String json = TestUtilities.serialize(kindModel);

    Kind kindModelNew = TestUtilities.deserialize(json, Kind.class);
    assertTrue(kindModelNew instanceof Kind);
    assertEquals(kindModelNew.id(), "testString");
    assertEquals(kindModelNew.formatKind(), "testString");
    assertEquals(kindModelNew.targetKind(), "testString");
    assertEquals(kindModelNew.metadata().toString(), new java.util.HashMap<String,Object>(){{put("foo", "testString"); }}.toString());
    assertEquals(kindModelNew.installDescription(), "testString");
    assertEquals(kindModelNew.created().toString(), TestUtilities.createMockDateTime("2019-01-01T12:00:00").toString());
    assertEquals(kindModelNew.updated().toString(), TestUtilities.createMockDateTime("2019-01-01T12:00:00").toString());
  }
}