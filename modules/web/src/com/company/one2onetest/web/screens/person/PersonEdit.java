package com.company.one2onetest.web.screens.person;

import com.haulmont.cuba.gui.screen.*;
import com.company.one2onetest.entity.Person;

@UiController("one2onetest_Person.edit")
@UiDescriptor("person-edit.xml")
@EditedEntityContainer("personDc")
@LoadDataBeforeShow
public class PersonEdit extends StandardEditor<Person> {
}