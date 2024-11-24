#include <stdio.h>

void swap(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}

int main(){
	int a, b;
	printf("IDK, input two numbers\n");
	scanf("%d %d", &a, &b);
	swap(&a, &b);
	printf("Swaped numbers: %d %d", a, b);
	return 0;
}
