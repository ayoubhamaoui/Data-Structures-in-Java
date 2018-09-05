import java.io.*;

public class array {
	public static void main(String[] args) {
		long[]	arr;					//	ref to array
		arr	=	new	long[100];			//	make array
		int	nElems	=	0;				//	number of items
		
		int	j;							//	loop counter
		long searchKey;					//	key of item to search for
		
		//------------------------------------------------------
		
		arr[0]	=	77;
		arr[1]	=	78;
		arr[2]	=	45;
		arr[3]	=	23;
		arr[4]	=	56;
		arr[5]	=	33;
		arr[6]	=	87;
		arr[7]	=	96;
		arr[8]	=	12;
		arr[9]	=	29;
		nElems	=	arr.length;			// new we have 10 items in array
		
		//-------------------------------------------------------
		for(j=0;j<nElems;j++)		//	display items
			System.out.print(arr[j]+"\t");
		System.out.println("");
		
		//-------------------------------------------------------
	}
}
