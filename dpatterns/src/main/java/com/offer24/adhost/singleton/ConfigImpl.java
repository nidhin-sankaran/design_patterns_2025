package com.offer24.adhost.singleton;

public class ConfigImpl implements  Config{
    private static ConfigImpl instance;
    private ConfigImpl(){
        super();

    }
    public static ConfigImpl getInstance(){
        if(instance == null) {
            synchronized(ConfigImpl.class) {
                if(instance == null) {
                    return instance = new ConfigImpl();
                }
            }
        }
        return instance;
    }
    public  static  void  resetInstance(){
        instance = null;
    }
    @Override
    public void getConfig() {
        System.out.println("ConfigImpl");
    }
}
