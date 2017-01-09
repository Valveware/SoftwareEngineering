
public abstract class Duck {
	//Behavior variables
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	//Constructor
	public Duck(){
		
	}
	//duck methods
    public abstract void display(); // different for each (kind of) Duck
    
    public void swim(){
    	System.out.println("All ducks float, even decoys");
    };
    
	public void performQuack(){
		quackBehavior.quack();
	}
	public void performFly(){
		flyBehavior.fly();
	}
	// Setting behavior Dynamically
	// Allows duck's behavior to be changed on the fly
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb){
		quackBehavior = qb;
	}
    // OTHER DUCKLIKE Methods
}
