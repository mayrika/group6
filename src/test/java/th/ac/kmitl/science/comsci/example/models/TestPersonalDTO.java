package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class TestPersonalDTO {

    @Test

    public void InputDataToPersonalDTO() {

        PersonalDTO personalDTO = new PersonalDTO();

        String id = "14781";
        String globalId = "G1245597734";
        String name = "Alice";
        String taxId = "T9748578387383";
        String uriId = "alicewonderland@hotmail.com";

        personalDTO.setId(id);
        personalDTO.setGlobalId(globalId);
        personalDTO.setName(name);
        personalDTO.setTaxId(taxId);
        personalDTO.setUriId(uriId);

        Assert.assertEquals(personalDTO.getId(), id);
        Assert.assertEquals(personalDTO.getGlobalId(), globalId);
        Assert.assertEquals(personalDTO.getName(), name);
        Assert.assertEquals(personalDTO.getTaxId(), taxId);
        Assert.assertEquals(personalDTO.getUriId(), uriId);

    }
}
