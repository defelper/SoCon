/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cli;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author exceltior
 */
public class Gestor extends Utilizador implements Serializable {

    private int id_gestor;
    private Sala[] salas_geridas;
    private boolean superuser;

    public Gestor(int id_gestor, boolean superuser, String username, String password, String nome, String apelido,
            Date data_nascimento, String email, String rua, String numero, String complemento,
            String cidade, String pais) {
        super(username, password, nome, apelido, data_nascimento, email, rua, numero,
                complemento, cidade, pais,2);
        this.id_gestor = id_gestor;
        this.superuser = false;
    }

    public Sala[] getSalas_geridas() {
        return salas_geridas;
    }

    public int getId_gestor() {
        return id_gestor;
    }

    public boolean isSuperuser() {
        return superuser;
    }

    public void setId_gestor(int id_gestor) {
        this.id_gestor = id_gestor;
    }

    public void setSuperuser(boolean superuser) {
        this.superuser = superuser;
    }
}
