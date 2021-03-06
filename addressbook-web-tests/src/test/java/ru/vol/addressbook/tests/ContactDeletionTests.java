package ru.vol.addressbook.tests;

import org.testng.annotations.Test;
import ru.vol.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase{

    @Test
    public void TestContactDeletion() {
        if (!app.getContactHelper().isThereaContact()) {
            app.getContactHelper().createContact(new ContactData("test1", "lastName", "1", "i", "1", "1", "2", "3", "test1"));
        }
        app.getContactHelper().SelectContact();
        app.getContactHelper().iniContactDeletion();
        app.getContactHelper().ContactDeletion();
        app.getContactHelper().returnToContactPage();
    }
}
