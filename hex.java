package placement;

public class hex {

	public static void main(String[] args) {
	int dec=58,rem;String hex="";
	while(dec>0)
	{   
		rem=dec%16;
		if(rem<0)
		hex=rem+hex;
		{
			rem=(rem-10)+'A';
			hex=(char)rem+hex;
		}
	}
	}

}
