package com.offer24.adhost;

import com.offer24.adhost.builder.Employee;
import com.offer24.adhost.prototype.configuration.ConfigType;
import com.offer24.adhost.prototype.configuration.Configuration;
import com.offer24.adhost.prototype.registry.ConfigProtoRegistry;
import com.offer24.adhost.prototype.registry.ConfigRegistryImpl;
import com.offer24.adhost.singleton.ConfigImpl;

public class Main {
    public static void main(String[] args) {
        // prototype
        Configuration mediumConfig = new Configuration();
        mediumConfig.setConfigName("MEDIUM_C");
        mediumConfig.setConfigDescription("This is specific to Medium type");
        mediumConfig.setType(ConfigType.MEDIUM);
        ConfigProtoRegistry registry = new ConfigRegistryImpl();
        registry.addPrototype(mediumConfig);

        Configuration easyConfig = new Configuration();
        easyConfig.setConfigName("EASY_C");
        easyConfig.setConfigDescription("This is specific to EASY type");
        easyConfig.setType(ConfigType.EASY);
        registry.addPrototype(easyConfig);

        Configuration hardConfig = new Configuration();
        hardConfig.setConfigName("HARD_C");
        hardConfig.setConfigDescription("This is specific to HARD type");
        hardConfig.setType(ConfigType.HARD);
        registry.addPrototype(hardConfig);

        // clone easy
        Configuration easy = registry.getPrototype(ConfigType.EASY).clone();
        System.out.println("easy" + easy.getType());

        // clone medium
        Configuration medium = registry.getPrototype(ConfigType.MEDIUM).clone();
        System.out.println("medium" + medium.getType());

        // clone hard

        Configuration hard = registry.getPrototype(ConfigType.HARD).clone();
        System.out.println("hard" + hard.getType());


        // singleton
        ConfigImpl impl = ConfigImpl.getInstance();
        ConfigImpl impl2 = ConfigImpl.getInstance();
        System.out.println(impl);
        System.out.println(impl2);


        // builder
        Employee emp = Employee.EmployeeBuilder.getBuilder()
                .setAge(50)
                .setName("Vijay")
                .setDepartment("Engineering")
                .setDesignation("Senior mgr")
                .setSalary(4000)
                .build();
        System.out.println(emp);

    }
}