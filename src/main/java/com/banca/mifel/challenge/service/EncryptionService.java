package com.banca.mifel.challenge.service;

import com.banca.mifel.challenge.dto.EncryptedString;
public interface EncryptionService {
    EncryptedString getEncryptString(String value);
}
