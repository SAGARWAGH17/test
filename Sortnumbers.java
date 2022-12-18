import java.util.Arrays;
public class Sortnumbers {

	static void rearrange(int[] arr, int n)
	{
		int temp[] = arr.clone();
		int small = 0, large = n - 1;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			if (flag)
				arr[i] = temp[large--];
			else
				arr[i] = temp[small++];
			flag = !flag;
		}
	}
	public static void main(String[] args)
	{
		int arr[] = new int[] { 2, 4, 6, 8, 10 };
		rearrange(arr, arr.length);
		System.out.print("Expected output : ");
		System.out.println(Arrays.toString(arr));
	}

}