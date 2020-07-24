package com.company.screens;

import com.company.models.Application;
import com.company.models.Inventory;

import java.sql.SQLException;

public interface Screens {
    Screens display(Application app, Inventory i) throws SQLException;
}
