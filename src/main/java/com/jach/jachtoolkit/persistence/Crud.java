package com.jach.jachtoolkit.persistence;

import java.io.Serializable;

/**
 *
 * @author acruzh
 * @since 1.1
 */
public interface Crud extends Serializable {
    
    public String prepareEdit();
    
    public String update();
    
    public String cancelUpdate();
    
    public String prepareCreate();
    
    public String create();
    
    public String cancelCreate();
    
    public void destroy();
}
