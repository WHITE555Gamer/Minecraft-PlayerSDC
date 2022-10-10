package com.github.white555gamer.playersdc.assets.parse;

import org.bukkit.Location;

import static org.bukkit.Bukkit.getPlayer;

public class Location2StringParser {

    public static String Location2StringWithWorldParser(Location Loc) {
        String LocData = "(" + Loc.getWorld().getName() + "):" + Loc.getX() + "/" + Loc.getY() + "/" + Loc.getZ();
        return LocData;
    }
    public static String Location2StringWithoutWorldParser(Location Loc) {
        String LocData = Loc.getX() + "/" + Loc.getY() + "/" + Loc.getZ();
        return LocData;
    }
}
