package com.offer24.adhost.Adapter;

import java.util.List;

public class GoogleTransalatorAdapter implements  TransalationProviderAdapter {
    GoogleApi api = new GoogleApi();
    @Override
    public void transalate(TransalationReq req) {
        api.convert(req.sourceLanguage, req.targetLanguage);
        System.out.println("Google");

    }

    @Override
    public List<String> getSupportedLanguages() {
        return  api.getSuppLang();
    }
}
