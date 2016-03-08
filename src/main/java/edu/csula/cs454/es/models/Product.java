package edu.csula.cs454.es.models;

import java.util.Map;

/**
 * Business model to represent product
 */
public class Product {
    private final long id;
    private final String description;
    private final Map<String, String> attributes;

    public Product(long id, String description, Map<String, String> attributes) {
        this.id = id;
        this.description = description;
        this.attributes = attributes;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }
}
