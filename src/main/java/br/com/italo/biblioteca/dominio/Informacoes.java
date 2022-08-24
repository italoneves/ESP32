package br.com.italo.biblioteca.dominio;

import java.io.Serializable;

public class Informacoes implements Serializable {

    private String temperatura;
    private String sensor;
    private String statusAr;

    public Informacoes(String temperatura, String sensor, String statusAr) {
        this.temperatura = temperatura;
        this.sensor = sensor;
        this.statusAr = statusAr;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getStatusAr() {
        return statusAr;
    }

    public void setStatusAr(String statusAr) {
        this.statusAr = statusAr;
    }
}
