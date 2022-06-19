#include <stdio.h>
main(){
	int r, i, j;
	//printf("Enter rows:");
	//scanf("%d", &r);
	for(i=0; i<=4; i++)
	{
		for(j=0; j<=8; j++)
		{
			if((j>=(4-i)) && (j<=(4+i)))
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
