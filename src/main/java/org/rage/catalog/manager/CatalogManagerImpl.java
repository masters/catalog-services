package org.rage.catalog.manager;


import org.rage.catalog.exception.DataCatalogException;
import org.rage.catalog.exception.ValidationCatalogException;
import org.rage.catalog.util.CatalogTransformHelper;
import org.rage.ticket.catalog.dao.CatalogDao;
import org.rage.ticket.model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;

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
   @Autowired
   private CatalogDao                    catalogDao;


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
      List <org.rage.ticket.catalog.model.Catalog> catalogList = null;
      try
      {
         catalogList = catalogDao.list (catalogName);
      }
      catch (final Exception e)
      {
         LOG.error (e.getMessage (), e);
         throw new DataCatalogException (e.getMessage ());
      }
      return CatalogTransformHelper.transformCatalogList (catalogList);
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
      org.rage.ticket.catalog.model.Catalog catalog = null;

      try
      {
         catalog = catalogDao.getById (catalogName, id);
      }
      catch (final Exception e)
      {
         LOG.error (e.getMessage (), e);
         throw new DataCatalogException (e.getMessage ());
      }
      return CatalogTransformHelper.transformCatalog (catalog);
   }

}
