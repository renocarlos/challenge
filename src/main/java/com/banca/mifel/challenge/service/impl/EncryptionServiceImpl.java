package com.banca.mifel.challenge.service.impl;

import com.banca.mifel.challenge.dto.EncryptedString;
import com.banca.mifel.challenge.service.EncryptionService;
import com.banca.mifel.challenge.utils.AESCrypt;
import org.springframework.stereotype.Service;

@Service
public class EncryptionServiceImpl implements EncryptionService {

    @Override
    public EncryptedString getEncryptString(String value) {
        return new EncryptedString(AESCrypt.encrypt(value));
    }

}
