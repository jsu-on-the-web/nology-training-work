**Challenge: How many granules?**

1. 1 Teaspoon of coffee granules is needed for 150mL of water

2. Create an abstract `Container` with 2 functions

   - An abstract function `getVolume()`

   - A `teaspoonCount()` function that uses `getVolume()` to calculate the teaspoons of coffee granules needed for the volume

3. Create three classes `LatteGlass`, `ShotGlass` and `Mug` that extend container, all should implement the `getVolume()` method

**Challenge: Phone**

1. Create an abstract class named `Phone`
2. the `Phone` class should have a phone number property
3. the `Phone` class should have a method named `call` that takes a single parameter of another phone object and logs that phones number
4. create a class named `Landline` that inherits from `Phone` and has an `address` property
5. create a class named `Mobile` that inherits from `Phone` and has a method called `text` that takes another `Mobile` as well as a string and logs the number as well as the message