package com.hps.admindashboardservice.repos;
import com.hps.admindashboardservice.entities.settings;
import com.hps.admindashboardservice.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<user, Long>{
}
