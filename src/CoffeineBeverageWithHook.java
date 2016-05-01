
public abstract class CoffeineBeverageWithHook {

	void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	
	void boilWater(){
		System.out.println("Boiling water...");
	}
	
	abstract void brew();
	
	void pourInCup(){
		System.out.println("Pouring in cup...");
	}
	
	abstract void addCondiments();
	
	boolean customerWantsCondiments(){
		return true;
	}
}
