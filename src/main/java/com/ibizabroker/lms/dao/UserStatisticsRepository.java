package com.ibizabroker.lms.dao;

import com.ibizabroker.lms.entity.UserStatistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserStatisticsRepository extends JpaRepository<UserStatistics, Integer> {
    List<UserStatistics> findByUserId(Integer userId);  // Custom method for fetching statistics by user ID
}
