package com.icolak.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class Profile {
    private String name;
    private String surname;
    private String userName;
    private String phoneNumber;
    private String email;
    private LocalDateTime createdDate;
}
