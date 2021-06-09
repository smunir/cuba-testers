package com.company.mttest.web.screens.store;

import com.haulmont.cuba.gui.screen.*;
import com.company.mttest.entity.Store;

@UiController("mttest_Store.browse")
@UiDescriptor("store-browse.xml")
@LookupComponent("storesTable")
@LoadDataBeforeShow
public class StoreBrowse extends StandardLookup<Store> {
}