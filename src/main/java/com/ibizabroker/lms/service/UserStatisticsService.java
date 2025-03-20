package com.ibizabroker.lms.service;

import com.ibizabroker.lms.dao.UserStatisticsRepository;
import com.ibizabroker.lms.entity.UserStatistics;
import com.ibizabroker.lms.dao.UserStatisticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserStatisticsService {

    private final UserStatisticsRepository userStatisticsRepository;

    public UserStatisticsService(UserStatisticsRepository userStatisticsRepository) {
        this.userStatisticsRepository = userStatisticsRepository;
    }

    public List<UserStatistics> getUserStatistics(Integer userId) {
        return userStatisticsRepository.findByUserId(userId);
    }

    public void saveUserStatistics(UserStatistics stats) {
        userStatisticsRepository.save(stats);
    }
}
