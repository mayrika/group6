package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class TestCompanyDTO {

    @Test
    public void inputDataToCompanyDTO() {

        CompanyDTO companyDTO = new CompanyDTO() {} ;

        String id = "14781";
        String globalId = "G1245597734";
        String name = "Alice";
        String taxId = "T9748578387383";
        String uriId = "alicewonderland@hotmail.com";

        companyDTO.setId(id);
        companyDTO.setGlobalId(globalId);
        companyDTO.setName(name);
        companyDTO.setTaxId(taxId);
        companyDTO.setUriId(uriId);

        Assert.assertEquals(companyDTO.getId(), id);
        Assert.assertEquals(companyDTO.getGlobalId(), globalId);
        Assert.assertEquals(companyDTO.getName(), name);
        Assert.assertEquals(companyDTO.getTaxId(), taxId);
        Assert.assertEquals(companyDTO.getUriId(), uriId);

    }
}
