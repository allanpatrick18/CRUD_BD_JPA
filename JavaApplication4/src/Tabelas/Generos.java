/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabelas;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author allan
 */

@Entity
@Table(name = "generos")
public class Generos implements Serializable{

    @Id
    private Integer GENERO_ID;
    private String DESCRICAO;

    /**
     * @return the GENERO_ID
     */
    public Integer getGENERO_ID() {
        return GENERO_ID;
    }

    /**
     * @param GENERO_ID the GENERO_ID to set
     */
    public void setGENERO_ID(Integer GENERO_ID) {
        this.GENERO_ID = GENERO_ID;
    }

    /**
     * @return the DESCRICAO
     */
    public String getDESCRICAO() {  
        return DESCRICAO;
    }

    /**
     * @param DESCRICAO the DESCRICAO to set
     */
    public void setDESCRICAO(String DESCRICAO) {
        this.DESCRICAO = DESCRICAO;
    }

   
 

}
