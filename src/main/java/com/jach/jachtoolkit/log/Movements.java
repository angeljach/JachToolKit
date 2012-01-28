package com.jach.jachtoolkit.log;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Interface of Movements.
 * @author jach
 * @since 1.2
 */
public interface Movements extends Serializable {
    
    /**
     * Register a new Movements object.
     */
    public void save(String message);
    
    /**
     * Obtain a list of all the Movements.
     * @return List of Movements Object.
     */
    public List<Movements> getAllMovements();
    
    /**
     * Obtain a list of Movements from an initial Date.
     * @return List of Movements Object.
     */
    List<Movements> getMovementsFromDate(Date dateFrom);
    
}
