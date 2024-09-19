package com.example.state.demo.state.mapper;

import com.example.state.demo.state.entities.State;
import com.example.state.demo.state.request_response.StateRequest;
import com.example.state.demo.state.request_response.StateResponse;

public class StateMapper {

    public static State mapStateRequestToState(StateRequest stateRequest) {
        return State.builder()
                .name(stateRequest.getName())
                .code(stateRequest.getCode())
                .build();
    }

    public static StateResponse mapStateToStateResponse(State state) {
        return StateResponse.builder()
                .id(state.getId())
                .name(state.getName())
                .code(state.getCode())
                .build();
    }
}
