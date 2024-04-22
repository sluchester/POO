package engtelecom.poo;

public class Email {
    private String rotulo;
    private String email;

    public Email(String rotulo, String email) {
        this.rotulo = rotulo;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "rotulo='" + rotulo + '\'' +
                ", email='" + email + '\'' +
                '}';
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
