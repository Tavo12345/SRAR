/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gustavo.ejb;

import com.gustavo.model.Compromiso;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Gustavo
 */
@Local
public interface CompromisoFacadeLocal {

    void create(Compromiso compromiso);

    void edit(Compromiso compromiso);

    void remove(Compromiso compromiso);

    Compromiso find(Object id);

    List<Compromiso> findAll();

    List<Compromiso> findRange(int[] range);

    int count();
    
}
