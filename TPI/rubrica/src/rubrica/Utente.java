/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica;

public class Utente {
    private int id;
    private String Nome;
    private String Cognome;
    private int num;
    static private int p = 0;

    public Utente(String Nome, String Cognome, int num) {
        this.Nome = Nome;
        this.Cognome = Cognome;
        this.num = num;
        this.id = this.p;
        p++;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public int getNum() {
        return num;
    }

    public int getId() {
        return id;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCognome(String Cognome) {
        this.Cognome = Cognome;
    }

    public void setNum(int num) {
        this.num = num;
    }

}
