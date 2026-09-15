#include <stdio.h>
#include <graphics.h>
#include <conio.h>


typedef struct {
    int x_min, y_min, x_max, y_max;
} Rectangle;


void windowToViewport(Rectangle window, Rectangle viewport, int logical_x, int logical_y, int *physical_x, int *physical_y) {

    double wx = window.x_max - window.x_min;
    double wy = window.y_max - window.y_min;
    double vx = viewport.x_max - viewport.x_min;
    double vy = viewport.y_max - viewport.y_min;
    

    double scale_x = vx / wx;
    double scale_y = vy / wy;

    *physical_x = viewport.x_min + (int)((logical_x - window.x_min) * scale_x);
    *physical_y = viewport.y_min + (int)((logical_y - window.y_min) * scale_y);
}

void drawRectangle(Rectangle rect, int color) {
    setcolor(color);
    rectangle(rect.x_min, rect.y_min, rect.x_max, rect.y_max);
}

int main() {
    int gd = DETECT, gm;
    
    
    initgraph(&gd, &gm, "");
    
    
    Rectangle window = {100, 100, 500, 400};
    
    
        Rectangle viewport = {150, 150, 350, 300};
    
    
    drawRectangle(window, YELLOW);
    drawRectangle(viewport, RED);


    int phys_x1, phys_y1;    
    outtextxy(phys_x1,phys_y1,"hello, in viewport");
    
    
    getch();
    
    closegraph();
    
    return 0;
}
