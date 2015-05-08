package org.rage.catalog.service;


import org.rage.catalog.exception.DataCatalogException;
import org.rage.catalog.manager.CatalogManager;
import org.rage.catalog.util.ExceptionHandleHelper;
import org.rage.ticket.model.Catalog;
import org.rage.ticket.model.CatalogListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;


/**
 * CatalogServiceImpl
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
@Component ("catalogService")
public class CatalogServiceImpl implements CatalogService
{
   @Autowired
   private transient CatalogManager      catalogManager;
   private final static transient Logger LOG = Logger.getLogger (CatalogServiceImpl.class);


   /**
    * Overrides getCatalogList
    *
    * @param name
    * @return catalogWrapper
    * @since 17/02/2015
    * @see org.rage.catalog.service.CatalogService#getCatalogList(java.lang.String)
    */
   public CatalogListWrapper getCatalogList (final String name)
   {
      final CatalogListWrapper catalogWrapper = new CatalogListWrapper ();
      try
      {
         catalogWrapper.setCatalogList (catalogManager.getCatalogList (name));
      }
      catch (final DataCatalogException e)
      {
         LOG.error (e.getMessage (), e);
         ExceptionHandleHelper.convertErrorToWrapper (catalogWrapper, e);
      }
      catch (final Exception e)
      {
         LOG.error (e.getMessage (), e);
         ExceptionHandleHelper.convertErrorToWrapper (catalogWrapper, e);
      }
      return catalogWrapper;
   }


   /**
    * Overrides getCatalogById
    *
    * @param name
    * @param id
    * @return catalog
    * @since 17/02/2015
    * @see org.rage.catalog.service.CatalogService#getCatalogById(java.lang.String, java.lang.Integer)
    */
   public Catalog getCatalogById (final String name, final Integer id)
   {
      Catalog catalog = null;
      try
      {
         catalog = catalogManager.getCatalogById (name, id);
      }
      catch (final DataCatalogException e)
      {
         LOG.error (e.getMessage (), e);
         catalog = ExceptionHandleHelper.convertError (e);
      }
      catch (final Exception e)
      {
         LOG.error (e.getMessage (), e);
         catalog = ExceptionHandleHelper.convertError (e);
      }
      return catalog;
   }
}
