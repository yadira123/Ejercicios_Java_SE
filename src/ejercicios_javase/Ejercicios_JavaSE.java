
package ejercicios_javase;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Ejercicios_JavaSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*1. Programa java que realice lo siguiente: 
        declarar una variable N de tipo int, 
        una variable A de tipo double y una variable C de tipo char 
        y asigna a cada una un valor. A continuación muestra por 
        pantalla: El valor de cada variable, la suma de N + A, 
        la diferencia de A - N, el valor numérico correspondiente al 
        carácter que contiene la variable C.*/
//        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero:"));
//        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero entero:"));
//        char c = 'a';
//        
//        double suma = n+a;
//        double diff = a-n;
//        int valor = c;
//        
//        System.out.println("n = "+n);
//        System.out.println("a = "+a);
//        System.out.println("c = "+c);
//        
//        System.out.println("n + a = "+suma);
//        System.out.println("a - n = "+diff);
//        System.out.println("Valor numerico de a = "+valor);
        



    /*2.Programa java que realice lo siguiente: declarar dos 
    variables X e Y de tipo int, dos variables N y M de tipo double 
    y asigna a cada una un valor. A continuación reliza y muestra por 
    pantalla una serie de operaciones entre ellas. 
    El valor de cada variable.
    La suma  X + Y
    La diferencia  X – Y
    El producto  X * Y
    El cociente  X / Y
    El resto  X % Y
    La suma  N + M
    La diferencia  N – M
    El producto  N * M
    El cociente  N / M
    El resto  N % M
    La suma X + N
    El cociente Y / M
    El resto Y % M
    El doble de cada variable
    La suma de todas las variables
    El producto de todas las variables
    Si por ejemplo le hemos dado a X el valor 1, a Y el valor 2, 
    a M el valor 3.2 y a N el valor 4.7 se debe mostrar por pantalla:
    */
//    int x, y;
//    double n, m;
//    x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero:"));
//    y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero entero:"));
//    n = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero decimal:"));
//    m = Double.parseDouble(JOptionPane.showInputDialog("Ingrese otro numero decimal:"));
//    
//    int suma1 = x+y;
//    int diff1 = x-y;
//    int mult1 = x*y;
//    int coci1 = x/y;
//    int resto1 = x%y;
//       
//    double suma2 = n + m;
//    double diff2 = n - m;
//    double mult2 = n * m;
//    double coci2 = n / m;
//    double resto2 = n % m;
//   
//    double suma3 = x + n;
//    double coci3 = y / m;
//    double resto3 = y % m;
//    
//    int doblex = x * 2;
//    int dobley = y * 2;
//    double doblen = n * 2;
//    double doblem = m * 2;
//    
//    double sumaTotal = x+y+n+m;
//    double productoTotal = x*y*n*m;
//    
//        System.out.println("x = "+x+"\ny = "+y+"\nn = "+n+"\nm = "+m);
//        System.out.println("x + y = "+suma1);
//        System.out.println("x - y = "+diff1);
//        System.out.println("x * y = "+mult1);
//        System.out.println("x / y = "+coci1);
//        System.out.println("x % y = "+resto1);
//        
//        System.out.println("n + m = "+suma2);
//        System.out.println("n - m = "+diff2);
//        System.out.println("n * m = "+mult2);
//        System.out.println("n / m = "+coci2);
//        System.out.println("n % m = "+resto2);
//        
//        System.out.println("x + n = "+suma3);
//        System.out.println("y / m = "+coci3);
//        System.out.println("y % m = "+resto3);
//        
//        System.out.println("doble de x = "+doblex);
//        System.out.println("doble de y = "+dobley);
//        System.out.println("doble de n = "+doblen);
//        System.out.println("doble de m = "+doblem);
//        
//        System.out.println("x + y + n + m = "+sumaTotal);
//        System.out.println("x * y * n * m = "+productoTotal);


        


        /*3. Programa Java que declare una variable entera N y asígnale un valor. 
        A continuación escribe las instrucciones que realicen lo siguiente: 
        Incrementar N en 77, Decrementarla en 3, Duplicar su valor.*/
        
