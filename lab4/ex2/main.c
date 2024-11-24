#include <stdio.h>


union Data {
    unsigned long long value;
    char bytes[8];
};

unsigned long long encrypt(unsigned long long input) {
    union Data data;
    data.value = input;

    for (int i = 0; i < 8; i += 2) {
        unsigned char temp = data.bytes[i];
        data.bytes[i] = data.bytes[i + 1];
        data.bytes[i + 1] = temp;
    }

    return data.value;
}

int main() {
    unsigned long long input;

    printf("Enter an unsigned long long integer: ");
    scanf("%llu", &input);

    printf("Original message: %llu\n", input);

    unsigned long long encrypted = encrypt(input);
    printf("Encrypted message: %llu\n", encrypted);

    unsigned long long decrypted = encrypt(encrypted);
    printf("Decrypted message: %llu\n", decrypted);

    return 0;
}