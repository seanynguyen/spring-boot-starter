package com.youngidea.springbootstarter.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by sean on 6/20/15.
 */
@Entity
public class Quote {
    @Id
    @GeneratedValue
    Long id;
    private String quote;

    protected Quote() {}

    public Quote(String quote)
    {
        this.quote = quote;
    }

    public Long getId()
    {
        return id;
    }

    public String getQuote()
    {
        return quote;
    }

    @Override
    public String toString()
    {
        return "id: " + id + " Quote: " + quote;
    }
}