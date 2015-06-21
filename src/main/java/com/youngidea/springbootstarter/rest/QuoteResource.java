package com.youngidea.springbootstarter.rest;

import com.youngidea.springbootstarter.model.Quote;
import com.youngidea.springbootstarter.repository.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sean on 6/20/15.
 */
@RequestMapping("/api/quote")
@RestController
public class QuoteResource {

    @Autowired
    @Qualifier("quoteRepository")
    private QuoteRepository repository;

    private final static Quote NONE = new Quote("None");

//    @Autowired
//    public QuoteResource(QuoteRepository repository) {
//        this.repository = repository;
//    }

    @Secured("USER")
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Quote> getAll()
    {
        return repository.findAll();
    }

    @Secured("USER")
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public Quote getOne(@PathVariable Long id)
    {
        if (repository.exists(id))
        {
            return repository.findOne(id);
        }
        else
        {
            repository.save(NONE);
            return NONE;
        }
    }
}