//        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero entero:"));
//        
//        int inc = n+77;
//        int dec = n-3;
//        int doble = n*2;
//        System.out.println("inc 77 : "+inc);
//        System.out.println("dec 3 : "+dec);
//        System.out.println("doble : "+doble);
//        
        /*5. Programa Java que declare una variable A de tipo entero y asígnale un valor. 
        A continuación muestra un mensaje indicando si A es par o impar. 
        Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.*/

//        int a = 2;
//        
//        if ( a % 2 == 0){
//            System.out.println("Es par");
//        }else{
//            System.out.println("Es impar");
//        }
    

        /*6. Programa Java que declare una variable B de tipo entero y asígnale un valor. 
        A continuación muestra un mensaje indicando si el valor de B es positivo o negativo. 
        Consideraremos el 0 como positivo. Utiliza el operador condicional (? : ) 
        dentro del println para resolverlo.
        */
        
//        int b = Integer.parseInt(JOptionPane.showInputDialog("Valor:"));
//        
//        
//       System.out.println(b>=0 ? "Es positivo": "Es negativo");
//        
//        if(b>=0){
//            System.out.println("Es positivo");
//        }else{
//            System.out.println("Es negativo");
//        }


        /*7. Programa Java que declare una variable C de tipo entero y asígnale un valor. 
        A continuación muestra un mensaje indicando si el valor de C es positivo o negativo, 
        si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100. 
        Consideraremos el 0 como positivo. Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.*/
//        int c = 5;
//        
//        String esPositivo = c >= 0 ? "Es positivo" : "Es negativo";
//        String esPar = c%2==0 ? "Es Par":"Es impar";
//        String esMultiploDe5 = c%5==0 ? "Es multiplo de 5" : "No es multiplo d 5";
//        String esMultiploDe10 = c%10==0 ? "Es multiplo de 10" : "No es multiplo d 10";
//        String esMayor = c > 100 ? "Es mayor que 100" : "Es menor que 100";     
//        
//        System.out.println("numero: "+c);
//        System.out.println(esPositivo);
//        System.out.println(esPar);
//        System.out.println(esMultiploDe5);
//        System.out.println(esMultiploDe10);
//        System.out.println(esMayor);


//        /*Programa Java que lea dos números enteros por teclado y los muestre por pantalla.*/
//        int n1 = 5, n2=2;
//        System.out.println("n1 = "+n1+"\nn2 = "+n2);


        /*2. Programa Java que lea un nombre y muestre por pantalla: “Buenos
            dias nombre_introducido”.*/
//        String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
//        System.out.println("Buenos dias "+nombre);
        
        
        /*3. Programa Java que lee un número entero por teclado y obtiene y
        muestra por pantalla el doble y el triple de ese número.*/
//            int num =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero entero:"));
//            System.out.println("El doble del numero "+num+" es: "+(num*2));
//            System.out.println("El triple del numero "+num+" es: "+(num*3));


        /*4. Programa que lea una cantidad de grados centígrados y la pase a
        grados Fahrenheit. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)*/
//        int grados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad en grados centigrados"));
//        
//        double fahrenheit = 32 + (9 * grados/5);
//        
//        System.out.println(fahrenheit);



        /*5. Programa que lee por teclado el valor del radio de una circunferencia y calcula y
        muestra por pantalla la longitud y el área de la circunferencia. Longitud de la
        circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2*/
//        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad en grados centigrados"));
//        double longCircunferencia = 2 * Math.PI *radio;
//        double areaCircunferencia = Math.PI*radio^2;
        

        
        /*6. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
//        Scanner entrada = new Scanner(System.in);
//        double velocidad;
//        System.out.println("Introduzca la velocidad en Km/h:");
//        velocidad=entrada.nextDouble();
//        System.out.println(velocidad+" Km/h = "+(velocidad*1000/3600)+" m/s");


        /*7. Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa 
            según el teorema de Pitágoras*/
//        Scanner entrada = new Scanner(System.in);
//        int catetoA, catetoB;
//        double hipotenusa;
//        
//        System.out.println("Ingrese la longitud del cateto A:");
//        catetoA=entrada.nextInt();     
//        
//        System.out.println("Ingrese la longitud del cateto B:");
//        catetoB=entrada.nextInt();
//        
//        hipotenusa = Math.round(Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2)));
//        
//        System.out.println("Resultado: "+hipotenusa);



        /*8. Programa que calcula el volumen de una esfera.
            La fórmula para calcular el volumen de la esfera es 
            v = (4/3)*PI*r^3    */
