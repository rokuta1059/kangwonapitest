package com.kangwonapp.kangwonapi.notice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

@Repository
public interface NoticeRepository extends JpaRepository<notice, Long> {

    @Query(value = "SELECT * from notice where notice.department = ?1 order by notice.date", nativeQuery = true)
    List<notice> findbyDepartmentALL(String department);

    List<notice> findByDepartmentOrderByDateAsc(String department);
}
