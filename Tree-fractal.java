void setup(){
size(1000,700);
}
void draw(){
noFill();
noLoop();
stroke(255);
background(0);
translate(width/2,height);
drawTree(0,0,200);
}
void drawTree(float x,float y,float length){
float random=random(0.5)+0.4; 
strokeWeight(length/10);
strokeCap(ROUND);
line(0,0,0,-length);
translate(0,-length);
if(length>10){
pushMatrix();
rotate((PI/4)*random);
drawTree(x*random,y*random,length*0.7);
popMatrix();
pushMatrix();
rotate((-PI/4)*random);
drawTree(x*random,y*random,length*0.7);
popMatrix();
}
}
