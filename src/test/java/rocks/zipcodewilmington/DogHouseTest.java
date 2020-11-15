package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addTest() {
        // given // had
        Dog expected = new Dog();
        int expectedId = expected.getId();

        // when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(expectedId);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 2);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByDogTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 2);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(dogToBeAdded);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }

    @Test
    public void getDogByIdTest(){
        Dog dog = new Dog(null, null, 101);
        int expectedId = 101;

        Dog expectedDog = DogHouse.getDogById(expectedId);
        Dog actualDog = DogHouse.getDogById(12);

        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
