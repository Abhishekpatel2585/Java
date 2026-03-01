class Animal{
	void eat(){
		System.out.println("Eating the Food");
	}
}

class Dog extends Animal{
	void Bark(){
		System.out.println("Dog Barking");
	}
}
class Lion extends Animal{
	void Roar(){
		System.out.println("Lion Roaring");
	}
}

class Hierachical_inheritance{
	public static void main(String[] args){
		Dog D1=new Dog();
		D1.eat();
		D1.Bark();
		Lion L1=new Lion();
		L1.eat();
		L1.Roar();
	}
}