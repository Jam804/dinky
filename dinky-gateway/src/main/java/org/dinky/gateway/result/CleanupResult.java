/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dinky.gateway.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * CleanupResult
 *
 * @since 2024/12/25 20:15
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "CleanupResult", description = "Result of cleanup cluster")
public class CleanupResult {

    @ApiModelProperty(
            value = "is Success",
            dataType = "boolean",
            example = "true",
            notes = "Indicates whether the cleanup was successful")
    private boolean isSuccess;

    @ApiModelProperty(
            value = "Error message",
            dataType = "String",
            example = "An error occurred",
            notes = "Error message if the test encountered an issue")
    private String error;

    public static CleanupResult success() {
        return new CleanupResult(true, null);
    }

    public static CleanupResult fail(String error) {
        return new CleanupResult(false, error);
    }
}
