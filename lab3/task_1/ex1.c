#include <stdio.h>

int fact(int x){
	int prod = 1;
	for(int i = 1; i <= x; i++){
		prod *= i;
	}
	return prod;
}

int main(){
	int start, finish;
	scanf("%d", &start);
	scanf("%d", &finish);
	for(int i = start; i <= finish; i++){
		int sum = 0;
		int check = i;
		while(check != 0){
			sum += (fact(check%10));
			check /= 10;
		}
		if(sum == i){
			printf("%d ", sum);
		}
	}
	return 0;
}
