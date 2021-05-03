package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNoteBook;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NatureApp {

    public static void main(String[] args) {
        ForestNoteBook noteBook = new ForestNoteBook();

        Tree pineTree = new Tree("PineTree", 200);
        pineTree.setLeaftype(Leaftype.NEEDLE);
        Flower sakura = new Flower("Sakura", 17);
        sakura.setSmell(Scent.SWEET);
        Flower rose = new Flower("Rose", 35);
        rose.setSmell(Scent.SOUR);
        Weed weeds = new Weed("Weeds", 12);
        weeds.setArea(100);
        Weed mint = new Weed("Mint", 10);
        mint.setArea(500);
        Bush berry = new Bush("Berry", 50, "Raspberry");
        berry.setFruit("none");
        berry.setLeaftype(Leaftype.HEART);

        Set<Plant> plantDietOfAnimalsEncountered = new HashSet<>();
        plantDietOfAnimalsEncountered.add(mint);
        plantDietOfAnimalsEncountered.add(sakura);
        plantDietOfAnimalsEncountered.add(rose);


        Herbivore goat = new Herbivore("Goat", 77, 86, 105);
        goat.setPlantDiet(plantDietOfAnimalsEncountered);
        Herbivore moose = new Herbivore("Moose", 670, 190,220);
        moose.setPlantDiet(plantDietOfAnimalsEncountered);
        Omnivore pig = new Omnivore("Pig", 600, 90, 100);
        pig.setPlantDiet(plantDietOfAnimalsEncountered);
        Omnivore bear = new Omnivore("Bear", 1000, 170, 210);
        bear.setPlantDiet(plantDietOfAnimalsEncountered);
        Carnivore hyena = new Carnivore("Hyena", 100, 60, 80);
        Carnivore cheetah = new Carnivore("Cheetah", 150, 80, 170);
        Carnivore tiger = new Carnivore("Tiger", 550, 270, 1680);
        Carnivore lion = new Carnivore("Lion", 300, 100, 150);
        Carnivore rat = new Carnivore("Rat", 8 , 9 , 15);
        Carnivore eagle = new Carnivore("Eagle", 18, 35, 45);

        noteBook.addPlant(berry);
        noteBook.addPlant(rose);
        noteBook.addPlant(pineTree);
        noteBook.addPlant(sakura);
        noteBook.addPlant(mint);
        noteBook.addAnimal(eagle);
        noteBook.addAnimal(rat);
        noteBook.addAnimal(lion);
        noteBook.addAnimal(tiger);
        noteBook.addAnimal(moose);

        noteBook.setHerbivores(List.of(goat,moose));
        noteBook.setCarnivores(List.of(cheetah, eagle, lion, tiger, hyena, rat));
        noteBook.setOmnivores(List.of(bear, pig));

        System.out.println(noteBook.getPlantCount());
        System.out.println(noteBook.getAnimalCount());

        System.out.println("-----------------");

        System.out.println(noteBook.getOmnivores());
        System.out.println(noteBook.getHerbivores());
        System.out.println(noteBook.getCarnivores());
        System.out.println("-----------------");


        noteBook.sortAnimalsByName();
        noteBook.sortPlantsByName();

        System.out.println("-----------------");

        noteBook.printNoteBook();

    }
}
