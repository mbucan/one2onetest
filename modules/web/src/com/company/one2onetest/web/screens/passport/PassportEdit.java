package com.company.one2onetest.web.screens.passport;

import com.company.one2onetest.entity.Person;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.model.InstanceContainer;
import com.haulmont.cuba.gui.screen.*;
import com.company.one2onetest.entity.Passport;

import javax.inject.Inject;
import java.util.Optional;

@UiController("one2onetest_Passport.edit")
@UiDescriptor("passport-edit.xml")
@EditedEntityContainer("passportDc")
@LoadDataBeforeShow
public class PassportEdit extends StandardEditor<Passport> {

    @Inject
    private TextField<String> personNameField;
    @Inject
    private TextField<String> personSurnameField;

    @Inject
    private InstanceContainer<Passport> passportDc;

    @Inject
    private DataManager dataManager;

    @Subscribe
    public void onAfterShow(AfterShowEvent event) {
            Optional<Person> person = Optional.empty();
            person = loadPersonByPassportNumber(passportDc.getItem().getPassportNumber());
            if (person.isPresent()) {
                personNameField.setValue(person.get().getName());
                personSurnameField.setValue(person.get().getSurname());
            }
    }

    private Optional<Person> loadPersonByPassportNumber(String passportNo) {
        return dataManager.load(Person.class)
                .query("select e from one2onetest_Person e where e.passport.passportNumber = :paramPassportNumber")
                .parameter("paramPassportNumber", passportNo)
                .view("person-view")
                .optional();
    }

}
