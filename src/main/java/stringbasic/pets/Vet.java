package stringbasic.pets;

import java.util.ArrayList;
import java.util.List;

public class Vet {

    private List<Pet> pets = new ArrayList<>();

    public List<Pet> getPets() {
        return pets;
    }

    public void add(Pet newPet) {
        boolean isNew = true;
        for(Pet pet : pets) {
            if(areEquals(pet, newPet)) {
                isNew = false;
                break;
            }
        }
        if(isNew) {
            pets.add(newPet);
        }
    }

    private boolean areEquals(Pet pet1, Pet pet2) {
        return pet1.getRegNumber().equals(pet2.getRegNumber());
    }
}
