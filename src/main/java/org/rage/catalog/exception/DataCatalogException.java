package org.rage.catalog.exception;


/**
 * DataCatalogException represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public class DataCatalogException extends Exception
{

   /** long for serialVersionUID */
   private static final long serialVersionUID = 1L;


   /**
    * Constructs an instance of DataCatalogException object.
    * 
    * @param errorMessage
    */
   public DataCatalogException (final String errorMessage)
   {
      super (errorMessage);
   }
}
