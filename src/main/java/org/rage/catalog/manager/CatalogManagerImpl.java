package org.rage.catalog.manager;


import org.rage.catalog.exception.DataCatalogException;
import org.rage.catalog.exception.ValidationCatalogException;
import org.rage.ticket.model.Catalog;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


/**
 * CatalogManagerImpl represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
@Component ("catalogManager")
public class CatalogManagerImpl implements CatalogManager
{
   private final static transient Logger LOG = Logger.getLogger (CatalogManagerImpl.class);


   /**
    * Overrides getCatalogList
    *
    * @param catalogName
    * @return catalogList
    * @throws ValidationCatalogException
    * @throws DataCatalogException
    * @since 17/02/2015
    * @see org.rage.catalog.manager.CatalogManager#getCatalogList(java.lang.String)
    */
   public List <Catalog> getCatalogList (final String catalogName) throws ValidationCatalogException,
         DataCatalogException
   {
      LOG.info ("getCatalogList name: " + catalogName);
      // TODO Auto-generated method stub
      final List <Catalog> ca = new ArrayList <Catalog> ();
      ca.add (new Catalog (1, "x"));
      ca.add (new Catalog (2, "y"));
      return ca;
   }


   /**
    * Overrides getCatalogById
    *
    * @param catalogName
    * @param id
    * @return catalog
    * @throws ValidationCatalogException
    * @throws DataCatalogException
    * @since 17/02/2015
    * @see org.rage.catalog.manager.CatalogManager#getCatalogById(java.lang.String, java.lang.Integer)
    */
   public Catalog getCatalogById (final String catalogName, final Integer id) throws ValidationCatalogException,
         DataCatalogException
   {
      LOG.info ("getCatalogById name: " + catalogName + ", id: " + id);
      // TODO Auto-generated method stub
      return new Catalog (3, "y");
   }

}
