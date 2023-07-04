package com.realstate.jdbc;

import com.realstate.entities.Owner;
import com.realstate.jdbc.impl.OwnerImplJDBC;
import com.realstate.service.OwnerService;
import org.junit.*;

public class TestCrudOwner {

    private Owner owner;
    private OwnerService service = new OwnerService();;

    @AfterClass
    public static void loadOwner(){
    }

    @Test
    public void testeShouldPersistiOwner(){
        owner = new Owner();
        owner.setName("Pummita");
        owner.setFone("(21)98339999");
        Assert.assertTrue(service.insert(owner));
    }
}
