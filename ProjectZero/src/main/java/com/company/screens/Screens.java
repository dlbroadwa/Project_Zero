package com.company.screens;

import com.company.models.Application;
import com.company.models.StockInventory;

import java.sql.SQLException;

public interface Screens {
    Screens display(Application app, StockInventory i) throws SQLException;
}
