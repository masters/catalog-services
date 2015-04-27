package org.rage.catalog.exception;


import org.rage.ticket.exception.TicketBaseException;


/**
 * ValidationCatalogException represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public class ValidationCatalogException extends TicketBaseException
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


   /**
    * Constructs an instance of ValidationCatalogException object.
    * 
    * @param errorMessage
    * @param cause
    */
   public ValidationCatalogException (final String errorMessage, final Throwable cause)
   {
      super (errorMessage, cause);
   }
}
