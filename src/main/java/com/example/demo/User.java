package com.example.demo;

import java.io.Serializable;
import java.util.UUID;

import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
  
@XmlRootElement(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
  
    @JsonbProperty("id")
    private UUID id;
  
    @JsonbProperty("uri")
    private String uri;
  
    @JsonbProperty("firstName")
    private String firstName;
  
    @JsonbProperty("lastName")
    private String lastName;
  
    public UUID getId() {
        return id;
    }
    public void setId(UUID uuid) {
        this.id = uuid;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }
}
