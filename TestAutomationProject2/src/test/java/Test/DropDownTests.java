package Test;

import Base.BaseTest;
import Pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTests extends BaseTest
{
    @Test
    public void testSelectOption()
    {
        DropDownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");

        var selectOption = dropDownPage.getSelectedOption();

        Assert.assertEquals(selectOption.size(),1);
        Assert.assertTrue(selectOption.contains("Option 1"),"The selected option is not as expected");
    }
}
