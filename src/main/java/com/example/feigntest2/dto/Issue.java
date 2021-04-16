package com.example.feigntest2.dto;

import lombok.Data;
import java.util.List;

@Data
public class Issue {
    String title;
    String body;
    String milestone;
    String repository_url;
}
