/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.ejb;

import com.gustavo.model.Tema;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gustavo
 */
@Stateless
public class TemaFacade extends AbstractFacade<Tema> implements TemaFacadeLocal {
    @PersistenceContext(unitName = "primePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TemaFacade() {
        super(Tema.class);
    }
    
}
