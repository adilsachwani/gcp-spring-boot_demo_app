package com.bootstrappers.floodmanager.service;

import com.bootstrappers.floodmanager.domain.model.State;

import java.util.List;

public interface StateService {

    List<State> getAllStates();

    State getStateByName(String name);

}
