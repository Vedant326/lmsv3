package com.ibizabroker.lms.controller;

import com.ibizabroker.lms.entity.UserStatistics;
import com.ibizabroker.lms.service.UserStatisticsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-statistics")
public class UserStatisticsController {

    private final UserStatisticsService userStatisticsService;

    public UserStatisticsController(UserStatisticsService userStatisticsService) {
        this.userStatisticsService = userStatisticsService;
    }

    @GetMapping("/{userId}")
    public List<UserStatistics> getUserStatistics(@PathVariable Integer userId) {
        return userStatisticsService.getUserStatistics(userId);
    }

    @PostMapping("/add")
    public void addUserStatistics(@RequestBody UserStatistics stats) {
        userStatisticsService.saveUserStatistics(stats);
    }
}
