class Parent extends Person{

    private Parent spouse;
    private Child[] children = new Child[0];

    public Parent(String name, int age, Parent spouse){

        super(name, age);
        this.spouse = spouse;
    }

    public Parent(String name, int age){
        super(name, age);
    }

    public Parent getSpouse(){
        return this.spouse;
    }

    public void setSpouse(Parent spouse){
        this.spouse = spouse;
    }

    public Child[] getChildren(){
        return this.children;
    }

    public void setChildren(Child[] children){
        this.children = children;
    }

    public void addChild (Child child){
        int numOfChildren = this.children.length;
        Child[] newChildren = new Child[numOfChildren + 1];
        for (int i = 0; i < numOfChildren; i++){
            newChildren[i] = this.children[i];
        }
        newChildren[numOfChildren + 1] = child;
    }





}