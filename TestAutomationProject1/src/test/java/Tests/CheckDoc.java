package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckDoc
{
    @Test(dataProvider = "GetDocument")
    void testDocumentNameAndPrice(String docName,String price)
    {
        //we put the actual from the ui here
        Assert.assertEquals(docName,"Need a Notice");
        Assert.assertEquals(price,"$29 /recipient");
    }

    @DataProvider(name = "GetDocument")
    public Object[][] getDocumentsAndPrices()
    {
        return new Object[][]
                {
                        {"Need a Notice","$29 /recipient"}
                };
    }
}
