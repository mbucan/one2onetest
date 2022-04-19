package com.company.one2onetest.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.one2onetest.entity.Person;

@UiController("one2onetest_Person.browse")
@UiDescriptor("person-browse.xml")
@LookupComponent("personsTable")
@LoadDataBeforeShow
public class PersonBrowse extends StandardLookup<Person> {
}