#include <graphics.h>
#include <conio.h>
#include <stdio.h>

void center_and_symmetry(int cx, int cy, int x, int y);

int main() {
    int gd = DETECT, gm;

    int cx, cy;
    int a, b; 

    initgraph(&gd, &gm, "");

    printf("Enter center x y: ");
    scanf("%d %d", &cx, &cy);

    printf("Enter x-radius and y-radius: ");
    scanf("%d %d", &a, &b);

    int x = 0;
    int y = b;

    float p1;
    float dx = 2 * b * b * x;
    float dy = 2 * a * a * y;

   
    p1 = (b*b) - (a*a*b) + (0.25 * a*a);

    while (dx < dy) {
        center_and_symmetry(cx, cy, x, y);

        if (p1 < 0) {
            x++;
            dx = dx + 2 * b * b;
            p1 = p1 + dx + b*b;;
        } else {
            x++;
            y--;
            dx = dx + 2 * b * b;
            dy = dy - 2 * a * a;
            p1 = p1 + dx - dy + b*b;
        }
    }

    
    float p2 = (b*b)*((x + 0.5)*(x + 0.5)) + (a*a)*((y - 1)*(y - 1)) - (a*a*b*b);

    while (y >= 0) {
        center_and_symmetry(cx, cy, x, y);

        if (p2 > 0) {
            y--;
            dy = dy - 2 * a * a;
            p2 = p2 + a*a - dy;
        } else {
            y--;
            x++;
            dx = dx + 2 * b * b;
            dy = dy - 2 * a * a;
            p2 = p2 + dx - dy + a*a;
        }
    }

    getch();
    closegraph();
    return 0;
}

void center_and_symmetry(int cx, int cy, int x, int y){
    putpixel(cx + x, cy + y, WHITE);
    putpixel(cx - x, cy + y, WHITE);
    putpixel(cx + x, cy - y, WHITE);
    putpixel(cx - x, cy - y, WHITE);
}
