/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.engine;

/**
 * Runtime exception indicating the requested class was not found or an error occurred
 * while loading the class.
 *
 * @author Frederik Heremans
 */
public class ClassLoadingException extends ProcessEngineException {

  private static final long serialVersionUID = 1L;

  protected String className;

  public ClassLoadingException(String message, Throwable cause) {
    super(message, cause);
  }

  public ClassLoadingException(String message, String className, Throwable cause) {
    this(message, cause);
    this.className = className;
  }

  /**
   * Returns the name of the class this exception is related to.
   */
  public String getClassName() {
    return className;
  }


}