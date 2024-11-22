package animals;

public class Dog {
     String  name;
    Integer age;
    String color;
    public Integer test; // это плохая практика, всегда надо сеттером и геттером

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name, Integer age, String color, Integer test) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.test = test;
    }

    public Dog () {
    }

    public void bark(){
        System.out.println("гав гав гав");
    }
    public void bark(String tuff) {

        System.out.println("гав гав гав" + tuff);
    }


   // public abstract void barkqq();

}

