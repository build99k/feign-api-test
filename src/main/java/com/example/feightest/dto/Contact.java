package com.example.feightest.dto;

import lombok.Data;

@Data
public class Contact {
    String id;
    String name;
    String email;
    String address;
    String gender;
    ContactPhone phone;
}
