package org.rage.catalog.controller;


import org.rage.catalog.service.CatalogService;
import org.rage.catalog.util.ControllerParameterValidator;
import org.rage.ticket.model.Catalog;
import org.rage.ticket.model.CatalogListWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;


/**
 * CatalogController
 *
 * @since 16/02/2015
 *
 */
@RestController
@Controller ("catalogController")
public class CatalogController
{
   @Autowired
   private transient CatalogService catalogService;


   /**
    * Represents getCatalogList
    *
    * @param catalogName
    * @param servletResponse
    * @return catalogList
    * @since 16/02/2015
    *
    */
   @RequestMapping ("/catalog")
   public CatalogListWrapper getCatalogList (@RequestParam (value = "name") final String catalogName,
         final HttpServletResponse servletResponse)
   {
      ControllerParameterValidator.validateParameter (catalogName, servletResponse);
      return catalogService.getCatalogList (catalogName);
   }


   /**
    * Represents getCatalogById
    *
    * @param catalogName
    * @param id
    * @param servletResponse
    * @return catalog
    * @since 17/02/2015
    *
    */
   @RequestMapping ("/catalog/{id}")
   public Catalog getCatalogById (@RequestParam (value = "name") final String catalogName,
         @PathVariable (value = "id") final Integer id, final HttpServletResponse servletResponse)
   {
      ControllerParameterValidator.validateParameter (catalogName, servletResponse);
      return catalogService.getCatalogById (catalogName, id);
   }

}
