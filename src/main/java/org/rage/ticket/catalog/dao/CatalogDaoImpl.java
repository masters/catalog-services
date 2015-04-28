package org.rage.ticket.catalog.dao;


import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Restrictions;
import org.rage.ticket.catalog.model.Catalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * CatalogDaoImpl
 *
 * @version $Id$
 * @since 21/04/2015
 *
 */
public class CatalogDaoImpl implements CatalogDao
{
   @Autowired
   private SessionFactory sessionFactory;


   /**
    * Overrides list
    *
    * @return catalogList
    * @since 21/04/2015
    * @see org.rage.ticket.catalog.dao.CatalogDao#list(java.lang.String)
    */
   @SuppressWarnings ("unchecked")
   @Transactional
   public List <Catalog> list (final String category)
   {

      final List <Catalog> catalogList = sessionFactory.getCurrentSession ().createCriteria (Catalog.class).add (
            Restrictions.like ("category", category)).setResultTransformer (CriteriaSpecification.DISTINCT_ROOT_ENTITY)
            .list ();
      return catalogList;
   }


   /**
    * Overrides getById
    *
    * @param category
    * @param id
    * @return catalog
    * @since 21/04/2015
    * @see org.rage.ticket.catalog.dao.CatalogDao#getById(java.lang.String, java.lang.Integer)
    */
   @SuppressWarnings ("unchecked")
   @Transactional
   public Catalog getById (final String category, final Integer id)
   {
      final List <Catalog> catalogList = sessionFactory.getCurrentSession ().createCriteria (Catalog.class).add (
            Restrictions.like ("category", category)).add (Restrictions.like ("id", id)).setResultTransformer (
            CriteriaSpecification.DISTINCT_ROOT_ENTITY).list ();
      return (catalogList != null) && (catalogList.size () > 0) ? catalogList.get (0) : null;
   }
}
