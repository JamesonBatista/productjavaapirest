package com.product.apiback.repository;

import com.product.apiback.entity.UserListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserList extends JpaRepository<UserListEntity, Long>{
}
