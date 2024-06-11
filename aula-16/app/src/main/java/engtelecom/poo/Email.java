package engtelecom.poo;

public class Email {
    private String rotulo;
    private String email;

    public Email(String rotulo, String email) {
        this.rotulo = rotulo;
        if(validaEmail(email)){ this.email = email;} else{ this.email = null;}
    }

    @Override
    public String toString() {
        return "Email{" +
                "rotulo='" + rotulo + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private boolean validaEmail(String email){
        String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a−z]{2,})$";
        //String email = "meu.email@dominio.com.br";
        if (email.matches(eR)){
            return true;
        } else{
            return false;
        }
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}