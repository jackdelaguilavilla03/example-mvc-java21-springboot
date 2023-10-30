package com.demo.mvcexample.repository;

import com.demo.mvcexample.model.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
