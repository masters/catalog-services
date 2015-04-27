package org.rage.catalog.service;


import org.rage.catalog.exception.DataCatalogException;
import org.rage.catalog.exception.ValidationCatalogException;
import org.rage.catalog.manager.CatalogManager;
import org.rage.ticket.model.Catalog;
import org.rage.ticket.model.CatalogListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.apache.log4j.Logger;



/**
 * CatalogServiceImpl represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
@Component ("catalogService")
public class CatalogServiceImpl implements CatalogService
{
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
      catch (final ValidationCatalogException e)
      {
         LOG.error (e.getMessage (), e);
         catalogWrapper.setErrorMessage (e.getMessage ());
         catalogWrapper.setValid (Boolean.FALSE);
      }
      catch (final DataCatalogException e)
      {
         LOG.error (e.getMessage (), e);
         catalogWrapper.setErrorMessage (e.getMessage ());
         catalogWrapper.setValid (Boolean.FALSE);
      }
      catch (final Exception e)
      {
         LOG.error (e.getMessage (), e);
         catalogWrapper.setErrorMessage (e.getMessage ());
         catalogWrapper.setValid (Boolean.FALSE);
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
      catch (final ValidationCatalogException e)
      {
         LOG.error (e.getMessage (), e);
         catalog = new Catalog ();
         catalog.setDescription (e.getMessage ());
         catalog.setValid (Boolean.FALSE);
      }
      catch (final DataCatalogException e)
      {
         LOG.error (e.getMessage (), e);
         catalog = new Catalog ();
         catalog.setDescription (e.getMessage ());
         catalog.setValid (Boolean.FALSE);
      }
      catch (final Exception e)
      {
         LOG.error (e.getMessage (), e);
         catalog = new Catalog ();
         catalog.setErrorMessage (e.getMessage ());
         catalog.setValid (Boolean.FALSE);
      }
      return catalog;
   }


   /**
    * Represents setCatalogManager
    *
    * @param catalogManager
    * @since 17/02/2015
    *
    * @todo complete description
    */
   @Autowired
   public void setCatalogManager (final CatalogManager catalogManager)
   {
      this.catalogManager = catalogManager;
   }
}
