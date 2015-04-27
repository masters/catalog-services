package org.rage.catalog.exception;


/**
 * ValidationCatalogException represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public class ValidationCatalogException extends Exception
{

   /** long for serialVersionUID */
   private static final long serialVersionUID = 1L;


   /**
    * Constructs an instance of ValidationCatalogException object.
    * 
    * @param errorMessage
    */
   public ValidationCatalogException (final String errorMessage)
   {
      super (errorMessage);
   }
}
