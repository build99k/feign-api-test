package com.example.feigntest2.controller;

import com.example.feigntest.dto.Contributor;
import com.example.feigntest2.dto.Issue;
import com.example.feigntest2.service.GitHubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GitHubAPIController {

    @Autowired
    private GitHubService gitHubService;

    @GetMapping(value = "/github/{owner}/{repo}")
    public List<Contributor> getGitHubContributors(@PathVariable String owner , @PathVariable String repo){
        return gitHubService.getGitHubContributors(owner, repo);
    }

    @GetMapping(value = "/github/{owner}/{repo}/issues")
    public List<Issue> getGitHubIssue(@PathVariable String owner , @PathVariable String repo){
        return gitHubService.getGitHubIssues(owner,repo);
    }

}
