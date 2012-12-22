/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerscala

object Problem5 {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    var increment:Int = 19 * 17 * 13 * 11 * 7 * 5 * 3 * 2 
/* the above numbers are all the prie numbers less than twenty and thus are all coprime,
 * therefore the number must be a multiple of their product*/

    var i:Int = increment
    while (!divisibleByAll(i)) {
      i += increment
    }
    println(i)
  }

    def divisibleByAll(num:Int): Boolean = {
      for (i <- 2 until 21) { // 1 does not need to be checked ever
        if (num % i != 0)
          return false
      }
      return true
    }
}
