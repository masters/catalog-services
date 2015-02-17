package org.rage.catalog.service;


import org.rage.ticket.model.Catalog;
import org.rage.ticket.model.CatalogListWrapper;


/**
 * CatalogService represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public interface CatalogService
{
   /**
    * Represents getCatalogList
    *
    * @param name
    * @return catalogWrapper
    * @since 17/02/2015
    *
    */
   CatalogListWrapper getCatalogList (final String name);


   /**
    * Represents getCatalogById
    *
    * @param name Catalog name
    * @param id
    * @return catalog
    * @since 17/02/2015
    *
    */
   Catalog getCatalogById (final String name, final Integer id);
}
