package org.example;

public class Puppy implements Cutie {
    public String description() {
        return "A little puppy with big, sad eyes";
    }

    public Integer cutenessRating() {
        return 11;
    }
}

public class Kitty implements Cutie {
    public String description() {
        return "A kitten with tiny paws and whiskers";
    }

    public Integer cutenessRating() {
        return 10;
    }
}

public class PygmyMarmoset implements Cutie {
    public String description() {
        return "A teeny-tiny monkey with big eyes";
    }

    public Integer cutenessRating() {
        return 9;
    }
}
