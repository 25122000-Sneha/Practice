#include <stdio.h>
main(){
	int r, i, j;
	printf("Enter rows:");
	scanf("%d", &r);
	for(i=0; i<r; i++)
	{
		for(j=0; j<r; j++)
		{
			if(j<=r-1-i)
			{
				printf("*");
			}
			else
			{
				printf(" ");
			}
		}
		printf("\n");
	}
	
	
}
