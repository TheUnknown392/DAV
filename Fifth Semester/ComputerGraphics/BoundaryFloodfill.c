#include <graphics.h>
#include <conio.h>
#include <stdio.h>

void Boundary_fill(int x, int y, int b_color, int fill_color) {
    int value = getpixel(x, y);

    if (value != b_color && value != fill_color) {
        putpixel(x, y, fill_color);

        Boundary_fill(x - 1, y, b_color, fill_color);
        Boundary_fill(x + 1, y, b_color, fill_color);
        Boundary_fill(x, y - 1, b_color, fill_color);
        Boundary_fill(x, y + 1, b_color, fill_color);
    }
}

void flood_fill(int x, int y, int color){
  int value = getpixel(x,y);
  if(color == value){
    flood_fill(x-1,y,color);
    flood_fill(x+1,y,color);
    flood_fill(x,y-1,color);
    flood_fill(x,y+1,color);
  }
}


int main() {
    int gd = DETECT, gm;

    initgraph(&gd, &gm, "");

    int boundary_color = WHITE;

    int fill_color = RED;

    rectangle(100, 100, 300, 250);
    flood_fill(102,102,BLACK);
    //   Boundary_fill(150, 150, boundary_color, fill_color);

    getch();
    closegraph();

    return 0;
}
