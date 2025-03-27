package com.example.couchbasetask.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Data
@Document
public class User {
    @Id()
    private String id;
    private String email;
    private String fullName;
    private String birthDate;
    private String gender;
    private List<Sport> sports = new ArrayList<>();
}
