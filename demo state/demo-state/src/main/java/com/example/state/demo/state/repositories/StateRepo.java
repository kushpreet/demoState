package com.example.state.demo.state.repositories;

import com.example.state.demo.state.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<State,String> {
}
