package org.rage.catalog.exception;


import org.rage.ticket.exception.TicketBaseException;


/**
 * CatalogNotFoundException represents ...
 *
 * @version $Id$
 * @since Apr 28, 2015
 *
 */
public class CatalogNotFoundException extends TicketBaseException
{

   /** long for serialVersionUID */
   private static final long serialVersionUID = 1L;


   /**
    * Constructs an instance of CatalogNotFoundException object.
    *
    * @param errorMessage
    */
   public CatalogNotFoundException (final String errorMessage)
   {
      super (errorMessage);

   }

}
