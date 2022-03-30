package Day5;

abstract class Shap{
	abstract void draw();
}

// in real scenario, implementation is provided by others i.e unknown by the end user
class Square extends Shap{
	void draw()
	{
		System.out.println("drawing square");
	}
}
class Circle1 extends Shap
{
	void draw()
	{
		System.out.println("drawing circle");
	}
}
class TestAbstraction {

	public static void main(String[] args) 
	{
		Shap s=new Circle1();
		s.draw();
	}

}
