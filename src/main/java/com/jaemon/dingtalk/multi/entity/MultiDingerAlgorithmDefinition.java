/*
 * Copyright ©2015-2020 Jaemon. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jaemon.dingtalk.multi.entity;

import com.jaemon.dingtalk.dinger.DingerConfig;
import com.jaemon.dingtalk.multi.algorithm.AlgorithmHandler;

import java.util.List;

/**
 * MultiDingerAlgorithmDefinition
 *
 * @author Jaemon
 * @since 3.0
 */
public class MultiDingerAlgorithmDefinition {
    /**
     * dingerClass + {@link com.jaemon.dingtalk.constant.DkConstant#SPOT_SEPERATOR} + {@link AlgorithmHandler}.simpleName
     */
    private String key;
    /**
     * 算法处理类 {@link AlgorithmHandler}
     *
     * <br>
     * <code>
     *     // 父类.class.isAssignableFrom(子类.class) <br>
     *     AlgorithmHandler.class.isAssignableFrom(algorithm) = true
     * </code>
     */
    private Class<? extends AlgorithmHandler> algorithm;
    /**
     * 有效的钉钉机器人配置集合
     */
    private List<DingerConfig> dingerConfigs;

    public MultiDingerAlgorithmDefinition(String key, Class<? extends AlgorithmHandler> algorithm, List<DingerConfig> dingerConfigs) {
        this.key = key;
        this.algorithm = algorithm;
        this.dingerConfigs = dingerConfigs;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Class<? extends AlgorithmHandler> getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Class<? extends AlgorithmHandler> algorithm) {
        this.algorithm = algorithm;
    }

    public List<DingerConfig> getDingerConfigs() {
        return dingerConfigs;
    }

    public void setDingerConfigs(List<DingerConfig> dingerConfigs) {
        this.dingerConfigs = dingerConfigs;
    }
}