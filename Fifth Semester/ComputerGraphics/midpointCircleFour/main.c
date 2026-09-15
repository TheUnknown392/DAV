#include <graphics.h>
#include <conio.h>
#include <stdio.h>

void center_and_symmetry(int cx, int cy, int x, int y);

int main() {
    int gd = DETECT, gm;

    float r, cx, cy;
    
    initgraph(&gd, &gm, "");
    
    printf("please insert center x y: ");
    scanf("%f %f", &cx, &cy);

    printf("please insert radius: ");
    scanf("%f", &r);

    int x = 0, y = r;

    float p = (5.0/4.0) - r;
    do{
	center_and_symmetry(cx, cy, x, y);
	if(p<0){
	    x = x + 1;
	    p = p + 2*x +1;
	}else{
	    y = y - 1;
	    x = x + 1;
	    p = p + 2*x - 2*y + 1;
	}
    }while(x <= y);
    getch();
    closegraph();
    return 0;
}

void center_and_symmetry(int cx, int cy, int x, int y){
    putpixel(cx + x, cy + y, WHITE);
    putpixel(cx - x, cy + y, WHITE);
    putpixel(cx + x, cy - y, WHITE);
    putpixel(cx - x, cy - y, WHITE);
    putpixel(cx + y, cy + x, WHITE);
    putpixel(cx - y, cy + x, WHITE);
    putpixel(cx + y, cy - x, WHITE);
    putpixel(cx - y, cy - x, WHITE);
}