//        double radio, volumen;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.println("Ingrese el radio:");
//        
//        radio = entrada.nextDouble();
//        
//        volumen = (4/3) * Math.PI * Math.pow(radio, 3); 
//        
//        System.out.println("Volumen de la esfera de radio "+Math.round(radio)+" = "+volumen);




        /*9. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
            según la siguiente fórmula:  
            Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c))
            donde p =  (a+b+c)/2        
            El área del triángulo escaleno puede calcularse mediante la fórmula de Herón 
            si se conocen todos sus lados (a, b y c).
        */
            
//        Scanner entrada = new Scanner(System.in);
//        double ladoA, ladoB, ladoC, semiPerimeto, area;
//        
//        System.out.println("AREA DEL TRIANGULO: \nIngrese la longitud del lado A");
//        ladoA=entrada.nextDouble();
//        
//        System.out.println("Ingrese la longitud del lado B");
//        ladoB=entrada.nextDouble();
//        
//        System.out.println("Ingrese la longitud del lado C");
//        ladoC=entrada.nextDouble();
//        
//        semiPerimeto = (ladoA+ladoB+ladoC)/2;
//        
//        area = Math.pow((semiPerimeto*(semiPerimeto-ladoA)*(semiPerimeto-ladoB)*(semiPerimeto-ladoC)), 2);
//        
//        System.out.println("El area del triangulo es: "+area);
//        
        
        
        /*10. Programa que lee un número de 3 cifras y muestra sus cifras por separado.*/
//        Scanner entrada = new Scanner(System.in);
//        int numero;
//        
//        System.out.println("Ingrese un numero de 3 cifras:");
//        
//        numero=entrada.nextInt();
//        
//        System.out.println("Cifra 1 : "+(numero/100));
//        System.out.println("Cifra 2 : "+(numero/10)%10);
//        System.out.println("Cifra 3 : "+(numero%10));
        


        /*11. Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
        Por ejemplo para un número N = 12345   La salida debe ser:
        1
        12
        123
        1234
        12345 */
        
//        int numero;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.println("Introduzca un numero entero de 5 cifras:");
//        numero=entrada.nextInt();
//        
//        System.out.println(numero/10000);
//        System.out.println(numero/1000);
//        System.out.println(numero/100);
//        System.out.println(numero/10);
//        System.out.println(numero);
        
        
        /*Ejercicio 12:
        Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
        Por ejemplo para un número N = 12345    La salida debe ser:

        5
        45
        345
        2345
        12345   */
        
//        int numero;
//        
//        Scanner entrada = new Scanner(System.in);
//        
//        System.out.println("Introduzca un numero entero de 5 cifras:");
//        numero=entrada.nextInt();
//        
//        System.out.println(numero%10);
//        System.out.printf("%02d %n",numero%100);
//        System.out.printf("%03d %n",numero%1000);
//        System.out.printf("%04d %n",numero%10000);
//        System.out.printf("%05d %n",numero);
//        
        
        /*13.Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
            El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
            Por ejemplo:
            Si la fecha de nacimiento es 12/07/1980 
            Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
            Número de la suerte: 28     */

//            Scanner sc = new Scanner(System.in);
//            int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;
//            System.out.println("Introduzca fecha de nacimiento");
//            System.out.print("día: ");
//            dia = sc.nextInt();
//            System.out.print("mes: ");
//            mes = sc.nextInt();
//            System.out.print("año: ");
//            año = sc.nextInt();
//            suma = dia + mes + año;
//            cifra1 = suma/1000;      //obtiene la primera cifra
//            cifra2 = suma/100%10;  //obtiene la segunda cifra
//            cifra3 = suma/10%10;   //obtiene la tercera cifra
//            cifra4 = suma%10;        //obtiene la última cifra
//            suerte = cifra1 + cifra2 + cifra3 + cifra4;
//            System.out.println("Su número de la suerte es: " + suerte);
//            
            
            
            //----------------------Ejercicios Básicos con Estructura Condicional 
            

            //1. Programa Java que lea un número entero y calcule si es par o impar. 
            
