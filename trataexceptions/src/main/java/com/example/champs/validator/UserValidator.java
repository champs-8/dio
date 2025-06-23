package com.example.champs.validator;

import com.example.champs.model.UserModel;
import com.example.champs.exception.ValidatorException;

public class UserValidator {
    private UserValidator(){

    }

    public static void VerifyModel(final UserModel model) throws ValidatorException{
        if(stringIsBlank(model.getName()))
            throw new ValidatorException("Informe um nome válido.");
        if(model.getName().length() <= 1)
            throw new ValidatorException("O nome deve ter mias que 1 caractere.");
        if(stringIsBlank(model.getEmail()))
            throw new ValidatorException("Informe um email válido.");
        if((!model.getEmail().contains("@")) || (!model.getEmail().contains(".")))
            throw new ValidatorException("Informe um email válido.");
    }
    
    private static boolean stringIsBlank(final String value){
        return value == null || value.isBlank();
    }
}