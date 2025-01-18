package com.offer24.adhost.Adapter;

import java.util.List;

public interface TransalationProviderAdapter {
    void transalate(TransalationReq req);
    List<String> getSupportedLanguages();
}
