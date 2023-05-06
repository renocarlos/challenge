package com.banca.mifel.challenge.controller;

import com.banca.mifel.challenge.dto.EncryptedString;
import com.banca.mifel.challenge.service.EncryptionService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("encryption")
@NoArgsConstructor
public class EncryptionController {

    @Autowired
    EncryptionService encryptionService;

    @PostMapping("/encrypt")
    public ResponseEntity<EncryptedString> getEncryptString(@RequestBody String value) {
        return new ResponseEntity<>(encryptionService.getEncryptString(value), HttpStatus.OK);
    }
}
