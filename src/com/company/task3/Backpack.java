package com.company.task3;

import java.util.ArrayList;
import java.util.Objects;

public class Backpack {
    ArrayList <Cirkle> cirkles = new ArrayList<>();
    ArrayList <Cylinder> cylinders = new ArrayList<>();
    ArrayList <Flateble> flatebles = new ArrayList<>();

    public ArrayList<Cirkle> getCirkles() {
        return cirkles;
    }

    public Backpack(Apple[] apple ,Kola [] kolas) {
    }
    public Backpack (Ball [] balls,Water [] waters , Papka [] papkas){
    }
    public Backpack (Apple [] apples3 , Ball [] balls3,Papka [] papkas,Kola [] kolas3){

    }


    public Backpack(ArrayList<Cirkle> cirkles, ArrayList<Cylinder> cylinders, ArrayList<Flateble> flatebles) {
        this.cirkles = cirkles;
        this.cylinders = cylinders;
        this.flatebles = flatebles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return Objects.equals(cirkles, backpack.cirkles) &&
                Objects.equals(cylinders, backpack.cylinders) &&
                Objects.equals(flatebles, backpack.flatebles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cirkles, cylinders, flatebles);
    }
}
