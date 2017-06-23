package de.hsbochum.fbg.kswe.geoinfo.api;

import java.io.IOException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class WeatherRetrieverImplTest {

    @Test
    public void testRetrieval() throws UnsupportedCountryException, IOException {
        WeatherRetrieverImpl retriever = new WeatherRetrieverImpl();

        Weather weather = retriever.retrieve(new City("Bochum", "Germany"));
        float temp = weather.getTemp();
        float rain = weather.getRain();
        float wind = weather.getWindSpeed();

        Assert.assertTrue(temp > -100);
        Assert.assertTrue(temp < 100);
        Assert.assertThat(rain, CoreMatchers.not(Float.NaN));
        Assert.assertThat(wind, CoreMatchers.not(Float.NaN));
    }

    @Test(expected = UnsupportedCountryException.class)
    public void testUnsupportedCountry() throws UnsupportedCountryException, IOException {
        WeatherRetrieverImpl retriever = new WeatherRetrieverImpl();

        Weather weather = retriever.retrieve(new City("Bochum", "France"));
        float temp = weather.getTemp();
    }

}
