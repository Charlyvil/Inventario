/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Diana_G
 */
@Stateless
public class HabilidadFacade extends AbstractFacade<Habilidad> {

    @PersistenceContext(unitName = "inventarioCAADIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HabilidadFacade() {
        super(Habilidad.class);
    }
    
}
