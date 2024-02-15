package test;

import model.Paste;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import service.PasteCreator;

public class CreateNewPasteTest extends CommonConditions {

    @Test
    public void oneCanCreatedPaste() {
        Paste paste = PasteCreator.createPaste();
        boolean createPaste = new HomePage(driver)
                .openPage()
                .fillInTheFields(paste)
                .createPaste()
                .newPasteIsPosted();

        Assert.assertTrue(createPaste, "Paste has not created!");
    }

    @Test
    public void theFieldsOfTheCreatedPasteAreCorrect() {
        Paste paste = PasteCreator.createPaste();
        boolean fieldsCorrect = new HomePage(driver)
                .openPage()
                .fillInTheFields(paste)
                .createPaste()
                .newPasteIsCreatedCorrect(paste);
        Assert.assertTrue(fieldsCorrect, "Fields are incorrect!");
    }

}
