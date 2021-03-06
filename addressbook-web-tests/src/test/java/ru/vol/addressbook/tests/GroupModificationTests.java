package ru.vol.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.vol.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification() {
        app.getGroupHelper().goToGroupPage();
        int before = app.getGroupHelper().getGroupCount();
        if (!app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, "3"));
        }
        app.getGroupHelper().SelectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "2", "3"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before);
    }
}
