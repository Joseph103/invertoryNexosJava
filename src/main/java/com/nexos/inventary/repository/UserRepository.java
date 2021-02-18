package com.nexos.inventary.repository;

import com.nexos.inventary.model.UserNexos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <UserNexos, Long>{

}
