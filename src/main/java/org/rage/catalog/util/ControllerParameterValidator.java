package org.rage.catalog.util;


import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletResponse;


/**
 * ParameterValidator represents ...
 *
 * @version $Id$
 * @since 17/02/2015
 *
 */
public final class ControllerParameterValidator
{

   /**
    * Represents validateParameter
    *
    * @param name
    * @param servletResponse
    * @since 17/02/2015
    *
    */
   public static void validateParameter (final String name, final HttpServletResponse servletResponse)
   {
      if (StringUtils.isBlank (name))
      {
         servletResponse.setStatus (HttpServletResponse.SC_BAD_REQUEST);
         throw new IllegalArgumentException ("Wrong parameters");
      }
   }


}
