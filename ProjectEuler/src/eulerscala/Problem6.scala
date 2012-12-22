/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerscala

import scala.math
object Problem6 {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    var sumOfSquares:Long = 0l
    var sum:Long = 0l
    for (i <- 1l until 101l) {
      sum += i
      sumOfSquares += (i * i)
    }
    System.out.println(math.abs((sum * sum) - sumOfSquares))
  }

}
