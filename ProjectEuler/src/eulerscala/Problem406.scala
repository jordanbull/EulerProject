/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eulerscala
import scala.collection.mutable.HashMap
import scala.math

object Problem406 {
  var map = HashMap[Long, Double](1l -> 0.0, 0l -> 0.0)
  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    //println(worstValue(5, 2, 3))
    //map = HashMap[Long, Double](1l -> 0.0, 0l -> 0.0)
    //println(worstValue(500, math.sqrt(2), math.sqrt(3)))
    //map = HashMap[Long, Double](1l -> 0.0, 0l -> 0.0)
    var i = 1l
    var time = System.currentTimeMillis
    while (i < 20001) {
      worstValue(i, 5, 7)
      i += 1
    }
    println(worstValue(20000, 5, 7))
    println(System.currentTimeMillis - time)
  }

  def worstValue(n:Long, a:Double, b:Double): Double = {
    if (map.contains(n))
      return map(n)
    var optimal:Double = Double.MaxValue
    var i = n/2
    while (i < n+1) {
      var size1:Long = i - 1
      var size2:Long = n - i
      if (size1 < 1) {
        //optimal = math.min(worstValue(size2, a, b) + a, optimal)
        optimal = math.min(map(size2) + a, optimal)
      } else if (size2 < 1) {
        //optimal = math.min(worstValue(size1, a, b) + b, optimal)
        optimal = math.min(map(size1) + b, optimal)
      } else {
        //optimal = math.min( math.max(worstValue(size1, a, b) + b, worstValue(size2, a, b) + a), optimal)
        optimal = math.min( math.max(map(size1) + b, map(size2) + a), optimal)
      }
      i += 1
    }
    i = 1
    while (i < n/2) {
      var size1:Long = i - 1
      var size2:Long = n - i
      if (size1 < 1) {
        //optimal = math.min(worstValue(size2, a, b) + a, optimal)
        optimal = math.min(map(size2) + a, optimal)
      } else if (size2 < 1) {
        //optimal = math.min(worstValue(size1, a, b) + b, optimal)
        optimal = math.min(map(size1) + b, optimal)
      } else {
        //optimal = math.min( math.max(worstValue(size1, a, b) + b, worstValue(size2, a, b) + a), optimal)
        optimal = math.min( math.max(map(size1) + b, map(size2) + a), optimal)
      }
      i += 1
    }
    map.put(n, optimal)
    return optimal
  }
}
