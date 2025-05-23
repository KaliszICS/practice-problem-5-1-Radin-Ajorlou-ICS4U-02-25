class Child extends Person{

    private Child[] siblings = new Child[0];
    private Parent parent1;
    private Parent parent2;

    public Child(String name, int age, Parent parent1, Parent parent2){
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
    }

    public Parent getParent1(){
        return this.parent1;
    }

    public Parent getParent2(){
        return this.parent2;
    }
    

    public Child[] getSiblings(){
        return this.siblings;
    }

    public void setSiblings(Child[] siblings){
        this.siblings = siblings;
    }

    public void addSibling(Child child){
        int length = this.siblings.length;
        Child[] newSiblings = new Child[length + 1];
        for (int i = 0; i < length; i++){
            newSiblings[i] = this.siblings[i];
        }
        newSiblings[length + 1] = child;
    }

    
}
