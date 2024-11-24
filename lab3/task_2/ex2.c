#include <stdio.h>

int main(){
	char str[100];
	gets(str);
	int len = 0;
	for( ; str[len] != '\0'; len++);
	char setstr[100];
	int index = 0;
	for(int i = 0; i <= len; i++){
		int flag = 1;
		for(int j = 0; j < 100; j++){
			if(setstr[j] == str[i]){
				flag = 0;
				break;
			}
		}
		if(flag && str[i] != ' '){
			setstr[index] = str[i];
			index++;
		}
	}
	int setlen = 0;
	for( ; setstr[setlen] != '\0'; setlen++);
	for(int i = 0; i < setlen; i++){
		int cnt = 0;
		for(int j = 0; j < len; j++){
			if(setstr[i] == str[j]){
				cnt++;
			}
		}
		printf("%c ", setstr[i]);
		for(int j = 0; j < cnt; j++){
			printf(".");
		}
		printf("\n");
	}
	return 0;
}
