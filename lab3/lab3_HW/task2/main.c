#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    int set[n];
    set[0] = arr[0];
    int k = 1;
    for (int i = 1; i < n; i++) {
        int flag = 1;
        for(int j = 0; j < k; j++) {
            if(arr[i] == set[j]) {
                flag = 0;
                break;
            }
        }
        if(flag) {
            set[k] = arr[i];
            k++;
        }
    }
    for(int i = 0; i < k; i++) {
        printf("%d ", set[i]);
    }
    return 0;
}
