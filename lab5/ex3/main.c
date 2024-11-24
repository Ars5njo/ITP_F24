#include <stdio.h>

enum WeekDays {
    Monday = 1,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday,
};

char* ReturnMonth(int day) {
    switch(day) {
        case Monday: return "Monday";
        case Tuesday: return "Tuesday";
        case Wednesday: return "Wednesday";
        case Thursday: return "Thursday";
        case Friday: return "Friday";
        case Saturday: return "Saturday";
        case Sunday: return "Sunday";
        default: return "Ti debil";
    };
}

int main() {
    printf("Input the day of the week from 1 to 7 (1 is Monday and 7 is Sunday): ");
    int day;
    scanf("%d", &day);
    printf("The day of the week is: %s\n", ReturnMonth(day));
    return 0;
}
