package com.babu.demos.angular.sprangular.dal;

import com.babu.demos.angular.sprangular.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
