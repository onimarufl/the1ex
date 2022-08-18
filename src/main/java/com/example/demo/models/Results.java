package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Results implements Serializable {
    public String gender;
    public Name name;
    public String email;
    public String phone;
    public Id id;
    public Picture picture;

    @Data
    public class Id {
        public String name;
        public String value;
    }

    @Data
    public class Name {
        public String title;
        public String first;
        public String last;
    }

    @Data
    public class Picture {
        public String large;
        public String medium;
        public String thumbnail;
    }
}
