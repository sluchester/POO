package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private final long HORA_SEGUNDOS = 3600;
    private final long MIN_SEGUNDOS = 60;
    private final int ZERO = 0;

    public Horario(int h, int m, int s){
        if(validaHora(h)){this.hora = h;} else { this.hora = 0;}
        if(validaMinSeg(m)){this.hora = m;} else { this.minuto = 0;}
        if(validaMinSeg(s)){this.hora = s;} else { this.segundo = 0;}
    }

    public Horario(int h, int m){
        this(h,m,0);
    }

    public Horario(int h){
        this(h,0,0);
    }

    public Horario(){
        this(0,0,0);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d)" + hora, minuto, segundo);
    }

    private boolean validaHora(int n){
        if(n>= 0 && n<24){
            return true;
        } else {
            return false;
        }
    }

    private boolean validaMinSeg(int n){
        if(n>= 0 && n<60){
            return true;
        } else {
            return false;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String porExtenso(){
        String[] horaExtenso = {"zero", "uma", "duas", "tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",
                "vinte", "vinte e uma", "vinte e duas", "vinte e três"};

        String[] minutoExtenso = {"zero", "um", "dois", "tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",
                "vinte", "trinta", "quarenta", "cinquenta"}; //23

        String horaEscrita = horaExtenso[hora];

        int dezenaMin = minuto/10;
        int unidadeMin = minuto%10;

        String dezenaEscrita;
        String unidadeEscrita;

        if(dezenaMin > 1){
            dezenaEscrita = minutoExtenso[dezenaMin+18];
            unidadeEscrita = minutoExtenso[unidadeMin];
        } else{
            dezenaEscrita = minutoExtenso[minuto];
        }

        return horaEscrita+dezenaEscrita+unidadeEscrita;
    }

    public long horarioEmSegundos(){
        long varHora = hora*HORA_SEGUNDOS;
        long varMin = minuto*MIN_SEGUNDOS;

        return (varHora+varMin+segundo);
    }

    public long diferencaSegundos(Horario obj){
        return Math.abs(this.horarioEmSegundos() - obj.horarioEmSegundos());
    }
}