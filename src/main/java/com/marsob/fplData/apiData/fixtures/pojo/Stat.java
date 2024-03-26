package com.marsob.fplData.apiData.fixtures.pojo;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "identifier",
    "a",
    "h"
})
@Generated("jsonschema2pojo")
public class Stat {

    @JsonProperty("identifier")
    private String identifier;
    @JsonProperty("a")
    private List<A> a = new ArrayList<A>();
    @JsonProperty("h")
    private List<H> h = new ArrayList<H>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Stat withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    @JsonProperty("a")
    public List<A> getA() {
        return a;
    }

    @JsonProperty("a")
    public void setA(List<A> a) {
        this.a = a;
    }

    public Stat withA(List<A> a) {
        this.a = a;
        return this;
    }

    @JsonProperty("h")
    public List<H> getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(List<H> h) {
        this.h = h;
    }

    public Stat withH(List<H> h) {
        this.h = h;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Stat withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Stat.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("identifier");
        sb.append('=');
        sb.append(((this.identifier == null)?"<null>":this.identifier));
        sb.append(',');
        sb.append("a");
        sb.append('=');
        sb.append(((this.a == null)?"<null>":this.a));
        sb.append(',');
        sb.append("h");
        sb.append('=');
        sb.append(((this.h == null)?"<null>":this.h));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.h == null)? 0 :this.h.hashCode()));
        result = ((result* 31)+((this.identifier == null)? 0 :this.identifier.hashCode()));
        result = ((result* 31)+((this.a == null)? 0 :this.a.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Stat) == false) {
            return false;
        }
        Stat rhs = ((Stat) other);
        return (((((this.h == rhs.h)||((this.h!= null)&&this.h.equals(rhs.h)))&&((this.identifier == rhs.identifier)||((this.identifier!= null)&&this.identifier.equals(rhs.identifier))))&&((this.a == rhs.a)||((this.a!= null)&&this.a.equals(rhs.a))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
