package com.example.state.demo.state.controllers;

import com.example.state.demo.state.entities.State;
import com.example.state.demo.state.request_response.StateResponse;
import com.example.state.demo.state.services.StateService;
import com.example.state.demo.state.mapper.StateMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/state")
public class StateController {

    @Autowired
    private StateService stateService;

    @PutMapping("/{id}")
    public ResponseEntity<StateResponse> updateOrCreateState(@PathVariable String id, @RequestBody State state) {
        State updatedState = stateService.updateOrCreateState(id, state);
        StateResponse stateResponse = StateMapper.mapStateToStateResponse(updatedState);
        return ResponseEntity.ok(stateResponse);
    }

}
