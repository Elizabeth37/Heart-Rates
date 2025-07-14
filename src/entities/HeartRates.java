package entities;

import java.time.Instant;
import java.time.LocalDate;

public class HeartRates {

    //ATRIBUTOS
    private String name;
    private String sobrenome;
    private int dataNasc;
    private int mesNasc;
    private int anoNasc;

    public HeartRates(String name, String sobrenome, int diaNasc, int mesNasc, int anoNasc) {
        this.name = name;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.mesNasc = mesNasc;
        this.anoNasc = anoNasc;
    }

    //GETTERS E SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getMesNasc() {
        return mesNasc;
    }

    public void setMesNasc(int mesNasc) {
        this.mesNasc = mesNasc;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    //MÉTODO PARA CALCULAR A IDADE
    public int getIdade(){
        int anoAtual = LocalDate.now().getYear();
        int mesAtual = LocalDate.now().getMonthValue();
        int diaAtual = LocalDate.now().getDayOfMonth();

        int idade = anoAtual - anoNasc;

        return idade;
    }

    //MÉTODO PARA CALCULAR FREQUÊNCIA CARDÍACA MÁXIMA
    public int rateMax(){
        int idade = getIdade();
        return 220 - idade;

    }


    public String ratealvo() {
        int fcMax = rateMax();
        int fcAlvoMin = (int) (fcMax * 0.5);
        int fcAlvoMax = (int) (fcMax * 0.85);

        return fcAlvoMin + " - " + fcAlvoMax + " bpm ";
    }

        @Override
        public String toString(){
            return " ---INFORMAÇÕES DE " + name.toUpperCase() + " " + sobrenome.toUpperCase() +  " ---"
                    + " \nIdade: " + getIdade() + "anos"
                    + " \nFrequência cardíaca máxima: " + rateMax() + "bpm"
                    + "\nFrequência cardíaca alvo (50- 85%): " + ratealvo();

        }
    }
