/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.ejb;

import com.gustavo.model.Compromiso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Gustavo
 */
@Stateless
public class CompromisoFacade extends AbstractFacade<Compromiso> implements CompromisoFacadeLocal {
    @PersistenceContext(unitName = "com.gustavo_SRAR_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompromisoFacade() {
        super(Compromiso.class);
    }
    
}
