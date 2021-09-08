object ScalaFunctions extends App {


  def getSquare(num: Int):Int = {

    num*num;

  }


  def getCube(num: Int):Int = {

    num*num*num;

  }

  def  findingY(m: Int, x: Int, c: Int):Int ={

    (m*x)+c

  }

  def  findingC(y: Int, m: Int, x: Int):Int ={

    y - (m*x)

  }

  def  findingX(y: Int, c: Int, m: Int):Int ={

    (y - c)/m

  }

  def  findingM(y: Int, c: Int, x: Int):Int ={

    (y - c)/x

  }

  def findindRootX(y: Int, h:Int):Int = {

   val prod  = y - h



    def square(prod:Int): Int = {

      prod / 2

    }

    square(prod)

  }

  println("Square: "+getSquare(2));
  println("Cube: "+getCube(2));
  println("The value of y is: "+findingY(12,2,5))
  println("The value of C is: "+findingC(10,3,5))
  println("The value of X is: "+findingX(12,4,5))
  println("The value of M is: "+findingM(12,2,5))
  println("Value is: "+findindRootX(20,3))
  println(findindRootX(6, 2))




}
