package com.example.guestservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Guest {

    @Id
    private Integer id;

    private String fullName;

    private String email;

    private String phone;

    private National national;
}
