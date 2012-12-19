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
public class Cliente extends Utilizador implements Serializable{
    private Publicidade publ_activa [];
    private int total_publ_actuais;
    private int total_publ_realizadas;
    private int total_publ_expiradas;
    private int investimento_feito;
    private Publicidade [] publ_historico;
    private int n_publ_hist;
    private int n_publ_activa;

    public Cliente(String username, String password, String nome, String apelido,
            Date data_nascimento, String email, String rua, String numero, String complemento,
            String cidade, String pais) {
        super(username, password, nome, apelido, data_nascimento, email, rua, numero,
                complemento, cidade, pais,1);
        publ_activa = new Publicidade[250];
        total_publ_actuais = 0;
        total_publ_expiradas = 0;
        total_publ_realizadas = 0;
        n_publ_activa = 0;
        n_publ_hist = 0;
        publ_historico = new Publicidade[250];
        investimento_feito = 0;
        
    }

    
}
