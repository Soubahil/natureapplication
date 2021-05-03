

package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.*;

public class ForestNoteBook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();


    public ForestNoteBook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }


    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return this.carnivores.size() + this.omnivores.size() + this.herbivores.size();
    }

    public void addAnimal(Animal animal) {

        if (!AnimalExists(animal)) {
            this.animals.add(animal);
        } else {
            System.out.println("ALREADY EXISTS.");
        }

        if (animal instanceof Carnivore) {
            carnivores.add((Carnivore) animal);
        } else if (animal instanceof Omnivore) {
            omnivores.add((Omnivore) animal);
        } else if (animal instanceof Herbivore) {
            herbivores.add((Herbivore) animal);
        }

    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }
    private boolean AnimalExists(Animal animal) {

        return animals

                .stream()

                .anyMatch(a -> a.getName().equalsIgnoreCase(animal.getName()));

    }
    public void printNoteBook() {

        for (Animal animal : animals) {
            System.out.println(animal);
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }

    }

    public void sortAnimalsByName() {

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal animal1, Animal animal2) {
                return animal1.getName().toLowerCase(Locale.ROOT).compareTo(animal2.getName().toLowerCase(Locale.ROOT));
            }
        });

    }

    public void sortPlantsByName() {

        Collections.sort(plants, new Comparator<Plant>() {

            @Override
            public int compare(Plant plant1, Plant plant2) {
                return plant1.getName().toLowerCase(Locale.ROOT).compareTo(plant2.getName().toLowerCase(Locale.ROOT));
            }
        });

    }

}


