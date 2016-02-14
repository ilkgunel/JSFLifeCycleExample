/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilkgunel.jsflifecycle;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validator")
public class ValidatorClass implements Validator {

    public void validate(FacesContext context, UIComponent component, Object value)
            throws ValidatorException
    {
        System.out.println("Geçerlilik Denetleyici Metodu Çalıştı: " + value);
    }
}

