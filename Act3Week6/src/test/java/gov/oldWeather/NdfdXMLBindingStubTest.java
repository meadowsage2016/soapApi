package gov.oldWeather;

import junit.framework.TestCase;

import javax.xml.bind.*;
import java.io.StringReader;

/**
 * Created by student on 3/5/17.
 */
public class NdfdXMLBindingStubTest extends TestCase {
    public void testNDFDgenLatLonList() throws Exception {

    }

    public void testLatLonListZipCode() throws Exception {
        NdfdXMLBindingStub binding = (NdfdXMLBindingStub) new NdfdXMLLocator().getndfdXMLPort();

            String result = binding.latLonListZipCode("53711");
            String response = unmarshallResult(result);

            assertEquals("Looking for results", "???", response);
    }

    private String unmarshallResult(String response) throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(DwmlType.class);
        try {
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            DwmlType dwml =
                    (DwmlType) jaxbUnmarshaller.unmarshal(new StringReader(response));
            return dwml.getLatLonList();
            } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

}