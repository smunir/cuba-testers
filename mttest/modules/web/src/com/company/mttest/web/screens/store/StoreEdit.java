package com.company.mttest.web.screens.store;

import com.haulmont.cuba.gui.screen.*;
import com.company.mttest.entity.Store;

@UiController("mttest_Store.edit")
@UiDescriptor("store-edit.xml")
@EditedEntityContainer("storeDc")
@LoadDataBeforeShow
public class StoreEdit extends StandardEditor<Store> {
}