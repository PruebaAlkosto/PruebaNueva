package stepdefinition;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import task.LoginPage;
import net.thucydides.core.annotations.Step;

public class PortalStep {

    LoginPage pageLogin;


    @Dado("El usuario quiere loguearse")
    public void elUsuarioQuiereLoguearse() {
        pageLogin.open();

    }

    @Cuando("da click en continuar")
    public void daClickEnContinuar(String username, String pass) {
        pageLogin.Login(username, pass);
    }

    @Entonces("ingresa al portal")
    public void ingresaAlPortal() {
        throw new io.cucumber.java.PendingException();
    }
    @Step
    public void LoginPortal(String username, String pass) {
        pageLogin.open();
        pageLogin.Login(username, pass);
    }


}