package placement;

public class rightrotation {
	public static void main(String[] args)
	{
		int count=0;
				for(int i=0;i<a.length;i++) {
					count = i;
					while(count!=0) {
						temp=a[0][a[0].length-1];
								for(int j=a.length-1;j>0;j--) {
									a[i][j]=a[i][j-1];
								}
						a[i][0]=temp;
						count--;
								
					}
							
				}
					
	}

}
