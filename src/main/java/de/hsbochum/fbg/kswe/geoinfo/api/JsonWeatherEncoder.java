
package de.hsbochum.fbg.kswe.geoinfo.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class JsonWeatherEncoder {

    public String encode(Weather obj) {
 
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode node = mapper.createObjectNode();
        
        ObjectNode cityNode = mapper.createObjectNode();
        cityNode.put("name", obj.getCity().getCity());
        cityNode.put("country", obj.getCity().getCountry());
        node.set("city", cityNode);
        
        ObjectNode weatherNode = mapper.createObjectNode();
        ObjectNode tempNode = mapper.createObjectNode();
        tempNode.put("value", obj.getTemp());
        tempNode.put("unit", "C");
        weatherNode.set("temperatur", tempNode);
        
        node.set("phenomena", weatherNode);
        
        return node.toString();
    }
    
}
