package lab2.task5;

public class PhDStudent extends Student {

    private String researchField;

    public PhDStudent(String name, int age, String major, String field){
        super(name, age, major);
        researchField = field;
    }

    @Override
    public void assignPet(Animal pet){

        if(pet instanceof Dog){
            System.out.println("PhD students cannot take care of dogs!");
            return;
        }

        super.assignPet(pet);
    }

    @Override
    public String getOccupation(){
        return "PhD in " + researchField;
    }
}