//            Scanner entrada = new Scanner(System.in);
//            int num; String resp;
//            System.out.println("Ingrese un numero entero:");
//            num=entrada.nextInt();
//            resp=num%2==0? "par":"impar";
//            System.out.println(num+" es "+resp);
               

            //2. Programa que lea un número entero y muestre si el número es múltiplo de 10. 
//            Scanner entrada = new Scanner(System.in);
//            int num;
//            String resp;
//            System.out.println("Ingrese un numero entero:");
//            num=entrada.nextInt();
//            resp=num%10==0? "Es multiplo de 10":"NO es multiplo de 10";
//            System.out.println(resp);
            
            
            //3. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. 
//            Scanner entrada =new Scanner(System.in);
//            
//            char caracter;
//            
//            System.out.println("Introduzca un caracter:");
//            caracter=(char) System.in.read();//lee un solo caracter
//            
//            if(Character.isUpperCase(caracter)){
//                System.out.println("Es una letra mayuscula");
//            }else{
//                System.out.println("No es una letra mayuscula");
//            }
            
            
            
            //4. Programa que lea dos caracteres por teclado y compruebe si son iguales.
//            
//            char caracter1, caracter2;
//            System.out.println("Ingrese caracter 1");
//            caracter1=(char)System.in.read();
//            System.in.read();//salta el intro que ha quedado en el buffer
//            System.out.println("Ingrese caracter 2");
//            caracter2=(char) System.in.read();
//            
//            if(caracter1==caracter2){
//                System.out.println("Son Iguales");
//            }else{
//                System.out.println("NO son Iguales");
//            }
                
                
            //5. Programa que lea dos caracteres y compruebe si son dos letras minúsculas.
            
//            char caracter1, caracter2;
//            System.out.println("Ingrese caracter 1");
//            caracter1=(char)System.in.read();
//            System.in.read();
//            System.out.println("Ingrese caracter 2");
//            caracter2=(char)System.in.read();
//            
//            if(Character.isLowerCase(caracter1) && Character.isLowerCase(caracter2)){
//                System.out.println("Ambos caracteres son minusculas");
//                
//            }else if(Character.isUpperCase(caracter1) && Character.isUpperCase(caracter2)){
//                System.out.println("Ambos caracteres son mayusculas");
//            }else{
//                System.out.println("Ambos no son minusculas");
//            }
                
            
                
            //6. Programa que lea un carácter y compruebe si es un número (Carácter entre '0' y '9').
//            char caracter1;
//            System.out.println("Ingrese un caracter:");
//            caracter1=(char)System.in.read();   
//            
//            if(caracter1>='0' && caracter1<='9'){
//                System.out.println("Es un numero");
//            }else{
//                System.out.println("Es un caracter");
//            }
                
            //7. Programa que lea dos números por teclado y muestre el resultado de la división del primero
            //   por el segundo. Se debe comprobar que el divisor no puede ser cero.
//            Scanner entrada=new Scanner(System.in);
//            
//            int dividendo, divisor ;
//            double resultado;
//            System.out.println("Introduzca el dividendo:");
//            dividendo=entrada.nextInt();
//            System.out.println("Introduzca el divisor:");
//            divisor=entrada.nextInt();
//            
//            if(divisor==0){
//                System.out.println("El divisor no puede ser 0");
//            }else if(divisor>0){
//                resultado=dividendo/divisor;
//                System.out.println(resultado);
//            }
            
            
                
                
            //8. Calcular el mayor de tres números enteros en Java.
//            Scanner entrada=new Scanner(System.in);
//          
//            int num1, num2,num3, mayor;
//            System.out.println("Introduzca el Primer numero:");    
//            num1=entrada.nextInt();
//            System.out.println("Introduzca el Segundo numero:");    
//            num2=entrada.nextInt();
//            System.out.println("Introduzca el Tercer numero:");    
//            num3=entrada.nextInt();
//            
//            if(num1>num2 && num1>num3){
//                mayor=num1;
//            }else if(num2>num1 && num2>num3){
//                mayor=num2;
//            }else{
//                mayor=num3;
//            }
//            System.out.println("El numero mayor es : "+mayor);
            
            
                
                /*9. Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos
                respectivamente, y comprueba si la hora que indican es una hora válida. */
