package com.example.state.demo.state.request_response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StateRequest {
    private String name;
    private String code;
}
