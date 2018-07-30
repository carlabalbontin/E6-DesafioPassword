package com.cbalt.desafiopassword;

public interface PasswordCallback {
    void inputBlank();
    void insuficientCharacters();
    void success();
}
