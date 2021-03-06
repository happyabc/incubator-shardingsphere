/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.parsing.parser.context.condition;

import lombok.Getter;
import lombok.ToString;
import org.apache.shardingsphere.core.parsing.parser.expression.SQLTextExpression;

import java.util.Collections;
import java.util.List;

/**
 * Generated key condition.
 * 
 * @author zhangliang
 * @author maxiaoguang
 * @author panjuan
 */
@Getter
@ToString
public final class GeneratedKeyCondition extends Condition {
    
    private final Column column;
    
    private final int index;
    
    private final Comparable<?> value;
    
    public GeneratedKeyCondition(final Column column, final int index, final Comparable<?> value) {
        super(column, new SQLTextExpression(String.valueOf(value)));
        this.column = column;
        this.index = index;
        this.value = value;
    }
    
    @Override
    public List<Comparable<?>> getConditionValues(final List<?> parameters) {
        Comparable<?> result = null == value ? (Comparable<?>) parameters.get(index) : value;
        return Collections.<Comparable<?>>singletonList(result);
    }
}
