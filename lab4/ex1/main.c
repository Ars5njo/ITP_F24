#include <stdio.h>


struct ExamDay {
    int day;
    char month[20];
    int year;
} examDay;

struct Student {
    char name[100];
    char surname[100];
    int group_number;
    struct ExamDay exam_day;
} student;

int main(void) {
    struct Student student;
    scanf("%s", student.name);
    scanf("%s", student.surname);
    scanf("%d", &student.group_number);
    scanf("%d", &student.exam_day.day);
    scanf("%s", student.exam_day.month);
    scanf("%d", &student.exam_day.year);

    printf("Name: %s\n", student.name);
    printf("Surname: %s\n", student.surname);
    printf("Group number %d\n", student.group_number);
    printf("Day of the exam: %d\n", student.exam_day.day);
    printf("Month of the exam: %s\n", student.exam_day.month);
    printf("Year of the exam: %d\n", student.exam_day.year);
    return 0;
}
