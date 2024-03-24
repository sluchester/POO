package engtelecom.poo;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    private final long HORA_SEGUNDOS = 3600;
    private final long MIN_SEGUNDOS = 60;
    private final int NEGATIVO = -1;
    private final int ZERO = 0;

    public Horario(int h, int m, int s){
        if(validaHorario(h)){this.hora = h;} else { this.hora = 0;}
        if(validaHorario(m)){this.hora = m;} else { this.minuto = 0;}
        if(validaHorario(s)){this.hora = s;} else { this.segundo = 0;}
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

    //TODO retornar da maneira correta - como fazer retornar daquele modo de 00:00:00
    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }

    private boolean validaHorario(int n){
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

    //TODO validar e finalizar a logica
    public String porExtenso(Horario hora){
        String[] horaExtenso = {"zero", "uma", "duas", "tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",
                "vinte", "vinte e uma", "vinte e duas", "vinte e três", "vinte e quatro"};

        String[] minutoExtenso = {"zero", "um", "dois", "tres","quatro", "cinco", "seis", "sete", "oito", "nove", "dez",
                "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove",
                "vinte", "trinta", "quarenta", "cinquenta"};



        return"bad";
    }

    public long horarioEmSegundos(){
        long varHora = hora*HORA_SEGUNDOS;
        long varMin = minuto*MIN_SEGUNDOS;

        return (varHora+varMin+segundo);
    }

    private long converteNegativo(long n){
        return n*NEGATIVO;
    }

    public long diferencaSegundos(Horario obj){
        long horaToSeg = obj.hora - this.hora;
        long minToSeg = obj.minuto - this.hora;
        long segToSeg = obj.segundo - this.segundo;

        if(horaToSeg < ZERO){horaToSeg=converteNegativo(horaToSeg);}
        if(minToSeg < ZERO){minToSeg=converteNegativo(minToSeg);}
        if(segToSeg < ZERO){segToSeg=converteNegativo(segToSeg);}

        return ((horaToSeg*HORA_SEGUNDOS)+(minToSeg*MIN_SEGUNDOS)+(segToSeg));
    }

}
