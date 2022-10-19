package com.bootstrappers.floodmanager.service.impl;

import com.bootstrappers.floodmanager.domain.model.State;
import com.bootstrappers.floodmanager.domain.repository.StateRepository;
import com.bootstrappers.floodmanager.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public List<State> getAllStates() {
        return stateRepository.findAll();
    }

    @Override
    public State getStateByName(String name) {
        return stateRepository.findByTitle(name)
                .orElseThrow(() -> new RuntimeException("State not found"));
    }

}
