package org.example;

import org.example.model.*;
import org.example.model.enums.LampType;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(3, PaintColor.WHITE );

        Bed bed = new Bed("Modern", 2, 50, 1, 1);

        Lamp lamp = new Lamp(LampType.NORMAL, true, 80);

        Wardrobe wardrobe = new Wardrobe(120, 200, 75.5);

        Carpet carpet = new Carpet(200, 300, PaintColor.RED);

        Bedroom bedroom = new Bedroom("My Cozy Room", wall1, wall2, wall3, wall4,
                ceiling, bed, wardrobe, carpet, lamp);

    }
}