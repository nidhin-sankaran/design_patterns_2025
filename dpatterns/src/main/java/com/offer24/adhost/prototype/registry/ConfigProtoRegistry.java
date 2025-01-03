package com.offer24.adhost.prototype.registry;

import com.offer24.adhost.prototype.configuration.ConfigType;
import com.offer24.adhost.prototype.configuration.Configuration;

import java.util.HashMap;
import java.util.Map;

public interface ConfigProtoRegistry {
    void addPrototype(Configuration c);
    Configuration getPrototype(ConfigType type);
}
