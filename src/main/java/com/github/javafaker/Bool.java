package com.github.javafaker;

public class Bool {
    private final Faker faker;

    protected Bool(Faker faker) {
        this.faker = faker;
    }
    //Test
    public boolean bool() {
        return faker.random().nextBoolean();
    }
}
