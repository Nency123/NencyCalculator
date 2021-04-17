import java.util.*
fun main(args : Array<String>)
{
    var callFun = Example()
    callFun.printstatement(callFun.statement)
    var scan = Scanner(System.`in`)
    var opInt = scan.nextInt()
    callFun.printstatement(callFun.initFirstStatement)
    var firstNo=scan.nextFloat()
    callFun.printstatement(callFun.initSecondStatement)
    var secondNo=scan.nextFloat()

    callFun.optOperation(opInt,firstNo,secondNo)
    //callFun.addition()

}
class Example {
    val statement =
        "Which expression you want to perform \n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Percentage\n 6.Factorial\n 7.Power \n 8.Square root \n 9.Cube root \n write any number from above"
    val initFirstStatement = "Enter the First Value"
    val initSecondStatement = "Enter the Second Value"
    val fResult = "The Result is:"

    fun printstatement(f: String) {
        println(f)
    }

    //addition
    fun addition(firstNo: Float, secondNo: Float) {
        var result = firstNo + secondNo
        printstatement("The Result Addition is $result")
    }
    //subtraction
    fun subtraction(firstNo: Float, secondNo: Float) {
        var result = firstNo - secondNo
        printstatement("The Result Subtraction is $result")
    }
    //multication
    fun multiplication(firstNo: Float, secondNo: Float) {
        var result = firstNo * secondNo
        printstatement("The Result Multiplication is $result")
    }
    //division
    fun division(firstNo: Float, secondNo: Float) {
        if (secondNo == 0f){
           printstatement("Number should not be Zero")
            return
        }
        var result = firstNo / secondNo
        printstatement("The Result division is $result")
    }

    //percentage
    fun percentage(firstNo: Float, secondNo: Float) {
        if (secondNo == 0f){
            printstatement("Number should not be Zero")
            return
        }
        var result: Float = firstNo % secondNo
        printstatement("The Reminder is $result")
    }
    //factorial
    fun factorial(firstNo: Float, secondNo: Float) {
        var fact: Long = 1
        var fact2: Long = 1
        for (i in 1..firstNo.toInt()){
            fact = fact * i
        }
        printstatement("The Result of Factorial FirstNo is $fact")
        for (i2 in 1..secondNo.toInt()){
            fact2 = fact2 * i2
        }
        printstatement("The Result of Factorial SecondNo is $fact2")

    }
    //power
    fun power(firstNo: Float, secondNo: Float) {
        var base: Float = firstNo
        var expo: Float = secondNo
        var result: Long = 1
        while (expo.toInt() != 0) {
            result = result * base.toLong()
            --expo
        }
        printstatement("The Result of power is $result")
        }
        //square root
        fun square_root(firstNo: Float, secondNo: Float) {
            var result: Double = 1.0
            var result2: Double = 1.0
            result = Math.sqrt(firstNo.toDouble())
            result2 = Math.sqrt(secondNo.toDouble())
            printstatement("The Result of Square root of firstNo is $result")
            printstatement("The Result of Square root of secondNo is $result2")
        }
    //cube-root
    fun cube_root(firstNo: Float, secondNo: Float) {
        var result: Double = Math.cbrt(firstNo.toDouble())
        var result2: Double = Math.cbrt(secondNo.toDouble())
        printstatement("The Result of Cube_Root of first no. is $result")
        printstatement("The Result is Cube_Root of second no.$result2")
    }

    fun optOperation(optInt: Int, firstNo: Float, secondNo: Float) {
        if (optInt == 1) {
            addition(firstNo, secondNo)
        } else if (optInt == 2) {
            subtraction(firstNo, secondNo)
        } else if (optInt == 3) {
            multiplication(firstNo, secondNo)
        } else if (optInt == 4) {
            division(firstNo, secondNo)
        } else if (optInt == 5) {
            percentage(firstNo, secondNo)
        } else if (optInt == 6) {
            factorial(firstNo, secondNo)
        } else if (optInt == 7) {
            power(firstNo, secondNo)
        }else if (optInt == 8) {
            square_root(firstNo, secondNo)
        }else if (optInt == 9) {
            cube_root(firstNo, secondNo)
        }else
        {
            printstatement("please Enter right value of operation")
        }

    }

}
