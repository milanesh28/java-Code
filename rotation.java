package placement;

public class rotation {

	public static void main(String[] args) {
    int []a= {1,2,3,4,5};
    int []b= {3,4,5,1,2};
    int flag=1;
    		while(a[0]!=b[0]) {
    		int temp= a[0];
    		for(int i=1;1<b.length;i++)
    			a[i-1]=a[i];
    		a[a.length]=temp;
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!=b[i]);
		flag=0;
		System.out.print("No");
		break;
	}
	
	if(flag==1)
		System.out.print("Yes");
}
}
