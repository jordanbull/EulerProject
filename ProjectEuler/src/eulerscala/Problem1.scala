/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerscala

object Problem1 {
  def main(args: Array[String]) {
    var sum:Int = 0
    var num:Int = 3
    while (num < 1000) {
      sum += num
      num += 3
    }
    num = 0
    while (num < 1000) {
      if (num % 3 != 0)
        sum += num
      num += 5
    }
    println(sum)
  }
}
