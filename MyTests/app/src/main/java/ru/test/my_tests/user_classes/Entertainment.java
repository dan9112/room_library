package ru.test.my_tests.user_classes;

abstract class Entertainment {
    private String name,
            description;

    private String[] genre;

    public Entertainment(String name, String[] genre) {
        this.name = name;
        this.genre = genre;
        this.description = null;
    }

    public Entertainment(String name, String[] genre, String description) {
        this.name = name;
        this.genre = genre;
        this.description = description;
    }

    //методы для получения полей класса
    public String getName() {
        return name;
    }

    public String[] getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }
}

