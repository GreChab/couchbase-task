package com.example.couchbasetask.repository;

import com.example.couchbasetask.model.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CouchbaseRepository<User, String> {

    Optional<User> findByEmail(String email);

    @Query("#{#n1ql.selectEntity} WHERE ANY sport IN sports SATISFIES sport.sportName = $1 END")
    Optional<User> findBySportName(String sportName);

    @Query("#{#n1ql.selectEntity} WHERE SEARCH(#{#n1ql.bucket}, {\"query\" : $1})")
    Optional<User> findByQuery(String query);
}