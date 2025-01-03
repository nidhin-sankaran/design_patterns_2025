package com.offer24.adhost.prototype.configuration;

import com.offer24.adhost.common.ClonableObject;

public class Configuration implements ClonableObject<Configuration> {
    private int configId;
    private String configName;
    private String configDescription;
    private ConfigType type;

    public Configuration() {

    }
    Configuration(Configuration config) {
        this.configId = config.configId;
        this.configName = config.configName;
        this.configDescription = config.configDescription;
        this.type = config.type;
    }


    @Override
    public Configuration clone() {
        return new Configuration(this);
    }

    public int getConfigId() {
        return configId;
    }

    public void setConfigId(int configId) {
        this.configId = configId;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public String getConfigDescription() {
        return configDescription;
    }

    public void setConfigDescription(String configDescription) {
        this.configDescription = configDescription;
    }

    public ConfigType getType() {
        return type;
    }

    public void setType(ConfigType type) {
        this.type = type;
    }
}
