package com.intellibucket.lesson.springframework.model;


public class Person {
    private String firstName;
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public static final class Builder {
        private String firstName;
        private String lastName;

        private Builder() {
        }

        public static Builder aPerson() {
            return new Builder();
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.firstName = this.firstName;
            person.lastName = this.lastName;
            return person;
        }
    }
}
