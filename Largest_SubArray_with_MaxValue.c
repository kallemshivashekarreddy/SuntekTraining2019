#include <stdio.h>
#include <stdlib.h>

void strarr(int arr[], int n)
{
	int max_so_far = 0;

	
	int max_ending_here = 0;

	int start = 0, end = 0;


	int beg = 0;

	for (int i = 0; i < n; i++)
	{
		
		max_ending_here = max_ending_here + arr[i];

		
		if (max_ending_here < 0)
		{
			max_ending_here = 0;	
			beg = i + 1;
		}

		
		if (max_so_far < max_ending_here)
		{
			max_so_far = max_ending_here;
			start = beg;
			end = i;
		}
	}

	printf("The sum of contiguous subarray with the largest sum is %d",
			max_so_far);

	printf("\n The contiguous subarray with the largest sum is ");
	for (int i = start; i <= end; i++)
		printf("%d ",arr[i]);
}

int main()
{
	int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
	int n = sizeof(arr)/sizeof(arr[0]);

	strarr(arr, n);

	return 0;
}


