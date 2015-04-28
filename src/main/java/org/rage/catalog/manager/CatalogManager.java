package org.rage.catalog.manager;


import org.rage.catalog.exception.DataCatalogException;
import org.rage.ticket.model.Catalog;

import java.util.List;


/**
 * CatalogManager represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public interface CatalogManager
{

   /**
    * Represents getCatalogList
    *
    * @param catalogName
    * @return catalogList
    * @throws DataCatalogException
    * @since 17/02/2015
    *
    */
   List <Catalog> getCatalogList (String catalogName) throws DataCatalogException;


   /**
    * Represents getCatalogById
    *
    * @param catalogName
    * @param id
    * @return catalog
    * @throws DataCatalogException
    * @since 17/02/2015
    *
    * @todo complete description
    */
   Catalog getCatalogById (String catalogName, Integer id) throws DataCatalogException;
}
