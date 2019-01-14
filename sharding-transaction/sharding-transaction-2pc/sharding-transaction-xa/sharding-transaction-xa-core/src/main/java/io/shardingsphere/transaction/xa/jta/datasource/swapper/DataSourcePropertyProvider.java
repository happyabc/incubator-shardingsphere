/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.transaction.xa.jta.datasource.swapper;

/**
 * Data source property provider.
 *
 * @author zhangliang
 */
public interface DataSourcePropertyProvider {
    
    /**
     * Get data source class name.
     *
     * @return data source class name
     */
    String getDataSourceClassName();
    
    /**
     * Get URL property name.
     * 
     * @return URL property name
     */
    String getURLPropertyName();
    
    /**
     * Get username property name.
     *
     * @return username property name
     */
    String getUsernamePropertyName();
    
    /**
     * Get password property name.
     *
     * @return password property name
     */
    String getPasswordPropertyName();
}