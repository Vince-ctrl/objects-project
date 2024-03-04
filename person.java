public class person {
    String name;
    int age;
    String gender;
    public person(String personName, int personAge, String personGender){
        name = personName;
        age = personAge;
        gender = personGender;
    }
    public void changeAge(int newAge){
        age = newAge;
    }
    public String toString(){
        return "My name is " + name + ". I am " + age + " years old. My gender is " + gender + ".";
    }
}
