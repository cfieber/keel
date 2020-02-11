/*
 * Copyright 2017 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

plugins {
  `java-library`
  id("kotlin-spring")
}

dependencies {
  api(project(":keel-api"))

  implementation("com.fasterxml.jackson.core:jackson-databind")
  implementation("org.springframework:spring-context")
  implementation("org.springframework.boot:spring-boot-autoconfigure")

  // this is really just so we can access `configuredObjectMapper`
  testImplementation(project(":keel-core"))

  testImplementation("io.strikt:strikt-jackson")
  testImplementation("dev.minutest:minutest")
}