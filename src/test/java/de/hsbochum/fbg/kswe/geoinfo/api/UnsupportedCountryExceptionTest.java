/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsbochum.fbg.kswe.geoinfo.api;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arne
 */
public class UnsupportedCountryExceptionTest {
    
    public UnsupportedCountryExceptionTest() {
    }

    @Test(expected = UnsupportedCountryException.class)
    public void testSUnsupportedCountryException() throws UnsupportedCountryException {
        throw new UnsupportedCountryException("exception", new NullPointerException());
    }
    
}
