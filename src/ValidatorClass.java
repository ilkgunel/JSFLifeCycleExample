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
