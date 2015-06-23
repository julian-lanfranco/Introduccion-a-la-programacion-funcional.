
package utils


/**
 * En matemáticas, una fracción, número fraccionario, (del vocablo latín frāctus, 
 * fractĭo -ōnis, roto, o quebrado)1 es la expresión de una cantidad dividida 
 * entre otra cantidad; es decir que representa un cociente no efectuado de 
 * números. Por razones históricas también se les llama fracción común, fracción 
 * vulgar o fracción decimal. El conjunto matemático que contiene a las fracciones 
 * es el conjunto de los números racionales, denotado ℚ.
 */
class Fraccion(val numerador:Int, val denominador:Int) {
  require(denominador != 0, "El denominador no puede ser 0")
  
  def this(numerador:Int) = this(numerador, 1)
  
  /**
   * En matemáticas, se define el máximo común divisor(MCD) de dos o más números 
   * enteros al mayor número entero que los divide sin dejar resto.
   * El algoritmo de Euclides, que utiliza el algoritmo de la división junto 
   * al hecho que el MCD de dos números también divide al resto obtenido de 
   * dividir el mayor entre el más pequeño.
   */
  def mcd (x:Int,y:Int) : Int = {
   if (x ==0) y
   else mcd(y%x,x)
  }
  
  def simplificar () : Fraccion =  {
    
    val divisor:Int = mcd(this.numerador,this.denominador)
    
    val simplificada:Fraccion = new Fraccion(this.numerador/divisor,this.denominador/divisor)
    
    simplificada
    
  }
     
  
  /*
   * 
   *   a   +   c   =       ad + bc     (se multiplica cruzado y los productos de suman)
   *  --       --         --------
   *   b       d             bd        (se multiplican los denominadores)
   * 
   */
  def + (otro : Fraccion) : Fraccion = 
  {
    val sumada:Fraccion = 
      new Fraccion(this.numerador*otro.denominador+this.denominador*otro.numerador,denominador*otro.denominador)                                   
  sumada.simplificar()
  
  }
    
  
  
  def - (otro : Fraccion) : Fraccion = 
  {
    val restada:Fraccion = 
      new Fraccion(this.numerador*otro.denominador-this.denominador*otro.numerador,denominador*otro.denominador)                                   
  restada.simplificar()
  }
  
  /*
   * Para multiplicar dos fracciones, el procedimiento es muy simple. Solo es necesario 
   * hacerlo horizontalmente, es decir, multiplicar ambos numeradores y luego ambos denominadores.
   */
  def * (otro : Fraccion) : Fraccion = 
  {
    val multiplicada:Fraccion = 
      new Fraccion(this.numerador*otro.numerador,this.denominador*otro.denominador)                                   
  multiplicada.simplificar()
  }
  
  def / (otro : Fraccion) : Fraccion = 
  {
    val dividida:Fraccion = 
      new Fraccion(this.numerador*otro.denominador,this.denominador*otro.numerador)                                   
  dividida.simplificar()
  }
  
  def == (otro : Fraccion) : Boolean = {
    
    (this.simplificar().numerador==otro.simplificar().numerador)&&(this.simplificar().denominador==otro.simplificar().denominador)
    
    
  }
  
  def < (otro : Fraccion) : Boolean = 
  {
    (this.numerador*otro.denominador<this.denominador*otro.numerador)
  }
  
  def > (otro : Fraccion) : Boolean =
  {
    (this.numerador*otro.denominador>this.denominador*otro.numerador)
  }
  
  def unary_- : Fraccion = 
  {
  val negada:Fraccion = new Fraccion(-this.numerador,this.denominador)                                   
  negada.simplificar()   
    
    
  }
  
  override def toString() : String = ??? 
}