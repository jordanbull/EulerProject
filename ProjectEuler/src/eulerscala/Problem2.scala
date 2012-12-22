/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerscala

object Problem2 {
  def main(args: Array[String]) {
    var twoBack:Int = 1
    var oneBack:Int = 2
    var sum:Int = 2
    var next = 3
    while (next < 4000000) {
      if (next%2 == 0)
        sum += next
      twoBack = oneBack
      oneBack = next
      next = twoBack + oneBack
    }
    println(sum)
  }
}
