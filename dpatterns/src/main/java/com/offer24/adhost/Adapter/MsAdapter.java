package com.offer24.adhost.Adapter;

import java.util.List;

public class MsAdapter implements  TransalationProviderAdapter {
    MsApi api = new MsApi();
    @Override
    public void transalate(TransalationReq req) {
        api.transalate(req.sourceLanguage, req.targetLanguage);
        System.out.println("MS");

    }

    @Override
    public List<String> getSupportedLanguages() {
        return api.getMsSupportedLang();
    }
}
