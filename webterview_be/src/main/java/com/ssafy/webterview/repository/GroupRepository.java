package com.ssafy.webterview.repository;

import com.ssafy.webterview.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface GroupRepository extends JpaRepository<Group, Integer> {
    @Query("select g " +
            "from Group g " +
            "where g.user.userNo=?1 " +
            "and g.groupStartDate <= current_timestamp " +
            "and g.groupEndDate >= current_timestamp")
    Group getCurrentGroup(int userNo);
}