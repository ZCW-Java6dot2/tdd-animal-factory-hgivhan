package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    private Dog dog;

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        // Given
        String expected = "bark!";

        // when
        Dog dog = new Dog(null, null, 0);
        String actual = dog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // given
        Date expected = new Date();

        // when
        Dog dog = new Dog(null, null, 0);
        dog.setBirthDate(expected);

        // then
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // given
        Food food = new Food();
        Dog dog = new Dog(null, null, 0);
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;


        // when
        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetId(){
        Dog dog = new Dog(null, null, 1);
        int expectedId = 1;

        int actualId = dog.getId();

        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // given
        Dog dog = new Dog(null, null, 0);

        // when
        boolean outcome = dog instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }



    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        Dog dog = new Dog(null, null, 0);

        // when
        boolean outcome = dog instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
    }



    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Bowe";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName); //
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}


