#include <stdio.h>

struct Ingredient {
    char name[30];
    int amount;
};

struct Recipe {
    char name[50];
    struct Ingredient ingredients[10];
    int num_ingredients;
};

int main() {
    int i, j, num_recipes;

    printf("Enter the number of recipes: ");
    scanf("%d", &num_recipes);

    struct Recipe cookbook[num_recipes];

    for (i = 0; i < num_recipes; i++) {
        printf("\nEnter the name of recipe %d: ", i + 1);
        scanf(" %[^\n]s", cookbook[i].name);

        printf("Enter the number of ingredients for %s (2 to 10): ", cookbook[i].name);
        scanf("%d", &cookbook[i].num_ingredients);

        while (cookbook[i].num_ingredients < 2 || cookbook[i].num_ingredients > 10) {
            printf("Please enter a valid number of ingredients (2 to 10): ");
            scanf("%d", &cookbook[i].num_ingredients);
        }

        for (j = 0; j < cookbook[i].num_ingredients; j++) {
            printf("Enter name of ingredient %d: ", j + 1);
            scanf(" %[^\n]s", cookbook[i].ingredients[j].name);
            printf("Enter the amount of %s: ", cookbook[i].ingredients[j].name);
            scanf("%d", &cookbook[i].ingredients[j].amount);
        }
    }


    printf("\nCookbook Recipes:\n");
    for (i = 0; i < num_recipes; i++) {
        printf("\nRecipe: %s\n", cookbook[i].name);
        printf("Ingredients:\n");
        for (j = 0; j < cookbook[i].num_ingredients; j++) {
            printf("  %s: %d units\n", cookbook[i].ingredients[j].name, cookbook[i].ingredients[j].amount);
        }
    }

    return 0;
}