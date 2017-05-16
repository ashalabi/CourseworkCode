
public class Lomuto {

	public static int partition(int[] A, int low, int high){
	    int s, j, p, t;

	    p = A[low];
	    s = low;

	    for(j = low+1; j <= high; j++) {
	        if(A[j] < p) {
	        	s++;
	        	t = A[j];
	            A[j] = A[s];
	            A[s] = t;
	            
	        }
	    }

	    t = A[s];
	    A[s] = A[low];
	    A[low] = t;

	    return s;
	}
}