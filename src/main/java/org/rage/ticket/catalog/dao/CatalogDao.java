package org.rage.ticket.catalog.dao;


import org.rage.ticket.catalog.model.Catalog;

import java.util.List;


/**
 * CatalogDao
 *
 * @version $Id$
 * @since 21/04/2015
 *
 */
public interface CatalogDao
{
   /**
    * Represents list
    *
    * @param category
    * @return list
    * @since 21/04/2015
    *
    */
   public List <Catalog> list (String category);


   /**
    * Represents getById
    *
    * @param category
    * @param id
    * @return catalog
    * @since 21/04/2015
    *
    */
   public Catalog getById (String category, Integer id);
}
