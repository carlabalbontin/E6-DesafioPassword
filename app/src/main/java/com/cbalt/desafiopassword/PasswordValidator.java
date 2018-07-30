package com.cbalt.desafiopassword;

public class PasswordValidator {
    private PasswordCallback callback;

    public PasswordValidator(PasswordCallback callback) {
        this.callback = callback;
    }

    public void validatePassword(String value){
        if (value.trim().length() > 0){
            if (value.trim().length() >= 8){
                callback.success();
            } else {
                callback.insuficientCharacters();
            }

        } else {
            callback.inputBlank();
        }
    }
}
