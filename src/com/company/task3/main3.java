package com.company.task3;

public class main3 {
    public static void main(String[] args) {

      Apple apple [] = new Apple[20];
      Kola kolas [] = new Kola[20];
      Backpack backpack1 = new Backpack(apple,kolas);
      Ball balls[] = new Ball[50];
      Papka papkas [] = new Papka[50];
      Water waters [] = new Water[50];
      Backpack backpack2 = new Backpack(balls,waters,papkas);
      Apple apples3 [] = new Apple[10];
      Ball balls3 [] = new Ball[3];
      Backpack backpack3 = new Backpack(apples3,balls3,papkas,kolas);
    }
}
