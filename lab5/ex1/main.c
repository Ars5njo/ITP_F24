#include <stdio.h>

//__attribute__((packed))
struct Birthday {
    unsigned short int day: 5;
    unsigned short int month: 4;
    unsigned short int year: 7;
};

int main() {
    struct Birthday birthday = {5, 8, 106};
    printf("Day: %u\n", birthday.day);
    printf("Month: %u\n", birthday.month);
    printf("Year: %u\n", birthday.year+1900);
    printf("Size of structure is %lu\n", sizeof(birthday));
    return 0;
}
