package com.company.one2onetest.web.screens.passport;

import com.haulmont.cuba.gui.screen.*;
import com.company.one2onetest.entity.Passport;

@UiController("one2onetest_Passport.browse")
@UiDescriptor("passport-browse.xml")
@LookupComponent("passportsTable")
@LoadDataBeforeShow
public class PassportBrowse extends StandardLookup<Passport> {
}