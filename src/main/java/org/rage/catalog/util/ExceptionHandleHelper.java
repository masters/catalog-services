package org.rage.catalog.util;


import org.rage.ticket.model.Catalog;
import org.rage.ticket.model.CommonBase;


/**
 * ExceptionHandleHelper
 *
 * @version $Id$
 * @since Apr 28, 2015
 *
 */
public class ExceptionHandleHelper
{

   /**
    * Represents convertError
    *
    * @param exception
    * @return baseObject
    * @since Apr 28, 2015
    *
    */
   public static Catalog convertError (final Exception exception)
   {
      final Catalog baseObject = new Catalog ();
      convertError (baseObject, exception);
      return baseObject;
   }


   /**
    * Represents convertError
    *
    * @param commonBase
    * @param exception
    * @since Apr 28, 2015
    *
    */
   public static void convertError (final Catalog commonBase, final Exception exception)
   {
      if (exception != null)
      {
         commonBase.setErrorMessage (exception.getMessage ());
      }
      commonBase.setValid (Boolean.FALSE);
   }


   /**
    * Represents convertErrorToWrapper
    *
    * @param commonBase
    * @param exception
    * @since Apr 28, 2015
    *
    */
   public static void convertErrorToWrapper (final CommonBase commonBase, final Exception exception)
   {
      if (exception != null)
      {
         commonBase.setErrorMessage (exception.getMessage ());
      }
      commonBase.setValid (Boolean.FALSE);
   }
}
