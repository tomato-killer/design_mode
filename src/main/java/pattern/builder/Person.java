package pattern.builder;

public class Person {

    private String name;
    private String gender;
    private int age;

    private Person() {
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {

        private String name;
        private String gender;
        private int age;

        public Builder() {
        }

        public String getName() {
            return name;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }


        public Person builder(){
            return new Person(this);
        }

    }
}
