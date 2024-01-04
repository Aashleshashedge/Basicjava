package MyPack;

class Player {
	String name; 
	int age;
	Player(String n,int a) 
	{name=n; age=a;}
	void show()
	{
		System.out.println("Player name: "+name);
		System.out.println("Age: "+age);
	}
}
class Cricket_player extends Player {
	String type;
	Cricket_player (String n, String t, int a)
	{
		super(n,a);
		type =t;
	}

public void show()
{
	super.show();
	System.out.println("Player type: "+type);
}
}
class Football_player extends Player
{
	String type;
	Football_player (String n,String t,int a)
{
	super(n,a);
	type= t;
}
public void show()
{
	super.show();
	System.out.println("Player type: "+type);
}
}
class Hockey_player extends Player{
	String type ;
	Hockey_player( String n,String t,int a){
		super(n,a);
		type=t;
		}
	public void show()
	{
		super.show();
		System.out.println("Player type: "+type);
		}
	}
class Demo {
	public static void main(String[] args) {
		Cricket_player  c= new Cricket_player ("Divyanshi","cricket",23);
		Football_player f=new Football_player ("Malasha", "football" ,22);
		Hockey_player h=new Hockey_player ("Janhavi", "Hockey",24);
		
		c.show();
		System.out.println(" ");
		f.show();
		System.out.println(" ");
		h.show();
		System.out.println(" ");
	}
}
