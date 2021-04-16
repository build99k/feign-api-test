package com.example.feigntest2.client;


import com.example.feigntest2.dto.Contributor;
import com.example.feigntest2.dto.Issue;
import feign.Param;
import feign.RequestLine;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

public interface GitHubClient {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

    @RequestLine("GET /repos/{owner}/{repo}/issues")
    List<Issue> getIssues(@Param("owner") String owner, @Param("repo") String repo);

}
