package org.rage.catalog.util;


import org.rage.ticket.model.Catalog;

import java.util.ArrayList;
import java.util.List;


/**
 * CatalogTransformHelper
 *
 * @version $Id$
 * @since 21/04/2015
 *
 */
public final class CatalogTransformHelper
{

   /**
    * Class that transforms from local model to Domain Ticket Model.
    *
    * @param catalogList
    * @return list
    * @since 21/04/2015
    *
    */
   public static List <Catalog> transformCatalogList (final List <org.rage.ticket.catalog.model.Catalog> catalogList)
   {
      final List <Catalog> list = new ArrayList <Catalog> ();
      Catalog catalogTmp = null;
      if (catalogList != null)
      {
         for (final org.rage.ticket.catalog.model.Catalog catalog : catalogList)
         {
            catalogTmp = transformCatalog (catalog);
            if (catalogTmp != null)
            {
               list.add (catalogTmp);
            }
         }
      }
      return list;
   }


   /**
    * Class that transforms from local model to Domain Ticket Model.
    *
    * @param catalog
    * @return catalog
    * @since 21/04/2015
    *
    */
   public static Catalog transformCatalog (final org.rage.ticket.catalog.model.Catalog catalog)
   {
      if (catalog == null)
      {
         return null;
      }
      return new Catalog (catalog.getId (), catalog.getDescription ());
   }
}
