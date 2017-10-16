/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdInventarioCAADI;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author charly
 */
@Stateless
public class AutorlibrosFacade extends AbstractFacade<Autorlibros> {

    @PersistenceContext(unitName = "inventarioCAADIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutorlibrosFacade() {
        super(Autorlibros.class);
    }
    
}
