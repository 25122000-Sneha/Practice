#include <stdio.h>
main(){
	int r, i, j;
	//printf("Enter rows:");
	//scanf("%d", &r);
	
	//for 4 rows
	for(i=0; i<4; i++)
	{
		for(j=0; j<7; j++)
		{
			if((j>=3-i) && (j<=3+i))
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
