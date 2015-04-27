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
    * Represents transformCatalogList
    *
    * @param catalogList
    * @return list
    * @since 21/04/2015
    *
    * @todo complete description
    */
   public static List <Catalog> transformCatalogList (final List <org.rage.ticket.catalog.model.Catalog> catalogList)
   {
      final List <Catalog> list = new ArrayList <Catalog> ();
      if (catalogList != null)
      {
         for (final org.rage.ticket.catalog.model.Catalog catalog : catalogList)
         {
            list.add (new Catalog (catalog.getId (), catalog.getDescription ()));
         }
      }
      return list;
   }


   /**
    * Represents transformCatalog
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
