package com.example.couchbasetask.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Sport {
    @Id()
    private String sportName;
    private String sportProficiency;
}
