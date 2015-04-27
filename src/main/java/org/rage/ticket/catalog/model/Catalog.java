package org.rage.ticket.catalog.model;


import java.io.Serializable;


/**
 * Catalog
 *
 * @version $Id$
 * @since 21/04/2015
 *
 */
public class Catalog implements Serializable
{
   private Integer id;
   private String  category;
   private String  description;


   /**
    * @return the id
    */
   public Integer getId ()
   {
      return id;
   }


   /**
    * @param id the id to set
    */
   public void setId (final Integer id)
   {
      this.id = id;
   }


   /**
    * @return the catagory
    */
   public String getCategory ()
   {
      return category;
   }


   /**
    * @param category the category to set
    */
   public void setCategory (final String category)
   {
      this.category = category;
   }


   /**
    * @return the description
    */
   public String getDescription ()
   {
      return description;
   }


   /**
    * @param description the description to set
    */
   public void setDescription (final String description)
   {
      this.description = description;
   }


}
