package practise;

public class iscatplaying
{
public static boolean iscatplaying (boolean summer,int temperature){
	while(summer==true)
	{
		if(temperature>=25 && temperature<=35)
		{
			return true;
		}
		return false;
	}
	return false;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(iscatplaying(true,40));

	}

}
