package com.realstate.service;

import com.realstate.entities.Ground;

public class GroundService implements IPTUGround{
    private Ground ground;

    public boolean createGround(Ground ground){
        ground = new Ground();
        return true;
    }
}
