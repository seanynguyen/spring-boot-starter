package com.youngidea.springbootstarter.repository;

import com.youngidea.springbootstarter.model.Quote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by sean on 6/20/15.
 */
@Repository
public interface QuoteRepository extends CrudRepository<Quote, Long>
{
}