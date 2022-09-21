import java.util.Scanner;
class Snake_ladder_UC5 {
	public static void main(String[] args) {
		int dicevalue;
		Scanner sc=new Scanner(System.in);
		dicevalue=sc.nextInt(7);
		int count=0;
		int pos=0;
		String option[]= {"noplay","ladder","snake"};
		while(pos<=100) {
			String s[]=[option];
			if(s=="noplay")
				pos=pos;
			else if(s=="ladder")
			{
				pos=pos+dicevalue;
				if(pos>100)
					pos=pos-dicevalue;
			}
			else
			{
				pos=pos-dicevalue;
				if(pos<0)
					pos=0;
			}
			System.out.println("position after dice roll:"+pos);
		}
		count++;
		System.out.println(count);
	}

}
