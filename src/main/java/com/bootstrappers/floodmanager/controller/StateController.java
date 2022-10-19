package com.bootstrappers.floodmanager.controller;

import com.bootstrappers.floodmanager.domain.model.State;
import com.bootstrappers.floodmanager.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/state")
@RestController
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping
    public ResponseEntity<List<State>> getAllStates(){
        List<State> states = stateService.getAllStates();
        return ResponseEntity.ok(states);
    }

    @GetMapping("/{name}")
    public ResponseEntity<State> getStateByName(@PathVariable("name") String name){
        State state = stateService.getStateByName(name);
        return ResponseEntity.ok(state);
    }

}
