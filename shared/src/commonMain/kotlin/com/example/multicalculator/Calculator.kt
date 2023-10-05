package com.example.multicalculator

public class Calculator {
    fun add(left: Int, right: Int) : Int{
        return left + right
    }
    fun subtract(left: Int, right: Int) : Int{
        return left - right
    }
    fun divide(left: Int, right: Int) : Int{

            return left / right
        }
    fun multiply(left: Int, right: Int): Int{
        return left * right
    }

}
 fun main(){
     val calculator = Calculator()
     val sum = calculator.add(7,3)
     println("Sum: $sum")

     val sub = calculator.subtract(9,4)
     println("subtract: $sub")

     val div = calculator.divide(8,2)
     println("divide: $div")

     val product = calculator.multiply(6,7)
     println("multiply: $product")
 }

