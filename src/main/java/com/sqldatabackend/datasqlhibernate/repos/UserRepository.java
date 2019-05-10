package com.sqldatabackend.datasqlhibernate.repos;

import com.sqldatabackend.datasqlhibernate.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>
{
    User findByUsername(String username);
}
