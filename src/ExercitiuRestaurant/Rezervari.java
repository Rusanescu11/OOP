package ExercitiuRestaurant;

import java.time.LocalDateTime;

public class Rezervari {
    private LocalDateTime dataInceput;
    private LocalDateTime dataSfarsir;
    private  int numarPersoane;
    private String numePersoaneCareauRezervatMasa;

    public Rezervari(int numarPersoane,LocalDateTime dataDeInceput, LocalDateTime dataDePlecare,String numePersoanaCareauRezervatMasa) {
        this.dataInceput = dataDeInceput;
        this.dataSfarsir = dataDePlecare;
        this.numarPersoane = numarPersoane;
       this.numePersoaneCareauRezervatMasa=numePersoanaCareauRezervatMasa;
    }



    public LocalDateTime getDataInceput() {
        return dataInceput;
    }

    public void setDataInceput(LocalDateTime dataInceput) {
        this.dataInceput = dataInceput;
    }

    public LocalDateTime getDataSfarsir() {
        return dataSfarsir;
    }

    public void setDataSfarsir(LocalDateTime dataSfarsir) {
        this.dataSfarsir = dataSfarsir;
    }

    public String getNumePersoaneCareauRezervatMasa() {
        return numePersoaneCareauRezervatMasa;
    }

    public void setNumePersoaneCareauRezervatMasa(String numePersoaneCareauRezervatMasa) {
        this.numePersoaneCareauRezervatMasa = numePersoaneCareauRezervatMasa;
    }



    public int getNumarPersoane() {
        return numarPersoane;
    }

    public void setNumarPersoane(int numarPersoane) {
        this.numarPersoane = numarPersoane;
    }
}
