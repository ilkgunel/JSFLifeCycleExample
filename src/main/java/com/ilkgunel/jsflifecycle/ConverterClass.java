package com.ilkgunel.jsflifecycle;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("converter")
public class ConverterClass implements Converter {

    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        System.out.println("Dönüştürücü Sınıfı Obje Olarak Getirme Metodu Çalıştı: " + value);
        return value;
    }
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        System.out.println("Dönüştürücü Sınıfı String Olarak Getirme Metodu Çalıştı" + value);
        return (String) value;
    }

}

