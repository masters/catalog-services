package org.rage.catalog.exception;


import org.rage.ticket.exception.TicketBaseException;


/**
 * DataCatalogException represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public class DataCatalogException extends TicketBaseException
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


   /**
    * Constructs an instance of DataCatalogException object.
    * 
    * @param errorMessage
    * @param cause
    */
   public DataCatalogException (final String errorMessage, final Throwable cause)
   {
      super (errorMessage, cause);
   }
}
