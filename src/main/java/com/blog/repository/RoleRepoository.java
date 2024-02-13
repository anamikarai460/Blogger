package com.blog.repository;
import com.blog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RoleRepoository extends JpaRepository<Role,Long> {
     @Override
     Optional<Role> findById(Long Name);
     Optional<Role> findByName(String Name);

}
