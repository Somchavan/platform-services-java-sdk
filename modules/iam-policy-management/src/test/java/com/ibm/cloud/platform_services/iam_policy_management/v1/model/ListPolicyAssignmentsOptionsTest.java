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

package com.ibm.cloud.platform_services.iam_policy_management.v1.model;

import com.ibm.cloud.platform_services.iam_policy_management.v1.model.ListPolicyAssignmentsOptions;
import com.ibm.cloud.platform_services.iam_policy_management.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListPolicyAssignmentsOptions model.
 */
public class ListPolicyAssignmentsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListPolicyAssignmentsOptions() throws Throwable {
    ListPolicyAssignmentsOptions listPolicyAssignmentsOptionsModel = new ListPolicyAssignmentsOptions.Builder()
      .version("1.0")
      .accountId("testString")
      .acceptLanguage("default")
      .templateId("testString")
      .templateVersion("testString")
      .limit(Long.valueOf("50"))
      .start("testString")
      .build();
    assertEquals(listPolicyAssignmentsOptionsModel.version(), "1.0");
    assertEquals(listPolicyAssignmentsOptionsModel.accountId(), "testString");
    assertEquals(listPolicyAssignmentsOptionsModel.acceptLanguage(), "default");
    assertEquals(listPolicyAssignmentsOptionsModel.templateId(), "testString");
    assertEquals(listPolicyAssignmentsOptionsModel.templateVersion(), "testString");
    assertEquals(listPolicyAssignmentsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listPolicyAssignmentsOptionsModel.start(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListPolicyAssignmentsOptionsError() throws Throwable {
    new ListPolicyAssignmentsOptions.Builder().build();
  }

}