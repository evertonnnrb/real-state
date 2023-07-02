package com.realstate;

import com.realstate.entities.Ground;
import com.realstate.entities.Owner;
import com.realstate.entities.Property;
import com.realstate.entities.enuns.CurrentSituation;
import org.junit.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestsGround {

    private static Property property;
    private static Owner owner;

    private static Ground ground;

    @BeforeClass
    public static void testCreateObjects(){
        owner = new Owner(1,"Oliver JK","(067) 3344-0099");
        ground = new Ground(234,"Quadra 12",new BigDecimal(135000.00),
                CurrentSituation.FOR_SALE,owner, LocalDate.now(),1,360.0);
    }

    @Test
    public void testInstantiatGround(){
        Assert.assertNotNull(ground);
        System.out.println(ground);

    }

}
