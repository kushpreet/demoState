package com.example.state.demo.state.services;

import com.example.state.demo.state.entities.State;
import com.example.state.demo.state.repositories.StateRepo;
import com.example.state.demo.state.request_response.StateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StateService {

    @Autowired
    private StateRepo stateRepo;

    public State updateOrCreateState(String id, State newState) {
        Optional<State> existingState = stateRepo.findById(id);

        if (existingState.isPresent()) {
            State state = existingState.get();
            state.setName(newState.getName());
            state.setCode(newState.getCode());
            return stateRepo.save(state);
        } else {
            return stateRepo.save(newState);
        }
    }

}
