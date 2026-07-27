 class class1 {
    String name = "john";
    int age =20;
    void display(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    public static void main(String[] args){
        class1 s1 = new class1();
        s1.display();
        System.out.println("name: " + s1.name);
    }
    
}