//                Scanner entrada = new Scanner(System.in);
//                int hora, minutos, segundos;
//                
//                System.out.println("Ingrese una hora:");
//                hora=entrada.nextInt();
//                System.out.println("Ingrese el minuto:");
//                minutos=entrada.nextInt();
//                System.out.println("Ingrese los segundos:");
//                segundos=entrada.nextInt();
//                
//                if(hora>=0 && hora<=24){
//                    if(minutos>=0 && minutos<=60){                        
//                        if(segundos>=0 && segundos<=60){
//                            System.out.println("La hora introducida es correcta");
//                        }else{
//                            System.out.println("El numero del segundo introducido es incorrecto");
//                        }
//                    }else{
//                        System.out.println("El minuto introducido es incorrecto");
//                    }         
//                }else{
//                    System.out.println("La hora introducida es incorrecta");
//                }
                
                
            /*10. Programa que lea una variable entera mes y compruebe si el valor corresponde a un mes de 30, 31 o 28 días.
                Se mostrará además el nombre del mes. Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.*/
                
//            Scanner entrada=new Scanner(System.in);
//            
//            int mes, nroDias=0;
//            String nombreMes="";
//            System.out.println("Ingrese un mes:");
//            mes=entrada.nextInt();
//            
//            if(mes>=1 && mes<=12){
//                
//                switch(mes){
//                    case 1:
//                        nombreMes="Enero";
//                        nroDias=31;
//                        break;
//                    case 2:
//                        nombreMes="Febrero";
//                        nroDias=28;
//                        break;
//                    case 3:
//                        nombreMes="Marzo";
//                        nroDias=31;
//                        break;
//                    case 4:
//                        nombreMes="Abril";
//                        nroDias=30;
//                        break;
//                    case 5:
//                        nombreMes="Mayo";
//                        nroDias=31;
//                        break;
//                    case 6:
//                        nombreMes="Junio";
//                        nroDias=30;
//                        break;
//                    case 7:
//                        nombreMes="Julio";
//                        nroDias=31;
//                        break;
//                    case 8:
//                        nombreMes="Agosto";
//                        nroDias=31;
//                        break;
//                    case 9:
//                        nombreMes="Septiembre";
//                        nroDias=30;
//                        break;
//                    case 10:
//                        nombreMes="Octubre";
//                        nroDias=31;
//                        break;
//                    case 11:
//                        nombreMes="Noviembre";
//                        nroDias=30;
//                        break;
//                    case 12:
//                        nombreMes="Diciembre";
//                        nroDias=31;
//                        break;
//                    default:
//                        nombreMes="incorrecto";
//                        break;
//                 
//                }
//                
//              System.out.println("El mes introducido es "+nombreMes+" y tiene "+nroDias+" dias.");
//
//            }
            
            
                
        //----------------------------Ejercicios Básicos con Estructura Iterativa o Repetitiva-------
        
        //1. Programa Java que muestre los números del 1 al 100 utilizando la instrucción while
//        int contador=1;
//       
//        while(contador<=100){
//            System.out.println(contador);
//            ++contador;            
//        }
        
        //2. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while
//        int contador = 1;
//        do{
//            System.out.println(contador);
//            contador++;
//        }while(contador<=100);
        
        
        //3. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for
        
//        for(int c=1;c<=100;c++){
//            System.out.println(c);
//        }
        
        //4. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while
//        int c=100;
//        while(c>=1){
//            System.out.println(c);
//            c--;
//        }
        
        //5. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while
//        int c=100;
//        do{
//            System.out.println(c);
//            c--;
//        }while(c>=1);
        
        //6. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for 
//        for(int i=100;i>=1;i--){
//            System.out.println(i);
//        }       
            
            
        
        //--------------------------Ejercicios Generales-----------------------
        //1. Intercambiar el contenido de dos variables
