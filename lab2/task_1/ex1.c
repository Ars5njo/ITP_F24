#include <stdio.h>
#include <string.h>


int main(){
        char string[100];
        scanf("%s", &string);
        for(int i = strlen(&string); i >= 0; i--){
                printf("%c", string[i]);
        }
	printf("\n");
        return 0;
}
