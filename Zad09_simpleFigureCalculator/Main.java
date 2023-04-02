import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSelect the number of the operation you want to perform");
        System.out.println("select a square, press: 1");
        System.out.println("select a rectangle, press: 2");
        System.out.println("select a circle, press: 3");
        System.out.println("select a rectangular triangle, press 4");
        System.out.println("select a triangle, press 5");
        System.out.println("select a trapeze, press 6");
        System.out.println("select a rhombus figure, press 7");
        int number = scanner.nextInt();
        switch(number) {
            case 1:
                System.out.println("Square from the sides, choose: 1\nSquare from the diagonal, choose: 2");
                int square = scanner.nextInt();
                switch(square) {
                    case 1:
                        System.out.println("give side a: ");
                        float a = scanner.nextFloat();
                        float field = a * a;
                        float circuit = 4 * a;
                        float diagonal = a * (float) Math.sqrt(2);
                        System.out.printf("field = %.2f cm^2 circuit = %.2f cm diagonal = %.2f cm",field,circuit,diagonal);
                        break;
                    case 2:
                        System.out.println("enter the diagonal d: ");
                        float d = scanner.nextFloat();
                        float side = d / (float) Math.sqrt(2);
                        float field1 = (float)  (Math.pow(side,2));
                        float circuit1 = side * 4;
                        System.out.printf("field = %.1f cm^2 circuit = %.1f cm side = %.2f cm",field1,circuit1,side);
                        break;
                    default:
                        System.out.println("there is no number like "+square);
                }break;
            case 2:
                System.out.println("rectangle from the sides, choose: 1\nrectangle from the diagonal and one side, choose: 2");
                int rectangle = scanner.nextInt();
                switch (rectangle){
                    case 1:
                        System.out.println("give side a: ");
                        float a = scanner.nextFloat();
                        System.out.println("give side b: ");
                        float b = scanner.nextFloat();
                        float field = a * b;
                        float circuit = (a * 2) + (b * 2);
                        float diagonal = ((a*a) + (b*b));
                        float diagonal1 = (float) Math.sqrt(diagonal);
                        System.out.printf("field = %.2f cm^2 circuit = %.2f cm diagonal = %.2f",field,circuit,diagonal1);
                        System.exit(0);
                    case 2:
                        System.out.println("give side a: ");
                        float a2 = scanner.nextFloat();
                        System.out.println("give diagonal d: ");
                        float d = scanner.nextFloat();
                        float field1 =  ((d * d) - (a2 * a2)) ;
                        float bSide = (float) Math.sqrt(field1);
                        float circuit1 = ((bSide * 2) + (a2 * 2));
                        float field2 = a2 * bSide ;
                        System.out.printf("field = %.1f cm^2 circuit = %.1f cm b Side = %.2f",field2,circuit1,bSide);
                        System.exit(0);
                    default:
                        System.out.println("there is no number like "+rectangle);
                } break;
            case 3:
                System.out.println("circle, from the radius, choose: 1\ncircle, from the field, choose: 2\ncircle, from the field circuit, choose: 3");
                int circle = scanner.nextInt();
                switch (circle){
                    case 1:
                        System.out.println("enter radius r: ");
                        float r = scanner.nextFloat();
                        float field = (r*r);
                        float circuit = 2*r;
                        float diameter = 2*r;
                        System.out.printf("field = %.1fπ circuit = %.1fπ b circle diameter = %.2f cm",field,circuit,diameter);
                        float field1 = (r*r) * (float) Math.PI;
                        float circuit1 = 2*r * (float) Math.PI;
                        System.out.printf("\nfield = %.3f circuit = %.3f",field1,circuit1);
                        break;
                    case 2:
                        System.out.println("enter field: ");
                        float circleField = scanner.nextFloat();
                        float rad = (float) Math.sqrt(circleField);
                        float circuit2 = 2*rad;
                        System.out.printf("r = %.2f circuit = %.2f π",rad,circuit2);
                    case 3:
                        System.out.println("enter circuit: ");
                        float circleCircuit = scanner.nextFloat();
                        float rad1 = circleCircuit / 2;
                        float field2 = rad1 * rad1;
                        System.out.printf("r = %.2f field = %.2f π",rad1,field2);
                    default:
                        System.out.println("there is no number like "+circle);
                }break;
            case 4:
                System.out.println("rectangular triangle, from the sides (a, b), choose: 1\nrectangular triangle, from the sides (a, c), choose: 2");
                int rectangularTriangle = scanner.nextInt();
                switch (rectangularTriangle){
                    case 1:
                        System.out.println("give side a: ");
                        float a = scanner.nextFloat();
                        System.out.println("give side b: ");
                        float b = scanner.nextFloat();
                        float field = (a*b)/2;
                        float circuit = (a*a)+(b*b);
                        float circuit1 = (float) Math.sqrt(circuit);
                        float circuit2 = a+b+circuit1;
                        System.out.printf("field = %.2f side c = %.2f circuit = %.2f",field,circuit1,circuit2);
                        break;
                    case 2:
                        System.out.println("give side a: ");
                        float a1 = scanner.nextFloat();
                        System.out.println("give side c: ");
                        float c = scanner.nextFloat();
                        float sideB = (c*c)-(a1*a1);
                        float sideB1 = (float) Math.sqrt(sideB);
                        float field1 = (a1*sideB1)/2;
                        float circuit3 = (a1+sideB1+c);
                        System.out.printf("side b = %.2f field = %.2f circuit = %.2f",sideB1,field1,circuit3);
                    default:
                        System.out.println("there is no number like "+rectangularTriangle);
                }break;
            case 5:
                System.out.println("give side a: ");
                float a = scanner.nextFloat();
                System.out.println("enter height h: ");
                float h = scanner.nextFloat();
                float field = (a*h)/2;
                System.out.printf("field = %.2f",field);
                break;
            case 6:
                System.out.println("trapeze, from the sides (a, b) and h, choose: 1\ntrapeze , from the sides (a, b) and field looking for h, choose: 2");
                int trapeze = scanner.nextInt();
                switch (trapeze){
                    case 1:
                        System.out.println("give side a: ");
                        float at = scanner.nextFloat();
                        System.out.println("give side b: ");
                        float bt = scanner.nextFloat();
                        System.out.println("enter height h: ");
                        float ht = scanner.nextFloat();
                        float fieldTrapeze = (((at + bt) * ht)/2);
                        System.out.printf("field = %.2f",fieldTrapeze);
                        break;
                    case 2:
                        System.out.println("give side a: ");
                        float at2 = scanner.nextFloat();
                        System.out.println("give side b: ");
                        float bt2 = scanner.nextFloat();
                        System.out.println("enter field: ");
                        float fieldt = scanner.nextFloat();
                        float fieldt1 = (at2+bt2)/2;
                        float fieldt2 = fieldt / fieldt1;
                        System.out.printf("hight = %.2f",fieldt2);
                    default:
                        System.out.println("there is no number like "+trapeze);
                }break;
            case 7:
                System.out.println("rhombus from the side a and h, choose: 1\nrhombus from the diagonal, choose: 2");
                int rhombus = scanner.nextInt();
                switch (rhombus){
                    case 1:
                        System.out.println("give side a: ");
                        float aa = scanner.nextFloat();
                        System.out.println("give side h: ");
                        float hh = scanner.nextFloat();

                        float fieldRhombus = aa * hh;
                        float circuitRhombus = aa*4;
                        System.out.printf("field = %.2f circuit = %.2f",fieldRhombus,circuitRhombus);
                        break;
                    case 2:
                        System.out.println("enter the diagonal d: ");
                        float d = scanner.nextFloat();
                        System.out.println("enter the diagonal f: ");
                        float f = scanner.nextFloat();

                        float fieldRhombus1 = (d * f)/2;
                        System.out.printf("field = %.2f",fieldRhombus1);
                        break;
                    default:
                        System.out.println("there is no number like "+rhombus);
                }break;

        }
    }
}