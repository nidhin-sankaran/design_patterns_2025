package com.offer24.adhost.prototype.registry;

import com.offer24.adhost.prototype.configuration.ConfigType;
import com.offer24.adhost.prototype.configuration.Configuration;

import java.util.HashMap;
import java.util.Map;

public class ConfigRegistryImpl implements  ConfigProtoRegistry {
    Map<ConfigType, Configuration> map = new HashMap<>();


    @Override
    public void addPrototype(Configuration c) {
        map.put(c.getType(), c);

    }

    @Override
    public Configuration getPrototype(ConfigType type) {
        return map.get(type).clone();
    }

}
