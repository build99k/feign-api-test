package com.example.feigntest.dto;

import lombok.Data;

@Data
public class Contributor {
    String login;
    String id;
    String avatar_url;
    String url;
    String html_url;
    String followers_url;
    String following_url;
    String gists_url;
    String starred_url;
    String subscriptions;
    String organizations_url;
    String repos_url;
    String events_url;
    String received_events_url;
    String type;
    String site_admin;
    int contributions;
}
