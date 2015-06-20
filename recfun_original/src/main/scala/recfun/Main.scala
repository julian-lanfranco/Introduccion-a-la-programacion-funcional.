package recfun

import scala.collection.mutable.ListBuffer
import common._
 

object Main {
  
  def main(args: Array[String]) 
   {
    println("Pascal's Triangle")
    for (row <- 0 to 10) 
      {
      for (col <- 0 to row)
        {
         print(pascal(col, row) + " ")
         println()
        }
      }
   }

  /**
   * Exercise 1
   * En matemática, el triángulo de Pascal es una representación de los coeficientes 
   * binomiales ordenados en forma triangular. Es llamado así en honor al matemático 
   * francés Blaise Pascal, quien introdujo esta notación en 1654, en su Traité du 
   * triangle arithmétique. Si bien las propiedades y aplicaciones del triángulo fueron 
   * conocidas con anterioridad al tratado de Pascal por matemáticos indios, chinos o persas, 
   * fue Pascal quien desarrolló muchas de sus aplicaciones y el primero en organizar la 
   * información de manera conjunta.
   * 
   * Realizar una funcion que dada la columna y la fila nos devuelve el nro del triangulo de pascal.
   * 
   */
 
  
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 && r == 0) 1 
    else if (c < 0 || r < 0) 0 
    else pascal(c, r - 1) + pascal(c - 1, r - 1) 

  /**
   * Exercise 2
   * Escriba una función llamada “existe” que indique si un objeto se encuentra 
   * dentro de una lista determinada
   */
    
  def existe(numero_buscado: Int, lista: List[Int]) : Boolean = 
    if (lista.isEmpty) false
    else if (lista.head == numero_buscado) true
    else existe(numero_buscado, lista.tail)
  
  /**
   * Exercise 3
   * Realizar una funcion que indique si una lista tiene parentesis balanceados.
   * 
   */

  
  def balanceAux(n: Int)(lista: List[Char]): Boolean =
  if (n < 0 ) false //controla que no se cierre un parentesis antes de abrir uno
  
  else if ((lista.isEmpty)&&(n == 0)) true //al final de la lista fueron se abiertos tantos parentesis como los que se cerraron
  else if ((lista.isEmpty)&&(n > 0)) false //al final de la lista hay parentesis que no fueron cerrados
  else if (lista.head == '(') balanceAux(n+1)(lista.tail)//cuenta un parentesis abiertos y sigue con el control de la lista
  else if (lista.head == ')') balanceAux(n-1)(lista.tail)//cuenta un parentesis cerrado y sigue con el control de la lista
  else balanceAux(n)(lista.tail)
  
  def balance (lista: List[Char]): Boolean = balanceAux(0)(lista: List[Char])
  

  /**
   * Exercise 4
   * Realizar una funcion que cuente cuantas conbinaciones de monedas pueden pagar un valor determinado.
   * Por ejemplo hay 3 formas de pagar 4 pesos con monedas de 1 peso y 2 pesos
   * 4 = 1+1+1+1
   * 4 = 2+2
   * 4 = 2+1+1
   */
 
  
  def countChange(money: Int, coins: List[Int]): Int = {
    
    def count(m: Int, c: List[Int]) : Int = {
      if (c.isEmpty) 0
      else if (m - c.head == 0) 1
      else if (m - c.head < 0) 0
      else countChange(m - c.head, c) + countChange(m, c.tail)
    }
    count(money, coins.sorted)
  }
  }

