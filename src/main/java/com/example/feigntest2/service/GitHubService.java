package com.example.feigntest2.service;

import com.example.feigntest2.client.GitHubClient;
import com.example.feigntest.dto.Contributor;
import com.example.feigntest2.dto.Issue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class GitHubService {

    @Autowired
    private GitHubClient gitHubClient;

    @Autowired
    private ApplicationContext applicationContext;

    public List<Contributor> getGitHubContributors(String owner, String repo){
        log.info("==================================tag=====================================");
        log.info(String.valueOf(gitHubClient.getClass().hashCode()));

        return gitHubClient.contributors(owner,repo);
    }

    public List<Issue> getGitHubIssues(String owner, String repo){
        return gitHubClient.getIssues(owner,repo);
    }

}