//        int A, B, auxiliar;
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Ingrese un valor numerico para la variable a");
//        A=entrada.nextInt();
//        System.out.println("Ingrese un valor numerico para la variable b");
//        B=entrada.nextInt();
//        System.out.println("a = "+a+"\nb = "+b+"\n");
//        A = A + B;
//        B = A - B;
//        A = A - B;
//        System.out.println("a = "+A+"\nb = "+B);
//        
        
        
        //2. Calcular el número de cifras de un número entero
//        Scanner entrada = new Scanner(System.in);
//        int numero, cifras;
//        char car;
//        do{
//            System.out.print("Introduce un número entero: ");
//            numero = entrada.nextInt();
//            cifras = 0;    //esta variable es el contador de cifras
//            while(numero!=0){             //mientras a n le queden cifras
//                   numero = numero/10;         //le quitamos el último dígito
//                   cifras++;          //sumamos 1 al contador de cifras
//            }
//            System.out.println("El número tiene " +cifras+ " cifras");
//            System.out.print("Continuar? ");
//            car = (char)System.in.read();
//        }while(car!='n' && car!= 'N');    
    
        
        //3. Pasar de grados centígrados a grados kelvin.El proceso de leer grados centígrados
            //se debe repetir mientras que se responda ‘S’ a la pregunta: Repetir proceso? (S/N)
//        Scanner sc = new Scanner(System.in);
//        double temperatura;
//        char car;
//        do{
//            System.out.print("Introduce temperatura en ºC: ");
//            temperatura = sc.nextDouble();
//            System.out.println("Grados Kelvin ..: " + (temperatura+273));
//            System.out.print("Repetir proceso? (S/N): " );
//            car = (char)System.in.read();
//        }while(car =='S' || car == 's');
        
        
        //4. Mostrar la tabla de multiplicar de un número.
//        int num=0, res=0;
//        Scanner entrada=new Scanner(System.in);
//        System.out.println("Ingrese el numero:");
//        num=entrada.nextInt();
//        for(int i=0;i<=12;i++){
//            res=num*i;
//            System.out.println(num+" x "+i+" = "+res);
//        }
        
        
        //5. Leer números y contar cuántos acaban en 2.
        int num, ultimoDigito, cantNum, cont=0, acabaEn2=0;
        String numero="";
        Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cual es la cantidad de numeros que va a ingresar por consola?");
        cantNum=entrada.nextInt();
        do{
            cont++;
            System.out.println("Ingrese numero:"+cont);
            num=entrada.nextInt();
            numero=Integer.toString(num);//pasando de entero a string 
            ultimoDigito=numero.charAt(numero.length()-1);
            if(ultimoDigito=='2'){
                acabaEn2=acabaEn2+1;
            }
                    
        }while(cantNum>cont);
        System.out.println(acabaEn2+" numeros acaban en 2.");
        

//        Scanner scn = new Scanner(System.in);
//
//        System.out.print("Introduzca el total de numeros que desea ingresar: ");
//
//        int todosNumeros = scn.nextInt();
//
//        int[] numeros = new int[todosNumeros];
//
//        System.out.println("Introduzca " + todosNumeros + " numeros: ");
//
//        for (int i = 0; i < numeros.length; i++) {
//            System.out.print("Numero " + (i + 1) + ": ");
//            numeros[i] = scn.nextInt();
//        }
//        System.out.println("Los numeros introducidos son: ");
//
//        try {
//            for (int i = 0; i < numeros.length; i++) {
//                System.out.println(numeros[i]);
//            }
//        } catch (Exception exc) {
//        // TODO Auto-generated catch block
//            exc.printStackTrace();
//        }
//
//        System.out.println("Y los numeros acabados en 2 son: ");
//        for (int i = 0; i < numeros.length; i++) {
//            if (numeros[i] % 10 == 2) {
//                System.out.println(numeros[i]);
//            }
//        }
        

        //6. Comprobar si un número es perfecto.
        //7. Comprobar si dos números son amigos.
        //8. Mostrar los N primeros términos de la serie de Fibonacci
        //9. Pasar de decimal a binario
        //10. Pasar de binario a decimal
        //11. Convertir a Números Romanos
        //12. Cifrado Cesar para codificar y decodificar un texto
        //13. Comprobar si un número entero es capicúa
        
    }
    
}
