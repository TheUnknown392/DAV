#include <graphics.h>
#include <conio.h>
#include <stdio.h>

int main() {
    int gd = DETECT, gm;

    float x1, y1, x2, y2;
    float delx, dely, steps, x, y;
    int i;
    printf("Enter x1 y1: ");
    scanf("%f %f", &x1, &y1);
    printf("Enter x2 y2: ");
    scanf("%f %f", &x2, &y2);
    initgraph(&gd, &gm, "");
    delx = x2 - x1;
    dely = y2 - y1;

    int labelx, labely;
    if(x2>x1){
	labelx=1;
    }else{
	labelx=-1;
    }
    
    if(y2>y1){
        labely=1;
    }else{
	labely=-1;
    }

    x = x1;
    y = y1;
    
    putpixel(x, y, WHITE);

    if(delx > dely){
	float p = 2*dely - delx;
	for(int k=0; k<delx; k++){
	    if(p<0){
		x=x+labelx;
		p = p + 2*dely;
	    }else{
		x = x + labelx;
		y = labely + y;
		p = p + 2*dely - 2*delx;
	    }
	    putpixel(x, y, WHITE);
	}
    }else{
	float p = 2*delx - dely;
	for(int k=0; k<dely; k++){
	    if(p<0){
		y = y + labely;
		p=p+2*delx;
	    }else{
		x = x + labelx;
		y = y + labely;
		p = p + 2*delx - 2*dely;
	    }
	    putpixel(x, y, WHITE);
	}
    }
    getch();
    closegraph();
    return 0;
}
