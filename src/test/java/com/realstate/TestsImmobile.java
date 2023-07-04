package com.realstate;

import com.realstate.entities.Immobile;
import com.realstate.entities.Owner;
import com.realstate.entities.Property;
import com.realstate.entities.enuns.CurrentSituation;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TestsImmobile {

    private static Property property;
    private static Owner owner;

    private static Immobile immobile;

    @BeforeClass
    public static void testCreateObjects() {
        owner = new Owner(1, "Oliver JK", "(067) 3344-0099");
        immobile = new Immobile(234, "Quadra 12", new BigDecimal("50000"),
                CurrentSituation.FOR_SALE, owner, LocalDate.now(), 1, 260.0, false);
    }

    @Test
    public void testInstantiatImmobile() {
        Assert.assertNotNull(immobile);
        System.out.println(immobile);

    }

    @Test
    public void testTaxOfIPTU(){
        System.out.println(immobile.calculateIPTU(immobile.getSaleValue(), BigDecimal.valueOf(0.03)));
    }

}
